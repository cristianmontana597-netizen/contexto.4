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

    /**
     * Persiste el arreglo de personas en un archivo binario utilizando Serialización.
     * * @param personas Listado de objetos a guardar.
     * @param path     Directorio de destino.
     * @param name     Nombre del archivo binario.
     * @return "File create!!" si tuvo éxito, o el mensaje de error correspondiente.
     */
    @Override
    public String serializar(Persona[] personas, String path, String name) {
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personas);
            oos.close();
            fos.close();
            return "File create!!";
        } catch (IOException ioe) {
            return "Error file " + ioe.getMessage();
        }
    }

    /**
     * Carga y reconstruye el arreglo de personas desde un archivo binario (Deserialización).
     * * @param path Ruta del archivo.
     * @param name Nombre del archivo a leer.
     * @return El arreglo de objetos {@link Persona} recuperado.
     */
    @Override
    public Persona[] deserializar(String path, String name) {
        Persona[] a = null;
        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);

            a = (Persona[]) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar datos: " + e.getMessage());
        }
        return a;
    }
}