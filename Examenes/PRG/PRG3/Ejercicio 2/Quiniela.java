import java.util.Scanner;

public class Quiniela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int[] equipo1 = new int[15];
        int[] equipo2 = new int[15];

        System.out.println("Calculadora de quinielas");
        for (int i = 0; i < 15; i++) {
            System.out.printf("Introduzca el partido %d:\n", i+1);

            System.out.print("Equipo 1: ");
            op = Integer.valueOf(sc.nextLine());
            equipo1[i] = op;

            System.out.print("Equipo 2: ");
            op = Integer.valueOf(sc.nextLine());
            equipo2[i] = op;
        }

        System.out.println("La quiniela es:");
        for (int i = 0; i < 15; i++) {
            if (equipo1[i] > equipo2[i]) {
                System.out.printf("Partido %d: 1\n", i+1);
            }
            else if (equipo1[i] == equipo2[i]) {
                System.out.printf("Partido %d: X\n", i+1);
            }
            else {
                System.out.printf("Partido %d: 2\n", i+1);
            }
        }
    }
}
