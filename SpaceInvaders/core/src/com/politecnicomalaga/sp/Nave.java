package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Nave extends ObjVolador{
    //ATRIBUTOS
    protected boolean vivo;
    protected Texture explosion;

    //CONSTRUCTORES
    public Nave() {
        super();
        this.vivo = true;
        this.explosion = null;
    }

    public Nave(Texture texNave, Texture explosion, float posX, float posY, float velX, float velY) {
        super(texNave, posX, posY, velX, velY);
        this.explosion = explosion;
        this.vivo = true;
    }

    //GETTERS & SETTERS
    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Texture getExplosion() {
        return explosion;
    }

    public void setExplosion(Texture explosion) {
        this.explosion = explosion;
    }

    //METODOS
    public void explotar() {
        this.vivo = false;
    }

    @Override
    public void draw(SpriteBatch pantalla) {
        if(this.vivo) {
            super.draw(pantalla);
        } else {
            pantalla.draw(explosion, posX, posY);
        }
    }

    @Override
    public void mover() {
        //Solo si esta dentro del los limites de la pantalla
    }
}
