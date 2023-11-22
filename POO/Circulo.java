public class Circulo {
    //ATRIBUTOS------------------------------------
    private double diametro;
    private double radio; //¿Causa algun problema? ¿Deberia definirse de manera especial?
    private double x;
    private double y;
    private int rojo;
    private int verde;
    private int azul;

    //CONSTRUCTORES--------------------------------
    public Circulo() {
        diametro = 0;
        radio = diametro / 2;
        x = 0;
        y = 0;
        rojo = 0;
        verde = 0;
        azul = 0;
    }

    public Circulo(double dDiametro) {
        diametro = dDiametro;
        radio = diametro / 2;
        x = 0;
        y = 0;
        rojo = 0;
        verde = 0;
        azul = 0;
    }

    public Circulo(double dDiametro, double dX, double dY, int nRojo, int nVerde, int nAzul) {
        diametro = dDiametro;
        radio = diametro / 2;
        x = dX;
        y = dY;
        rojo = nRojo;
        verde = nVerde;
        azul = nAzul;
    }

    //GETTERS--------------------------------------
    public double getDiametro() {
        return diametro;
    }

    public double getRadio() {
        return radio;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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

    //SETTERS--------------------------------------
    public void setDiametro(double diametro) {
        this.diametro = diametro;
        this.radio = diametro / 2;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRojo(int rojo) {
        this.rojo = rojo;
    }

    public void setVerde(int verde) {
        this.verde = verde;
    }

    public void setAzul(int azul) {
        this.azul = azul;
    }

    //METODOS--------------------------------------
    public double getArea() {
        return 3.14 * (radio * radio);
    }

    public double getPerimetro() {
        return 3.14 * diametro;
    }

    public void aumentarDiametro(double incremento) {
        diametro += incremento;
        radio = diametro / 2;
    }

    public void aumentarRadio(double incremento) {
        radio += incremento;
        diametro = radio * 2;
    }

    public String getValues() {
        return "Diametro: " + String.valueOf(diametro) + "\nRadio: " + String.valueOf(radio) + "\nRojo: " + String.valueOf(rojo) + "\nVerde: " + String.valueOf(verde) + "\nAzul: " + String.valueOf(azul);
    }

    public void printValues() {
        System.out.printf("Diametro: %f\nRadio: %f\nRojo: %d\nVerde: %d\nAzul: %d\n\n", diametro, radio, rojo, verde, azul);
    }

    public boolean esdelcirculo(double x, double y) {
        return false;
    }
}
