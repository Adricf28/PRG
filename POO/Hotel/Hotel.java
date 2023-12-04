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
    public void listar() {
        for (int i = 0; i < misClientes.length; i++) {
            if (misClientes[i] != null) {
                System.out.printf("Nombre: %s, DNI: %s, Gmail: %s\n\n", misClientes[i].getNombre(), misClientes[i].getDni(), misClientes[i].getGmail());
            }
        }
    }

    public boolean add(Cliente nuevoCliente) {
        try {
            for (int i = 0; i < misClientes.length; i++) {
                if (misClientes[i] == null) {
                    misClientes[i] = nuevoCliente;
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean remove(String dni) {
        try {
            for (int i = 0; i < misClientes.length; i++) {
                if (misClientes[i].getDni().equalsIgnoreCase(dni)) {
                    misClientes[i] = null;
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public Cliente search(String dni) {
        try {
            for (int i = 0; i < misClientes.length; i++) {
                if (misClientes[i].getDni().equalsIgnoreCase(dni)) {
                    return misClientes[i];
                }
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}