package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class EquipoTriangulo {
    //ATRIBUTOS
    protected float velX;
    protected float velY;
    protected Texture img;
    protected ArrayList<ObjetoVoladorScala> teamTriangulo;

    //CONSTRUCTORES
    public EquipoTriangulo(ArrayList<Integer> posiciones, float velX, float velY, Texture img, float ancho, float alto) {
        this.velX = velX;
        this.velY = velY;
        this.img = img;

        this.teamTriangulo = new ArrayList<>(3);
        this.teamTriangulo.add(new ObjetoVoladorScala(posiciones.get(0), posiciones.get(1), velX, velY, img, ancho, alto));
        this.teamTriangulo.add(new ObjetoVoladorScala(posiciones.get(2), posiciones.get(3), velX, velY, img, ancho, alto));
        this.teamTriangulo.add(new ObjetoVoladorScala(posiciones.get(4), posiciones.get(5), velX, velY, img, ancho, alto));
    }

    //GETTERS && SETTERS
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


    //METODOS
}
