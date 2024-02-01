package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Bichito extends ObjVolador{

    //Solo atributos nuevos uso los del padre.
    //Solo metodos nuevos uso los del padre.
    //Atributos nuevos
    protected Texture rojo;
    protected Texture verde;
    protected Texture azul;
    protected boolean cambioTextura;
    private int timeCambioTextura = 1;
    //La azul no hace falta porque utilizo la de Objvolador

    //Constructor

    public Bichito(float posX, float posY, float velX, float velY, Texture azul, Texture rojo, Texture verde) {
        super(posX, posY, velX, velY, azul);
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }

    //Mas metodos nuevos

    public Texture getRojo() {
        return rojo;
    }

    public void setRojo(Texture rojo) {
        this.rojo = rojo;
    }

    public Texture getVerde() {
        return verde;
    }

    public Texture getAzul() {
        return azul;
    }

    public void setVerde(Texture verde) {
        this.verde = verde;
    }
/*
    public void setCambioTextura(Texture imagenDisparo) {
        if (cambioTextura) {
            cambioTextura = false;
            timeCambioTextura = 1;
            imagenDisparo
        }
        */

    //Metodos sobreescritos
    @Override
    public void draw(SpriteBatch pantalla) {
        super.draw(pantalla);

        if (timeCambioTextura == 15) {
            super.imagen = getVerde();
        } else if(timeCambioTextura == 30) {
            super.imagen = getRojo();
        } else if(timeCambioTextura == 45) {
            super.imagen = getAzul();
            timeCambioTextura = 1;
        }

        timeCambioTextura++;

    }




}
