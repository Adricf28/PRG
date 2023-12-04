public class Hotel {
    //ATRIBUTOS
    private static final int NUM_CLIENTES_MAX = 1000;
    private String nombre;
    private String direccion;
    private Cliente[] misClientes;

    //CONSTRUCTORES
    public Hotel() {
        this.nombre = "";
        this.direccion = "";
        this.misClientes = new Cliente[NUM_CLIENTES_MAX];
    }

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.misClientes = new Cliente[NUM_CLIENTES_MAX];
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente[] getMisClientes() {
        return misClientes;
    }

    public void setMisClientes(Cliente[] misClientes) {
        this.misClientes = misClientes;
    }

    //METODOS
    public Cliente[] listaDeClientes() {
        Cliente[] copia;

        copia = new Cliente[NUM_CLIENTES_MAX];

        //copiar cada uno de los clientes en copia

        return copia;
    }

    public boolean add(Cliente nuevoCliente) {
        for (int i = 0; i < misClientes.length; i++) {
            if (misClientes[i] == null) {
                misClientes[i] = nuevoCliente;
                return true;
            }
        }
        return false;
    }

    public boolean remove(String dni) {
        for (int i = 0; i < misClientes.length; i++) {
            if (misClientes[i].getDni() == dni) {
                misClientes[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean search(String dni) {
        for (int i = 0; i < misClientes.length; i++) {
            if (misClientes[i].getDni() == dni) {
                return true;
            }
        }
        return false;
    }
}