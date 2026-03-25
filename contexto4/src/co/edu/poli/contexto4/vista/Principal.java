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
import co.edu.poli.contexto4.servicios.ImplementacionOperacionCRUD;
import co.edu.poli.contexto4.servicios.OperacionCRUD;

public class Principal {
    public static void main(String[] args) {
        // Instanciamos el servicio
        OperacionCRUD gestor = new ImplementacionOperacionCRUD();

        // 1. PROBAR CREAR (Agregamos 3 para forzar la expansión del arreglo de 2)
        System.out.println(gestor.crear(new AstronautaEspecialista("Juan", "001",1 ,1,1,1,1,1,"especialista")));
        System.out.println(gestor.crear(new Personal("Ana", "002", 1,1,1,1,"")));
        System.out.println(gestor.crear(new AstronautaEspecialista("Pedro", "003", 1 ,1,1,1,1,1,"especialista")));

        // 2. PROBAR LEER
        Persona buscada = gestor.leer("003");
        System.out.println("Encontrado: " + (buscada != null ? buscada.getNombre() : "No existe"));

        // 3. PROBAR ACTUALIZAR
        System.out.println(gestor.actualizar("001", new AstronautaEspecialista("Juan Modificado", "001", 1 ,1,1,1,1,1,"especialista")));

        // 4. PROBAR ELIMINAR
        Persona borrada = gestor.eliminar("003");
        System.out.println("Se borró a: " + (borrada != null ? borrada.getNombre() : "Nada"));
        System.out.println(gestor.leerTodo());
    }
}