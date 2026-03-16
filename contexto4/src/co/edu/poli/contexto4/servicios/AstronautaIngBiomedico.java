package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.modelo.AstronautaEspecialista;

class AstronautaingBioquimico extends AstronautaEspecialista {
 
 private static String certificado;
 private static String laboratorio;

 public AstronautaingBioquimico(String nombre, String id, int edad, int peso, double altura, int experiencia, 
                                int equipo, double oxigeno, String rango, String pCertificado, String pLaboratorio) {
     super(nombre, id, edad, peso, altura, experiencia, equipo, oxigeno, rango);
     certificado = pCertificado;
     laboratorio = pLaboratorio;
 }


 public static String obtenerInfoLab() {
     return "Info Lab: " + laboratorio + " | Certificado: " + certificado;
 }



 @Override
 public String toString() {
     return "AstronautaingBioquimico [Estaticos -> Lab: " + laboratorio + "]";
 }
}