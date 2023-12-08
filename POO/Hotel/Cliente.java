public class Cliente {
    //ATRIBUTOS
    private String nombre;
    private String dni;
    private String gmail;
    private String direccion;
    private String telefono;
    private int edad;
    private String fechaNacimiento;

    //CONSTRUCTORES
    public Cliente() {
        this.nombre = "";
        this.dni = "";
        this.gmail = "";
    }

    public Cliente(String nombre, String dni, String gmail) {
        this.nombre = nombre;
        this.dni = dni;
        this.gmail = gmail;
    }

    public Cliente(String nombre, String dni, String gmail, String direccion, String telefono, int edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.gmail = gmail;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}