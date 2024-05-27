package com.politecnicomalaga.facturas;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    //ATRIBUTOS
    protected String fecha;
    protected int codigo;
    protected List<LineaFactura> lineaFacturas;

    //CONSTRUCTORES
    public Factura(String fecha, int codigo) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.lineaFacturas = new ArrayList<>();
    }

    //GETTERS & SETTERS
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<LineaFactura> getLineaFacturas() {
        return lineaFacturas;
    }

    //METODOS
    public boolean addLineaFactura(LineaFactura linea) {
        if (linea != null) {
            for (LineaFactura i:lineaFacturas) {
                if (i.miProducto.getCodigo() == linea.miProducto.getCodigo()) return false;
            }
            return lineaFacturas.add(linea);
        }
        return false;
    }

    public boolean delLineaFactura(int codProd) {
        for (LineaFactura i:lineaFacturas) {
            if (i.miProducto.getCodigo() == codProd) return lineaFacturas.remove(i);
        }
        return false;
    }

    public LineaFactura buscarLineaFactura(int codProd) {
        for (LineaFactura i:lineaFacturas) {
            if (i.miProducto.getCodigo() == codProd) return i;
        }
        return null;
    }

    public LineaFactura[] getDatosFactura() {
        ArrayList<LineaFactura> datosFactura = new ArrayList<>();

        for (LineaFactura i:lineaFacturas) {
            datosFactura.add(i);
        }

        return datosFactura.toArray(new LineaFactura[datosFactura.size()]);
    }

    public double getTotalFactura() {
        double total = 0;

        for (LineaFactura i:lineaFacturas) {
            total += i.getTotal();
        }

        return total;
    }
}
