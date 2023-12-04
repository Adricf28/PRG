import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String op, s1, s2;
        Cliente cliente1 = new Cliente();
        Hotel hotel1 = new Hotel();

        while(true) {
            System.out.println("a) Definir hotel\nb) Añadir cliente\nc) Eliminar cliente\nd) Buscar cliente\ncualquier otra) Salir");
            System.out.print("Seleccion: ");
            op = sc.nextLine();

            if (op.equalsIgnoreCase("a")) {
                System.out.print("Escribe el nombre del hotel: ");
                op = sc.nextLine();
                System.out.print("Escribe la direccion del hotel: ");
                s1 = sc.nextLine();
                hotel1 = new Hotel(op, s1);

                System.out.println("Hotel creado correctamente\n");
            } else if (op.equalsIgnoreCase("b")) {
                System.out.println("Primero hay que crear un cliente");
                System.out.print("Escribe el nombre del cliente: ");
                op = sc.nextLine();
                System.out.print("Escribe el dni del cliente: ");
                s1 = sc.nextLine();
                System.out.print("Escribe el gmail del cliente: ");
                s2 = sc.nextLine();
                cliente1 = new Cliente(op, s1, s2);

                if (hotel1.add(cliente1)) {
                    System.out.println("Se ha añadido el cliente correctamente\n");
                } else {
                    System.out.println("No hay espacio para mas clientes\n");
                }

            } else if (op.equalsIgnoreCase("c")) {
                System.out.print("Introduce el dni del cliente que quieres eliminar: ");
                op = sc.nextLine();

                if (hotel1.remove(op)) {
                    System.out.println("Cliente eliminado correctamente\n");
                } else {
                    System.out.println("No se ha podido eliminar al cliente\n");
                }
            } else if (op.equalsIgnoreCase("d")) {
                System.out.print("Introduce el dni del cliente que quieres buscar: ");
                op = sc.nextLine();

                if (hotel1.search(op)) {
                    System.out.println("El cliente se encuentra en este hotel\n");
                } else {
                    System.out.println("No se ha podido encontrar al cliente\n");
                }
            } else {
                break;
            }
        }*/


        Hotel hotel1 = new Hotel("Playabonita", "Calle Barca");
        Cliente cliente1 = new Cliente("Adrian", "26838689N", "adricf2807@gmail.com");

        if (hotel1.add(cliente1)) {
            System.out.println("Se ha añadido el cliente correctamente\n");
        } else {
            System.out.println("No hay espacio para mas clientes\n");
        }

        if (hotel1.search("26838689N")) {
            System.out.println("El cliente se encuentra en este hotel\n");
        } else {
            System.out.println("No se ha podido encontrar al cliente\n");
        }

        if (hotel1.remove("26838689N")) {
            System.out.println("Cliente eliminado correctamente\n");
        } else {
            System.out.println("No se ha podido eliminar al cliente\n");
        }
    }
}
