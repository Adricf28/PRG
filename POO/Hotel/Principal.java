import java.util.Scanner;

public class Principal {
    static final Scanner sc = new Scanner(System.in);
    static String op, s1, s2;
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Hotel hotel1 = new Hotel();

        while(true) {
            System.out.println("a) Definir hotel\nb) Añadir cliente\nc) Eliminar cliente\nd) Buscar cliente\ne) Listar clientes\ncualquier otra) Salir");
            System.out.print("Seleccion: ");
            op = sc.nextLine();

            if (op.equalsIgnoreCase("a")) {
                hotel1 = crearHotel();
                System.out.println("Hotel creado correctamente\n");
            }
            else if (op.equalsIgnoreCase("b")) {
                cliente1 = crearCliente();

                if (hotel1.add(cliente1)) {
                    System.out.println("Se ha añadido el cliente correctamente\n");
                } else {
                    System.out.println("No hay espacio para mas clientes\n");
                }

            }
            else if (op.equalsIgnoreCase("c")) {
                System.out.print("Introduce el dni del cliente que quieres eliminar: ");
                op = sc.nextLine();

                if (hotel1.remove(op)) {
                    System.out.println("Cliente eliminado correctamente\n");
                } else {
                    System.out.println("No se ha podido eliminar al cliente\n");
                }
            }
            else if (op.equalsIgnoreCase("d")) {
                System.out.print("Introduce el dni del cliente que quieres buscar: ");
                op = sc.nextLine();

                if (hotel1.search(op)) {
                    System.out.println("El cliente se encuentra en este hotel\n");
                } else {
                    System.out.println("No se ha podido encontrar al cliente\n");
                }
            }
            else if (op.equalsIgnoreCase("e")) {
                hotel1.listar();
            }
            else {
                break;
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static Hotel crearHotel() {
        Hotel nuevoHotel;

        System.out.print("Escribe el nombre del hotel: ");
        op = sc.nextLine();
        System.out.print("Escribe la direccion del hotel: ");
        s1 = sc.nextLine();

        nuevoHotel = new Hotel(op, s1);
        return nuevoHotel;
    }

    public static Cliente crearCliente() {
        Cliente nuevoCliente;

        System.out.println("Primero hay que crear un cliente");
        System.out.print("Escribe el nombre del cliente: ");
        op = sc.nextLine();
        System.out.print("Escribe el dni del cliente: ");
        s1 = sc.nextLine();
        System.out.print("Escribe el gmail del cliente: ");
        s2 = sc.nextLine();

        nuevoCliente = new Cliente(op, s1, s2);
        return nuevoCliente;
    }
}