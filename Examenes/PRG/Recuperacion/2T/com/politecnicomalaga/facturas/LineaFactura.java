package com.politecnicomalaga.facturas;

public class LineaFactura {
    //ATRIBUTOS
    protected Producto miProducto;
    protected int cantidad;

    //CONSTRUCTORES
    public LineaFactura(Producto miProducto, int cantidad) {
        this.miProducto = miProducto;
        if (cantidad >= 1) this.cantidad = cantidad;
        else this.cantidad = 1;
    }

    //GETTERS & SETTERS
    public Producto getMiProducto() {
        return miProducto;
    }

    public void setMiProducto(Producto miProducto) {
        this.miProducto = miProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 1) this.cantidad = cantidad;
    }

    //METODOS
    public double getTotal() {
        double resultado = miProducto.getPrecio() * cantidad;
        return resultado;
    }
}
