public class Cuenta {
    //ATRIBUTOS
    protected float saldo;
    protected int consignaciones=0;
    protected int retiros=0;
    protected float tasaAnual;
    protected float comisionMensual=0;

    //CONSTRUCTORES
    public Cuenta() {
        this.saldo = 0;
        this.tasaAnual = 0;
    }
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    //METODOS
    public void consignar(float nuevoSaldo) {
        this.saldo += nuevoSaldo;
    }
    public void retirar(float saldo) {
        if (saldo <= this.saldo) {
            this.saldo -= saldo;
        }
    }
    public float interes(){
        float tasaMensual = this.tasaAnual % 12;
        return this.saldo += (this.saldo * tasaMensual);
    }
    public void extracto() {
        //nosebro 2
    }
    public void imprimir() {
        System.out.printf("Saldo: %f\nConsignaciones: %d\nRetiros: %d\nTasa Anual: %f\nComision Mensual: %f", this.saldo, this.consignaciones, this.retiros, this.tasaAnual, this.comisionMensual);
    }
}