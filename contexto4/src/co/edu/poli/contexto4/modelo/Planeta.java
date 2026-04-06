package co.edu.poli.contexto4.modelo;

import java.io.Serializable;

/**
 * Representa un cuerpo celeste de destino dentro de la misión espacial.
 * Esta clase almacena las condiciones ambientales y geográficas del planeta
 * para determinar su viabilidad para la exploración humana.
 * @author TuNombre/Poli
 * @version 1.0
 */
public class Planeta implements Serializable {
    
    /** Nombre identificador del planeta */
    private String nombre;
    
    /** Distancia promedio desde la Tierra medida en unidades astronómicas o kilómetros */
    private double distanciaTierra;
    
    /** Composición química predominante de la capa gaseosa del planeta */
    private String atmosfera;
    
    /** Indica la presencia de agua en cualquier estado físico */
    private boolean tieneAgua;
    
    /** Indica si la atmósfera posee niveles de oxígeno respirables */
    private boolean esOxigeno;

    /**
     * Constructor para inicializar un nuevo Planeta con sus parámetros ambientales.
     * @param nombre          Nombre del planeta.
     * @param distanciaTierra Distancia relativa a la Tierra.
     * @param atmosfera       Tipo de atmósfera detectada.
     * @param tieneAgua       Estado de presencia de agua.
     * @param esOxigeno       Estado de presencia de oxígeno.
     */
    public Planeta(String nombre, double distanciaTierra, String atmosfera, boolean tieneAgua, boolean esOxigeno) {
        this.nombre = nombre;
        this.setDistanciaTierra(distanciaTierra);
        this.setAtmosfera(atmosfera);
        this.tieneAgua = tieneAgua;
        this.esOxigeno = esOxigeno;
    }

    /**
     * Evalúa si el planeta cumple con los requisitos mínimos para la vida humana.
     * @return true si el planeta cuenta con agua y oxígeno simultáneamente.
     */
    public boolean esHabitable() {
        return tieneAgua && esOxigeno;
    }

    /** @return El nombre del planeta. */
    public String getNombre() { return nombre; }

    /** @return La distancia desde la Tierra. */
	public double getDistanciaTierra() {
		return distanciaTierra;
	}

    /** @param distanciaTierra La nueva distancia a establecer. */
	public void setDistanciaTierra(double distanciaTierra) {
		this.distanciaTierra = distanciaTierra;
	}

    /** @return La descripción de la atmósfera. */
	public String getAtmosfera() {
		return atmosfera;
	}

    /** @param atmosfera La nueva composición atmosférica. */
	public void setAtmosfera(String atmosfera) {
		this.atmosfera = atmosfera;
	}

    /**
     * Retorna una representación textual simple del planeta.
     * @return Cadena que incluye el nombre del cuerpo celeste.
     */
    @Override
    public String toString() {
        return "Planeta [nombre=" + nombre + "]";
    }

}