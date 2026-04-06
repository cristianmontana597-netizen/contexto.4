package co.edu.poli.contexto4.modelo;

/**
 * Representa al personal de apoyo técnico o administrativo de la misión espacial.
 * Esta clase extiende de {@link Persona} y añade una especialidad técnica 
 * y una relación directa con una {@link Mision} específica.
 * * @author TuNombre/Poli
 * @version 1.0
 */
public class Personal extends Persona {
    
    /** Área técnica o profesional en la que se desempeña el personal */
    private String especialidad;
    
    /** Misión específica a la cual está asignado este miembro del personal */
    private Mision mision;

    /**
     * Constructor para instanciar un miembro del Personal de apoyo.
     * @param nombre       Nombre completo del trabajador.
     * @param id           Identificación única.
     * @param edad         Edad en años.
     * @param peso         Peso en kilogramos.
     * @param altura       Estatura en metros.
     * @param experiencia  Años de trayectoria profesional.
     * @param especialidad Área de especialización (ej: Mantenimiento, Logística).
     */
    public Personal(String nombre, String id, int edad, int peso, double altura, int experiencia, String especialidad) {
        super(nombre, id, edad, peso, altura, experiencia);
        this.especialidad = especialidad;
        // La misión se inicializa generalmente mediante el setter tras la creación
        this.mision = mision; 
    }

    /**
     * Sobrescritura del método para identificar al personal.
     * Combina los datos base con la especialidad del individuo.
     * * @param id El identificador para el proceso.
     * @return Cadena que concatena nombre, id y especialidad.
     */
    @Override
	public String identificarse(String id) {
         return nombre + id + especialidad;
    }

    /**
     * Sobrecarga del método identificar que permite filtrar o retornar solo la especialidad.
     * @param id           Identificador del personal.
     * @param especialidad Especialidad técnica a validar.
     * @return El nombre de la especialidad.
     */
    public String identificarse(String id, String especialidad) {
		return especialidad;
    }
   
    /** @return La especialidad actual del personal. */
    public String getEspecialidad() {
        return especialidad;
    }

    /** @param especialidad La nueva especialidad a asignar. */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /** @return El objeto Mision asociado. */
    public Mision getMision() {
        return mision;
    }

    /** @param mision El nuevo objeto de misión a asignar. */
    public void setMision(Mision mision) {
        this.mision = mision;
    }

    /**
     * Retorna una representación en texto del miembro del personal.
     * @return Cadena con los datos de la superclase y el nombre específico.
     */
    @Override
    public String toString() {
        return super.toString() + " Personal [especialidad=" + especialidad + "]";
    }

    /**
     * Implementación del método abstracto para realizar una tarea específica de apoyo.
     * @return null como marcador de posición.
     */
	@Override
	public String realizarAccionEspecial() {
		// TODO Auto-generated method stub
		return null;
	}
}