package co.edu.poli.contexto4.modelo;

public class NaveEspacial {
    private String serial;
    private String color;
    private String tamano;
    private double peso;
    private int antiguedad;
    private double velocidad;
    private Combustible combustible;

    public NaveEspacial(String serial, String color, String tamano, double peso, int antiguedad, double velocidad, Combustible combustible) {
        this.serial = serial;
        this.color = color;
        this.tamano = tamano;
        this.peso = peso;
        this.antiguedad = antiguedad;
        this.velocidad = velocidad;
        this.combustible = combustible;
    }

    public double consumirCombustible() {
        return 0.0; 
    }

    public double calcularTiempoLlegada() {
        return 0.0;
    }

    public boolean repararNave(int viajesNave) {
        return true;
    }

    public boolean encenderNave() {
        return true;
    }

    // Getters y Setters
    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public int getAntiguedad() { return antiguedad; }
    public void setAntiguedad(int antiguedad) { this.antiguedad = antiguedad; }
    public double getVelocidad() { return velocidad; }
    public void setVelocidad(double velocidad) { this.velocidad = velocidad; }
    public Combustible getCombustible() { return combustible; }
    public void setCombustible(Combustible combustible) { this.combustible = combustible; }

    @Override
    public String toString() {
        return "NaveEspacial [serial=" + serial + ", velocidad=" + velocidad + "]";
    }
}