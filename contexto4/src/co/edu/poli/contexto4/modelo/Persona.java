package co.edu.poli.contexto4.modelo;


public abstract class Persona {
    public static final String ESPECIE = "HUMANO";
	protected String nombre;
    private String id;
    private int edad;
    private int peso;
    private double altura;
    private int experiencia;

    public Persona(String nombre, String id, int edad, int peso, double altura, int experiencia) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.experiencia = experiencia;
    }

    // Métodos PROTEGIDOS 
   public String identificarse(String id) {
        return nombre;
    }

   public String identificarse(String id, int edad) {
    	return nombre + id +  edad;
    } 
   public abstract String realizarAccionEspecial();
   

    // Métodos de acceso PÚBLICOS (+)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public int getPeso() { return peso; }
    public void setPeso(int peso) { this.peso = peso; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public int getExperiencia() { return experiencia; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    
    
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", id=" + id + "]";
    }

	}
