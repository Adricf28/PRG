package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ObjVolador {
    protected float posX, posY, velX, velY;
    protected SpriteBatch batch;
    protected Texture imagen;

    public ObjVolador(float posX, float posY, float velX, float velY, Texture imagen) {
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
        this.imagen = imagen;
    }

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

    public float getVelX() {
        return velX;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }

    public float getVelY() {
        return velY;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }

    public Texture getImagen() {
        return imagen;
    }

    public void setImagen(Texture imagen) {
        this.imagen = imagen;
    }

    //Metodos especificos

    public void draw(SpriteBatch pantalla) {
        pantalla.draw(imagen, posX, posY);
    }

    public void moverse() {
        posX += velX;
        posY += velY;
    }


    public int getWidth() {
        return this.imagen.getWidth();
    }


    public int getHeigth() {
        return this.imagen.getHeight();
    }
}
