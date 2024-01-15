public class Vehiculo {
    private String id;
    private String descripcion;
    public Vehiculo(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    public String getDatos() {
        return id + "; " + descripcion;
    }
}

public class Coche extends Vehiculo { //Da error porque hay que definirlo en otra clase
    private String modelo;
    public Coche(String id, String descripcion, String modelo) {
        super(id, descripcion);
        this.modelo = modelo;
    }

    @Override
    public String getDatos() {
        return super.getDatos() + "; " + modelo;
    }
}