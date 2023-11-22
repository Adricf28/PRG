public class Cuadrado {

    //Atributos (para los estados)
    private int lado; //medido en m

    //Sistema RGB
    private int rojo;
    private int verde;
    private int azul;


    //Metodos para los comportamientos


    //Constructor
    public Cuadrado(int nLado, int nRojo, int nVerde, int nAzul) {
        lado = nLado;
        rojo = nRojo;
        verde = nVerde;
        azul = nAzul;
    }

    public Cuadrado(int nLado) {
        lado = nLado;
        rojo = 0;
        verde = 0;
        azul = 0;
    }

    public Cuadrado() {
        lado = 0;
        rojo = 0;
        verde = 0;
        azul = 0;
    }


    //Resto de metodos
    public int getLado() {
        return lado;
    }
    public String getColorRGB() {
        return String.valueOf(rojo) + String.valueOf(verde) + String.valueOf(azul);
    }

    public int getRojo() {
        return rojo;
    }

    public int getVerde() {
        return verde;
    }

    public int getAzul() {
        return azul;
    }

    public int getArea() {
        return lado * lado;
    }

    public void ampliaLado(int incremento) {
        lado += incremento;
    }

    public void setLado(int nuevoLado) {
        lado = nuevoLado;
    }

    public String getAllValues() {
        return "Lado: " + String.valueOf(lado) + ", Rojo: " + String.valueOf(rojo) + ", Verde: " + String.valueOf(verde) + ", Azul: " + String.valueOf(azul);
    }
}
