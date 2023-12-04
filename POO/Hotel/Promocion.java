public class Promocion {
    //ATRIBUTOS
    private int codigo;
    private int edadMinima;
    private int edadMaxima;
    private String decripcion;

    //CONSTRUCTORES
    public Promocion() {
        this.codigo = 0;
        this.edadMinima = 0;
        this.edadMaxima = 0;
        this.decripcion = "";
    }

    public Promocion(int codigo, int edadMinima, int edadMaxima, String decripcion) {
        this.codigo = codigo;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.decripcion = decripcion;
    }

    //GETTERS Y SETTERS

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }
}