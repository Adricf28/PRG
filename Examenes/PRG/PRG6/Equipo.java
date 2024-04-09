import java.util.HashMap;
import java.util.Map;

public class Equipo {
    //ATRIBUTOS
    private String codEquipo;
    private String descripcion;
    private String nombreResponsable;
    private String apellidosResponsable;
    private String ciudad;
    private String email;
    private String telefono;
    private Map<String, Jugador> jugadores;

    //CONSTRUCTOR
    public Equipo() {
        this.jugadores = new HashMap<>();
    }

    public Equipo(String codEquipo, String descripcion, String nombreResponsable, String apellidosResponsable, String ciudad, String email, String telefono) {
        this.codEquipo = codEquipo;
        this.descripcion = descripcion;
        this.nombreResponsable = nombreResponsable;
        this.apellidosResponsable = apellidosResponsable;
        this.ciudad = ciudad;
        this.email = email;
        this.telefono = telefono;
        this.jugadores = new HashMap<>();
    }

    //GETTERS & SETTERS
    public String getCodEquipo() {
        return codEquipo;
    }

    public void setCodEquipo(String codEquipo) {
        this.codEquipo = codEquipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getApellidosResponsable() {
        return apellidosResponsable;
    }

    public void setApellidosResponsable(String apellidosResponsable) {
        this.apellidosResponsable = apellidosResponsable;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //METODOS
    public boolean cambiarDisponibilidad(String dniJugador, boolean disponible) {
        if (jugadores.get(dniJugador) == null) {
            return false;
        } else {
            jugadores.get(dniJugador).setDisponible(disponible);
            return true;
        }
    }

    public boolean addJugador(Jugador j) {
        if (buscarJugador(j.getDni()) != null) {
            return false;
        } else {
            jugadores.put(j.getDni(), j);
            return true;
        }
    }

    public boolean eliminarJugador(String dni) {
        if (buscarJugador(dni) != null) {
            jugadores.remove(dni);
            return true;
        }
        return false;
    }

    public Jugador buscarJugador(String dni) {
        return jugadores.get(dni);
    }
}
