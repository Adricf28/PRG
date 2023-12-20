public class SortArray {
    public static void main(String[] args) {
        String[] strArr = {"uno", "dos", "tres", "cuatro", "cinco", "seis"};

        listar(strArr);
        strArr[0] = null;
        strArr[2] = null;
        strArr[4] = null;
        listar(strArr);
        sort(strArr);
        listar(strArr);
    }

    public static void sort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] != null) {
                        arr[i] = arr[j];
                        arr[j] = null;
                        break;
                    }
                }
            }
        }
    }

    /*public static void sort1(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j])>0) {
                        String temp=arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
        }
    }

    public static void sort2(String[] arr) {
        if (arr.length>2) {
            String[] resultado = unir(sort2(mitadArray) , sort2(otraMitad));
        } else if (arr.length==2 && arr[0].compareTo(arr[1])>0) {
            String t = arr[0];
            arr[0] = arr[1];
            arr[1] = t;
        }
    }*/


    public static void listar(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}