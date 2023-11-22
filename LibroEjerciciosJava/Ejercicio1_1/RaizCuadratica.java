import java.util.Scanner;

public class RaizCuadratica {
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
                raiz();
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

    public static void raiz() {
        double a, b, c, r1, r2;

        System.out.println("Ingresa el valor de a: ");
        a = sc.nextDouble();
        System.out.println("Ingresa el valor de b: ");
        b = sc.nextDouble();
        System.out.println("Ingresa el valor de c: ");
        c = sc.nextDouble();

        if (4*a*c > b * b) {
            System.out.println("Las raíces son de tipo números imaginarios");
        } else if (a != 0) {
            double formula = (b * b) - (4 * a * c);
            r1 = ((-b + Math.sqrt(formula)) / (2 * a));
            r2 = ((-b - Math.sqrt(formula)) / (2 * a));
            System.out.println("La primera raíz es: " + r1);
            System.out.println("La segunda raíz es: " + r2);
        } else {
            System.out.println("La ecuación no es cuadrática, a es 0");
        }
    }
}