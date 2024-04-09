import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static String op, s1, s2, s3, s4, s5;

    public static void main(String[] args) {
        Carrera carrera1 = new Carrera();
        Participante participante1 = new Participante();
        boolean continuar = true;

        while(continuar) {
            System.out.println("CARRERAS URBANAS");
            System.out.println("Sistema de control de participantes:");
            System.out.println("a. Resetear/crear carrera.\nb. Inscribir participante.\nc. Buscar participante.\nd. Borrar participante.\ne. (o cualquier otra tecla) Salir");
            System.out.print("Seleccion: ");
            op = sc.nextLine();

            if (op.equalsIgnoreCase("a")) {
                carrera1 = crearCarrera();
                System.out.println("--- Carrera creada correctamente ---\n");
            }
            else if (op.equalsIgnoreCase("b")) {
                participante1 = crearParticipante();

                if (carrera1.add(participante1)) {
                    System.out.println("--- Participante " + participante1.getNombre() + " inscrito correctamente ---\n");
                } else {
                    System.out.println("--- No se ha podido inscribir al participante ---\n");
                }

            }
            else if (op.equalsIgnoreCase("c")) {
                System.out.print("Introduce el dni del participante que desea buscar: ");
                op = sc.nextLine();

                if (carrera1.search(op)) {
                    System.out.println("--- El participante con dni " + op + " se encuentra en esta carrera ---\n");
                } else {
                    System.out.println("--- No se ha podido encontrar al participante con dni " + op + " en esta carrera ---\n");
                }
            }
            else if (op.equalsIgnoreCase("d")) {
                System.out.print("Introduce el dni del participante que desea eliminar: ");
                op = sc.nextLine();

                if (carrera1.delete(op)) {
                    System.out.println("--- El participante con dni " + op + " se ha eliminado correctamente de esta carrera ---\n");
                } else {
                    System.out.println("--- No se ha podido eliminar al participante con dni " + op + " de esta carrera ---\n");
                }
            }
            else {
                continuar = false;
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static Carrera crearCarrera() {
        Carrera nuevaCarrera;

        System.out.print("Introduce el codigo de la carrera: ");
        op = sc.nextLine();
        System.out.print("Introduce una breve descripcion de la carrera: ");
        s1 = sc.nextLine();
        System.out.print("Introduce la fecha de realizacion en formato DD/MM/AAAA: ");
        s2 = sc.nextLine();

        nuevaCarrera = new Carrera(op, s1, s2);
        return nuevaCarrera;
    }

    public static Participante crearParticipante() {
        Participante nuevoParticipante;

        System.out.print("Introduce el dni del participante: ");
        op = sc.nextLine();
        System.out.print("Introduce el nombre del participante: ");
        s1 = sc.nextLine();
        System.out.print("Introduce los apellidos del participante: ");
        s2 = sc.nextLine();
        System.out.print("Introduce la fecha de nacimiento del participante en formato DD/MM/AAAA: ");
        s3 = sc.nextLine();
        System.out.print("Introduce el email del participante: ");
        s4 = sc.nextLine();
        System.out.print("Introduce el telefono del participante: ");
        s5 = sc.nextLine();

        nuevoParticipante = new Participante(op, s1, s2, s3, s4, s5);
        return nuevoParticipante;
    }
}
