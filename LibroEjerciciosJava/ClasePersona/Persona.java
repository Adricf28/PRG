public class Persona {
    //ATRIBUTOS----------
    private String nombre;
    private String apellido;
    private String dni;
    private int añoNacimiento;
    private String pais;
    private char genero;

    //CONSTRUCTORES----------
    public Persona() {
        nombre = "";
        apellido = "";
        dni = "";
        añoNacimiento = 0;
        pais = "";
        genero = '\0';
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, String dni, int añoNacimiento, String pais, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.añoNacimiento = añoNacimiento;
        this.pais = pais;
        this.genero = genero;
    }

    //GETTERS----------
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public char getGenero() {
        return genero;
    }

    //SETTERS----------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    //METODOS----------
    public void printValues() {
        System.out.printf("Nombre: %s\nApellido: %s\nDNI: %s\nAño de nacimiento: %d\nPais: %s\nGenero: %c\n\n", nombre, apellido, dni, añoNacimiento, pais, genero);
    }
}
