public class PlazaDeParqueo {
    private int numero;
    private String tipo;
    private EstadoDePlazaDeParqueo estado;

    // Constructor
    public PlazaDeParqueo(int numero, String tipo, EstadoDePlazaDeParqueo estado) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = estado;
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public EstadoDePlazaDeParqueo getEstado() {
        return estado;
    }

    public void setEstado(EstadoDePlazaDeParqueo estado) {
        this.estado = estado;
    }

    // Método para asignar vehículo
    public void asignarVehiculo() {
        this.estado = EstadoDePlazaDeParqueo.OCUPADO;
    }

    // Método para liberar plaza
    public void liberarPlaza() {
        this.estado = EstadoDePlazaDeParqueo.DESOCUPADO;
    }
}
