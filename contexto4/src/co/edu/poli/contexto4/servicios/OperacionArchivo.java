package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.modelo.Persona;

/**
 * Define las operaciones para la persistencia de datos en archivos fisicos.
 * @author TuNombre/Poli
 * @version 1.0
 */
public interface OperacionArchivo {

    /**
     * @param personas El arreglo de objetos a guardar.
     * @param path La ruta del directorio.
     * @param name El nombre del archivo.
     * @return Mensaje de confirmacion.
     * @throws Exception Si ocurre un error de escritura.
     */
    public String serializar(Persona[] personas, String path, String name) throws Exception;

    /**
     * @param path Ruta del directorio.
     * @param name Nombre del archivo.
     * @return Arreglo de objetos recuperado.
     * @throws Exception Si el archivo no existe o esta corrupto.
     */
    public Persona[] deserializar(String path, String name) throws Exception;
}