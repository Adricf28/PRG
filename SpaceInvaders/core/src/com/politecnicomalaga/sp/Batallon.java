package com.politecnicomalaga.sp;

import java.util.ArrayList;

public class Batallon{
    //ATRIBUTOS
    protected float posX, posY, velY;
    protected ArrayList<Escuadron> escuadrones;

    //CONSTRUCTORES
    public Batallon() {
        this.posX = 0;
        this.posY = 0;
        this.velY = 0;
        this.escuadrones = new ArrayList<>(2);
    }

    public Batallon(float posX, float posY, float velY) {
        this.posX = posX;
        this.posY = posY;
        this.velY = velY;
        this.escuadrones = new ArrayList<>(2);
    }

    //GETTERS & SETTERS
    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public float getVelY() {
        return velY;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }

    public ArrayList<Escuadron> getEscuadrones() {
        return escuadrones;
    }

    public void setEscuadrones(ArrayList<Escuadron> escuadrones) {
        this.escuadrones = escuadrones;
    }

    //METODOS
    public void mover() {
        this.posY += this.velY;
    }
}
