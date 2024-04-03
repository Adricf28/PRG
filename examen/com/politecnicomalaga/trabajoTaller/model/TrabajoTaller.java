package com.politecnicomalaga.trabajoTaller.model;

public class TrabajoTaller {
    //ATRIBUTOS
    protected String fechaEntrada;
    protected int horaEntrada;
    protected String codigo;

    //CONSTRUCTOR

    //GETTERS & SETTERS

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
