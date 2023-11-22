import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduce un numero para ejecutar el programa o 'salir' para finalizarlo.");
            option = sc.nextLine();

            if (isNum(option)) {
                amstrong(Integer.parseInt(option));
            } else if (option.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                System.out.printf("El valor %s es incorrecto.\n", option);
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static void amstrong (Integer n) {
        int length = (int) (Math.log10(n) + 1);
        int number = n;
        int i = 0;
        int temp = 0;

        while (i++ < length) {
            temp = temp + (int)(Math.pow(number % 10, length));
            number = number / 10;
        }

        if (temp == n) {
            System.out.printf("El numero %d es un numero de Amstrong.\n", n);
        } else {
            System.out.printf("El numero %d no es un numero de Amstrong.\n", n);
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
