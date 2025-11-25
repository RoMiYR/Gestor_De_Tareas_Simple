package Metodos;

import Tarea.Tarea;
import java.time.LocalDate;


/**
 *
 * @author josue
 */
public class Agregar_Tarea {
    
    //Este metodo se encarga de obtener los datos necesarios de la clase tarea, despues crear un objeto del tipo tarea, y al final lo agrega al ArrayList
    //Debajo de cada dato esta la comprobacion del dato de salida, que es un "-1", eso signifca que el usuario cancelo la accion.
    
    public static void agregarTarea() {
        
        String nombre = Obtencion_De_Datos.Obtener_String.obtenerString("el nombre de la tarea");
        if (nombre.equals("-1")) {
            return;
        }
        
        String descripcion = Obtencion_De_Datos.Obtener_String.obtenerString("la descripcion de la tarea");
        if (descripcion.equals("-1")) {
            return;
        }
        
        String prioridad = Obtencion_De_Datos.Obtener_Nivel_De_Prioridad.nivelDePrioridad();
        if (prioridad.equals("-1")) {
            return;
        }
        
        
        LocalDate fechaLimite = Obtencion_De_Datos.Obtener_Fecha_Limite.obtenerFechaLimite();
        
        
        if (fechaLimite == null) {
            return;
        }
        
        Tarea nuevaTarea = new Tarea(nombre, descripcion, prioridad, fechaLimite);
        
        Coleccion_De_Tareas.Coleccion_De_Tareas.agregarTarea(nuevaTarea);
        
    }
    
}
