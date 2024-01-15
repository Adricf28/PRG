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

    public NaveAmiga(float posX, float posY, float velX, float velY, SpriteBatch batch, Texture imagen, boolean vivo, Texture explosion) {
        super(posX, posY, velX, velY, batch, imagen, vivo, explosion);
        this.rafagaAmiga = new ArrayList<>();
    }

    //GETTERS & SETTERS
    public ArrayList<DisparoAmigo> getRafagaAmiga() {
        return rafagaAmiga;
    }

    public void setRafagaAmiga(ArrayList<DisparoAmigo> rafagaAmiga) {
        this.rafagaAmiga = rafagaAmiga;
    }

    //METODOS
    /*
    public void nosequeesesto (ArrayList<DisparoAmigo> lista) {
        for (DisparoAmigo unDisparo:rafagaAmiga) {
            unDisparo.dispose();
        }

        this.rafagaAmiga = lista;
    }

    public void crearDisparo(Texture imagenDisparo) {
        DisparoAmigo unDisparo =new DisparoAmigo(posX, posY, 2.0f, imagenDisparo);
        rafagaAmiga.add(unDisparo);

        /*Generalizacion
        public void crearObjetoItem(argumentos...) {
            ClaseItem objetoItem = new ClaseItem(argumentosItem...);
            contenedor.add(objetoItem);
        }

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

    public void eliminarDisparoOut() {



    }
    */
}
