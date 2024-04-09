public class Coche extends Vehiculo{
    //ATRIBUTOS
    protected int plazasMaximas;
    protected int puertas;
    protected float volumenMaletero;
    protected String tipo;

    //CONSTRUCTORES
    public Coche(String matricula, String modelo, String marca, float kms, float precioDia, String tipoMotor, int plazasMaximas, int puertas, float volumenMaletero, String tipo) {
        super(matricula, modelo, marca, kms, precioDia, tipoMotor);
        this.plazasMaximas = plazasMaximas;
        this.puertas = puertas;
        this.volumenMaletero = volumenMaletero;
        this.tipo = tipo;
    }

    //GETTERS & SETTERS
    public int getPlazasMaximas() {
        return plazasMaximas;
    }

    public void setPlazasMaximas(int plazasMaximas) {
        this.plazasMaximas = plazasMaximas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public float getVolumenMaletero() {
        return volumenMaletero;
    }

    public void setVolumenMaletero(float volumenMaletero) {
        this.volumenMaletero = volumenMaletero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //METODOS

}
