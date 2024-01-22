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

    public NaveAmiga(Texture texNave, Texture explosion, float posX, float posY, float velX, float velY) {
        super(texNave, explosion, posX, posY, velX, velY);
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
    public void crearDisparo(Texture dAmigo) {
        DisparoAmigo unDisparo = new DisparoAmigo(dAmigo, posX, posY, 2.0f);
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