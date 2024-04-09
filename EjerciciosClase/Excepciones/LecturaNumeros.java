import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        while (true) {
            try {
                System.out.print("Numero a: ");
                a = sc.nextInt();
                System.out.print("Numero b: ");
                b = Integer.valueOf(sc.nextLine());
                System.out.print("Numero c: ");
                c = Integer.valueOf(sc.nextLine());
                System.out.print("Numero d: ");
                d = Integer.valueOf(sc.nextLine());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto " + e.toString());
            }
        }
    }
}
