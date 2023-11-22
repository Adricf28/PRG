import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mes;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduzca un mes del 1 al 12 o 'salir' para terminar el programa.");
            mes = sc.nextLine();

            if (isNum(mes)) {
                meses(Integer.parseInt(mes));
            }
            else if (mes.equalsIgnoreCase("salir")) {
                continuar = false;
            }
            else {
                System.out.printf("El valor %s es incorrecto.\n", mes);
            }
        }

        System.out.println("Finalizando el programa...");
    }

    private static void meses(Integer mes) {

        if (mes == 1) {
            System.out.println("Enero tiene 31 días.");
        } else if (mes == 2) {
            System.out.println("Febrero tiene 28 días, o 29 en años bisiestos.");
        } else if (mes == 3) {
            System.out.println("Marzo tiene 31 días.");
        } else if (mes == 4) {
            System.out.println("Abril tiene 30 días.");
        } else if (mes == 5) {
            System.out.println("Mayo tiene 31 días.");
        } else if (mes == 6) {
            System.out.println("Junio tiene 30 días.");
        } else if (mes == 7) {
            System.out.println("Julio tiene 31 días.");
        } else if (mes == 8) {
            System.out.println("Agosto tiene 31 días.");
        } else if (mes == 9) {
            System.out.println("Septiembre tiene 30 días.");
        } else if (mes == 10) {
            System.out.println("Octubre tiene 31 días.");
        } else if (mes == 11) {
            System.out.println("Noviembre tiene 30 días.");
        } else if (mes == 12) {
            System.out.println("Diciembre tiene 31 días.");
        } else {
            System.out.println("Introduce un numero entre el 1 y el 12");
        }
    }

    public static boolean isNum(String arg) {
        try {
            Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
