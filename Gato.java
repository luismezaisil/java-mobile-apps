package modelos;

public class Gato {
    
    private String nombre;
    private int edad;
    private String raza;


    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getRaza(){
        return raza;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public Gato(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void maullar(){
        System.out.println(nombre + " esta maullando");
    }
}
