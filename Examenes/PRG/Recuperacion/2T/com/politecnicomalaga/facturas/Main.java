package com.politecnicomalaga.facturas;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String op;
    static Map<Integer, Factura> facturas = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n-- Menu facturas --");
            System.out.print("a) Crear factura (entrada: codigo y fecha)\nb) Mostrar facturas (todas)\nc) Añadir producto a factura (entrada: codigo de la factura, datos del producto y cantidad, mostrara error si el producto ya estaba o no existe la factura)\nd) Eliminar producto de la factura (entrada: codigo de la factura y codigo del producto, mostrara error si no se encuentra la factura o el producto)\ne) Mostrar total de una factura (entrada: codigo de la factura)\n");
            System.out.print("Eleccion: ");

            op = sc.nextLine();
            if (op.equalsIgnoreCase("a")) {
                if (crearFactura()) {
                    System.out.println("Factura creada correctamente");
                } else {
                    System.out.println("Ha habido un error en la creacion de la factura");
                }
            } else if (op.equalsIgnoreCase("b")) {
                listarFacturas();
            } else if (op.equalsIgnoreCase("c")) {
                if (añadirProducto()) {
                    System.out.println("Producto añadido correctamente");
                } else {
                    System.out.println("Ha habido un error al añadir el producto");
                }
            } else if (op.equalsIgnoreCase("d")) {
                if (borrarProducto()) {
                    System.out.println("Producto borrado correctamente");
                } else {
                    System.out.println("Ha habido un error al borrar el producto");
                }
            } else if (op.equalsIgnoreCase("e")) {
                showTotal();
            } else {
                break;
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static boolean crearFactura() {
        System.out.print("Introduce el codigo de la factura: ");
        int codigo = Integer.valueOf(sc.nextLine());

        if (facturas.get(codigo) != null) return false;

        System.out.print("Introduce la fecha de la factura: ");
        String fecha = sc.nextLine();

        facturas.put(codigo, new Factura(fecha, codigo));

        return true;
    }

    public static void listarFacturas() {
        for (Factura i:facturas.values()) {
            System.out.printf("Codigo: %d, Fecha: %s\n", i.getCodigo(), i.getFecha());
        }
    }

    public static boolean añadirProducto() {
        System.out.print("Introduce el codigo de la factura: ");
        int codFactura = Integer.valueOf(sc.nextLine());

        if (facturas.get(codFactura) != null) {
            Factura miFactura = facturas.get(codFactura);

            System.out.print("Introduce el codigo del producto: ");
            int codProd = Integer.valueOf(sc.nextLine());

            if (miFactura.buscarLineaFactura(codProd) != null) return false;

            System.out.print("Introduce la descripcion del producto: ");
            String descripcion = sc.nextLine();
            System.out.print("Introduce el precio del producto: ");
            double precio = Double.valueOf(sc.nextLine());
            System.out.print("Introduce la cantidad de productos: ");
            int cantidad = Integer.valueOf(sc.nextLine());

            return miFactura.addLineaFactura(new LineaFactura(new Producto(codProd, descripcion, precio), cantidad));
        }

        return false;
    }

    public static boolean borrarProducto() {
        System.out.print("Introduce el codigo de la factura: ");
        int codFactura = Integer.valueOf(sc.nextLine());

        if (facturas.get(codFactura) != null) {
            Factura miFactura = facturas.get(codFactura);

            System.out.print("Introduce el codigo del producto: ");
            int codProd = Integer.valueOf(sc.nextLine());

            if (miFactura.buscarLineaFactura(codProd) != null) {
                return miFactura.delLineaFactura(codProd);
            }
        }

        return false;
    }

    public static boolean showTotal() {
        System.out.print("Introduce el codigo de la factura: ");
        int codFactura = Integer.valueOf(sc.nextLine());

        if (facturas.get(codFactura) != null) {
            Factura miFactura = facturas.get(codFactura);

            System.out.println("Total factura " + codFactura + ": " + miFactura.getTotalFactura());
            return true;
        }

        System.out.println("La factura " + codFactura + " no existe");
        return false;
    }
}
