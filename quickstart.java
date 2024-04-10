// Upper camel case: utilizado para nombrar las clases
// LOwer camel case: utilizado para nombrar los atributos y metodos de las clases
public class quickstart {

    private static void greeting(String name) {
        System.out.println("Hello " + name);
        System.out.println("");
    }

    private static void aritmeticOperations(int a , int b) {

        System.out.println("Arithmetic operations: ");
        System.out.println("");

        // addition operator
        System.out.println("a + b = " + (a + b));

        // substraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a x b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modular operator
        System.out.println("a % b = " + (a % b));

    }

    private static void logicalOperations() {
        // declare variables
        int a = 5, b =3, c = 8;

        System.out.println("Logical operations");
        System.out.println("");
        // && operator
        System.out.println((a>b) && (c>b));
        System.out.println((a>b) && (c<b));
        // || operator
        System.out.println((a>b) || (c>b));
        System.out.println((a>b) || (c<b));
        // ! operator
        System.out.println(!(a == b));
    }

    private static void ternaryOperations() {
        int februaryDays = 29;
        String result;

        System.out.println("Ternary operation: ");
        System.out.println("");
        result = (februaryDays == 28)?"Not a leap year" : "Leap year";
        System.out.println(result);
        System.out.println("");

    }
    private static void relationalOperations() {
       int a = 7, b = 11;
       System.out.println("Relational operations: ");
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println("");
    }
    private static void instanceofOperation() {
        System.out.println("Instance of operation");
        String str = "ISIL";
        boolean result;
        result = str instanceof String ;
        System.out.println("Is str an instance of a string? : "+ result);
    }

    public static void main(String[] args) {

        // greeting
        greeting("Miraflores");
        // arithmetic operations
        aritmeticOperations(12,5);
        // logical operations
        logicalOperations();
        // ternary operations
        ternaryOperations();
        // relational operations
        relationalOperations();
        // instance of operation
        instanceofOperation();

    }

}
