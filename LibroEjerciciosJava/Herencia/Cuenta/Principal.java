public class Principal {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(2000, 2);
        CuentaAhorros ahorros1 = new CuentaAhorros(11000, 1);

        ahorros1.imprimir();
        System.out.println();
        ahorros1.consignar(1200);
        ahorros1.imprimir();
        System.out.println();
        ahorros1.retirar(200);
        ahorros1.consignar(10000);
        ahorros1.imprimir();
    }
}