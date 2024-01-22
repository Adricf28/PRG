package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ObjVolador {
    //ATRIBUTOS
    protected float posX, posY, velX, velY;
    protected Texture texObjVolador;

    //CONSTRUCTORES
    public ObjVolador() {
        this.posX = 0;
        this.posY = 0;
        this.velX = 0;
        this.velY = 0;
        this.texObjVolador = null;
    }
    public ObjVolador(Texture texObjVolador, float posX, float posY, float velX, float velY) {
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
        this.texObjVolador = texObjVolador;
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

    public Texture gettexObjVolador() {
        return texObjVolador;
    }

    public void settexObjVolador(Texture texObjVolador) {
        this.texObjVolador = texObjVolador;
    }

    //METODOS
    public void mover() {
        posX += velX;
        posY += velY;
    }

    public void dispose() {
        if (texObjVolador != null) {
            texObjVolador.dispose();
        }
    }

    public void draw(SpriteBatch pantalla) {
        pantalla.draw(texObjVolador, posX, posY);
    }

    public boolean colisiona(ObjVolador ovni) {
        return this.colisionaFila(ovni) && this.colisionaColumna(ovni);
    }

    public boolean colisionaFila(ObjVolador ovni) {
        float x = this.posX;
        float xw = this.posX + this.getWidth();
        float x1 = ovni.getPosX();
        float x1w1 = ovni.getPosX() + ovni.getWidth();

        return (x1 >= x && x1 <= xw) || (x1w1 >= x && x1w1 <= xw);
    }

    public boolean colisionaColumna(ObjVolador ovni) {
        float y = this.posY;
        float yh = this.posY + this.getHeight();
        float y1 = ovni.getPosY();
        float y1h1 = ovni.getPosY() + ovni.getHeight();

        return (y1 >= y && y1 <= yh) || (y1h1 >= y && y1h1 <= yh);
    }

    public int getWidth() {
        return this.texObjVolador.getWidth();
    }

    public int getHeight() {
        return this.texObjVolador.getHeight();
    }
}
