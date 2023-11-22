import java.util.InputMismatchException;
import java.util.Scanner;

public class Amigos {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        boolean continuar = true;
        boolean fix = false;

        while (continuar) {
            if (fix) {
                sc.nextLine();
            }
            System.out.println("Introduce 'continuar' para ejecutar el programa o 'salir' para finalizarlo");
            option = sc.nextLine();
            if (option.equalsIgnoreCase("continuar")) {
                numAmigos();
            }
            else if (option.equalsIgnoreCase("salir")) {
                continuar = false;
            }
            else {
                System.out.printf("El valor %s es incorrecto.\n", option);
            }
            fix = true;
        }

        System.out.println("Finalizando el programa...");
    }

    public static void numAmigos() {
        System.out.println("Introduce dos numeros.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 1; i <= n1/2; i++) {
            if (n1 % i == 0) {
                suma1 += i;
            }
        }
        for (int i = 1; i <= n2/2; i++) {
            if (n2 % i == 0) {
                suma2 += i;
            }
        }

        if (suma1 == n2 && suma2 == n1) {
            System.out.printf("%d y %d son numeros amigos.\n", n1, n2);
        } else {
            System.out.printf("%d y %d no son numeros amigos.\n", n1, n2);
        }
    }
}
