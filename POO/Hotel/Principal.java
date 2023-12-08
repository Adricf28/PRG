import java.util.Scanner;

public class Principal {
    static final Scanner sc = new Scanner(System.in);
    static String op, s1, s2, s3;
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel();
        Cliente cliente1 = new Cliente();

        while(true) {
            System.out.println("a) Definir hotel\nb) Añadir cliente\nc) Eliminar cliente\nd) Buscar cliente\ne) Listar clientes\nf) Crear promocion\ncualquier otra) Salir");
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
                listar(hotel1);
            }
            else if (op.equalsIgnoreCase("f")) {
                crearPromocion();
                System.out.println("La promocion se ha creado correctamente\n");
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

    public static Promocion crearPromocion() {
        Promocion nuevaPromocion;

        System.out.print("Introduce el codigo de la promocion: ");
        op = sc.nextLine();
        System.out.print("Introduce la edad minima: ");
        s1 = sc.nextLine();
        System.out.print("Introduce la edad maxima: ");
        s2 = sc.nextLine();
        System.out.print("Describe la promocion: ");
        s3 = sc.nextLine();

        nuevaPromocion = new Promocion(Integer.valueOf(op), Integer.valueOf(s1), Integer.valueOf(s2), s3);
        return nuevaPromocion;
    }

    public static void listar(Hotel ht) {
        Cliente[] clientes = ht.getMisClientes();

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                System.out.printf("Nombre: %s, DNI: %s, Gmail: %s\n", clientes[i].getNombre(), clientes[i].getDni(), clientes[i].getGmail());
            }
        }

        System.out.println();
    }
}