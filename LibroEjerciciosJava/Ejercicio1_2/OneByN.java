import java.util.Scanner;

public class OneByN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduce un numero para ejecutar el programa o 'salir' para finalizarlo.");
            option = sc.nextLine();

            if (isNum(option)) {
                division(Integer.parseInt(option));
            } else if (option.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                System.out.printf("El valor %s es incorrecto.\n", option);
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static void division(Integer n) {
        double temp = 0;
        int i = 1;

        while (i <= n) {
            temp = temp + (1.0 / i);
            i++;
        }

        System.out.printf("Temp: %f\n", temp);
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
