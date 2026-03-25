package co.edu.poli.contexto4.modelo;

public class AstronautaEspecialista extends Persona {
    private int equipo;
    private double oxigeno;
    private String rango;

    public AstronautaEspecialista(String nombre, String id, int edad, int peso, double altura, int experiencia, 
                                 int equipo, double oxigeno, String rango) {
        super(nombre, id, edad, peso, altura, experiencia);
        this.equipo = equipo;
        this.oxigeno = oxigeno;
        this.rango = rango;
    }

    
    @Override
	public String identificarse(String id) {
        return super.identificarse(id)+"Astronauta - " + getNombre() + " (Rango: " + rango + ")";
    }

    
    public double consumirOxigeno(double cantidad) {
        this.oxigeno -= cantidad;
        return this.oxigeno;
    }

    public double calcularIMC() {
        return getPeso() / (getAltura() * getAltura());
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Rango: " + rango + ", Equipo: " + equipo + ", Oxigeno: " + oxigeno;
    }

    public String getRango() { return rango; }


	public int getEquipo() {
		return equipo;
	}


	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}


	public double getOxigeno() {
		return oxigeno;
	}


	public void setOxigeno(double oxigeno) {
		this.oxigeno = oxigeno;
	}


	public void setRango(String rango) {
		this.rango = rango;
	}


	@Override
	public String realizarAccionEspecial() {
		// TODO Auto-generated method stub
		return null;
	}
}