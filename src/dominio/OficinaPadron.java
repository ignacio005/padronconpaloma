package dominio;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class OficinaPadron
{
    private ArrayList<Habitante> habitantesPadron = new ArrayList<>();
    public void annadir(Habitante habitante){
    habitantesPadron.add(habitante);
    volcarContactos();
    }
    public ArrayList<Habitante> getHabitantesPadron(){
    return habitantesPadron;
    }
    public int calcularNumeroHabitantes(){
    int suma = 0;
    for(Habitante habitante : habitantesPadron){
    suma++;
    }
    return suma;    
    }
    private void cargarHabitantes() {
    try {
        File fichero = new File("padron.csv");
        fichero.createNewFile();
        Scanner sc = new Scanner(fichero);
        sc.useDelimiter(",|\n");
        while (sc.hasNext()) {
            String nombre = sc.next();
            String apellido1 = sc.hasNext() ? sc.next() : "";
            String apellido2 = sc.hasNext() ? sc.next() : "";
            Habitante habitante = new Habitante(nombre, apellido1, apellido2);
            habitantesPadron.add(habitante);
        }
        sc.close();
    } catch(IOException ex) {
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
                fw.write(habitante.getNombre() + "," +habitante.getApellido1() + "," +habitante.getApellido2() + "\n");
            }
            fw.close();
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}