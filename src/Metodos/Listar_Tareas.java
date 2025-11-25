package Metodos;

import Tarea.Tarea;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Listar_Tareas {

    public static void listarTareas() {

        int contador = 1;

        if (Coleccion_De_Tareas.Coleccion_De_Tareas.getTareas().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aun no hay tareas registradas");
            return;
        }

        StringBuilder textoConstruido = new StringBuilder();

        for (Tarea tareaActual : Coleccion_De_Tareas.Coleccion_De_Tareas.getTareas()) {
            textoConstruido.append(contador + " -> ").append(tareaActual.getNombre() + "/").append(tareaActual.getPrioridad() + "/").append(tareaActual.getFechaLimite() + "\n");
            contador++;
        }

        JOptionPane.showMessageDialog(null, "Las tareas registradas son las siguientes\n"
                + textoConstruido.toString());

    }

}
