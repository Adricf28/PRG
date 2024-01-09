public class CuentaAhorros extends Cuenta {
    //ATRIBUTOS
    protected boolean estado;

    //CONSTRUCTORES
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.estado = this.saldo < 10000 ? true : false;
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
    @Override
    public void extracto() {
        if (this.retiros > 4) {
            //nosebro 3
        }
    }
    @Override
    public void imprimir() {
        System.out.printf("Saldo: %f\nComision mensual: %f\nTransacciones realizadas: %d\n", this.saldo, this.comisionMensual, (this.consignaciones + this.retiros));
    }
}