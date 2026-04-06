package co.edu.poli.contexto4.modelo;

import java.io.Serializable;

/**
 * Representa el informe de actividades y desempeño de un miembro del personal.
 * Esta clase permite rastrear la productividad, los días laborados y el 
 * resultado final de las tareas asignadas dentro de la misión espacial.
 * Implementa {@link Serializable} para garantizar que los registros puedan 
 * ser almacenados en el archivo binario del sistema.
 * * @author TuNombre/Poli
 * @version 1.0
 */
public class RegistroTrabajo implements Serializable {
    
    /** Identificador único del registro de trabajo */
    private String id;
    
    /** Referencia al miembro del personal asociado al registro (Relación 1..1) */
    private Personal personal;
    
    /** Cantidad total de días que el personal ha dedicado a sus labores */
    private int diasTrabajados;
    
    /** Descripción del logro, entregable o estado final del trabajo realizado */
    private String resultado;

    /**
     * Constructor para inicializar un nuevo registro de trabajo.
     * @param id             ID único del registro.
     * @param personal       Objeto de tipo {@link Personal} responsable de la tarea.
     * @param diasTrabajados Número de jornadas completadas.
     * @param resultado      Resumen del desempeño o producto obtenido.
     */
    public RegistroTrabajo(String id, Personal personal, int diasTrabajados, String resultado) {
        this.id = id;
        this.personal = personal;
        this.diasTrabajados = diasTrabajados;
        this.resultado = resultado;
    }

    /** @return El identificador del registro. */
    public String getId() { return id; }
    
    /** @param id El nuevo ID para este registro. */
    public void setId(String id) { this.id = id; }
    
    /** @return El objeto Personal asociado al registro. */
    public Personal getPersonal() { return personal; }
    
    /** @param personal El nuevo miembro del personal a vincular. */
    public void setPersonal(Personal personal) { this.personal = personal; }
    
    /** @return El número de días trabajados. */
    public int getDiasTrabajados() { return diasTrabajados; }
    
    /** @param diasTrabajados La nueva cantidad de días a establecer. */
    public void setDiasTrabajados(int diasTrabajados) { this.diasTrabajados = diasTrabajados; }
    
    /** @return El resultado o descripción del trabajo. */
    public String getResultado() { return resultado; }
    
    /** @param resultado El nuevo resultado o estado a asignar. */
    public void setResultado(String resultado) { this.resultado = resultado; }

    /**
     * Retorna una representación textual simplificada del registro de trabajo.
     * * @return Cadena que incluye el ID y el resultado del registro.
     */
    @Override
    public String toString() {
        return "RegistroTrabajo [id=" + id + ", resultado=" + resultado + "]";
    }
}