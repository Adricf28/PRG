package com.politecnicomalaga.artefactos;

import java.util.ArrayList;

public class Sensor {
    //ATRIBUTOS
    private int type;
    private int num;
    private ArrayList<Campo> fields;

    //CONSTRUCTORES
    public Sensor() {
        this.fields = new ArrayList<>();
    }

    public Sensor(int type, int num) {
        this.type = type;
        this.num = num;
        this.fields = new ArrayList<>();
    }

    //GETTERS & SETTERS
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<Campo> getFields() {
        return fields;
    }

    //METODOS
    public boolean addCampo(Campo c) {
        for (Campo i:fields) {
            if (i.getName().equals(c.getName())) {
                return false;
            }
        }
        return fields.add(c);
    }

    public boolean delCampo(String name) {
        for (Campo i:fields) {
            if (i.getName().equals(name)) {
                return fields.remove(i);
            }
        }
        return false;
    }
}
