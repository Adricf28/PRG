import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String op;
    static Competicion miCompeticion = null;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nElige una opcion:");
            System.out.print("a) Proporcionar datos de la competicion\nb) Añadir un nuevo equipo\nc) Eliminar un equipo existente\nd) Buscar equipo de una localidad\ne) Listar todos los equipos\nf) Dar de alta un nuevo jugador en un equipo\ng) Eliminar un jugador en un equipo\nh) Cambiar estado/disponibilidad de un jugador de un equipo\n");
            System.out.print("Eleccion: ");

            op = sc.nextLine();
            if (op.equalsIgnoreCase("a")) {
                miCompeticion = crearCompeticion();

                if (miCompeticion != null) {
                    System.out.println("Competicion creada correctamente");
                } else {
                    System.out.println("Ha habido un error en la creacion");
                }
            } else if (op.equalsIgnoreCase("b")) {
                if (nuevoEquipo()) {
                    System.out.println("Equipo añadido correctamente");
                } else {
                    System.out.println("Ha habido un error al añadir el equipo");
                }
            } else if (op.equalsIgnoreCase("c")) {
                System.out.print("Codigo del equipo a eliminar: ");
                op = sc.nextLine();

                if (miCompeticion.eliminarEquipo(op)) {
                    System.out.println("Equipo eliminado correctamente");
                } else {
                    System.out.println("Ha habido un error en la eliminacion");
                }
            } else if (op.equalsIgnoreCase("d")) {

                eqLocalidad();

            } else if (op.equalsIgnoreCase("e")) {

                listarEquipos();

            } else if (op.equalsIgnoreCase("f")) {
                if (nuevoJugador()) {
                    System.out.println("Jugador añadido correctamente");
                } else {
                    System.out.println("Ha habido un error al añadir el jugador");
                }
            } else if (op.equalsIgnoreCase("g")) {
                if (fueraJugador()) {
                    System.out.println("Jugador eliminado correctamente");
                } else {
                    System.out.println("Ha habido un error en la eliminacion");
                }

            } else if (op.equalsIgnoreCase("h")) {
                if (cambiarDisp()) {
                    System.out.println("Disponibilidad cambiada correctamente");
                } else {
                    System.out.println("Ha habido un error en el cambio");
                }
            } else {
                break;
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static Competicion crearCompeticion() {

        System.out.print("Codigo de competicion: ");
        String codComp = sc.nextLine();
        System.out.print("Descripcion: ");
        String descripcion = sc.nextLine();
        System.out.print("Provincia: ");
        String provincia = sc.nextLine();

        return new Competicion(codComp, descripcion, provincia);
    }

    public static boolean nuevoEquipo() {

        System.out.print("Codigo de equipo: ");
        String codEq = sc.nextLine();
        System.out.print("Descripcion: ");
        String descripcion = sc.nextLine();
        System.out.print("Nombre del responsable: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos del responsable: ");
        String apellidos = sc.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();

        Equipo miEquipo = new Equipo(codEq, descripcion, nombre, apellidos, ciudad, email, telefono);

        return miCompeticion.addEquipo(miEquipo);
    }

    public static boolean nuevoJugador() {

        System.out.print("Introduce el codigo de equipo del jugador a añadir: ");
        String codEq = sc.nextLine();

        if (miCompeticion.buscarEquipo(codEq) == null) return false;

        System.out.println("Introduce los datos del nuevo jugador");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Dorsal: ");
        int dorsal = Integer.valueOf(sc.nextLine());
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();

        return miCompeticion.buscarEquipo(codEq).addJugador(new Jugador(nombre, apellidos, dorsal, dni, email, telefono));
    }

    public static boolean fueraJugador() {
        System.out.print("Introduce el codigo de equipo del jugador a eliminar: ");
        String codEq = sc.nextLine();

        if (miCompeticion.buscarEquipo(codEq) == null) return false;

        System.out.print("Introduce el DNI del jugador: ");
        String dni = sc.nextLine();

        return miCompeticion.buscarEquipo(codEq).eliminarJugador(dni);
    }

    public static boolean cambiarDisp() {
        boolean disponible;

        System.out.print("Introduce el codigo de equipo del jugador: ");
        String codEq = sc.nextLine();

        if (miCompeticion.buscarEquipo(codEq) == null) return false;

        System.out.print("Introduce el DNI del jugador: ");
        String dni = sc.nextLine();
        System.out.print("Elige una opcion:\na) Cambiar a disponible\nb) Cambiar a no disponible");
        String op = sc.nextLine();
        if (op.equalsIgnoreCase("a")) {
            disponible = true;
        } else {
            disponible = false;
        }
        return miCompeticion.buscarEquipo(codEq).cambiarDisponibilidad(dni, disponible);
    }

    public static void eqLocalidad() {

        System.out.print("Localidad a buscar: ");
        op = sc.nextLine();

        Equipo[] eqs = miCompeticion.buscarEquipoLocalidad(op);

        System.out.println("Los codigos de equipo de la ciudad de " + op + " son:");
        for (Equipo i:eqs) {
            System.out.println(i.getCodEquipo());
        }
    }

    public static void listarEquipos() {
        ArrayList<Equipo> eqActuales = miCompeticion.getEquipos();

        System.out.println("Estos son los codigos de los equipos actuales:");
        for (Equipo i:eqActuales) {
            System.out.println(i.getCodEquipo());
        }
    }
}


