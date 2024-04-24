import java.util.Scanner;
public class Sesion03 {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();        

        System.out.println(Sesion03.sumFirstNaturals(number));        
        System.out.println(numDetector(number));        

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("El número mayor es: " + higherNum(a,b));

        int day = scanner.nextInt();
        Sesion03.dayWeek(day);

        scanner.close();
    }

    public static int sumFirstNaturals(int number){
        return number*(number+1)/2;
    }

    public static boolean numOdd(int number){
        return (number%2) == 0  ;
    }

    public static String numDetector(int number){
        if (numOdd(number)==true){
            return "Es par";
        }
        return "Es impar";
    }

    public static int higherNum(int a, int b){
        return (a>b)? a:b;
    }

    public static void dayWeek(int day){
        switch (day) {
            case 1: System.out.println("Lunes");                
                break;
            case 2: System.out.println("Martes");                
                break;
            case 3: System.out.println("Miercoles");                
                break;
            case 4: System.out.println("Jueves");                
                break;
            case 5: System.out.println("Viernes");                
                break;
            case 6: System.out.println("Sábado");                
                break;
            case 7: System.out.println("Domingo");                
                break;
        
            default: System.out.println("Por favor ingrese un número entre 1 y 7");
                break;
        }    
    }

}
