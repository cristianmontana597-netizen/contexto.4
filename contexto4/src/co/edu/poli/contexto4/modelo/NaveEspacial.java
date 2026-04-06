package co.edu.poli.contexto4.modelo;

import java.io.Serializable;

/**
 * Representa una unidad de transporte espacial dentro del sistema de la misión.
 * Esta clase gestiona las propiedades físicas de la nave, su rendimiento en
 * términos de velocidad y combustible, y su estado de mantenimiento.
 * @author TuNombre/Poli
 * @version 1.0
 */
public class NaveEspacial implements Serializable {

    /** Número de serie único que identifica a la nave */
    private String serial;
    
    /** Color exterior de la nave espacial */
    private String color;
    
    /** Dimensiones o categoría de tamaño de la nave */
    private String tamano;
    
    /** Peso total de la nave en toneladas o kilogramos */
    private double peso;
    
    /** Años de servicio o tiempo desde la fabricación de la nave */
    private int antiguedad;
    
    /** Velocidad máxima o actual de desplazamiento en el espacio */
    private double velocidad;
    
    /** Referencia al sistema de combustible de la nave (Relación 1..1) */
    private Combustible combustible;

    /**
     * Constructor completo para instanciar una nueva NaveEspacial.
     * @param serial     Identificador único de la nave.
     * @param color      Color representativo.
     * @param tamano     Clasificación de tamaño.
     * @param peso       Peso físico de la estructura.
     * @param antiguedad Años de operación.
     * @param velocidad  Velocidad de crucero.
     * @param combustible Objeto de tipo {@link Combustible} asignado.
     */
    public NaveEspacial(String serial, String color, String tamano, double peso, int antiguedad, double velocidad, Combustible combustible) {
        this.serial = serial;
        this.color = color;
        this.tamano = tamano;
        this.peso = peso;
        this.antiguedad = antiguedad;
        this.velocidad = velocidad;
        this.combustible = combustible;
    }

    /**
     * Calcula la tasa de consumo de combustible según los parámetros de la nave.
     * * @return El valor del combustible consumido (actualmente retorna 0.0).
     */
    public double consumirCombustible() {
        return 0.0; 
    }

    /**
     * Estima el tiempo necesario para llegar al destino basándose en la velocidad.
     * * @return El tiempo estimado de llegada (actualmente retorna 0.0).
     */
    public double calcularTiempoLlegada() {
        return 0.0;
    }

    /**
     * Determina si la nave requiere reparaciones tras una serie de viajes.
     * * @param viajesNave Cantidad de misiones realizadas por la nave.
     * @return true si la reparación se ejecutó correctamente.
     */
    public boolean repararNave(int viajesNave) {
        return true;
    }

    /**
     * Inicia los sistemas críticos y motores de la nave espacial.
     * * @return true si el encendido fue exitoso.
     */
    public boolean encenderNave() {
        return true;
    }

    /** @return El número de serie de la nave. */
    public String getSerial() { return serial; }
    /** @param serial El nuevo número de serie. */
    public void setSerial(String serial) { this.serial = serial; }

    /** @return El color de la nave. */
    public String getColor() { return color; }
    /** @param color El nuevo color. */
    public void setColor(String color) { this.color = color; }

    /** @return El tamaño de la nave. */
    public String getTamano() { return tamano; }
    /** @param tamano El nuevo tamaño. */
    public void setTamano(String tamano) { this.tamano = tamano; }

    /** @return El peso de la nave. */
    public double getPeso() { return peso; }
    /** @param peso El nuevo peso. */
    public void setPeso(double peso) { this.peso = peso; }

    /** @return Los años de antigüedad. */
    public int getAntiguedad() { return antiguedad; }
    /** @param antiguedad Los nuevos años de antigüedad. */
    public void setAntiguedad(int antiguedad) { this.antiguedad = antiguedad; }

    /** @return La velocidad actual. */
    public double getVelocidad() { return velocidad; }
    /** @param velocidad La nueva velocidad. */
    public void setVelocidad(double velocidad) { this.velocidad = velocidad; }

    /** @return El objeto de combustible asociado. */
    public Combustible getCombustible() { return combustible; }
    /** @param combustible El nuevo sistema de combustible. */
    public void setCombustible(Combustible combustible) { this.combustible = combustible; }

    /**
     * Retorna una representación textual con los datos clave de la nave.
     * @return Cadena con serial y velocidad.
     */
    @Override
    public String toString() {
        return "NaveEspacial [serial=" + serial + ", velocidad=" + velocidad + "]";
    }
}