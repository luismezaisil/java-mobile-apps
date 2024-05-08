package ejercicio;

public class Empleado {

    private String nombre;
    private String cargo;
    private int salario;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Empleado(String nombre, String cargo, int salario){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void Aumento(int porcentaje, int salario){
        this.salario = salario;
        int newSalario = salario + salario*porcentaje/100;
        System.out.println("El salario incluyendo aumento es: " + newSalario);
    }
}

