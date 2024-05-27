package com.politecnicomalaga.artefactos;

public class Campo {
    //ATRIBUTOS
    private String name;
    private String unit;
    private int decPrecision;

    //CONSTRUCTORES
    public Campo() {}

    public Campo(String name, String unit, int decPrecision) {
        this.name = name;
        this.unit = unit;
        this.decPrecision = decPrecision;
    }

    //GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getDecPrecision() {
        return decPrecision;
    }

    public void setDecPrecision(int decPrecision) {
        this.decPrecision = decPrecision;
    }


    //METODOS
}
