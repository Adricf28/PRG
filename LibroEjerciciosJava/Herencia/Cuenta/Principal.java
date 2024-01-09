public class Principal {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(2000, 2);
        CuentaAhorros ahorros1 = new CuentaAhorros(11000, 1);

        //No funciona
        ahorros1.imprimir();
        ahorros1.consignar(1200);
        ahorros1.imprimir();
    }
}