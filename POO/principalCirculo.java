import java.sql.SQLOutput;

public class principalCirculo {
    public static void main(String[] args) {
        Circulo aCirculo = new Circulo();
        Circulo bCirculo = new Circulo(50.4);
        Circulo cCirculo = new Circulo(30.6, 255, 255, 255);

        //----------DISTINTOS METODOS PARA IMPRIMIR VALORES
        /*String valoresBCirculo = bCirculo.getValues() + "\n";
        System.out.println(valoresBCirculo);
        bCirculo.printValues();*/


        //----------AUMENTAR DIAMETRO Y VER COMO CAMBIA EL RADIO
        /*System.out.println(cCirculo.getValues() + "\n");
        cCirculo.aumentarDiametro(6);
        System.out.println(cCirculo.getValues() + "\n");*/


        //----------AUMENTAR RADIO Y VER COMO CAMBIA EL DIAMETRO
        /*System.out.println("Radio: " + String.valueOf(cCirculo.getRadio()) + ", Diametro: " + String.valueOf(cCirculo.getDiametro()));
        cCirculo.aumentarRadio(5);
        System.out.println("Radio: " + String.valueOf(cCirculo.getRadio()) + ", Diametro: " + String.valueOf(cCirculo.getDiametro()));*/

        //AREA Y PERIMETRO
        //System.out.printf("Diametro: %f\nArea: %f\nPerimetro: %f", cCirculo.getDiametro(), cCirculo.getArea(), cCirculo.getPerimetro());

        //----------SET DIAMETRO CON SCANNER
        /*System.out.printf("Diametro: %f\nRadio: %f\n", cCirculo.getDiametro(), cCirculo.getRadio());
        cCirculo.setDiametro();
        System.out.printf("Diametro: %f\nRadio: %f\n", cCirculo.getDiametro(), cCirculo.getRadio());*/


        //----------ASIGNAR VALORES A aCirculo
        /*aCirculo.printValues();

        aCirculo.setDiametro();
        aCirculo.setRojo(30);
        aCirculo.setVerde(60);
        aCirculo.setAzul(90);

        aCirculo.printValues();*/
    }
}
