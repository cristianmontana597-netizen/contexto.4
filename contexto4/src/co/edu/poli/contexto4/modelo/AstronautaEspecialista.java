package co.edu.poli.contexto4.modelo;

/**
 * Representa a un astronauta con especialización técnica dentro de la misión espacial.
 * Esta clase extiende de {@link Persona} y añade atributos específicos como equipo,
 * niveles de oxigeno y rango militar o científico.
 * * @author TuNombre/Poli
 * @version 1.0
 */
public class AstronautaEspecialista extends Persona {
    
    /** Identificador del equipo al que pertenece el astronauta */
    private int equipo;
    
    /** Nivel actual de oxígeno disponible en el traje espacial */
    private double oxigeno;
    
    /** Rango o cargo específico del astronauta (ej: Comandante, Especialista) */
    private String rango;

    /**
     * Constructor completo para crear un AstronautaEspecialista.
     * @param nombre      Nombre completo del astronauta.
     * @param id          Identificación única.
     * @param edad        Edad del astronauta.
     * @param peso        Peso en kilogramos.
     * @param altura      Estatura en metros.
     * @param experiencia Años de experiencia en misiones.
     * @param equipo      Número o ID del equipo asignado.
     * @param oxigeno     Cantidad inicial de oxígeno.
     * @param rango       Rango asignado en la misión.
     */
    public AstronautaEspecialista(String nombre, String id, int edad, int peso, double altura, int experiencia, int equipo, double oxigeno, String rango) {
        super(nombre, id, edad, peso, altura, experiencia);
        this.equipo = equipo;
        this.oxigeno = oxigeno;
        this.rango = rango;
    }

    /**
     * Genera una cadena de texto para identificar al astronauta incluyendo su rango.
     * @param id El identificador a procesar.
     * @return Una cadena que combina la identificación base con los datos del astronauta.
     */
    @Override
	public String identificarse(String id) {
        return super.identificarse(id) + "Astronauta - " + getNombre() + " (Rango: " + rango + ")";
    }

    /**
     * Reduce la cantidad de oxígeno disponible según el consumo indicado.
     * @param cantidad Cantidad de oxígeno a restar del tanque.
     * @return El nivel de oxígeno restante después del consumo.
     */
    public double consumirOxigeno(double cantidad) {
        this.oxigeno -= cantidad;
        return this.oxigeno;
    }

    /**
     * Calcula el Índice de Masa Corporal (IMC) del astronauta.
     * @return El valor del IMC calculado como peso / (altura^2).
     */
    public double calcularIMC() {
        return getPeso() / (getAltura() * getAltura());
    }

    /**
     * Retorna una representación en texto del objeto AstronautaEspecialista.
     * @return Cadena con los datos base de la persona y el rango del astronauta.
     */
    @Override
    public String toString() {
        return super.toString() + ", Rango: " + rango;
    }

    /** @return El rango del astronauta. */
    public String getRango() { return rango; }

    /** @return El ID del equipo. */
	public int getEquipo() {
		return equipo;
	}

    /** @param equipo El nuevo ID de equipo a asignar. */
	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}

    /** @return El nivel de oxígeno actual. */
	public double getOxigeno() {
		return oxigeno;
	}

    /** @param oxigeno El nuevo nivel de oxígeno a establecer. */
	public void setOxigeno(double oxigeno) {
		this.oxigeno = oxigeno;
	}

    /** @param rango El nuevo rango a asignar. */
	public void setRango(String rango) {
		this.rango = rango;
	}

    /**
     * Implementación del método abstracto para realizar una acción específica del rol.
     * Actualmente retorna null como marcador de posición.
     * @return null.
     */
	@Override
	public String realizarAccionEspecial() {
		// TODO Auto-generated method stub
		return null;
	}
}