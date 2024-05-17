package com.politecnicomalaga.entidadbancaria;

import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static String op;
    static Cuenta c1 = new Cuenta("0000", 0, "NADA", null);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nElige una opcion:");
            System.out.print("A. Dar datos de la cuenta\nB. Cargar cliente de la cuenta desde fichero JSON\nC. Realizar ingreso efectivo\nD. Realizar retirada efectivo\nE. Grabar cuenta a fichero JSON\nF. Cargar cuenta desde fichero JSON\nG. Exportar datos a texto(toString) hacia pantalla y fichero\n");
            System.out.print("Eleccion: ");

            op = sc.nextLine();
            if (op.equalsIgnoreCase("a")) {
                try {
                    datosCuenta();
                    System.out.println("Datos modificados correctamente");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (op.equalsIgnoreCase("b")) {

            } else if (op.equalsIgnoreCase("c")) {
                try {
                    ingreso();
                    System.out.println("Ingreso realizado correctamente");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (op.equalsIgnoreCase("d")) {
                try {
                    retirada();
                    System.out.println("Retirada realizada correctamente");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (op.equalsIgnoreCase("e")) {

            } else if (op.equalsIgnoreCase("f")) {

            } else if (op.equalsIgnoreCase("g")) {

            } else {
                break;
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static void datosCuenta() {
        System.out.print("CCC: ");
        String ccc = sc.nextLine();
        System.out.print("Saldo: ");
        float saldo = Float.valueOf(sc.nextLine());
        System.out.print("Fecha de apertura: ");
        String fechaApertura = sc.nextLine();

        c1.setCcc(ccc);
        c1.setSaldo(saldo);
        c1.setFechaApertura(fechaApertura);
    }

    public static void ingreso() {
        System.out.print("Cantidad a ingresar: ");
        float cantidad = Float.valueOf(sc.nextLine());
        System.out.print("Fecha de la operacion: ");
        String fechaOperacion = sc.nextLine();

        c1.ingresarEfectivo(cantidad, fechaOperacion);
    }

    public static void retirada() {
        System.out.print("Cantidad a retirar: ");
        float cantidad = Float.valueOf(sc.nextLine());
        System.out.print("Fecha de la operacion: ");
        String fechaOperacion = sc.nextLine();

        c1.retirarEfectivo(cantidad, fechaOperacion);
    }
}
