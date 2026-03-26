package co.edu.poli.contexto4.servicios;
import co.edu.poli.contexto4.modelo.Persona;

public class ImplementacionOperacionCRUD implements OperacionCRUD {
    
    private Persona[] baseDeDatos;

    public ImplementacionOperacionCRUD() {
        // El ejercicio pide tamaño inicial de 2
        this.baseDeDatos = new Persona[2];
    }

    @Override
    public String crear(Persona p) {
        // Buscar el primer null
        for (int i = 0; i < baseDeDatos.length; i++) {
            if (baseDeDatos[i] == null) {
                baseDeDatos[i] = p;
                return "Objeto guardado en posición " + i;
            }
        }

        // AGREGACIÓN INFINITA: Si llegamos aquí, el arreglo está lleno. Lo agrandamos.
        Persona[] nuevoArreglo = new Persona[baseDeDatos.length + 1];
        System.arraycopy(baseDeDatos, 0, nuevoArreglo, 0, baseDeDatos.length);
        nuevoArreglo[baseDeDatos.length] = p; // Insertamos al final
        baseDeDatos = nuevoArreglo;
        
        return "Arreglo expandido. Objeto guardado.";
    }

    @Override
    public Persona leer(String id) {
        for (Persona p : baseDeDatos) {
            if (p != null && p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String actualizar(String id, Persona nuevaP) {
        for (int i = 0; i < baseDeDatos.length; i++) {
            if (baseDeDatos[i] != null && baseDeDatos[i].getId().equals(id)) {
                baseDeDatos[i] = nuevaP;
                return "Actualizado con éxito.";
            }
        }
        return "ID no encontrado.";
    }

    @Override
    public Persona eliminar(String id) {
        for (int i = 0; i < baseDeDatos.length; i++) {
            if (baseDeDatos[i] != null && baseDeDatos[i].getId().equals(id)) {
                Persona eliminado = baseDeDatos[i];
                baseDeDatos[i] = null; // Lo "borramos" dejando el espacio en null
                return eliminado;
            }
        }
        return null;
    }

    
    @Override
    public Persona[] leerTodo() {
        System.out.println("\n--- LISTADO DE TRIPULACIÓN (Desde el Servicio) ---");
        
        
        return this.baseDeDatos;
    }
}