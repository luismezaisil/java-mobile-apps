package sesion02;

public class Test {
    public static void main(String[] args) {
        greeting("Francisco");
        rectangleOperations(5, 12);
        System.out.println(validateNumbers(5,5,5,5));
    }

    public static void myMethod() {
        System.out.println("Hello,ISIL!");
    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name);
    }

    private static void rectangleArea(int a, int b) {
        System.out.println("The area of the rectangle is: " + (a * b));
    }
    private static void rectanglePerimeter(int a, int b) {
        System.out.println("The perimeter of the rectangle: " + ((a*2) + (a*2)));
    }

    public static void rectangleOperations(int width, int height) {
        int a = width;
        int b = height;
        rectangleArea(a, b);
        rectanglePerimeter(a, b);
    }

    public static String validateNumbers(int a, int b, int c, int d){
        if (a==b && b==c && c==d) {
            return ("The four numbers are all the same.");
        }
        return ("The four numbers are not all the same.");
    }
}

