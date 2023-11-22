import java.util.Scanner;

public class IndiceIMC {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion;
        boolean fix = false;
        boolean continuar = true;

        while (continuar) {
            if (fix) {
                sc.nextLine();
            }
            System.out.println("Continuar / Salir");
            opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("continuar")) {
                imc();
            }
            else if (opcion.equalsIgnoreCase("salir")) {
                continuar = false;
            }
            else {
                System.out.printf("El valor %s es incorrecto.\n", opcion);
            }
            fix = true;
        }

        System.out.println("Finalizando el programa...");
    }

    public static void imc() {
        float peso, altura, imc;

        System.out.println("Introduce el peso en kg:");
        peso = sc.nextFloat();
        System.out.println("Introduce la altura en m:");
        altura = sc.nextFloat();

        imc = peso / (float)(Math.pow(altura, 2));

        if (imc < 16) {
            System.out.printf("IMC: %f, Categoría: Delgadez severa.\n", imc);
        } else if (imc >= 16 && imc < 17) {
            System.out.printf("IMC: %f, Categoría: Delgadez moderada.\n", imc);
        } else if (imc >= 17 && imc < 18.5) {
            System.out.printf("IMC: %f, Categoría: Delgadez leve.\n", imc);
        } else if (imc >= 18.5 && imc < 25) {
            System.out.printf("IMC: %f, Categoría: Peso normal.\n", imc);
        } else if (imc >= 25 && imc < 30) {
            System.out.printf("IMC: %f, Categoría: Sobrepeso.\n", imc);
        } else if (imc >= 30 && imc < 35) {
            System.out.printf("IMC: %f, Categoría: Obesidad leve.\n", imc);
        } else if (imc >= 35 && imc < 40) {
            System.out.printf("IMC: %f, Categoría: Obesidad moderada.\n", imc);
        } else {
            System.out.printf("IMC: %f, Categoría: Obesidad mórbida.\n", imc);
        }
    }
}
