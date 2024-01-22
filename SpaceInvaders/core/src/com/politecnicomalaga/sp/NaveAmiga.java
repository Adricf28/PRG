package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class NaveAmiga extends Nave{
    //ATRIBUTOS
    protected ArrayList<DisparoAmigo> rafagaAmiga;

    //CONSTRUCTORES
    public NaveAmiga() {
        super();
        this.rafagaAmiga = new ArrayList<>();
    }

    public NaveAmiga(float posX, float posY, float velX, float velY, Texture naveAmiga, Texture explosion, boolean vivo) {
        super(posX, posY, velX, velY, naveAmiga, explosion, vivo);
        this.rafagaAmiga = new ArrayList<>();
    }

    //GETTERS & SETTERS
    public ArrayList<DisparoAmigo> getRafagaAmiga() {
        return rafagaAmiga;
    }

    public void setRafagaAmiga(ArrayList<DisparoAmigo> rafagaAmiga) {
        for (DisparoAmigo unDisparo:this.rafagaAmiga) {
            unDisparo.dispose();
        }
        this.rafagaAmiga = rafagaAmiga;
    }

    //METODOS
    public void crearDisparo(Texture imagenDisparo) {
        DisparoAmigo unDisparo = new DisparoAmigo(posX, posY, 2.0f, imagenDisparo);
        rafagaAmiga.add(unDisparo);
    }

    public boolean colisionDisparos(NaveEnemiga alien) {

        boolean chocado = false;
        int i=0;
        while(!chocado) {
            DisparoAmigo probando = rafagaAmiga.get(i);
            chocado = probando.colisiona(alien);
            i++;
        }
        return chocado;
    }
}