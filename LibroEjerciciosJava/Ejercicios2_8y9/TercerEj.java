public class TercerEj {
    public static void main(String[] args) {
        int[][] arr = crearMatriz(5, 5, 500, 1000);
        System.out.println("Filas: " + filas(arr));
        System.out.println("Columnas: " + columnas(arr));
        System.out.println("");
        printMatriz(arr);
    }

    private static int[][] crearMatriz(int filas, int columnas, int min, int max) {
        int[][] newMatriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) { //Por cada fila (array)
            for (int j = 0; j < columnas; j++) { //Por cada columna (cada valor dentro de cada array de la matriz)
                newMatriz[i][j] = min + (int) (Math.random()*(max-min));
            }
        }

        return newMatriz;
    }

    private static int filas(int[][] matriz) {
        return matriz.length;
    }

    private static int columnas(int[][] matriz) {
        return matriz[0].length; //Esto te da el valor correcto porque todas las filas (arrays) llevan la misma cantidad de valores (columnas)"
    }

    public static boolean mismas_dimensiones (int[][] m1, int[][] m2) {
        return filas(m1)==filas(m2) && columnas(m1)==columnas(m2);
    }
    public static boolean es_cuadrada (int[][] m) {
        return filas(m)==columnas(m);
    }

    private static void printMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}