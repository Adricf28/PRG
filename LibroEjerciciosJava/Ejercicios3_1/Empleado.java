import java.util.ArrayList;

public class Empleado {
    //ATRIBUTOS
    private static int contador=0;
    private int id;
    private String nombre;
    private String apellidos;
    private double salario;
    private static double totalSalarios;

    //CONSTRUCTORES
    public Empleado() {
        contador++;
        this.id = contador;
        this.salariosEmpresa();
    }

    public Empleado(String nombre, String apellidos, double salario) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
        this.salariosEmpresa();
    }

    //GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getSalario() {
        return salario;
    }

    public static double getTotalSalarios() {
        return totalSalarios;
    }

    //METODOS
    public static void main(String[] args) {
        //Instanciacion
        Empleado e1 = new Empleado("Adrian", "Carmona", 1500);
        Empleado e2 = new Empleado("Juakin", "Rodriguez", 1200);
        Empleado e3 = new Empleado("Rosa", "Marquez", 2000);

        //ArrayList Empleados
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);

        //Impresion
        for (Empleado i:empleados) {
            System.out.printf("ID: %d\nNombre: %s\nApellidos: %s\nSalario: %f\n\n", i.getId(), i.getNombre(), i.getApellidos(), i.getSalario());
        }

        System.out.println("Total salarios empresa: " + Empleado.totalSalarios + "€");
    }

    public void salariosEmpresa() {
        totalSalarios += this.salario;
    }
}
