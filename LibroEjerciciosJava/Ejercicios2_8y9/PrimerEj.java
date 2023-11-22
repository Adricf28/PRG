public class PrimerEj {
    public static void main(String[] args) {
        int[] a = {3, 7, 12, 22, 9, 25, 18, 31, 21, 14, 45, 2};
        estadistica_pares_impares(a);
    }

    public static void estadistica_pares_impares(int[] arr) {
        int parSum=0, imparSum=0, nPares=0, nImpares=0, maxPar=0, maxImpar=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                parSum += arr[i];
                nPares++;

                if (arr[i] > maxPar) {
                    maxPar = arr[i];
                }
            } else {
                imparSum += arr[i];
                nImpares++;

                if (arr[i] > maxImpar) {
                    maxImpar = arr[i];
                }
            }
        }

        System.out.printf("Suma Pares: %d\nSuma Impares: %d\nNumero Pares: %d\nNumero Impares: %d\nMaximo Par: %d\nMaximo Impar: %d\n", parSum, imparSum, nPares, nImpares, maxPar, maxImpar);
    }
}