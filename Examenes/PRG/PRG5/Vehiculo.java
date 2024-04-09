public class Vehiculo {
    //ATRIBUTOS
    protected String matricula;
    protected String modelo;
    protected String marca;
    protected float kms;
    protected float precioDia;
    protected String tipoMotor;

    //CONSTRUCTORES
    public Vehiculo(String matricula, String modelo, String marca, float kms, float precioDia, String tipoMotor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.kms = kms;
        this.precioDia = precioDia;
        this.tipoMotor = tipoMotor;
    }

    //GETTERS & SETTERS
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getKms() {
        return kms;
    }

    public void setKms(float kms) {
        this.kms = kms;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    //METODOS
    public void updateKms(float kms) {
        this.kms += kms;
    }

    public void updatePrecioDia() {
        this.precioDia *= 1.2f;
    }
}
