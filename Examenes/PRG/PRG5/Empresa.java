import java.util.ArrayList;

public class Empresa {
    //ATRIBUTOS
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Reserva> reservas;

    //CONSTRUCTORES
    public Empresa() {
        this.vehiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    //GETTERS & SETTERS
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    //METODOS
    public boolean addVehiculo(Vehiculo v) {
        if (v != null) {
            for (Vehiculo i:vehiculos) {
                if (i.getMatricula().equals(v.getMatricula())) {
                    return false;
                }
            }
            return vehiculos.add(v);
        }
        return false;
    }

    public boolean addCliente(Cliente c) {
        if (c != null) {
            for (Cliente i:clientes) {
                if (i.getDni().equals(c.getDni())) {
                    return false;
                }
            }
            return clientes.add(c);
        }
        return false;
    }

    public boolean addReserva(Reserva r) {
        if (r != null) {
            for (Reserva i:reservas) {
                if (i.getvAlquilado().getMatricula().equals(r.getvAlquilado().getMatricula())) {
                    return false;
                }
            }
            return reservas.add(r);
        }
        return false;
    }
}
