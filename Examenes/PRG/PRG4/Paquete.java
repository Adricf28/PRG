import java.util.ArrayList;

public class Paquete {
    //ATRIBUTOS
    protected String localizador;
    protected String direccionEnvio;
    protected String dniCliente;
    protected String fechaEnvio;
    protected int diasPrevistos;
    protected String estado;
    protected ArrayList<Producto> productos;

    //CONSTRUCTORES
    public Paquete(String localizador, String direccionEnvio, String dniCliente, String fechaEnvio, String estado, int diasPrevistos) {
        this.localizador = localizador;
        this.direccionEnvio = direccionEnvio;
        this.dniCliente = dniCliente;
        this.fechaEnvio = fechaEnvio;
        this.diasPrevistos = diasPrevistos;
        this.estado = estado;
        this.productos = new ArrayList<>();
    }

    //GETTERS && SETTERS
    public String getLocalizador() {
        return localizador;
    }

    public void setLocalizador(String localizador) {
        this.localizador = localizador;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getDiasPrevistos() {
        return diasPrevistos;
    }

    public void setDiasPrevistos(int diasPrevistos) {
        this.diasPrevistos = diasPrevistos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        for (Producto unProducto:productos) {
            unProducto = null;
        }
        this.productos = productos;
    }

    //METODOS
    public boolean addProducto(Producto nuevoProducto) {
        return productos.add(nuevoProducto);
    }

    public boolean eliminarProducto(String codProducto) {
        for (Producto unProducto:productos) {
            if (codProducto.equalsIgnoreCase(unProducto.getCodProducto())) {
                unProducto = null;
                productos.remove(unProducto);
                return true;
            }
        }
        return false;
    }

    public boolean buscarProducto(String codProducto) {
        for (Producto unProducto:productos) {
            if (codProducto.equalsIgnoreCase(unProducto.getCodProducto())) {
                return true;
            }
        }
        return false;
    }
}
