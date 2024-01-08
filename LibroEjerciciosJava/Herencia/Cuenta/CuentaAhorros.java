public class CuentaAhorros extends Cuenta {
    //ATRIBUTOS
    protected boolean estado;

    //CONSTRUCTORES
    public CuentaAhorros(boolean estado) {
        this.estado = estado;
    }

    //METODOS
    @Override
    public void consignar(float nuevoSaldo) {
        if (this.estado) {
            super.consignar(nuevoSaldo);
        }
    }
    @Override
    public void retirar(float saldo) {
        if (this.estado) {
            super.retirar(saldo);
        }
    }

}