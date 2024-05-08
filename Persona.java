package modelos;
public class Persona {
    
    private String nombre;
    private int edad;
    private String dni;

    public void comer(String fruta){
        System.out.println(nombre + " esta comiendo " + fruta + ".");
    }

    public void dormir(){
        System.out.println(nombre + " esta durmiendo.");
    }

    public void caminar(){
        System.out.println(nombre + " esta caminando");
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

}
