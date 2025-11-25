package Obtencion_De_Datos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Obtener_Fecha_Limite {

    //Este metodo se encarga de obtener la fecha limite de la tarea que se desea registrar, maneja las excepciones como que el formato de la fecha ingresa no sea
    //el indicado.
    
    public static LocalDate obtenerFechaLimite() {

        while (true) {

            String fechaLimiteString = JOptionPane.showInputDialog("Ingresa la fecha limite de la tarea en el formato DD-MM-YYYY");
            if (fechaLimiteString == null) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");
                return null;
            }
            try {
                LocalDate fechaLimite = LocalDate.parse(fechaLimiteString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                return fechaLimite;
            } catch (DateTimeParseException ex) {
                JOptionPane.showMessageDialog(null, "Formato ingresado invalido");
            }

        }

    }

}
