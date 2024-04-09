public class Reserva {
    //ATRIBUTOS
    protected Vehiculo vAlquilado;
    protected String fechaInicio;
    protected int diasAlquiler;
    protected Cliente alquilador;

    //CONSTRUCTOR
    public Reserva(Vehiculo vAlquilado, String fechaInicio, int diasAlquiler, Cliente alquilador) {
        this.vAlquilado = vAlquilado;
        this.fechaInicio = fechaInicio;
        this.diasAlquiler = diasAlquiler;
        this.alquilador = alquilador;
    }

    //GETTERS & SETTERS
    public Vehiculo getvAlquilado() {
        return vAlquilado;
    }

    public void setvAlquilado(Vehiculo vAlquilado) {
        this.vAlquilado = vAlquilado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public Cliente getAlquilador() {
        return alquilador;
    }

    public void setAlquilador(Cliente alquilador) {
        this.alquilador = alquilador;
    }

    //METODOS

}