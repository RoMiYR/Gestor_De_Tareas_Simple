package Obtencion_De_Datos;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Obtener_Nivel_De_Prioridad {

    public static String nivelDePrioridad() {

        //Dentro de un while que no se detiene hasta que se cancele la operacion de registro o se cierre la ventara, se pide al usuario que ingrese el nivel de prioridad
        //con las opciones mostradas que son las disponibles
        
        while (true) {

            String opcionTemporal = JOptionPane.showInputDialog("Ingresa el nivel de prioridad de la tarea\n"
                    + "1 -> Baja\n"
                    + "2 -> Media\n"
                    + "3 -> Alta\n"
                    + "4 -> Urgente");

            if (opcionTemporal == null) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");
                return "-1";
            }

            switch (opcionTemporal) {
                case "1" -> {
                    return "Baja";
                }
                case "2" -> {
                    return "Media";
                }
                case "3" -> {
                    return "Alta";
                }
                case "4" -> {
                    return "Urgente";
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Debes elegir un nivel de prioridad valido!");
                }

            }

        }

    }
}
