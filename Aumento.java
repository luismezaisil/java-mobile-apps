package ejercicio;

import java.util.Scanner;

public class Aumento {
    
    public static void main(String[] args){
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();

        System.out.println("Ingrese el cargo: ");
        String cargo = scanner.next();

        System.out.println("Ingrese su salario: ");
        int salario = scanner.nextInt();

        System.out.println("Ingrese el porcentaje de aumento: ");
        int porcentaje = scanner.nextInt();

        Empleado empleado1 = new Empleado(nombre,cargo,salario);

        empleado1.Aumento(porcentaje, salario);

        scanner.close();
    }
}
