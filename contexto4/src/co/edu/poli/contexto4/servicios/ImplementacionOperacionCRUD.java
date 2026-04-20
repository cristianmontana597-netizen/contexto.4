package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.modelo.Persona;
import java.io.*;

/**
 * Implementación integral de los servicios de gestión y persistencia para la tripulación.
 * <p>Esta clase administra un arreglo dinámico de objetos {@link Persona} y cumple con
 * los contratos de {@link OperacionCRUD} para la lógica de negocio y 
 * {@link OperacionArchivo} para la persistencia en disco.</p>
 * * @author TuNombre/Poli
 * @version 1.1
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD, OperacionArchivo {
    
    /** * Arreglo principal que actúa como base de datos volátil en memoria.
     * Inicializado con un tamaño de 2 para demostrar la capacidad de expansión.
     */
    private Persona[] baseDeDatos = new Persona[2];
    
    /**
     * Inserta una nueva persona en el arreglo. 
     * <p>Si el arreglo actual está lleno (sin espacios null), utiliza {@link System#arraycopy} 
     * para crear un nuevo contenedor con mayor capacidad, permitiendo una agregación infinita.</p>
     * * @param p El objeto Persona a ser almacenado.
     * @return Mensaje indicando el éxito del guardado o la expansión del arreglo.
     */
    @Override
    public String crear(Persona p) {
        // Buscar el primer espacio disponible (null)
        for (int i = 0; i < baseDeDatos.length; i++) {
            if (baseDeDatos[i] == null) {
                baseDeDatos[i] = p;
                return "Objeto guardado en posición " + i;
            }
        }

        // ESTRATEGIA DE EXPANSIÓN DINÁMICA
        Persona[] nuevoArreglo = new Persona[baseDeDatos.length + 1];
        System.arraycopy(baseDeDatos, 0, nuevoArreglo, 0, baseDeDatos.length);
        nuevoArreglo[baseDeDatos.length] = p; 
        baseDeDatos = nuevoArreglo;
        
        return "Arreglo expandido. Objeto guardado.";
    }

    /**
     * Busca un objeto Persona dentro del arreglo mediante su ID único.
     * * @param id Identificador único a buscar.
     * @return El objeto {@link Persona} encontrado o null si no existe.
     */
    @Override
    public Persona leer(String id) {
        for (int i = 0; i < baseDeDatos.length; i++) {
            if (baseDeDatos[i] != null && baseDeDatos[i].getId().equals(id)) {
                return baseDeDatos[i];
            }
        }
        return null;
    }

    /**
     * Actualiza los datos de una persona existente reemplazándola en su posición original.
     * * @param id      ID del objeto original a actualizar.
     * @param nuevaP  Nuevos datos a asignar.
     * @return Mensaje indicando el resultado de la operación.
     */
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

    /**
     * Elimina a una persona del arreglo liberando su espacio (asignando null).
     * * @param id ID del objeto a eliminar.
     * @return El objeto {@link Persona} que fue removido, o null si no se encontró.
     */
    @Override
    public Persona eliminar(String id) {
        for (int i = 0; i < baseDeDatos.length; i++) {
            if (baseDeDatos[i] != null && baseDeDatos[i].getId().equals(id)) {
                Persona eliminado = baseDeDatos[i];
                baseDeDatos[i] = null; 
                return eliminado;
            }
        }
        return null;
    }

    /**
     * Retorna la referencia al arreglo completo para procesos de visualización masiva.
     * * @return El arreglo de objetos Persona actual.
     */
    @Override
    public Persona[] leerTodo() {
        System.out.println("\n--- LISTADO DE TRIPULACIÓN (Desde el Servicio) ---");
        return this.baseDeDatos;
    }

    @Override
    public String serializar(Persona[] personas, String path, String name) throws Exception {
        java.io.FileOutputStream fos = new java.io.FileOutputStream(path + name);
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
        oos.writeObject(personas);
        oos.close();
        return "Archivo guardado exitosamente.";
    }

    @Override
    public Persona[] deserializar(String path, String name) throws Exception {
        java.io.FileInputStream fis = new java.io.FileInputStream(path + name);
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
        Persona[] recuperado = (Persona[]) ois.readObject();
        ois.close();
        return recuperado;
    }
}
