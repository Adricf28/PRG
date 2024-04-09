package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ObjetoVoladorScala extends ObjetoVolador{
    //ATRIBUTOS
    protected float ancho;
    protected float alto;

    //CONSTRUCTORES

    public ObjetoVoladorScala(float pX, float pY, float vX, float vY, Texture img, float ancho, float alto) {
        super(pX, pY, vX, vY, img);
        this.ancho = ancho;
        this.alto = alto;
    }

    //GETTERS && SETTERS
    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    //METODOS
    @Override
    public void render(SpriteBatch sp) {
        sp.draw(img, posX, posY, ancho, alto);
    }
}
