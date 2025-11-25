package Coleccion_De_Tareas;

import Tarea.Tarea;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author josue
 */
public class Coleccion_De_Tareas {

    //Esta clase se encarga de crear una lista unica a la cual todas las clases puedan acceder a travez del getter, asi no se crean nuevos arrays.
    
    private static ArrayList<Tarea> Tareas = new ArrayList<>();

    public static ArrayList<Tarea> getTareas() {
        return Tareas;
    }

    //Este metodo agrega la tarea y con el comparator lo acomodamos en forma ascendente a travez de la fecha limite que tenga la tarea.
    public static void agregarTarea(Tarea t) {
        Tareas.add(t);

        Tareas.sort(Comparator.comparing(Tarea::getFechaLimite));
    }

}
