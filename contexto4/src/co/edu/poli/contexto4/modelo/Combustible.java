package co.edu.poli.contexto4.modelo;



/**
 * Representa el sistema de combustible utilizado en la misión espacial.
 * Permite gestionar las cantidades, el tipo de reserva y la peligrosidad
 * del material energético de las naves.
 * * @author TuNombre/Poli
 * @version 1.0
 */
public class Combustible {
    
    /** Identificador único del depósito de combustible */
    private String id;
    
    /** Cantidad actual de combustible disponible */
    private double cantidad;
    
    /** Indica si el material es altamente inflamable o reactivo */
    private boolean esInflamable;
    
    /** Indica si este depósito pertenece a la reserva de emergencia */
    private boolean esReserva;

    /**
     * Constructor para inicializar un nuevo depósito de combustible.
     * @param id           Identificador del depósito.
     * @param cantidad     Cantidad inicial cargada.
     * @param esInflamable Verdadero si el combustible es inflamable.
     * @param esReserva    Verdadero si el depósito es de reserva.
     */
    public Combustible(String id, double cantidad, boolean esInflamable, boolean esReserva) {
        this.id = id;
        this.cantidad = cantidad;
        this.esInflamable = esInflamable;
        this.esReserva = esReserva;
    }

    /**
     * Gestiona el consumo de una cantidad específica de combustible.
     * @param cantidad Cantidad a ser utilizada por los motores.
     * @return true si la operación fue exitosa.
     */
    public boolean usarCombustible(double cantidad) {
        return true;
    }

    /**
     * Incrementa la cantidad de combustible en el depósito actual.
     * @param cantidad Cantidad de combustible a añadir.
     * @return El nuevo total de combustible tras la recarga.
     */
    public double recargarCombustible(double cantidad) {
        return this.cantidad + cantidad;
    }

    /** @return El ID del combustible. */
    public String getId() { return id; }
    
    /** @param id El nuevo ID para este depósito. */
    public void setId(String id) { this.id = id; }
    
    /** @return La cantidad disponible actualmente. */
    public double getCantidad() { return cantidad; }
    
    /** @param cantidad La nueva cantidad a establecer. */
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }
    
    /** @return true si es inflamable. */
    public boolean isEsInflamable() { return esInflamable; }
    
    /** @param esInflamable El estado de inflamabilidad a establecer. */
    public void setEsInflamable(boolean esInflamable) { this.esInflamable = esInflamable; }
    
    /** @return true si el depósito es de reserva. */
    public boolean isEsReserva() { return esReserva; }
    
    /** @param esReserva El estado de reserva a establecer. */
    public void setEsReserva(boolean esReserva) { this.esReserva = esReserva; }

    /**
     * Retorna una representación en texto de los datos básicos del combustible.
     * @return Cadena con ID y cantidad actual.
     */
    @Override
    public String toString() {
        return "Combustible [id=" + id + ", cantidad=" + cantidad + "]";
    }
}