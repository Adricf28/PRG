package com.politecnicomalaga.entidadbancaria;

public class Operacion {

    private long id;
    private String fechaOperacion;
    private float cantidad;

    public Operacion(String fechaOperacion, float cantidad) {
        this.id = (long) (Math.random() * 1000000);
        this.fechaOperacion = fechaOperacion;
        this.cantidad = cantidad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Operacion{" +
                "id=" + id + ";" +
                "fechaOperacion='" + fechaOperacion + "';" +
                "cantidad=" + cantidad + ";\n";
    }
}
