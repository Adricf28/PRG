package com.politecnicomalaga.entidadbancaria;

public class Operacion {
    //ATRIBUTOS
    private long codigo;
    private String fechaOperacion;
    private float cantidad;

    //CONSTRUCTORES
    public Operacion(long codigo, String fechaOperacion, float cantidad) {
        this.codigo = codigo;
        this.fechaOperacion = fechaOperacion;
        this.cantidad = cantidad;
    }

    //GETTERS & SETTERS
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(String fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    //METODOS

}
