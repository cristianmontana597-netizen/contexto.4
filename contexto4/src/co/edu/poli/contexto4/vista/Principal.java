package co.edu.poli.contexto4.vista;

import co.edu.poli.contexto4.modelo.AstronautaEspecialista;
import co.edu.poli.contexto4.modelo.Combustible;
import co.edu.poli.contexto4.modelo.ContadorRadiacion;
import co.edu.poli.contexto4.modelo.Mision;
import co.edu.poli.contexto4.modelo.NaveEspacial;
import co.edu.poli.contexto4.modelo.Persona;
import co.edu.poli.contexto4.modelo.Personal;
import co.edu.poli.contexto4.modelo.Planeta;
import co.edu.poli.contexto4.modelo.Radiacion;
import co.edu.poli.contexto4.modelo.TrajeEspacial;

public class Principal {

    public static void main(String[] args) {
        
   
    	
Persona[] tripulacion = new Persona[5];
        
        // Colocar 3 objetos diferentes (Polimorfismo en asignación)
        tripulacion[0] = new Persona("Juan Pérez", "123A", 25, 72, 1.76, 10);
        tripulacion[1] = new AstronautaEspecialista("Elena Duque", "321B", 30, 80, 1.80, 15, 3, 75, "comandante");
        tripulacion[2] = new Personal("Dr. Smith", "Científico", 26, 68, 1.73, 6, "cientifico");
        for (Persona miembro : tripulacion) {
            if (miembro != null) { 
                System.out.println(miembro.toString());
            } else {
                System.out.println("[Posición Vacía]");               
            }
         }
        
        identificarTipoObjeto(tripulacion[0]); 
        identificarTipoObjeto(tripulacion[1]); 
        identificarTipoObjeto(tripulacion[2]); 
        
        Persona alguien = crearTripulantePolimorfico("Astronauta");
        System.out.println("Resultado de la salida: " + alguien.identificarse("ID-444"));
        
}
    
    public static void identificarTipoObjeto(Persona p) {
        if (p == null) return;

        System.out.print("el objeto "+p.getNombre()+" ");
        
        if (p instanceof AstronautaEspecialista) {
            System.out.println("Es un Astronauta Especialista.");
        } 
        else if (p instanceof Personal) {
            System.out.println("Es un miembro de Personal (Staff).");
        } 
        else {
            System.out.println("Es una Persona genérica.");
        }
    }
    public static Persona crearTripulantePolimorfico(String eleccion) {
        
        // Aquí el método decide qué "forma" tendrá la Persona que va a salir
        if (eleccion.equalsIgnoreCase("Astronauta")) {
            // Retornamos un hijo, pero el método dice que sale una "Persona"
            return new AstronautaEspecialista("Comandante Shepard", "N7-001", 35, 80, 1.85, 15, 2, 90.0, "Líder");
        } 
        else if (eleccion.equalsIgnoreCase("Staff")) {
            return new Personal("Dr. Liara", "Científica", 28, 60, 1.70, 8, "Biología");
        } 
        else {
            // Si no es ninguno de los anteriores, sale una Persona básica
            return new Persona("Civil Genérico", "999X", 20, 70, 1.75, 0);
        }
    }
    
    
 }
    