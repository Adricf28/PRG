public class Carrera {
    //ATRIBUTOS
    private static final int NUM_MAX_PARTICIPANTES = 100;
    private String codigo;
    private String descripcion;
    private String fechaRealizacion;
    private Participante[] misParticipantes;

    //CONSTRUCTORES
    public Carrera() {
        this.codigo = "";
        this.descripcion = "";
        this.fechaRealizacion = "";
        this.misParticipantes = new Participante[NUM_MAX_PARTICIPANTES];
    }

    public Carrera(String codigo, String descripcion, String fechaRealizacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaRealizacion = fechaRealizacion;
        this.misParticipantes = new Participante[NUM_MAX_PARTICIPANTES];
    }

    //GETTERS Y SETTERS
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Participante[] getMisParticipantes() {
        return misParticipantes;
    }

    public void setMisParticipantes(Participante[] misParticipantes) {
        this.misParticipantes = misParticipantes;
    }

    //METODOS
    public boolean add(Participante nuevoParticipante) {
        for (int i = 0; i < misParticipantes.length; i++) {
            if (misParticipantes[i] == null) {
                misParticipantes[i] = nuevoParticipante;
                return true;
            }
        }
        return false;
    }

    public boolean delete(String dni) {
        for (int i = 0; i < misParticipantes.length; i++) {
            if (misParticipantes[i] != null && misParticipantes[i].getDni().equalsIgnoreCase(dni)) {
                misParticipantes[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean search(String dni) {
        for (int i = 0; i < misParticipantes.length; i++) {
            if (misParticipantes[i] != null && misParticipantes[i].getDni().equalsIgnoreCase(dni)) {
                return true;
            }
        }
        return false;
    }

    public boolean update(String dni, Participante nuevoParticipante) {
        for (int i = 0; i < misParticipantes.length; i++) {
            if (misParticipantes[i] != null && misParticipantes[i].getDni() == dni) {
                misParticipantes[i] = nuevoParticipante;
                return true;
            }
        }
        return false;
    }
}