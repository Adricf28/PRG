import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduce un numero o 'salir' para finalizar el programa.");
            num = sc.nextLine();

            if (isNum(num)) {
                numLen(Integer.parseInt(num));
            } else if (num.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                System.out.println("Valor incorrecto.");
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static void numLen(Integer num) {
        int len = 0;
        int numero = num;

        do {
            numero /= 10;
            len++;
        } while (numero > 0);

        System.out.printf("El %d tiene una longitud de %d.\n", num, len);
    }

    public static boolean isNum(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException error) {
            return false;
        }
    }
}