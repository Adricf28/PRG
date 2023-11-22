public class Main {
    static final char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {
        char[] word = randomWord(5, 0, 26);
        printArray(word);

        char[][] wordMatrix = randomWordMatrix(6,7,0,26);
        printMatrix(wordMatrix);
        leerCasilla(wordMatrix, 0, 0);
        setCasilla(wordMatrix, 0, 0, 'z');
        printMatrix(wordMatrix);
        leerCasilla(wordMatrix, 0, 0);

        comprobarCasilla(wordMatrix, 0, 0);
        comprobarCasilla(wordMatrix, 10, 10);
    }

    private static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    private static void printMatrix(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static char[] randomWord(int len, int min, int max) {
        char[] newWord = new char[len];
        int letraRandom;

        for (int i = 0; i < newWord.length; i++) {
            letraRandom = min + (int) (Math.random() * (max-min));
            newWord[i] = alfabeto[letraRandom];
        }

        return newWord;
    }

    private static char[][] randomWordMatrix(int filas, int columnas, int min, int max) {
        char [][] newWordMatrix = new char[filas][columnas];
        int letraRandom;

        for (int i = 0; i < newWordMatrix.length; i++) {
            for (int j = 0; j < newWordMatrix[0].length; j++) {
                letraRandom = min + (int) (Math.random() * (max-min));
                newWordMatrix[i][j] = alfabeto[letraRandom];
            }
        }

        return newWordMatrix;
    }

    private static int filas(char[][] matriz) {
        return matriz.length;
    }

    private static int columnas(char[][] matriz) {
        return matriz[0].length;
    }

    private static void leerCasilla(char[][] matriz, int fila, int columna) {
        System.out.printf("En la fila %d, columna %d hay una: %c\n\n", fila, columna, matriz[fila][columna]);
    }

    private static char[][] setCasilla(char[][] matriz, int fila, int columna, char letra) {
        matriz[fila][columna] = letra;
        return matriz;
    }

    private static boolean comprobarCasilla(char[][] matriz, int fila, int columna) {
        if (fila <= matriz.length && columna <= matriz[0].length) {
            System.out.printf("La casilla en la fila %d y columna %d es valida. En ella hay una %c\n", fila, columna, matriz[fila][columna]);
            return true;
        }
        System.out.printf("La casilla en la fila %d y columna %d no es valida\n", fila, columna);
        return false;
    }
}