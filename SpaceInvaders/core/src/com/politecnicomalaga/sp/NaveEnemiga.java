package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class NaveEnemiga extends Nave {
    //ATRIBUTOS
    protected Texture texEnemigos;
    protected ArrayList<DisparoEnemigo> rafagaEnemiga;

    //CONSTRUCTORES
    public NaveEnemiga() {
        super();
        this.rafagaEnemiga = new ArrayList<>();
    }

    public NaveEnemiga(Texture texEnemigos, Texture explosion, float posX, float posY, float velX, float velY) {
        super(texEnemigos, explosion, posX, posY, velX, velY);
        this.texEnemigos = texEnemigos;
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
    public void crearDisparo(Texture dEnemigo) {
        DisparoEnemigo unDisparo = new DisparoEnemigo(dEnemigo, posX, posY, 2.0f);
        rafagaEnemiga.add(unDisparo);
    }


    @Override
    public void draw(SpriteBatch batch) {
        batch.draw(texEnemigos, posX, posY);
    }
}