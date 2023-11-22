import java.util.Scanner;

public class DiabetesAndres {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduzca 'continuar' para ejecutar el programa o 'salir' para finalizarlo.");
            opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("continuar")) {
                azucar();
            }
            else if (opcion.equalsIgnoreCase("salir")) {
                continuar = false;
            }
            else {
                System.out.printf("El valor %s es incorrecto.\n", opcion);
            }
        }

        System.out.println("Finalizando el programa...");
    }
    public static void azucar() {
        while (true) {
            System.out.println("Introduzca la cantidad de glucemia en mg/dl");
            String glucemia = sc.nextLine();
            double asucar;
            String opcion;

            if (isDouble(glucemia)) {
                asucar = Double.parseDouble(glucemia);
                if (asucar < 70) {
                    System.out.printf("Glucemia: %f mg/dl, el paciente tiene hipoglucemia ¿Esta consciente o inconsciente?\n", asucar);
                    opcion = sc.nextLine();

                    if (opcion.equalsIgnoreCase("consciente")) {
                        System.out.println("Suministrar liquidos azucarados de absorcion rapida o hidratos de carbono de absorcion lenta y repetir glucemia en 5-10min.");
                    } else if (opcion.equalsIgnoreCase("inconsciente")) {
                        System.out.println("NO DAR NADA POR BOCA, ADMINISTRAR GLUCAGON y avisar a familia y emergencias.");
                        break;
                    } else {
                        System.out.println("Valor incorrecto.");
                    }
                }
                else if (asucar < 180) {
                    System.out.printf("Glucemia: %f mg/dl, niveles normales.\n", asucar);
                    break;
                }
                else {
                    System.out.printf("Glucemia: %f mg/dl, el paciente tiene HIPERGLUCEMIA. Administrar agua y avisar a su familia.\n", asucar);
                    break;
                }
            }
            else {
                System.out.println("tu eres tonto?");
            }
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
