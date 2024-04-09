import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static String op, op2, op3, op4, op5, op6;
    static int n1;
    static float f1, f2;
    static Empresa miEmpresa = new Empresa();
    static Cliente tempC;
    static Vehiculo tempV;
    static Reserva tempR;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Elige una opcion:");
            System.out.print("a) Dar de alta un vehiculo\nb) Dar de alta un cliente\nc) Alquilar vehiculo a cliente\nd) Listar vehiculos\ne) Devolver vehiculo\n");
            System.out.print("Eleccion: ");

            op = sc.nextLine();
            if (op.equalsIgnoreCase("a")) {

                tempV = crearVehiculo();
                miEmpresa.addVehiculo(tempV);
                System.out.println("-- Vehiculo añadido correctamente --\n");

            } else if (op.equalsIgnoreCase("b")) {

                tempC = crearCliente();
                miEmpresa.addCliente(tempC);
                System.out.println("-- Cliente añadido correctamente --\n");

            } else if (op.equalsIgnoreCase("c")) {

                tempR = crearReserva();
                miEmpresa.addReserva(tempR);
                System.out.println("-- Reserva creada correctamente --\n");

            } else if (op.equalsIgnoreCase("d")) {
                System.out.println();
            } else if (op.equalsIgnoreCase("e")) {

                System.out.print("Matricula del vehiculo a devolver: ");
                op = sc.nextLine();
                System.out.print("Kilometros extra: ");
                f1 = Float.valueOf(sc.nextLine());

                devolverVehiculo(op, f1);
                System.out.println("-- Vehiculo devuelto correctamente --\n");

            } else {
                break;
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static Vehiculo crearVehiculo() {
        System.out.print("Matricula: ");
        op = sc.nextLine();
        System.out.print("Modelo: ");
        op2 = sc.nextLine();
        System.out.print("Marca: ");
        op3 = sc.nextLine();
        System.out.print("Kilometros: ");
        f1 = Float.valueOf(sc.nextLine());
        System.out.print("Precio por dia: ");
        f2 = Float.valueOf(sc.nextLine());
        System.out.print("Tipo de motor: ");
        op4 = sc.nextLine();

        return new Vehiculo(op, op2, op3, f1, f2, op4);
    }

    public static Cliente crearCliente() {
        System.out.print("Nombre: ");
        op = sc.nextLine();
        System.out.print("Apellidos: ");
        op2 = sc.nextLine();
        System.out.print("Email: ");
        op3 = sc.nextLine();
        System.out.print("Telefono: ");
        op4 = sc.nextLine();
        System.out.print("DNI: ");
        op5 = sc.nextLine();
        System.out.print("Numero de tarjeta: ");
        op6 = sc.nextLine();

        return new Cliente(op, op2, op3, op4, op5, op6);
    }

    public static Reserva crearReserva() {
        System.out.print("Matricula del vehiculo a alquilar: ");
        op = sc.nextLine();
        for (Vehiculo i: miEmpresa.getVehiculos()) {
            if (i.getMatricula().equals(op)) {
                tempV = i;
            }
            else {
                System.out.println("-- El vehiculo con matricula " + op + " no esta registrado --");
            }
        }

        System.out.print("Fecha de inicio del alquiler: ");
        op2 = sc.nextLine();
        System.out.print("Dias a alquilar: ");
        n1 = Integer.valueOf(sc.nextLine());

        System.out.print("DNI del cliente que alquila: ");
        op3 = sc.nextLine();
        for (Cliente i: miEmpresa.getClientes()) {
            if (i.getDni().equals(op3)) {
                tempC = i;
            }
            else {
                System.out.println("-- El cliente con DNI " + op3 + " no esta registrado --");
            }
        }

        return new Reserva(tempV, op2, n1, tempC);
    }

    public static boolean devolverVehiculo(String matricula, float kmExtra) {
        for (Reserva i: miEmpresa.getReservas()) {
            if (i.getvAlquilado().getMatricula().equals(matricula)) {
                i.getvAlquilado().updateKms(kmExtra);

                if ((int)kmExtra / i.getDiasAlquiler() > 500) {
                    i.getvAlquilado().updatePrecioDia();
                }

                System.out.println("Precio a cobrar: " + i.getDiasAlquiler() * i.getvAlquilado().getPrecioDia());
                miEmpresa.getReservas().remove(i);
                return true;
            }
        }
        return false;
    }
}