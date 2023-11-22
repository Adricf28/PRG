import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduce un numero para ejecutar el programa o 'salir' para finalizarlo.");
            option = sc.nextLine();

            if (isNum(option)) {
                fb(Integer.parseInt(option));
            } else if (option.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                System.out.printf("El valor %s es incorrecto.\n", option);
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static void fb(Integer n) {
        if (n <= 0) {
            System.out.println("Resultado: 0\n");
        }
        else if (n <= 2) {
            System.out.println("Resultado: 1\n");
        }
        else {
            int a = 0;
            int b = 1;
            int c = 0;

            while (n > 1) {
                c = a + b;
                a = b;
                b = c;
                n--;
            }
            System.out.printf("Resultado: %d.\n", c);
        }
    }

    public static boolean isNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
