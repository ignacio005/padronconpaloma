package presentacion;
import dominio.OficinaPadron;
import dominio.Habitante;
import java.util.ArrayList;
public class InterfazUsuario
{
    public static boolean ejecutar(String[] instruccion){
        OficinaPadron padron = new OficinaPadron();
        if (instruccion[0].equalsIgnoreCase("mostrar")&& instruccion.length ==1){
            mostrarOficinaPadron(padron);
        }else if(instruccion[0].equalsIgnoreCase("añadir")&& instruccion.length == 4){
            padron.annadir(new Habitante(instruccion[1],instruccion[2], instruccion[3]));
            System.out.println("Habitante añadido correctamente");
        
        }else if(instruccion[0].equalsIgnoreCase("salir")){
            padron.volcarContactos();
            return false;
        }else{   
            System.out.println("Error en la instrucción");
        }
        return true;
    }
    private static void mostrarOficinaPadron(OficinaPadron padron){
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for(Habitante habitante : habitantes){
            System.out.println(habitante.getNombre() + " " +habitante.getApellido1() + " " + habitante.getApellido2());
        }       
        System.out.println("El numero total de habitantes es" + padron.calcularNumeroHabitantes());
    }
}
