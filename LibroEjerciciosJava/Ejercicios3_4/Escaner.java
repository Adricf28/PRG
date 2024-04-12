import java.util.Scanner;

public class Escaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;

        System.out.print("String para contar mayus: ");
        op = sc.nextLine();
        System.out.printf("%s tiene %d mayusculas\n", op, Escaner.nMayus(op));

        System.out.print("String para contar 'a': ");
        op = sc.nextLine();
        System.out.printf("%s tiene %d 'a'\n", op, Escaner.charInStr(op, 'a'));

        System.out.print("String para borrar espacios: ");
        op = sc.nextLine();
        System.out.print("String sin espacios: ");
        Escaner.blankOut(op);

        System.out.print("String para revertirlo: ");
        op = sc.nextLine();
        System.out.printf("%s revertido: %s\n", op, Escaner.reverseStr(op));
    }

    public static int nMayus(String s) {
        char[] charArr = s.toCharArray();
        int mayus = 0;
        for (char i:charArr) {
            if (Character.isUpperCase(i)) {
                mayus++;
            }
        }
        return mayus;
    }

    public static int charInStr(String s, char c) {
        char[] charArr = s.toCharArray();
        int match = 0;
        for (char i:charArr) {
            if (i == c) {
                match++;
            }
        }
        return match;
    }

    public static void blankOut(String s) {
        System.out.println(s.replaceAll(" ", ""));
    }

    public static String reverseStr(String s) {
        char[] charArr = s.toCharArray();
        String rStr = "";
        for (int i = charArr.length-1; i >= 0; i--) {
            rStr += charArr[i];
        }
        return rStr;
    }
}
