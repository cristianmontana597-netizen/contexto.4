package co.edu.poli.contexto4.modelo;

public class ContadorRadiacion {
    private String serial;
    private String color;
    private String tamano;
    private double peso;

    public ContadorRadiacion(String serial, String color, String tamano, double peso) {
        this.serial = serial;
        this.color = color;
        this.tamano = tamano;
        this.peso = peso;
    }

    public double calcularRadiacion() {
        return 0.0;
    }

    public boolean repararContador(int usosContador) {
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

    @Override
    public String toString() {
        return "ContadorRadiacion [serial=" + serial + "]";
    }
}