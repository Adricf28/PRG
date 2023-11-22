public class SegundoEj {
    public static void main (String[] args) {
        char[] v = {'a', 'e', 'A', 'q', 'i', 'U', 'a', 'E', 'p', 'O', 'u', 'A', 'i', 'e'};
        estadistica_vocales(v);
    }

    public static void estadistica_vocales(char[] arr) {
        int as=0, es=0, is=0, os=0, us=0, consNum=0;
        char pos;

        for (int i = 0; i < arr.length; i++) {
            pos = arr[i];
            if (pos == 'a' || pos == 'A') {
                as++;
            } else if (pos == 'e' || pos == 'E') {
                es++;
            } else if (pos == 'i' || pos == 'I') {
                is++;
            } else if (pos == 'o' || pos == 'O') {
                os++;
            } else if (pos == 'u' || pos == 'U') {
                us++;
            } else {
                consNum++;
            }
        }

        System.out.printf("Total a: %d\nTotal e: %d\nTotal i: %d\nTotal o: %d\nTotal u: %d\nTotal Consonantes: %d\n", as, es, is, os, us, consNum);
    }
}