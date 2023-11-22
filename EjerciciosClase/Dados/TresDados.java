public class TresDados {

    static final int RANGO = 6;
    static final String GANA1 = "Ha ganado el jugador 1";
    static final String GANA2 = "Ha ganado el jugador 2";
    static final String EMPATE = "Han empatado";

    public static void main(String[] args) {

        int valor1, valor2, valor3, valor4, valor5, valor6, suma1, suma2;

        int i = 0;
        int numJuegos = (int)(Math.random() * 10 + 1);

        System.out.println("VAMOS A JUGAR " + numJuegos + " VECES.\n");

        while (i < numJuegos)
        {
            valor1 = (int)(Math.random() * RANGO + 1);
            valor2 = (int)(Math.random() * RANGO + 1);
            valor3 = (int)(Math.random() * RANGO + 1);
            valor4 = (int)(Math.random() * RANGO + 1);
            valor5 = (int)(Math.random() * RANGO + 1);
            valor6 = (int)(Math.random() * RANGO + 1);


            suma1 = valor1 + valor2 + valor3;
            suma2 = valor4 + valor5 + valor6;

            System.out.printf("Jugador 1: %d, %d, %d\n", valor1, valor2, valor3);
            System.out.printf("Jugador 2: %d, %d, %d\n", valor4, valor5, valor6);

            if ((valor1 == 6 || valor2 == 6 || valor3 == 6) && (valor4 != 6 && valor5 != 6 && valor6 !=6)) { //Gana el jugador 1 por 6
                System.out.println(GANA1 + "\n");
            }
            else if ((valor4 == 6 || valor5 == 6 || valor6 == 6) && (valor1 != 6 && valor2 != 6 && valor3 != 6)) { //Gana el jugador 2 por 6
                System.out.println(GANA2 + "\n");
            }
            else if (suma1 > suma2) { //Gana el jugador 1 por suma
                System.out.println(GANA1 + "\n");
            }
            else if (suma2 > suma1) { //Gana el jugador 2 por suma
                System.out.println(GANA2 + "\n");
            }
            else { //Empate
                System.out.println(EMPATE + "\n");
            }

            i++;
        }
    }
}