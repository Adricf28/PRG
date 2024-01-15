package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ObjVolador {
    //ATRIBUTOS
    protected float posX, posY, velX, velY;
    protected SpriteBatch batch;
    protected Texture imagen;

    //CONSTRUCTORES
    public ObjVolador() {
        this.posX = 0;
        this.posY = 0;
        this.velX = 0;
        this.velY = 0;
        this.batch = null;
        this.imagen = null;
    }
    public ObjVolador(float posX, float posY, float velX, float velY, SpriteBatch batch, Texture imagen) {
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
        this.batch = batch;
        this.imagen = imagen;
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

    public SpriteBatch getBatch() {
        return batch;
    }

    public void setBatch(SpriteBatch batch) {
        this.batch = batch;
    }

    public Texture getImagen() {
        return imagen;
    }

    public void setImagen(Texture imagen) {
        this.imagen = imagen;
    }

    //METODOS
    public void mover() {
        posX += velX;
        posY += velY;
    }

    public void dispose() {
        if (imagen != null) {
            imagen.dispose();
        }
    }

    public void draw(SpriteBatch pantalla) {
        pantalla.draw(imagen, posX, posY);
    }

    public boolean colisiona(NaveEnemiga alien) {
        return this.posX == alien.getPosX();
    }

}
