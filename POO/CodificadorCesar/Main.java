import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        String texto;
        int iLlave;
        Codificador c1;
        Version2 v2;

        /*do {
            System.out.print("Escribe un texto a codificar/decodificar: ");
            texto = sc.nextLine();
            System.out.print("Introduce un numero positivo para codificar o uno negativo para decodificar el texto: ");
            iLlave = Integer.valueOf(sc.nextLine());

            c1 = new Codificador(texto);
            texto = c1.codificaDecodifica(iLlave);

            System.out.printf("Texto codificado: %s\n", texto);

            System.out.print("¿Quieres codificar/decodificar otro texto? Responde SI/NO: ");
            texto = sc.nextLine();

            if (texto.equalsIgnoreCase("no")) {
                continuar = false;
            }

            System.out.println("");
        } while (continuar);*/

        iLlave = 366;

        System.out.println("--------------------------");

        v2 = new Version2("AbC012");
        texto = v2.codificaDecodifica(iLlave);
        System.out.printf("Texto codificado: %s\n", texto);

        v2 = new Version2("AbC012");
        texto = v2.codificaDecodifica(-iLlave);
        System.out.printf("Texto codificado: %s\n", texto);

        v2 = new Version2("xYz789");
        texto = v2.codificaDecodifica(iLlave);
        System.out.printf("Texto codificado: %s\n", texto);

        System.out.println("--------------------------");

        c1 = new Codificador("AbC012");
        texto = c1.codificaDecodifica(iLlave);
        System.out.printf("Texto codificado: %s\n", texto);

        c1 = new Codificador("AbC012");
        texto = c1.codificaDecodifica(-iLlave);
        System.out.printf("Texto codificado: %s\n", texto);

        c1 = new Codificador("xYz789");
        texto = c1.codificaDecodifica(iLlave);
        System.out.printf("Texto codificado: %s\n", texto);

        System.out.print("--------------------------");

        //System.out.print("Finalizando el programa...");
    }
}