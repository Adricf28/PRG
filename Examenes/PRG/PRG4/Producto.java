public class Producto {
    //ATRIBUTOS
    protected String codProducto;
    protected String descripcion;
    protected int cantidad;
    protected float peso;

    //CONSTRUCTORES
    public Producto(String codProducto, String descripcion, int cantidad, float peso) {
        this.codProducto = codProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.peso = peso;
    }

    //GETTERS && SETTERS
    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //METODOS
}