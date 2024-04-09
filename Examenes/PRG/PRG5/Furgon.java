public class Furgon extends Vehiculo{
    //ATRIBUTOS
    protected float cargaMaxima;
    protected int plazasAsientos;

    //CONSTRUCTORES
    public Furgon(String matricula, String modelo, String marca, float kms, float precioDia, String tipoMotor, float cargaMaxima, int plazasAsientos) {
        super(matricula, modelo, marca, kms, precioDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.plazasAsientos = plazasAsientos;
    }

    //GETTERS & SETTERS
    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getPlazasAsientos() {
        return plazasAsientos;
    }

    public void setPlazasAsientos(int plazasAsientos) {
        this.plazasAsientos = plazasAsientos;
    }

    //METODOS

}
