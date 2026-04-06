package co.edu.poli.contexto4.modelo;

import java.io.Serializable;

/**
 * Representa la entidad principal de una misión espacial. 
 * Esta clase centraliza la relación entre los astronautas, las naves, 
 * el planeta de destino y las condiciones de radiación detectadas.
 * * @author TuNombre/Poli
 * @version 1.0
 */
public class Mision implements Serializable {
    
    /** Identificador único de la misión */
    private String id;
    
    /** Lugar o base desde donde se coordina la misión */
    private String lugar;
    
    /** Registro de la fecha y hora de inicio */
    private String fechaHora;
    
    /** Referencia al planeta de destino (Relación 1..1) */
    private Planeta planeta; 
    
    /** Descripción del objetivo principal de la misión */
    private String objetivo;
    
    /** Descripción de los logros o el estado final de la misión */
    private String resultado;
    
    /** Listado de naves espaciales asignadas (Relación *) */
    private NaveEspacial[] naveEspacial; 
    
    /** Listado de astronautas especialistas asignados (Relación *) */
    private AstronautaEspecialista[] astronauta; 
    
    /** Datos de radiación asociados a la misión (Relación 1..1) */
    private Radiacion radiacion; 

    /**
     * Constructor para inicializar una misión con todos sus componentes.
     * * @param id             ID de la misión.
     * @param lugar          Ubicación de control.
     * @param fechaHora      Momento de ejecución.
     * @param planeta        Objeto del tipo Planeta asignado.
     * @param objetivo       Metas a cumplir.
     * @param resultado      Estado de la misión.
     * @param naveEspacial   Arreglo de naves involucradas.
     * @param astronauta     Arreglo de especialistas asignados.
     * @param radiacion      Objeto con datos de radiación.
     */
    public Mision(String id, String lugar, String fechaHora, Planeta planeta, String objetivo, 
                  String resultado, NaveEspacial[] naveEspacial, 
                  AstronautaEspecialista[] astronauta, Radiacion radiacion) {
        this.id = id;
        this.lugar = lugar;
        this.fechaHora = fechaHora;
        this.planeta = planeta;
        this.objetivo = objetivo;
        this.resultado = resultado;
        this.naveEspacial = naveEspacial;
        this.astronauta = astronauta;
        this.radiacion = radiacion;
    }

    /**
     * Realiza el cálculo estimado del tiempo que requiere la misión para completarse.
     * * @return El tiempo requerido calculado (actualmente retorna 0.0).
     */
    public double calcularTiempoRequerido() {
        // Implementación de ejemplo
        return 0.0;
    }

    /** @return El ID de la misión. */
    public String getId() { return id; }
    /** @param id El nuevo ID de la misión. */
    public void setId(String id) { this.id = id; }

    /** @return El lugar de la misión. */
    public String getLugar() { return lugar; }
    /** @param lugar El nuevo lugar de la misión. */
    public void setLugar(String lugar) { this.lugar = lugar; }

    /** @return La fecha y hora de la misión. */
    public String getFechaHora() { return fechaHora; }
    /** @param fechaHora La nueva fecha y hora. */
    public void setFechaHora(String fechaHora) { this.fechaHora = fechaHora; }

    /** @return El planeta de destino. */
    public Planeta getPlaneta() { return planeta; }
    /** @param planeta El nuevo planeta de destino. */
    public void setPlaneta(Planeta planeta) { this.planeta = planeta; }

    /** @return El objetivo de la misión. */
    public String getObjetivo() { return objetivo; }
    /** @param objetivo El nuevo objetivo de la misión. */
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }

    /** @return El resultado de la misión. */
    public String getResultado() { return resultado; }
    /** @param resultado El nuevo resultado de la misión. */
    public void setResultado(String resultado) { this.resultado = resultado; }

    /** @return Arreglo de naves espaciales. */
    public NaveEspacial[] getNaveEspacial() { return naveEspacial; }
    /** @param naveEspacial El nuevo arreglo de naves. */
    public void setNaveEspacial(NaveEspacial[] naveEspacial) { this.naveEspacial = naveEspacial; }

    /** @return Arreglo de astronautas especialistas. */
    public AstronautaEspecialista[] getAstronauta() { return astronauta; }
    /** @param astronauta El nuevo arreglo de astronautas. */
    public void setAstronauta(AstronautaEspecialista[] astronauta) { this.astronauta = astronauta; }

    /** @return El objeto de radiación. */
    public Radiacion getRadiacion() { return radiacion; }
    /** @param radiacion El nuevo objeto de radiación. */
    public void setRadiacion(Radiacion radiacion) { this.radiacion = radiacion; }

    /**
     * Retorna una representación textual simplificada de la misión.
     * @return Cadena con ID, objetivo y lugar.
     */
    @Override
    public String toString() {
        return "Mision [id=" + id + ", objetivo=" + objetivo + ", lugar=" + lugar + "]";
    }
}