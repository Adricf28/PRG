public class Temperatura {
    //ATRIBUTOS
    private double farenheit;
    private double celsius;

    //CONSTRUCTORES
    public Temperatura(){}

    public Temperatura(double farenheit, double celsius) {
        this.farenheit = farenheit;
        this.celsius = celsius;
    }

    //GETTERS & SETTERS


    //METODOS
    public static void main(String[] args) {
        System.out.println(Temperatura.cToF(20));
        System.out.println(Temperatura.fToC(20));
    }

    public static double fToC(double farenheit) {
        return (farenheit - 32) * 5/9;
    }

    public static double cToF(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
