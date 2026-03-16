package co.edu.poli.contexto4.modelo;

public class Planeta {
    private String nombre;
    private double distanciaTierra;
    private String atmosfera;
    private boolean tieneAgua;
    private boolean esOxigeno;

    public Planeta(String nombre, double distanciaTierra, String atmosfera, boolean tieneAgua, boolean esOxigeno) {
        this.nombre = nombre;
        this.setDistanciaTierra(distanciaTierra);
        this.setAtmosfera(atmosfera);
        this.tieneAgua = tieneAgua;
        this.esOxigeno = esOxigeno;
    }

    public boolean esHabitable() {
        return tieneAgua && esOxigeno;
    }

    // Getters, Setters y toString...
    public String getNombre() { return nombre; }

	public double getDistanciaTierra() {
		return distanciaTierra;
	}

	public void setDistanciaTierra(double distanciaTierra) {
		this.distanciaTierra = distanciaTierra;
	}

	public String getAtmosfera() {
		return atmosfera;
	}

	public void setAtmosfera(String atmosfera) {
		this.atmosfera = atmosfera;
	}
    @Override
    public String toString() {
        return "Planeta [nombre=" + nombre + "]";
    }

}