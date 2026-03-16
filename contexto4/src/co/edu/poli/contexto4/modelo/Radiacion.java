package co.edu.poli.contexto4.modelo;

public class Radiacion {
    private int id;
    private String tipo;
    private double cantidad;
    private double acumulacion;
    private double riesgo;
    private ContadorRadiacion contadorRadiacion;

    public Radiacion(int id, String tipo, double cantidad, double acumulacion, double riesgo, ContadorRadiacion contadorRadiacion) {
        this.id = id;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.acumulacion = acumulacion;
        this.riesgo = riesgo;
        this.contadorRadiacion = contadorRadiacion;
    }

    public double calcularRiesgo() {
        return 0.0;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getCantidad() { return cantidad; }
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }
    public double getAcumulacion() { return acumulacion; }
    public void setAcumulacion(double acumulacion) { this.acumulacion = acumulacion; }
    public double getRiesgo() { return riesgo; }
    public void setRiesgo(double riesgo) { this.riesgo = riesgo; }
    public ContadorRadiacion getContadorRadiacion() { return contadorRadiacion; }
    public void setContadorRadiacion(ContadorRadiacion contadorRadiacion) { this.contadorRadiacion = contadorRadiacion; }

    @Override
    public String toString() {
        return "Radiacion [tipo=" + tipo + ", riesgo=" + riesgo + "]";
    }
}