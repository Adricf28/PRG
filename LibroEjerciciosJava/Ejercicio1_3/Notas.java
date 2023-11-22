import java.util.Scanner;

public class Notas {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        boolean fix = false;
        boolean continuar = true;

        while (continuar) {
            if (fix) {
                sc.nextLine();
            }
            System.out.println("Introduce 'continuar' para ejecutar el programa o 'salir' para finalizarlo.");
            option = sc.nextLine();

            if (option.equalsIgnoreCase("continuar")) {
                mayorTres();
            } else if (option.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                System.out.println("Valor incorrecto.");
            }
            fix = true;
        }

        System.out.println("Finalizando el programa...");
    }

    public static void mayorTres() {
        float nota;
        int i = 0;
        int resultado = 0;

        do {
            System.out.println("Introduce una nota.");
            nota = sc.nextFloat();

            if (nota >= 3.0) {
                resultado++;
            }
            i++;
        } while (i < 5);

        System.out.printf("De las 5 notas, %d de ellas son mayores o igual a 3.0\n", resultado);
    }
}