package com.politecnicomalaga.hotel.model;

public class ClienteVIP extends Cliente{
    //ATRIBUTOS
    protected float porcentajeDescuento;

    //CONSTRUCTORES
    public ClienteVIP() {
    }

    public ClienteVIP(String nombre, String apellidos, String dni, String email, String telefono, float porcentajeDescuento) {
        super(nombre, apellidos, dni, email, telefono);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    //GETTERS & SETTERS
    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public float getModificadorPrecio() {
        return super.getModificadorPrecio() - (this.porcentajeDescuento);
    }

    //METODOS


}