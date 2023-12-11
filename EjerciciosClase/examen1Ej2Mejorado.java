import java.util.Scanner;

public class examen1Ej2Mejorado {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double posX, velX, acelX, masa, energia=0;
        int tiempo;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduce un numero mayor o igual a 0 para definir la posicion.");
            posX = leerDouble(0, Double.MAX_VALUE);
            System.out.println("Introduce un numero entre 1 y 100 para definir la velocidad.");
            velX = leerDouble(1, 100);
            System.out.println("Introduce un numero entre 10 y 20 para definir la aceleracion.");
            acelX = leerDouble(10, 20);
            System.out.println("Introduce un numero positivo para definir la masa.");
            masa = leerDouble(0, Double.MAX_VALUE);
            System.out.println("Introduce un numero entero entre 10 y 100 para definir el tiempo.");
            tiempo = leerInt(10, 100);

            for (int i = 1; i <= tiempo; i++) {
                posX = posX + velX;
                velX = velX + acelX;
                energia = (masa * velX * velX) / 2;
            }

            System.out.println("- Velocidad: " + velX + " m/s");
            System.out.println("- Aceleración: " + acelX + " m/s2");
            System.out.println("- Posicion: " + posX + "m");
            System.out.println("- Tiempo usado: " + tiempo + " segundos");
            System.out.println("- Energia cinetica: " + energia + " Julios");

            continuar = false;
        }
    }

    private static double leerDouble(double min, double max) {
        double dValor = Double.valueOf(sc.nextLine());

        while (dValor < min || dValor > max) {
            if (max == Double.MAX_VALUE) {
                System.out.printf("El valor debe ser mayor a %d\n", (int) min);
            } else {
                System.out.printf("El valor debe estar entre %d y %d\n", (int) min, (int) max);
            }
            dValor = Double.valueOf(sc.nextLine());
        }

        return dValor;
    }

    private static int leerInt(int min, int max) {
        int iValor = Integer.valueOf(sc.nextLine());

        while (iValor < min || iValor > max) {
            System.out.printf("El valor debe estar entre %d y %d\n", min, max);
            iValor = Integer.valueOf(sc.nextLine());
        }

        return iValor;
    }
}
