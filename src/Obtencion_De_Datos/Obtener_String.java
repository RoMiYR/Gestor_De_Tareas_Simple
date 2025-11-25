package Obtencion_De_Datos;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Obtener_String {

    public static String obtenerString(String atributoAObtener) {

        //Dentro de un while este metodo se encarga de obterner un string validando todas las entradas incorrectas que puedan suceder, pide el texto del atributo a obtener
        //para concatenarlo a el mensaje que se mostrara.
        
        while (true) {

            String valorTemporal = JOptionPane.showInputDialog("Ingrese " + atributoAObtener);
            if (valorTemporal == null) {
                JOptionPane.showMessageDialog(null, "Registro Cancelado");
                return "-1";
            } else if (valorTemporal.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Este campo no puede quedar vacio");
            } else {
                return valorTemporal;
            }

        }

    }

}
