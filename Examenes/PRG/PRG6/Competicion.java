import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Competicion {
    //ATRIBUTOS
    private String codCompeticion;
    private String descripcion;
    private String provincia;
    private ArrayList<Equipo> equipos;

    //CONSTRUCTORES
    public Competicion() {
        this.equipos = new ArrayList<>();
    }

    public Competicion(String codCompeticion, String descripcion, String provincia) {
        this.codCompeticion = codCompeticion;
        this.descripcion = descripcion;
        this.provincia = provincia;
        this.equipos = new ArrayList<>();
    }


    //GETTERS & SETTERS
    public String getCodCompeticion() {
        return codCompeticion;
    }

    public void setCodCompeticion(String codCompeticion) {
        this.codCompeticion = codCompeticion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    //METODOS
    //CRUD Equipos
    public boolean addEquipo(Equipo e) {
        for (Equipo i:equipos) {
            if (i.getCodEquipo().equals(e.getCodEquipo())) {
                return false;
            }
        }
        return equipos.add(e);
    }

    public boolean eliminarEquipo(String codEq) {
        for (Equipo i:equipos) {
            if (i.getCodEquipo().equals(codEq)) {
                if (i.getJugadores().isEmpty()) return equipos.remove(i);
            }
        }
        return false;
    }

    public Equipo buscarEquipo(String codEq) {
        for (Equipo i:equipos) {
            if (i.getCodEquipo().equals(codEq)) {
                return i;
            }
        }
        return null;
    }

    public Equipo[] buscarEquipoLocalidad(String localidad) {
        ArrayList<Equipo> equiposLocalidad = new ArrayList<>();

        for (Equipo i:equipos) {
            if (i.getCiudad().equals(localidad)) {
                equiposLocalidad.add(i);
            }
        }

        return equiposLocalidad.toArray(new Equipo[equiposLocalidad.size()]);
    }
}
