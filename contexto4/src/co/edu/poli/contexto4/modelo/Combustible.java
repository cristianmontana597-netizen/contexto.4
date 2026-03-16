package co.edu.poli.contexto4.modelo;

public class Combustible {
    private String id;
    private double cantidad;
    private boolean esInflamable;
    private boolean esReserva;

    public Combustible(String id, double cantidad, boolean esInflamable, boolean esReserva) {
        this.id = id;
        this.cantidad = cantidad;
        this.esInflamable = esInflamable;
        this.esReserva = esReserva;
    }

    public boolean usarCombustible(double cantidad) {
        return true;
    }

    public double recargarCombustible(double cantidad) {
        return this.cantidad + cantidad;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public double getCantidad() { return cantidad; }
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }
    public boolean isEsInflamable() { return esInflamable; }
    public void setEsInflamable(boolean esInflamable) { this.esInflamable = esInflamable; }
    public boolean isEsReserva() { return esReserva; }
    public void setEsReserva(boolean esReserva) { this.esReserva = esReserva; }

    @Override
    public String toString() {
        return "Combustible [id=" + id + ", cantidad=" + cantidad + "]";
    }
}