import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String year;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduce un año o 'salir' para terminar el programa.");
            year = sc.nextLine();

            if (isNum(year)) {
                bisiesto(Integer.parseInt(year));
            }
            else if (year.equalsIgnoreCase("salir")) {
                continuar = false;
            }
            else {
                System.out.printf("El valor %s es incorrecto.\n", year);
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static void bisiesto(Integer year) {
        boolean bisiesto;

        bisiesto = (year % 4 == 0);
        bisiesto = bisiesto && (year % 100 != 0 || year % 400 == 0);

        if (bisiesto) {
            System.out.printf("El año %d fue bisiesto.\n", year);
        } else {
            System.out.printf("El año %d no fue bisiesto.\n", year);
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