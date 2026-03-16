package co.edu.poli.contexto4.modelo;

public class Mision {
    private String id;
    private String lugar;
    private String fechaHora;
    private Planeta planeta; // Relación 1..1
    private String objetivo;
    private String resultado;
    private NaveEspacial[] naveEspacial; // Relación * (arreglo o lista)
    private AstronautaEspecialista[] astronauta; // Relación * (arreglo o lista)
    private Radiacion radiacion; // Relación 1..1

    // Constructor sobrecargado
    public Mision(String id, String lugar, String fechaHora, Planeta planeta, String objetivo, 
                  String resultado, NaveEspacial[] naveEspacial, 
                  AstronautaEspecialista[] astronauta, Radiacion radiacion) {
        this.id = id;
        this.lugar = lugar;
        this.fechaHora = fechaHora;
        this.planeta = planeta;
        this.objetivo = objetivo;
        this.resultado = resultado;
        this.naveEspacial = naveEspacial;
        this.astronauta = astronauta;
        this.radiacion = radiacion;
    }

    // Método de lógica del diagrama (+)
    public double calcularTiempoRequerido() {
        // Implementación de ejemplo
        return 0.0;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }

    public String getFechaHora() { return fechaHora; }
    public void setFechaHora(String fechaHora) { this.fechaHora = fechaHora; }

    public Planeta getPlaneta() { return planeta; }
    public void setPlaneta(Planeta planeta) { this.planeta = planeta; }

    public String getObjetivo() { return objetivo; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }

    public String getResultado() { return resultado; }
    public void setResultado(String resultado) { this.resultado = resultado; }

    public NaveEspacial[] getNaveEspacial() { return naveEspacial; }
    public void setNaveEspacial(NaveEspacial[] naveEspacial) { this.naveEspacial = naveEspacial; }

    public AstronautaEspecialista[] getAstronauta() { return astronauta; }
    public void setAstronauta(AstronautaEspecialista[] astronauta) { this.astronauta = astronauta; }

    public Radiacion getRadiacion() { return radiacion; }
    public void setRadiacion(Radiacion radiacion) { this.radiacion = radiacion; }

    @Override
    public String toString() {
        return "Mision [id=" + id + ", objetivo=" + objetivo + ", lugar=" + lugar + "]";
    }
}