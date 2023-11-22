public class PrincipalCuadrado {
    public static void main(String[] args) {

        Cuadrado miCuadrado, otroCuadrado;
        int area;

        miCuadrado = new Cuadrado();
        otroCuadrado = new Cuadrado(6);
        miCuadrado = new Cuadrado(10, 255, 255, 255);

        otroCuadrado = miCuadrado;

        area = miCuadrado.getArea();
        System.out.println("El area es: " + area);
        System.out.println("Cuadrado miCuadrado - " + miCuadrado.getAllValues());
        otroCuadrado.ampliaLado(4);
        System.out.println("Otro cuadrado modifica el lado en 4m");
        System.out.println("Cuadrado miCuadrado - " + miCuadrado.getAllValues());
        System.out.println("Cuadrado otroCuadrado - " + miCuadrado.getAllValues());

        area = miCuadrado.getArea();
        System.out.println("El area de miCuadrado es: " + area);
        area = otroCuadrado.getArea();
        System.out.println("El area de otroCuadrado es: " + area);
    }
}