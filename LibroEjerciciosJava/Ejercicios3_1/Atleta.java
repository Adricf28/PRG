import java.util.ArrayList;

public class Atleta {
    //ATRIBUTOS
    private int id;
    private String nombre;
    private double tiempo400m;
    static private int contador;
    static private String seleccion="Colombia";
    static private double tiempoEquipo;

    //CONSTRUCTORES
    public Atleta() {
        this.id = contador;
        contador++;
    }

    public Atleta(String nombre, double tiempo400m) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.tiempo400m = tiempo400m;
        this.correr400m();
    }

    //GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempo400m() {
        return tiempo400m;
    }

    public void setTiempo400m(double tiempo400m) {
        this.tiempo400m = tiempo400m;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Atleta.contador = contador;
    }

    public static String getSeleccion() {
        return seleccion;
    }

    public static void setSeleccion(String seleccion) {
        Atleta.seleccion = seleccion;
    }

    public static double getTiempoEquipo() {
        return tiempoEquipo;
    }

    public static void setTiempoEquipo(double tiempoEquipo) {
        Atleta.tiempoEquipo = tiempoEquipo;
    }

    //METODOS
    public static void main(String[] args) {
        //Instanciacion
        Atleta alPer = new Atleta("Alejandro Perlaza", 9.55);
        Atleta anZam = new Atleta("Anthony Zambrano", 9.28);
        Atleta diePal = new Atleta("Diego Palomeque", 9.53);
        Atleta gilHer = new Atleta("Gilmar Herrera", 9.29);

        //Añadiendo atletas a un ArrayList
        ArrayList<Atleta> atletas = new ArrayList<>();
        atletas.add(alPer);
        atletas.add(anZam);
        atletas.add(diePal);
        atletas.add(gilHer);

        //Impresion
        Atleta.printSeleccion();

        for (Atleta i:atletas) {
            System.out.printf("ID: %d\nNombre: %s\nTiempo 400m: %f\n\n", i.getId(), i.getNombre(), i.getTiempo400m());
        }

        Atleta.printTeamTime();
    }

    public void correr400m() {
        tiempoEquipo += this.tiempo400m;
    }

    public static void printSeleccion() {
        System.out.println("Seleccion: " + seleccion);
    }

    public static void printTeamTime() {
        System.out.println("Tiempo total del equipo: " + tiempoEquipo + " segundos");
    }
}
