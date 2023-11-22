import java.util.Scanner;

public class MCDyMCM {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        boolean fix = false;
        boolean continuar = true;

        while (continuar) {
            if (fix) {
                sc.nextLine();
            }
            System.out.println("Introduce 'mcm', 'mcd' o 'salir'.");
            option = sc.nextLine();

            if (option.equalsIgnoreCase("mcd")) {
                mcd();
            } else if (option.equalsIgnoreCase("mcm")) {
                mcm();
            } else if (option.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                System.out.println("Valor incorrecto.");
            }
            fix = true;
        }

        System.out.println("Finalizando el programa...");
    }

    public static void mcd() {
        System.out.print("Introduce un numero: ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.print("\nIntroduce otro numero: ");
        int y = sc.nextInt();
        int multXY = x * y;
        int multMin = multXY;

        for (int i = multXY; i >= Math.max(x, y); i--) {
            if (i % x == 0 && i % y == 0) {
                multMin = i;
            }
        }

        System.out.printf("El MCD de %d y %d es %d.\n", x, y, multMin);
    }

    public static void mcm() {
        int a, b, tempA, tempB;
        System.out.print("Introduce un numero: ");
        a = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce otro numero: ");
        b = sc.nextInt();
        tempA = a;
        tempB = b;

        for (int i = 0; tempA != tempB; i++) {
            if (tempA < tempB) {
                tempA += a;
            } else {
                tempB += b;
            }
        }

        System.out.printf("El MCM de %d y %d es %d.\n", a, b, tempA);
    }
}