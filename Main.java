import java.util.Scanner;

import modelos.Persona;

public class Main {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Carlos");
        persona1.setEdad(15);
        persona1.setDni("72573822");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una fruta:");
        String fruta = scanner.next();
        persona1.comer(fruta);

        Persona persona2 = new Persona();
        persona2.setNombre("Ana");
        persona2.setEdad(20);
        persona2.setDni("83743393");
        persona2.dormir();

        scanner.close();    
    }
}
