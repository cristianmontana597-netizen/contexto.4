package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.modelo.AstronautaEspecialista;
import java.io.Serializable;

/**
 * Representa a un astronauta especializado en Bioquímica dentro de la misión.
 * Esta clase hereda de {@link AstronautaEspecialista} y utiliza miembros estáticos
 * para gestionar la información del laboratorio y certificaciones compartidas.
 * * <p>Al heredar de una cadena que implementa {@link Serializable}, esta clase 
 * permite la persistencia de sus datos de instancia.</p>
 * * @author TuNombre/Poli
 * @version 1.0
 */
class AstronautaingBioquimico extends AstronautaEspecialista {
 
    /** Certificación profesional compartida por todos los ingenieros bioquímicos */
    private static String certificado;
    
    /** Nombre o identificador del laboratorio asignado a la especialidad */
    private static String laboratorio;

    /**
     * Constructor para instanciar un Astronauta Ingeniero Bioquímico.
     * * @param nombre       Nombre completo.
     * @param id           Identificación única.
     * @param edad         Edad en años.
     * @param peso         Peso en kilogramos.
     * @param altura       Estatura en metros.
     * @param experiencia  Años de trayectoria.
     * @param equipo       ID del equipo asignado.
     * @param oxigeno      Nivel de oxígeno inicial.
     * @param rango        Rango dentro de la misión.
     * @param pCertificado Valor para el certificado estático.
     * @param pLaboratorio Valor para el laboratorio estático.
     */
    public AstronautaingBioquimico(String nombre, String id, int edad, int peso, double altura, int experiencia, 
                                   int equipo, double oxigeno, String rango, String pCertificado, String pLaboratorio) {
        super(nombre, id, edad, peso, altura, experiencia, equipo, oxigeno, rango);
        certificado = pCertificado;
        laboratorio = pLaboratorio;
    }

    /**
     * Método estático de utilidad que retorna la información técnica del laboratorio.
     * * @return Una cadena con los datos del laboratorio y el certificado actual.
     */
    public static String obtenerInfoLab() {
        return "Info Lab: " + laboratorio + " | Certificado: " + certificado;
    }

    /**
     * Retorna una representación textual del ingeniero bioquímico, resaltando sus datos estáticos.
     * * @return Cadena con la información del laboratorio.
     */
    @Override
    public String toString() {
        return "AstronautaingBioquimico [Estaticos -> Lab: " + laboratorio + "]";
    }
}