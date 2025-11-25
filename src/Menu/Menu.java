package Menu;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Menu {

    public static void menu() {
        
        //Esta clase es el menu intercativo con el cual el usuario puede acceder a las diferentes funciones que hay en el menu.

        while (true) {

            String opcion = JOptionPane.showInputDialog("Selecciona una de las siguientes opciones\n"
                    + "1 -> Registrar nueva tarea\n"
                    + "2 -> Listar tareas\n"
                    + "3 -> Ver tareas vencidas\n"
                    + "4 -> Cerrar el programa");

            //Verificamos si la opcion no es nula, es decir que cierren la ventana.
            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Se ha ocacionado un cierre forzado");
                return;
            }

            switch (opcion) {
                case "1" -> {
                    Metodos.Agregar_Tarea.agregarTarea();
                }
                case "2" -> {
                    Metodos.Listar_Tareas.listarTareas();
                }
                case "3" -> {
                    Metodos.Tareas_Vencidas.mostrarTareasVencidas();
                }
                case "4" -> {
                    JOptionPane.showMessageDialog(null, "Cerrando aplicacion");
                    return;
                }
                default ->{
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                }
            }

        }

    }

}
