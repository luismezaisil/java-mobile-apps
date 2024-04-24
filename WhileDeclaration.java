import java.util.Scanner;
public class WhileDeclaration {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        WhileDeclaration.printOddNumbers(number);
        scanner.close();
    }

    public static void sayHello(int number){
        int count = 0;

        while (count < number){
            count++;
            System.out.println("Hello " + count);
        }

    }

    public static void printEvenNumbers(int number){
        int count = 0;
        while (count<number){
            count++;
            if(Sesion03.numOdd(count)){
                System.out.println(count);
            }
        }
    }

    public static void printOddNumbers(int number){
        int count = number;
        do{
            if(Sesion03.numOdd(count)==false){
                System.out.println(count);
            }
            count--;
        }
        while (count>1);
    }

}
    

