public class Strings {
    public static void main(String[] args) {
        System.out.println("nMayus: " + Strings.nMayus("ABCDEF"));
        System.out.println("o en Cocobongo: " + Strings.charInStr("Cocobongo", 'o'));
        System.out.println("a en Rosa: " + Strings.charInStr("Rosa", 'a'));
        System.out.println("i en Wachimileidi: " + Strings.charInStr("Wachimileidi", 'i'));
        Strings.blankOut("Hola Buenas Tardes");
        System.out.println("Lentejistas al reves: " + Strings.reverseStr("Lentejistas"));
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
