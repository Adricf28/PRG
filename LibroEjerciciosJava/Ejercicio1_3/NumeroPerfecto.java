import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduce un numero o 'salir' para finalizar el programa.");
            num = sc.nextLine();

            if (isNum(num)) {
                perfNum(Integer.parseInt(num));
            } else if (num.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                System.out.println("Valor incorrecto.");
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static void perfNum(Integer num) {
        int suma = 0;
        int i = 1;

        do {
            if (num % i == 0) {
                suma += i;
            }
            i++;
        } while (i < num);

        if (suma == num) {
            System.out.printf("El %d es un numero perfecto.\n", num);
        } else {
            System.out.printf("El %d no es un numero perfecto.\n", num);
        }
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
