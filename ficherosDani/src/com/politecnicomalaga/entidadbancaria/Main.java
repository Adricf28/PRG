package com.politecnicomalaga.entidadbancaria;

import com.google.gson.Gson;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Cuenta miCuenta;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        int opcion;

        do {
            mostrarMenuPrincipal();
            opcion = leerIntTeclado(sc);
            switch (opcion) {
                case 1:
                    datosCuenta(sc);
                    break;

                case 2:
                    cargarCliente(sc);

                    break;
                case 3:
                    ingresoEfectivo(sc);

                    break;
                case 4:
                    retiradaEfectivo(sc);

                    break;
                case 5:
                    cuentaTojson(sc);
                    break;
                case 6:
                    cargarCuentaFromjson();
                    break;
                case 7:
                    exportarATexto();
                    break;
                case -1:
                    System.out.println("Opción incorrecta. Inténtelo de nuevo");
                    break;
                default:
                    seguir = false;
            }
        } while (seguir);
        System.out.println("Fin de la aplicación");

    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\n\n\nMenú Opciones Cuenta Bancaria");
        System.out.println("-------------------------------------------------\n");
        System.out.println("1. Dar datos de la cuenta");
        System.out.println("2. Cargar Cliente de la cuenta desde fichero JSON");
        System.out.println("3. Realizar ingreso efectivo");
        System.out.println("4. Realizar retirada efectivo");
        System.out.println("5. Grabar cuenta a fichero JSON");
        System.out.println("6. Cargar cuenta desde fichero JSON");
        System.out.println("7. Exportar datos de texto (toSting) hacia pantalla y fichero");


        System.out.println("Cualquier otra opción: Salir");

    }

    private static int leerIntTeclado(Scanner sc) {
        int iOpcion;
        try {
            iOpcion = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            sc.nextLine();
            return -1;
        }
        return iOpcion;
    }

    private static void datosCuenta(Scanner sc) {
        String sCCC, sFechaApertura;
        float fSaldo;

        System.out.println("Número de cuenta:");
        sCCC = leerStringTeclado(sc);
        System.out.println("Fecha de apertura:");
        sFechaApertura = leerStringTeclado(sc);
        System.out.println("Saldo de la cuenta:");
        fSaldo = leerFloatTeclado(sc);


        if (miCuenta == null) {
            miCuenta = new Cuenta(sCCC, fSaldo, sFechaApertura);
        } else {
            miCuenta.setCcc(sCCC);
            miCuenta.setFechaApertura(sFechaApertura);
            miCuenta.setSaldo(fSaldo);
        }
    }

    private static void cargarCliente(Scanner sc) {
        System.out.println("Introduce el nombre del fichero JSON:");
        String sFichero = leerStringTeclado(sc);
        if (miCuenta == null) {
            System.out.println("Primero debe dar de alta la cuenta");
        } else {
            String json = ControladorFicheros.readText(sFichero);
            Gson trabajador = new Gson();
            Cliente c = trabajador.fromJson(json, Cliente.class);
            miCuenta.setMiCliente(c);
        }

    }


    private static String leerStringTeclado(Scanner sc) {

        String sEntrada;
        try {
            sEntrada = sc.nextLine();
        } catch (InputMismatchException e) {
            return "";
        }
        return sEntrada;
    }

    private static float leerFloatTeclado(Scanner sc) {
        float fOpcion;
        try {
            fOpcion = sc.nextFloat();
            sc.nextLine();
        } catch (InputMismatchException e) {
            sc.nextLine();
            return -1f;
        }
        return fOpcion;
    }

    private static void ingresoEfectivo(Scanner sc) {

        System.out.println("Introduce la cantidad a ingresar:");
        float fIngreso = leerFloatTeclado(sc);
        System.out.println("Introduce la fecha del ingreso:");
        String fecha = leerStringTeclado(sc);

        if (miCuenta == null) {
            System.out.println("Primero debe dar de alta la cuenta");
        } else {
            miCuenta.ingresarEfectivo(fIngreso, fecha);
        }
    }

    private static void retiradaEfectivo(Scanner sc) {
        System.out.println("Introduce la cantidad a retirar:");
        float fRetirada = leerFloatTeclado(sc);
        System.out.println("Introduce la fecha de la retirada:");
        String fecha = leerStringTeclado(sc);

        if (miCuenta == null) {
            System.out.println("Primero debe dar de alta la cuenta");
        } else {
            miCuenta.retirarEfectivo(fRetirada, fecha);
        }
    }

    private static void cuentaTojson(Scanner sc) {
        System.out.println("Introduce el nombre del fichero JSON:");
        String sFichero = leerStringTeclado(sc);
        if (miCuenta == null) {
            System.out.println("Primero debe dar de alta la cuenta");
        } else {
            Gson trabajador = new Gson();
            String json = trabajador.toJson(miCuenta);
            ControladorFicheros.writeText(sFichero, json);
        }
    }

    private static void cargarCuentaFromjson() {
        System.out.println("Introduce el nombre del fichero JSON:");
        String sFichero = leerStringTeclado(new Scanner(System.in));
        String json = ControladorFicheros.readText(sFichero);
        Gson trabajador = new Gson();
        miCuenta = trabajador.fromJson(json, Cuenta.class);
    }

    private static void exportarATexto() {
        if (miCuenta == null) {
            System.out.println("Primero debe dar de alta la cuenta");
        } else {
            System.out.println(miCuenta.toString());
            ControladorFicheros.writeText("cuenta.txt", miCuenta.toString());
        }
    }
}
