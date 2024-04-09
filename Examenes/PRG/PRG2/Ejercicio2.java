import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int sueldos=0, irpf=0, tempWage, tempTax, percent=0;
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduzca el sueldo (Entre 10000 y 60000). Fuera de rango: salimos:");
            tempWage = Integer.valueOf(sc.nextLine());

            if (tempWage < 10000 || tempWage > 60000) {
                System.out.println("Adios");
                continuar = false;
            } else if (tempWage >= 10000 && tempWage <= 30000) {
                percent = 10;
            } else if (tempWage > 30000 && tempWage <= 50000) {
                percent = 15;
            } else {
                percent = 20;
            }

            if (continuar) {
                tempTax = (tempWage * percent) / 100;
                sueldos += tempWage;
                irpf += tempTax;
                System.out.println("El sueldo es " + tempWage + ", el IRPF es el " + percent + "% que es " + tempTax + ".");
                System.out.printf("Totales: %d en sueldos y %d en IRPF\n", sueldos, irpf);
            }
        }
    }
}