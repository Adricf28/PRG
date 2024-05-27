package com.politecnicomalaga.artefactos;

import java.util.ArrayList;

public class Artefacto {
    //ATRIBUTOS
    private String artifact;
    private String architecture;
    private int productID;
    private ArrayList<Sensor> sensors;

    //CONSTRUCTORES
    public Artefacto() {
        this.sensors = new ArrayList<>();
    }

    public Artefacto(String artifact, String architecture, int productID) {
        this.artifact = artifact;
        this.architecture = architecture;
        this.productID = productID;
        this.sensors = new ArrayList<>();
    }

    //GETTERS & SETTERS
    public String getartifact() {
        return artifact;
    }

    public void setartifact(String artifact) {
        this.artifact = artifact;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    //METODOS
    public boolean addSensor(Sensor sen) {
        for (Sensor i:sensors) {
            if (i.getNum() == sen.getNum()) return false;
        }
        return sensors.add(sen);
    }
    
    public boolean delSensor(int codigo) {
        for (Sensor i:sensors) {
            if (i.getNum() == codigo) {
                return sensors.remove(i);
            }
        }
        return false;
    }

    public Sensor buscarSensor(int codigo) {
        for (Sensor i:sensors) {
            if (i.getNum() == codigo) return i;
        }
        return null;
    }
}
