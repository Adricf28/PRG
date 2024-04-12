import java.util.Arrays;

public class Wrappers {
    public static void main(String[] args) {
        Wrappers.sortCharArr("Acbedhgf".toCharArray());
        Wrappers.minMaxNumbers();
        Wrappers.intConverter(50);
    }

    public static void sortCharArr(char[] cArr) {
        Arrays.sort(cArr);
        for (char i:cArr) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void minMaxNumbers() {
        System.out.println("Valor mínimo de int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo de int: " + Integer.MAX_VALUE);

        System.out.println("Valor mínimo de long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo de long: " + Long.MAX_VALUE);

        System.out.println("Valor mínimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo de float: " + Float.MAX_VALUE);

        System.out.println("Valor mínimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo de double: " + Double.MAX_VALUE);
    }

    public static void intConverter(int a) {
        Long l = new Long(a);
        Float f = new Float(a);
        Double d = new Double(a);

        System.out.printf("Long: %d\nFloat: %f\nDouble: %f\n", l, f, d);
    }
}
