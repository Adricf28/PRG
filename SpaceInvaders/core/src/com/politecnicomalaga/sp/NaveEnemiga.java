package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class NaveEnemiga extends Nave {
    //ATRIBUTOS
    protected ArrayList<DisparoEnemigo> rafagaEnemiga;
    protected Texture naveEnemiga, explosion;

    //CONSTRUCTORES
    public NaveEnemiga() {
        super();
        this.rafagaEnemiga = new ArrayList<>();
    }

    public NaveEnemiga(float posX, float posY, float velX, float velY, Texture naveEnemiga, boolean vivo, Texture explosion) {
        super(posX, posY, velX, velY, naveEnemiga, vivo, explosion);
        this.rafagaEnemiga = new ArrayList<>();
    }

    //GETTERS & SETTERS
    public ArrayList<DisparoEnemigo> getrafagaEnemiga() {
        return rafagaEnemiga;
    }

    public void setrafagaEnemiga(ArrayList<DisparoEnemigo> rafagaEnemiga) {
        this.rafagaEnemiga = rafagaEnemiga;
    }

    //METODOS
    public void crearDisparoEnemigo() {}

    @Override
    public void draw(SpriteBatch pantalla) {}
}