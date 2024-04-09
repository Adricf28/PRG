public class Camion extends Vehiculo{
    //ATRIBUTOS
    protected float cargaMaxima;
    protected float longitud;

    //CONSTRUCTORES
    public Camion(String matricula, String modelo, String marca, float kms, float precioDia, String tipoMotor, float cargaMaxima, float longitud) {
        super(matricula, modelo, marca, kms, precioDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.longitud = longitud;
    }

    //GETTERS & SETTERS
    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    //METODOS

}
