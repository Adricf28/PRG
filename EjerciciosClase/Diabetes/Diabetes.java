import java.util.Scanner;

public class Diabetes {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String glucemia;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduzca la cantidad de glucemia en mg/dl o 'salir' para terminar el programa.");
            glucemia = sc.nextLine();

            if (isDouble(glucemia)) {
                azucar(Double.parseDouble(glucemia));
            }
            else if (glucemia.equalsIgnoreCase("salir")) {
                continuar = false;
            }
            else {
                System.out.printf("El valor %s es incorrecto.\n", glucemia);
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static void azucar(Double glucemia) {
        String opcion;

        if (glucemia < 70) {
            System.out.printf("Glucemia: %f mg/dl, el paciente tiene hipoglucemia ¿Esta consciente o inconsciente?\n", glucemia);
            opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("consciente")) {
                System.out.println("Suministrar liquidos azucarados de absorcion rapida o hidratos de carbono de absorcion lenta y repetir glucemia en 5-10min.");
            } else if (opcion.equalsIgnoreCase("inconsciente")) {
                System.out.println("NO DAR NADA POR BOCA, ADMINISTRAR GLUCAGON y avisar a familia y emergencias.");
            } else {
                System.out.println("Valor incorrecto.");
            }
        }
        else if (glucemia < 180) {
            System.out.printf("Glucemia: %f mg/dl, niveles normales.\n", glucemia);
        }
        else {
            System.out.printf("Glucemia: %f mg/dl, el paciente tiene HIPERGLUCEMIA. Administrar agua y avisar a su familia.\n", glucemia);
        }
    }

    public static boolean isDouble(String num) {
        try {
            Double.parseDouble(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}