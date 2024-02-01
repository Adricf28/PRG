package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Nave extends ObjVolador{

    protected Texture explosionT;
    protected boolean eliminado;
    protected boolean vivo;
    protected int anchoPantalla;

    public Nave(float posX, float posY, float velX, float velY, Texture imagen, Texture explosion, boolean vivo, int anchoPantalla) {
        super(posX, posY, velX, velY, imagen);
        this.explosionT = explosion;
        this.vivo = true;
        this.anchoPantalla = anchoPantalla;
        this.eliminado = false;
    }

    public Texture getExplosion() {
        return explosionT;
    }

    public void setExplosion(Texture explosion) {
        this.explosionT = explosion;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean isVivo() {
        return vivo;
    }
/*
    public void explotar() {
        this.vivo = false;
    }
*/
    @Override
    public void draw(SpriteBatch pantalla) {
        if(this.vivo) {
            super.draw(pantalla);
        } else {
            pantalla.draw(explosionT, posX, posY);
        }
    }
    @Override
    public void moverse() {
        super.moverse();
        limitesPantalla();
    }

    public boolean limitesPantalla(){
        if(posX + imagen.getWidth() >= anchoPantalla) {
            setPosX(this.posX);
            setVelX(-1 * getVelX());
            return true;
        }
        if(posX <= 0){
            setPosX(this.posX);
            setVelX(-1 * getVelX());
            return true;
        }
        return false;
    }

    public void eliminar(){
        if(imagen != null)
            imagen=null;
        if(!eliminado)
            this.eliminado = true;
    }
    public void explotar(){
        //Cuando se elimina una nave, se quita la imagen de la nave y aparece la imagen de una explosión
        eliminar();
        imagen = explosionT;
    }
    public boolean isDead(){
        return eliminado;
    }
}
