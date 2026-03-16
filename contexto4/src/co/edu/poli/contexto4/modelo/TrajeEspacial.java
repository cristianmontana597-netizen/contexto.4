package co.edu.poli.contexto4.modelo;

public class TrajeEspacial {
    // Atributos de instancia (propios de cada traje)
    private String serial;
    private String tamano;
    private int antiguedad;
    private double velocidad;
    private AstronautaEspecialista astronauta;

    // Atributos estáticos (compartidos por todos los trajes - subrayados en diagrama)
    private static String color = "blanco";
    private static double peso = 50.00;

    // Constructor sobrecargado
    public TrajeEspacial(String serial, String tamano, int antiguedad, double velocidad, AstronautaEspecialista astronauta) {
        this.serial = serial;
        this.tamano = tamano;
        this.antiguedad = antiguedad;
        this.velocidad = velocidad;
        this.astronauta = astronauta;
    }

    // Método de lógica del diagrama
    public boolean repararTraje(int usosTraje) {
        return true;
    }

    // --- Getters y Setters Estáticos ---
    public static String getColor() { return color; }
    public static void setColor(String nuevoColor) { color = nuevoColor; }

    public static double getPeso() { return peso; }
    public static void setPeso(double nuevoPeso) { peso = nuevoPeso; }

    // --- Getters y Setters de Instancia ---
    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }

    public int getAntiguedad() { return antiguedad; }
    public void setAntiguedad(int antiguedad) { this.antiguedad = antiguedad; }

    public double getVelocidad() { return velocidad; }
    public void setVelocidad(double velocidad) { this.velocidad = velocidad; }

    public AstronautaEspecialista getAstronauta() { return astronauta; }
    public void setAstronauta(AstronautaEspecialista astronauta) { this.astronauta = astronauta; }

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