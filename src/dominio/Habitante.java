package dominio;

public class Habitante
{
    //Ejercicio 8 al 10
    private String nombre;
    private String apellido1;
    private String apellido2;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1){
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2){
        this.apellido2 = apellido2;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido1(){
        return apellido1;
    }
    
    public String getApellido2(){
        return apellido2;
    }

    public static void main (String [] args){
        Habitante habitante1 = new Habitante("Javier", "Perez", "Martinez");
        System.out.println("Nombre: "+ habitante1.nombre);
        System.out.println("Apellido1: "+ habitante1.apellido1);
        System.out.println("Apellido2: " + habitante1.apellido2);

    }

    //Ejercicio 12
    public Habitante(String nombre, String apellido1, String apellido2){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
}
// Los paquetes son elementos de agrupación, para la modularización de código