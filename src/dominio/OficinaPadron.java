//Ejercicio 13
package dominio;

import java.util.ArrayList;   
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class OficinaPadron
{
    private ArrayList<Habitante>habitantesPadron = new ArrayList<>();
    public void annadir(Habitante habitante){
        habitantesPadron.add(habitante);
        volcarContactos();
    }
    public ArrayList getHabitantesPadron(){
        return habitantesPadron;
    }
    public int calcularNumeroHabitantes(){
        int suma = 0;
    for(Habitante habitante : habitantesPadron){
        suma++;
    }
        return suma;
    }
    // Ejercicio 15
        private void cargarHabitantes(){
            try{
                File fichero = new File("padron.csv");
                // Crea el fichero si no existe:
                fichero.createNewFile();
                Scanner sc = new Scanner(fichero);
                sc.useDelimiter(",|\n");
                while(sc.hasNext()){
                    Habitante habitante = new Habitante(sc.next(),sc.next(),sc.next());
                    habitantesPadron.add(habitante);
            }
                sc.close();
            }catch(IOException ex){
                System.out.println("No hay habitantes inscritos");
        }
    }
    public OficinaPadron(){
        cargarHabitantes();
    }
    public void volcarContactos(){
         try{
            FileWriter fw = new FileWriter("padron.csv");
        for(Habitante habitante : habitantesPadron){
            fw.write(habitante.getNombre() + "," + habitante.getApellido1() + "," + habitante.getApellido2() + "n");
        }
        fw.close();
        }catch(IOException ex){
        System.err.println(ex);
        }
    }
}