package com.politecnicomalaga.artefactos;

import java.util.*;

public class Main {
    static Map<Integer, Artefacto> artefactos = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static String fichero;

    public static void main(String[] args) {
        boolean seguir = true;
        int opcion;

        do {
            showMenu();
            opcion = leerInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del fichero JSON: ");
                    fichero = leerString();

                    if (GestorJSON.cargarArtefacto(artefactos, fichero)) {
                        System.out.println("Artefacto añadido correctamente\n");
                    } else {
                        System.out.println("Ha habido un error al añadir el artefacto\n");
                    }
                    break;
                case 2:
                    if (añadirSensor()) {
                        System.out.println("Sensor añadido correctamente\n");
                    } else {
                        System.out.println("Ha habido un error al añadir el sensor\n");
                    }
                    break;
                case 3:
                    if (borrarSensor()) {
                        System.out.println("Sensor borrado correctamente\n");
                    } else {
                        System.out.println("Ha habido un error al borrar el sensor\n");
                    }
                    break;
                case 4:
                    if (añadirCampo()) {
                        System.out.println("Campo añadido correctamente\n");
                    } else {
                        System.out.println("Ha habido un añadir el campo\n");
                    }
                    break;
                case 5:
                    if (borrarCampo()) {
                        System.out.println("Campo borrado correctamente\n");
                    } else {
                        System.out.println("Ha habido un error al borrar el campo\n");
                    }
                    break;
                case 6:
                    if (artToJson()) {
                        System.out.println("Artefacto grabado correctamente\n");
                    } else {
                        System.out.println("Ha habido un error al grabar el artefacto\n");
                    }
                    break;
                case 7:
                    if (senToJson()) {
                        System.out.println("Sensor grabado correctamente\n");
                    } else {
                        System.out.println("Ha habido un error al grabar el sensor\n");
                    }
                    break;
                case -1:
                    System.out.println("Ingrese una opcion valida\n");
                    break;
                default:
                    seguir = false;
            }
        } while (seguir);

        System.out.println("Finalizando el programa...");
    }

    private static void showMenu() {
        System.out.println("-- Menu Artefactos --");
        System.out.println("1. Añadir artefacto (desde fichero json, entrada: nombre del fichero)");
        System.out.println("2. Añadir sensor al artefacto (entrada: nombre del fichero, clave del artefacto)");
        System.out.println("3. Borrar sensor del artefacto (entrada: clave del artefacto, clave del sensor, que sería 'num')");
        System.out.println("4. Añadir campo al sensor (entrada: codigo del artefacto, codigo del sensor, datos del campo)");
        System.out.println("5. Borrar campo del sensor (entrada: codigo del artefacto, codigo del sensor, nombre del campo)");
        System.out.println("6. Grabar a JSON Artefacto (entrada: nombre del fichero, codigo del artefacto)");
        System.out.println("7. Grabar a JSON Sensor (entrada: nombre del fichero, codigo del artefacto, codigo del sensor)");
        System.out.println("Cualquier otra opción: Salir");
        System.out.print("Elige una opcion: ");
    }

    private static int leerInt() {
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

    private static String leerString() {
        String sEntrada;
        try {
            sEntrada = sc.nextLine();
        } catch (InputMismatchException e) {
            return "";
        }
        return sEntrada;
    }

    public static boolean añadirSensor() {
        System.out.print("Introduce el nombre del fichero JSON: ");
        String fichero = leerString();
        System.out.print("Introduce el codigo del artefacto: ");
        int codigo = leerInt();

        if (artefactos.get(codigo) != null) {
            Artefacto art = artefactos.get(codigo);
            return GestorJSON.cargarSensor(art, fichero);
        }
        return false;
    }

    public static boolean borrarSensor() {
        System.out.print("Introduce el codigo del artefacto: ");
        int codArt = leerInt();
        System.out.print("Introduce el codigo del sensor: ");
        int codSen = leerInt();

        if (artefactos.get(codArt) != null) {
            Artefacto art = artefactos.get(codArt);
            return art.delSensor(codSen);
        }
        return false;
    }

    public static boolean añadirCampo() {
        System.out.print("Introduce el codigo del artefacto: ");
        int codArt = leerInt();
        System.out.print("Introduce el codigo del sensor: ");
        int codSen = leerInt();

        if (artefactos.get(codArt) != null) {
            Artefacto art = artefactos.get(codArt);

            if (art.buscarSensor(codSen) != null) {
                Sensor sen = art.buscarSensor(codSen);

                System.out.print("Introduce el nombre del campo: ");
                String name = leerString();
                System.out.print("Introduce la unidad del campo: ");
                String unit = leerString();
                System.out.print("Introduce la precision del campo: ");
                int precision = leerInt();

                return sen.addCampo(new Campo(name, unit, precision));
            }
        }
        return false;
    }

    public static boolean borrarCampo() {
        System.out.print("Introduce el codigo del artefacto: ");
        int codArt = leerInt();
        System.out.print("Introduce el codigo del sensor: ");
        int codSen = leerInt();
        System.out.print("Introduce el nombre del campo: ");
        String name = leerString();

        if (artefactos.get(codArt) != null) {
            Artefacto art = artefactos.get(codArt);

            if (art.buscarSensor(codSen) != null) {
                Sensor sen = art.buscarSensor(codSen);
                return sen.delCampo(name);
            }
        }
        return false;
    }

    public static boolean artToJson() {
        System.out.print("Introduce el nombre del fichero JSON: ");
        fichero = leerString();
        System.out.print("Introduce el codigo del artefacto: ");
        int codigo = leerInt();

        if (artefactos.get(codigo) != null) {
            Artefacto art = artefactos.get(codigo);
            return GestorJSON.grabarArtefacto(art, fichero);
        }
        return false;
    }

    public static boolean senToJson() {
        System.out.print("Introduce el nombre del fichero JSON: ");
        fichero = leerString();
        System.out.print("Introduce el codigo del artefacto: ");
        int codArt = leerInt();
        System.out.print("Introduce el codigo del sensor: ");
        int codSen = leerInt();

        if (artefactos.get(codArt) != null) {
            Artefacto art = artefactos.get(codArt);

            if (art.buscarSensor(codSen) != null) {
                Sensor sen = art.buscarSensor(codSen);
                return GestorJSON.grabarSensor(sen, fichero);
            }
        }
        return false;
    }
}
