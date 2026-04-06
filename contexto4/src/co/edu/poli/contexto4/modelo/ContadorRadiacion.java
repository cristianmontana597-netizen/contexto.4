package co.edu.poli.contexto4.modelo;

import java.io.Serializable;

/**
 * Representa el dispositivo de medición de radiación utilizado en la misión espacial.
 * Permite gestionar las características físicas del contador y realizar
 * cálculos de niveles de radiación detectados en el entorno espacial.
 * * @author TuNombre/Poli
 * @version 1.0
 */
public class ContadorRadiacion implements Serializable {
    
    /** Identificador único o número de serie del dispositivo */
    private String serial;
    
    /** Color físico de la carcasa del contador */
    private String color;
    
    /** Dimensiones o tamaño del dispositivo (ej: Pequeño, Mediano, Grande) */
    private String tamano;
    
    /** Peso del dispositivo en kilogramos */
    private double peso;

    /**
     * Constructor para inicializar un nuevo dispositivo de conteo de radiación.
     * @param serial Número de serie único.
     * @param color  Color del dispositivo.
     * @param tamano Tamaño del dispositivo.
     * @param peso   Peso en kilogramos.
     */
    public ContadorRadiacion(String serial, String color, String tamano, double peso) {
        this.serial = serial;
        this.color = color;
        this.tamano = tamano;
        this.peso = peso;
    }

    /**
     * Calcula los niveles de radiación captados por el sensor.
     * @return El valor de radiación calculado (actualmente retorna 0.0).
     */
    public double calcularRadiacion() {
        return 0.0;
    }

    /**
     * Evalúa si el contador requiere reparación basándose en su historial de uso.
     * @param usosContador Cantidad de veces que se ha operado el dispositivo.
     * @return true si la reparación se puede realizar exitosamente.
     */
    public boolean repararContador(int usosContador) {
        return true;
    }

    /** @return El número de serie del contador. */
    public String getSerial() { return serial; }
    
    /** @param serial El nuevo número de serie a establecer. */
    public void setSerial(String serial) { this.serial = serial; }
    
    /** @return El color del dispositivo. */
    public String getColor() { return color; }
    
    /** @param color El nuevo color a asignar. */
    public void setColor(String color) { this.color = color; }
    
    /** @return El tamaño del dispositivo. */
    public String getTamano() { return tamano; }
    
    /** @param tamano El nuevo tamaño a establecer. */
    public void setTamano(String tamano) { this.tamano = tamano; }
    
    /** @return El peso del dispositivo. */
    public double getPeso() { return peso; }
    
    /** @param peso El nuevo peso a asignar. */
    public void setPeso(double peso) { this.peso = peso; }

    /**
     * Retorna una representación en texto del contador de radiación.
     ** @return Cadena que incluye el número de serie.
     */
    @Override
    public String toString() {
        return "ContadorRadiacion [serial=" + serial + "]";
    }
}