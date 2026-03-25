package co.edu.poli.contexto4.servicios;
import co.edu.poli.contexto4.modelo.Persona;

public interface OperacionCRUD {
    public String crear(Persona p);
    public Persona leer(String id);
    public String actualizar(String id, Persona p);
    public Persona eliminar(String id);
    public Persona[] leerTodo();
}