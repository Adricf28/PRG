import java.util.Scanner;

public class Factorial {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduce un numero o 'salir' para finalizar el programa");
            option = sc.nextLine();

            if (isNum(option)) {
                fact(Integer.parseInt(option));
            } else if (option.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                System.out.println("Valor incorrecto.");
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static void fact(Integer num) {
        int res = 1;

        for (int i = 1; i <= num; i++) {
            res *= i;
        }

        System.out.printf("El factorial de %d es %d\n", num, res);
    }

    public static boolean isNum(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}