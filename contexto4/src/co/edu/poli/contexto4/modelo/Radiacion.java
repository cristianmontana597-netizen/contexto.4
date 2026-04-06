package co.edu.poli.contexto4.modelo;

import java.io.Serializable;

/**
 * Representa los datos de radiación detectados durante la misión espacial.
 * Esta clase gestiona el tipo de radiación, los niveles de acumulación y 
 * el riesgo asociado, apoyándose en un dispositivo de medición específico.
 * @author TuNombre/Poli
 * @version 1.0
 */
public class Radiacion implements Serializable {
    
    /** Identificador único del registro de radiación */
    private int id;
    
    /** Tipo de radiación detectada (ej: Gamma, Alfa, Beta, Cósmica) */
    private String tipo;
    
    /** Cantidad instantánea de radiación medida */
    private double cantidad;
    
    /** Sumatoria de radiación recibida a lo largo del tiempo */
    private double acumulacion;
    
    /** Nivel de riesgo calculado para la integridad de la tripulación */
    private double riesgo;
    
    /** Referencia al dispositivo físico que realiza la medición (Relación 1..1) */
    private ContadorRadiacion contadorRadiacion;

    /**
     * Constructor para inicializar un nuevo registro de radiación.
     * * @param id               ID del registro.
     * @param tipo             Categoría de la radiación.
     * @param cantidad         Nivel medido actualmente.
     * @param acumulacion      Total acumulado en la misión.
     * @param riesgo           Factor de riesgo inicial.
     * @param contadorRadiacion Objeto {@link ContadorRadiacion} vinculado.
     */
    public Radiacion(int id, String tipo, double cantidad, double acumulacion, double riesgo, ContadorRadiacion contadorRadiacion) {
        this.id = id;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.acumulacion = acumulacion;
        this.riesgo = riesgo;
        this.contadorRadiacion = contadorRadiacion;
    }

    /**
     * Calcula el riesgo potencial basado en la cantidad y acumulación de radiación.
     * * @return El valor del riesgo calculado (actualmente retorna 0.0).
     */
    public double calcularRiesgo() {
        return 0.0;
    }

    /** @return El ID del registro de radiación. */
    public int getId() { return id; }
    
    /** @param id El nuevo ID a establecer. */
    public void setId(int id) { this.id = id; }
    
    /** @return El tipo de radiación detectada. */
    public String getTipo() { return tipo; }
    
    /** @param tipo El nuevo tipo de radiación. */
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    /** @return La cantidad medida. */
    public double getCantidad() { return cantidad; }
    
    /** @param cantidad La nueva cantidad a establecer. */
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }
    
    /** @return La radiación total acumulada. */
    public double getAcumulacion() { return acumulacion; }
    
    /** @param acumulacion El nuevo valor de acumulación. */
    public void setAcumulacion(double acumulacion) { this.acumulacion = acumulacion; }
    
    /** @return El nivel de riesgo actual. */
    public double getRiesgo() { return riesgo; }
    
    /** @param riesgo El nuevo nivel de riesgo a asignar. */
    public void setRiesgo(double riesgo) { this.riesgo = riesgo; }
    
    /** @return El objeto contador vinculado. */
    public ContadorRadiacion getContadorRadiacion() { return contadorRadiacion; }
    
    /** @param contadorRadiacion El nuevo contador de radiación a asignar. */
    public void setContadorRadiacion(ContadorRadiacion contadorRadiacion) { this.contadorRadiacion = contadorRadiacion; }

    /**
     * Retorna una representación textual del riesgo de radiación.
     * * @return Cadena con el tipo y el riesgo calculado.
     */
    @Override
    public String toString() {
        return "Radiacion [tipo=" + tipo + ", riesgo=" + riesgo + "]";
    }
}