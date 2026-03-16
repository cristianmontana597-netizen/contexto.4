package co.edu.poli.contexto4.modelo;

public class Personal extends Persona {
    private String especialidad;
    private Mision mision;

    public Personal(String nombre, String id, int edad, int peso, double altura, int experiencia, String especialidad) {
        super(nombre, id, edad, peso, altura, experiencia);
        this.especialidad = especialidad;
        this.mision = mision;
    }

    // SOBRESCRITURA (#): Un parámetro. Según el diagrama: return super.identificarse()
    @Override
	public String identificarse(String id) {
         return nombre + id + especialidad;
    }

    // SOBRECARGA (#): Dos parámetros. Según la nota del diagrama: return super.identificarse() + especialidad
    public String identificarse(String id, String especialidad) {
		return especialidad;
        
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    @Override
    public String toString() {
        return super.toString()+ "Persona [nombre=" + nombre + "]";
    }
}