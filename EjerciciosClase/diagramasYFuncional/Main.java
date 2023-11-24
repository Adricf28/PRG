import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static boolean continuar = true;

    public static void main(String[] args) {
        //pushTry();
        /*while (continuar) {
            mostrarMenu();
            hacerFuncion(recogerFuncion());
        }*/

        System.out.printf("Yo: %s\n", diaSemana(1, 98));
        System.out.printf("Maria: %s\n", diaaSemana(1, 98));

        //System.out.println("Finalizando el programa...");
    }

    //Dia semana by Maria
    public static String obtenerNombreDia(int indice) {
        switch (indice) {
            case 1: return "lunes";
            case 2: return "martes";
            case 3: return "miercoles";
            case 4: return "jueves";
            case 5: return "viernes";
            case 6: return "sabado";
            case 7: return "domingo";
            default: return "dia no valido";
        }
    }

    public static String diaaSemana(int diaContar, int diaBase) {
        int indice = (diaBase + diaContar) % 7; //veri interestin sisissi
        if (indice == 0) indice = 7;
        return obtenerNombreDia(indice);
    }

    private static String[] pushS(String[] arr, String add) {
        String[] newArr = new String[arr.length + 1];
        int i;

        for (i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[i] = add;

        return newArr;
    }

    private static void pushTry() {
        String[] arr = {"Lunes"};

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Dia: %s\n", arr[i]);
        }

        System.out.println("--Push--");
        arr = pushS(arr, "Martes");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Dia: %s\n", arr[i]);
        }
    }

    private static void mostrarMenu() {
        System.out.println("Elige una opcion de las siguientes: ");
        System.out.println("a) numeroPar\nb) mayorDeEdad\nc) diaSemana\nd) numeroPrimo\ne) Salir");
    }

    private static String recogerFuncion() {
        System.out.print("Seleccion: ");
        return sc.nextLine();
    }

    private static void hacerFuncion(String op) {
        int par, edad, dia, contador, primo;

        //NUMERO PAR
        if (op.compareToIgnoreCase("a") == 0) {
            System.out.print("Introduce un numero mayor a 0 para comprobar si es par: ");
            par = leerInt(0, Integer.MAX_VALUE);

            if (numeroPar(par)) {
                System.out.printf("El numero %d es par\n\n", par);
            } else {
                System.out.printf("El numero %d es impar\n\n", par);
            }
        }
        //MAYOR DE EDAD
        else if (op.compareToIgnoreCase("b") == 0) {
            System.out.print("Introduce una edad para comprobar si es mayor a 18: ");
            edad = leerInt(0, 120);

            if (mayorDeEdad(edad)) {
                System.out.printf("Edad: %d, es mayor de edad\n\n", edad);
            } else {
                System.out.printf("Edad: %d, no es mayor de edad\n\n", edad);
            }
        }
        //DIA SEMANA
        else if (op.compareToIgnoreCase("c") == 0) {
            System.out.print("Introduce un dia de la semana entre el 1 y el 7: ");
            dia = leerInt(1, 7);
            System.out.print("Introduce un numero mayor a 0 para el contador: ");
            contador = leerInt(0, Integer.MAX_VALUE);

            System.out.printf("Día de la semana: %s\n\n", diaSemana(dia, contador));
        }
        //NUMERO PRIMO
        else if (op.compareToIgnoreCase("d") == 0) {
            System.out.print("Introduce un numero mayor a 0 para comprobar si es primo: ");
            primo = leerInt(0, Integer.MAX_VALUE);

            if (numeroPrimo(primo)) {
                System.out.printf("El numero %d es primo\n\n", primo);
            } else {
                System.out.printf("El numero %d no es primo\n\n", primo);
            }
        }
        //SALIR
        else if (op.compareToIgnoreCase("e") == 0){
            continuar = false;
        }
        //OPCION VALIDA
        else {
            System.out.println("Introduce una opcion valida");
            hacerFuncion(recogerFuncion());
        }
    }

    private static int leerInt(int min, int max) {
        int n = Integer.valueOf(sc.nextLine());

        while (n < min || n > max) {
            System.out.printf("El numero debe estar entre %d y %d\n", min, max);
            System.out.print("Numero: ");
            n = sc.nextInt();
        }

        return n;
    }

    private static boolean numeroPar(int n) {
        return n % 2 == 0;
    }

    private static boolean mayorDeEdad(int n) {
        return n >= 18;
    }

    private static String diaSemana(int diaSemana, int contador) {
        String[] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (int i = 0; i < contador; i++) {
            if (diaSemana == 7) {
                diaSemana = 0;
            }
            diaSemana++;
        }

        return semana[diaSemana-1];
    }

    private static boolean numeroPrimo(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}