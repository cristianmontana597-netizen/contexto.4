package co.edu.poli.contexto4.modelo;

public class RegistroTrabajo {
    private String id;
    private Personal personal;
    private int diasTrabajados;
    private String resultado;

    public RegistroTrabajo(String id, Personal personal, int diasTrabajados, String resultado) {
        this.id = id;
        this.personal = personal;
        this.diasTrabajados = diasTrabajados;
        this.resultado = resultado;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public Personal getPersonal() { return personal; }
    public void setPersonal(Personal personal) { this.personal = personal; }
    public int getDiasTrabajados() { return diasTrabajados; }
    public void setDiasTrabajados(int diasTrabajados) { this.diasTrabajados = diasTrabajados; }
    public String getResultado() { return resultado; }
    public void setResultado(String resultado) { this.resultado = resultado; }

    @Override
    public String toString() {
        return "RegistroTrabajo [id=" + id + ", resultado=" + resultado + "]";
    }
}