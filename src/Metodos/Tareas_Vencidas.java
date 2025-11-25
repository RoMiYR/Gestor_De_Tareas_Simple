package Metodos;

import Obtencion_De_Datos.Obtener_Fecha_Limite;
import Tarea.Tarea;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Tareas_Vencidas {

    public static void mostrarTareasVencidas() {

        LocalDate fechaElegida = null;

        if (Coleccion_De_Tareas.Coleccion_De_Tareas.getTareas().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aun no hay tareas registradas");
            return;
        }

        while (fechaElegida == null) {

            String opcionTemporal = JOptionPane.showInputDialog("De que forma quiere saber si las tareas han vencido\n"
                    + "1 -> Ingresando una fecha especifica\n"
                    + "2 -> Usando la fecha actual");

            if (opcionTemporal == null) {
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
                return;
            }

            switch (opcionTemporal) {
                case "1" -> {
                    fechaElegida = Obtener_Fecha_Limite.obtenerFechaLimite();
                }
                case "2" -> {
                    fechaElegida = LocalDate.now();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Debes elegir una opcion valida!");
                }
            }

        }

        StringBuilder fechasVencidas = new StringBuilder();

        for (Tarea tareaActual : Coleccion_De_Tareas.Coleccion_De_Tareas.getTareas()) {

            if (tareaActual.getFechaLimite().isBefore(fechaElegida)) {
                fechasVencidas.append(tareaActual.getNombre() + "/").append(tareaActual.getPrioridad() + "/").append(tareaActual.getFechaLimite() + "\n");
            }

        }
        
        if (fechasVencidas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay tareas vencidas segun la fecha indicada");
            return;
        }

        JOptionPane.showMessageDialog(null, "A continuacion se mostraran las tareas vencidas segun la fecha -> " + fechaElegida + "\n"
                + fechasVencidas);

    }

}
