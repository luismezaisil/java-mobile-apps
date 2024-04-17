package sesion02;

public class Main {
    public static void main(String[] args) {
        /*
         * Ejemplo de invocacion a un método definido como static
         */
        System.out.println(Math.addNumbers(5, 3));
        Main.createStudents();
        /*
        * Se crea un objeto de la clase Example
         */ 
        Example example = new Example();
        example.showMessage();
    }

    public static void createStudents(){
        /*
         * Ejemplo de invocacion a un método no definido como static
         */
        Student studentCarlos  = new Student();
        studentCarlos.study();

        studentCarlos.age = 15;
        studentCarlos.name = "Carlos";
        studentCarlos.dni = "89434239";
        studentCarlos.showName();

        Student studentAna = new Student();

        studentAna.age = 21;
        studentAna.name = "Ana";
        studentAna.dni = "45678925";
        studentAna.showName();

    }
}
