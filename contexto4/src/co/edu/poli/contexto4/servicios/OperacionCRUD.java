package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.modelo.Persona;

/**
 * Define el contrato para las operaciones de gestion de datos (CRUD).
 * * @author TuNombre/Poli
 * @version 1.0
 */
public interface OperacionCRUD {

    /**
     * Registra un nuevo objeto.
     * @param p El objeto Persona a registrar.
     * @return Mensaje de confirmacion.
     */
    public String crear(Persona p);

    /**
     * Busca un objeto por su ID.
     * @param id Identificador unico.
     * @return El objeto encontrado o null.
     */
    public Persona leer(String id);

    /**
     * Actualiza un objeto existente.
     * @param id Identificador unico.
     * @param p  Nuevos datos.
     * @return Mensaje de confirmacion.
     */
    public String actualizar(String id, Persona p);

    /**
     * Elimina un objeto por su ID.
     * @param id Identificador unico.
     * @return El objeto eliminado.
     */
    public Persona eliminar(String id);

    /**
     * Retorna todos los registros.
     * @return Arreglo de personas.
     */
    public Persona[] leerTodo();

    /**
     * Guarda los datos en un archivo.
     * @param estudiantes Arreglo a guardar.
     * @param path        Ruta del archivo.
     * @param name        Nombre del archivo.
     * @return Mensaje de confirmacion.
     */
    public String serializar(Persona[] estudiantes, String path, String name);

    /**
     * Carga los datos desde un archivo.
     * @param path Ruta del archivo.
     * @param name Nombre del archivo.
     * @return Arreglo recuperado.
     */
    public Persona[] deserializar(String path, String name);
}