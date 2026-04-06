package co.edu.poli.contexto4.modelo;

import java.io.Serializable;

/**
 * Representa la base conceptual de cualquier individuo dentro de la misión espacial.
 * Esta clase es abstracta, lo que significa que no puede ser instanciada directamente,
 * sirviendo como molde para roles específicos como Astronautas o Personal.
 * Implementa {@link Serializable} para permitir la persistencia de datos en archivos binarios.
 * @author TuNombre/Poli
 * @version 1.0
 */
public abstract class Persona implements Serializable {
    
    /** Constante que define la especie biológica de la persona */
    public static final String ESPECIE = "HUMANO";
    
    /** Nombre completo del individuo */
    protected String nombre;
    
    /** Identificador único o documento de identidad */
    private String id;
    
    /** Edad cronológica del individuo */
    private int edad;
    
    /** Masa corporal en kilogramos */
    private double peso;
    
    /** Estatura o altura en metros */
    private double altura;
    
    /** Años de experiencia previa en el sector aeroespacial */
    private int experiencia;

    /**
     * Constructor para inicializar los atributos base de una Persona.
     * @param nombre      Nombre completo.
     * @param id          Identificación única.
     * @param edad        Edad en años.
     * @param peso        Peso en kg.
     * @param altura      Altura en metros.
     * @param experiencia Años de trayectoria.
     */
    public Persona(String nombre, String id, int edad, double peso, double altura, int experiencia) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.experiencia = experiencia;
    }

    /**
     * Retorna el nombre de la persona como forma básica de identificación.
     * * @param id El identificador para el proceso de validación.
     * @return El nombre de la persona.
     */
    public String identificarse(String id) {
        return nombre;
    }

    /**
     * Método sobrecargado para identificación detallada incluyendo edad.
     * * @param id   Identificador único.
     * @param edad Edad del individuo.
     * @return Cadena concatenada con nombre, id y edad.
     */
    public String identificarse(String id, int edad) {
    	return nombre + id + edad;
    } 

    /**
     * Método abstracto que debe ser implementado por las subclases para definir
     * una acción única según el rol (Astronauta o Personal).
     * * @return Mensaje describiendo la acción realizada.
     */
    public abstract String realizarAccionEspecial();

    /** @return El nombre de la persona. */
    public String getNombre() { return nombre; }
    
    /** @param nombre El nuevo nombre a establecer. */
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    /** @return El ID de la persona. */
    public String getId() { return id; }
    
    /** @param id El nuevo ID a establecer. */
    public void setId(String id) { this.id = id; }
    
    /** @return La edad actual. */
    public int getEdad() { return edad; }
    
    /** @param edad La nueva edad a establecer. */
    public void setEdad(int edad) { this.edad = edad; }
    
    /** @return El peso en kg. */
    public double getPeso() { return peso; }
    
    /** @param d El nuevo peso a establecer. */
    public void setPeso(double d) { this.peso = d; }
    
    /** @return La altura en metros. */
    public double getAltura() { return altura; }
    
    /** @param altura La nueva altura a establecer. */
    public void setAltura(double altura) { this.altura = altura; }
    
    /** @return Los años de experiencia. */
    public int getExperiencia() { return experiencia; }
    
    /** @param experiencia Los nuevos años de experiencia. */
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    /**
     * Retorna una representación en texto legible de la persona.
     * * @return Cadena con el nombre e ID.
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", id=" + id + "]";
    }
}