package Tarea;

import java.time.LocalDate;

/**
 *
 * @author josue
 */
public class Tarea {
    
    //Atributos
    private String nombre;
    private String descripcion;
    private String prioridad;
    private LocalDate fechaLimite;

    //Constructores
    public Tarea() {

    }

    public Tarea(String nombre, String descripcion, String prioridad, LocalDate fechaLimite) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

}
