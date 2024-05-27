package com.politecnicomalaga.facturas;

public class ProductoOferta extends Producto{
    //ATRIBUTOS
    protected byte porcentajeDescuento;

    //CONSTRUCTORES
    public ProductoOferta(int codigo, String descripcion, double precio, byte porcentajeDescuento) {
        super(codigo, descripcion, precio);
        if (porcentajeDescuento >= 1 && porcentajeDescuento <= 50) this.porcentajeDescuento = porcentajeDescuento;
        else this.porcentajeDescuento = 1;
    }

    //GETTERS & SETTERS
    public byte getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(byte porcentajeDescuento) {
        if (porcentajeDescuento >= 1 && porcentajeDescuento <= 50) this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double getPrecio() {
        return this.precio - (this.precio * this.porcentajeDescuento / 100);
    }

    //METODOS
}
