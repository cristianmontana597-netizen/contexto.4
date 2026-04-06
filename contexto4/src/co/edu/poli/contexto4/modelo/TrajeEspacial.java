package co.edu.poli.contexto4.modelo;

import java.io.Serializable;

/**
 * Representa el equipo de protección individual utilizado por los astronautas.
 * Esta clase gestiona tanto atributos únicos por traje (serial, tamaño) como 
 * atributos estáticos compartidos por todo el inventario (color, peso base).
 * * <p>Implementa {@link Serializable} para permitir la persistencia en el sistema.</p>
 * * @author TuNombre/Poli
 * @version 1.0
 */
public class TrajeEspacial implements Serializable {

    /** Número de serie único del traje espacial */
    private String serial;
    
    /** Talla o dimensiones del traje (ej: S, M, L, XL) */
    private String tamano;
    
    /** Años de uso o tiempo desde el último mantenimiento */
    private int antiguedad;
    
    /** Velocidad de desplazamiento permitida o autonomía del propulsor */
    private double velocidad;
    
    /** Referencia al astronauta que tiene asignado el traje (Relación 1..1) */
    private AstronautaEspecialista astronauta;

    /** Color estándar de fabricación para todos los trajes (Atributo Estático).
     * En el diagrama UML aparece subrayado por ser miembro de clase.
     */
    private static String color = "blanco";
    
    /** * Peso estándar en kilogramos compartido por todos los trajes (Atributo Estático).
     * En el diagrama UML aparece subrayado por ser miembro de clase.
     */
    private static double peso = 50.00;

    /**
     * Constructor completo para crear una instancia de TrajeEspacial.
     * * @param serial     Identificador único.
     * @param tamano     Talla del traje.
     * @param antiguedad Años de servicio.
     * @param velocidad  Capacidad de desplazamiento.
     * @param astronauta Objeto {@link AstronautaEspecialista} vinculado.
     */
    public TrajeEspacial(String serial, String tamano, int antiguedad, double velocidad, AstronautaEspecialista astronauta) {
        this.serial = serial;
        this.tamano = tamano;
        this.antiguedad = antiguedad;
        this.velocidad = velocidad;
        this.astronauta = astronauta;
    }

    /**
     * Evalúa y ejecuta el protocolo de reparación del traje según su uso.
     * * @param usosTraje Cantidad de misiones o salidas extravehiculares realizadas.
     * @return true si la reparación se completó con éxito.
     */
    public boolean repararTraje(int usosTraje) {
        return true;
    }

    // --- Getters y Setters Estáticos ---

    /** @return El color compartido por todos los trajes. */
    public static String getColor() { return color; }
    
    /** @param nuevoColor El nuevo color estándar para la flota de trajes. */
    public static void setColor(String nuevoColor) { color = nuevoColor; }

    /** @return El peso estándar de los trajes. */
    public static double getPeso() { return peso; }
    
    /** @param nuevoPeso El nuevo peso base a establecer para la clase. */
    public static void setPeso(double nuevoPeso) { peso = nuevoPeso; }

    // --- Getters y Setters de Instancia ---

    /** @return El número de serie del traje. */
    public String getSerial() { return serial; }
    
    /** @param serial El nuevo número de serie. */
    public void setSerial(String serial) { this.serial = serial; }

    /** @return La talla del traje. */
    public String getTamano() { return tamano; }
    
    /** @param tamano La nueva talla a asignar. */
    public void setTamano(String tamano) { this.tamano = tamano; }

    /** @return Los años de antigüedad del equipo. */
    public int getAntiguedad() { return antiguedad; }
    
    /** @param antiguedad Los nuevos años de antigüedad. */
    public void setAntiguedad(int antiguedad) { this.antiguedad = antiguedad; }

    /** @return La velocidad de operación. */
    public double getVelocidad() { return velocidad; }
    
    /** @param velocidad La nueva velocidad a establecer. */
    public void setVelocidad(double velocidad) { this.velocidad = velocidad; }

    /** @return El astronauta propietario del traje. */
    public AstronautaEspecialista getAstronauta() { return astronauta; }
    
    /** @param astronauta El nuevo astronauta especialista asignado. */
    public void setAstronauta(AstronautaEspecialista astronauta) { this.astronauta = astronauta; }

    /**
     * Retorna una representación textual del traje, incluyendo datos compartidos.
     * * @return Cadena con serial, tamaño, color y peso.
     */
    @Override
    public String toString() {
        return "TrajeEspacial [" +
               "serial=" + serial + 
               ", tamano=" + tamano + 
               ", color compartido=" + color + 
               ", peso compartido=" + peso + "kg" +
               "]";
    }
}