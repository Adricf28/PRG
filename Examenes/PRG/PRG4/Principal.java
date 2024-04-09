import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static String op, op2, op3, op4, op5;
    static int n1;
    static float f1;
    static ArrayList<Paquete> paquetes = new ArrayList<>();

    public static void main(String[] args) {
        Paquete paquete1;
        boolean continuar = true;

        while(continuar) {
            System.out.println("Elige una opcion:");
            System.out.print("a) Dar de alta un paquete vacio\nb) Añadir producto a paquete\nc) Eliminar producto\nd) Buscar producto\ne) Listar paquetes\nf) Listar productos\ng o otra tecla) Salir\n");
            System.out.print("Eleccion: ");

            op = sc.nextLine();
            if (op.equalsIgnoreCase("a")) {
                paquete1 = crearPaquete();
                paquetes.add(paquete1);
                System.out.println("-- Paquete creado correctamente --\n");
            }
            else if (op.equalsIgnoreCase("b")) {
                System.out.print("Codigo de producto: ");
                op = sc.nextLine();
                System.out.print("Descripcion: ");
                op2 = sc.nextLine();
                System.out.print("Cantidad: ");
                n1 = Integer.valueOf(sc.nextLine());
                System.out.print("Peso: ");
                f1 = Float.valueOf(sc.nextLine());
                System.out.print("Localizador del paquete: ");
                op3 = sc.nextLine();

                if (añadirProducto(op3, op, op2, n1, f1)) {
                    System.out.println("-- Producto añadido correctamente --\n");
                } else {
                    System.out.println("-- No se ha podido añadir el producto --\n");
                }
            }
            else if (op.equalsIgnoreCase("c")) {
                System.out.print("Localizador: ");
                op = sc.nextLine();
                System.out.print("Codigo de producto: ");
                op2 = sc.nextLine();

                if (eliminarProducto(op, op2)) {
                    System.out.println("-- Producto eliminado correctamente --\n");
                } else {
                    System.out.println("-- No se ha podido eliminar el producto --\n");
                }
            }
            else if (op.equalsIgnoreCase("d")) {
                System.out.print("Localizador: ");
                op = sc.nextLine();
                System.out.print("Codigo de producto: ");
                op2 = sc.nextLine();

                if (buscarProducto(op, op2)) {
                    System.out.println("-- El producto se encuentra en este paquete --\n");
                } else {
                    System.out.println("-- No se ha podido encontrar el producto --\n");
                }
            }
            else if (op.equalsIgnoreCase("e")) {
                System.out.print("Estado de los paquetes a buscar: ");
                op = sc.nextLine();

                System.out.printf("Paquetes cuyo estado es '%s':\n", op);
                listarPaquetes(op);
            }
            else if (op.equalsIgnoreCase("f")) {
                System.out.print("Localizador: ");
                op = sc.nextLine();

                System.out.printf("Productos en el paquete %s:\n", op);
                listarProductos(op);
            }
            else {
                continuar = false;
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static Paquete crearPaquete() {
        System.out.print("Localizador: ");
        op = sc.nextLine();
        System.out.print("Direccion de envio: ");
        op2 = sc.nextLine();
        System.out.print("DNI del cliente: ");
        op3 = sc.nextLine();
        System.out.print("Fecha de envio: ");
        op4 = sc.nextLine();
        System.out.print("Estado del producto (debe estar Vacio, En preparacion, Enviado o Entregado): ");
        op5 = sc.nextLine();
        System.out.print("Dias previstos para la llegada: ");
        n1 = Integer.valueOf(sc.nextLine());

        return new Paquete(op, op2, op3, op4, op5, n1);
    }

    public static boolean añadirProducto(String localizador, String codProducto, String descripcion, int cantidad, float peso) {
        for (Paquete unPaquete:paquetes) {
            if (localizador.equalsIgnoreCase(unPaquete.getLocalizador())) {
                if (unPaquete.getEstado().equalsIgnoreCase("vacio") || unPaquete.getEstado().equalsIgnoreCase("en preparacion")) {
                    Producto producto1 = new Producto(codProducto, descripcion, cantidad, peso);
                    return unPaquete.addProducto(producto1);
                } else {
                    System.out.println("No se pueden añadir productos ya que el paquete esta enviado o entregado");
                }
            }
        }
        return false;
    }

    public static boolean eliminarProducto(String localizador, String codProducto) {
        for (Paquete unPaquete:paquetes) {
            if (localizador.equalsIgnoreCase(unPaquete.getLocalizador())) {
                return unPaquete.eliminarProducto(codProducto);
            }
        }
        return false;
    }

    public static boolean buscarProducto(String localizador, String codProducto) {
        for (Paquete unPaquete:paquetes) {
            if (localizador.equalsIgnoreCase(unPaquete.getLocalizador())) {
                return unPaquete.buscarProducto(codProducto);
            }
        }
        return false;
    }

    public static void listarPaquetes(String estado) {
        for (Paquete unPaquete:paquetes) {
            if (estado.equalsIgnoreCase(unPaquete.getEstado())) {
                System.out.println(unPaquete.getEstado());
            }
        }
    }

    public static void listarProductos(String localizador) {
        for (Paquete unPaquete:paquetes) {
            if (localizador.equalsIgnoreCase(unPaquete.getLocalizador())) {
                ArrayList<Producto> productos = unPaquete.getProductos();
                for (Producto unProducto:productos) {
                    System.out.println(unProducto.getCodProducto());
                }
            }
        }
    }
}