package com.politecnicomalaga.sp;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;
import java.util.Vector;

public class NaveAmiga extends Nave {

    private Texture disparoT;
    private ArrayList<DisparoAmigo> rafagaDisparos;
    private float velBala = 1;
    private float velocidadNave = 5;
    private int vecesQueMePinto = 1;
    private boolean recargado = true;
    Texture naveamiga, explosionT;

    public NaveAmiga(float posX, float posY, float velX, float velY, Texture naveamiga, Texture explosionT, Texture disparoT, boolean vivo, int anchoPantalla) {
        super(posX, posY, velX, velY, naveamiga, explosionT, vivo, anchoPantalla);
        this.rafagaDisparos = new ArrayList<>();
        this.disparoT = disparoT;

    }


    public void crearDisparo(Texture imagenDisparo) {
        if (recargado) {
            recargado = false;
            vecesQueMePinto=1;
            DisparoAmigo unDisparo = new DisparoAmigo(this.posX+20, this.posY+40, 2f, disparoT);
            rafagaDisparos.add(unDisparo);
        }

        /*Generalizacion
        public void crearObjetoItem(argumentos...) {
            ClaseItem objetoItem = new ClaseItem(argumentosItem...);
            contenedor.add(objetoItem);
        }
        */
    }
/*
    public void setRafagaDisparos(ArrayList <DisparoAmigo> lista) {
        for (int i = 0; i<rafagaDisparos.size();i++) {
            rafagaDisparos.get(i).dispose();
        }

        //Esto es for each
        for (DisparoAmigo unDisparo : rafagaDisparos) {
            unDisparo.dispose();
        }

        this.rafagaDisparos = lista;
    }
*/
    /*
    public boolean colisionDisparos(NaveEnemiga alien) {

        boolean chocado = false;
        int i = 0;
        while (!chocado) {
            DisparoAmigo probando = rafagaDisparos.get(i);
            chocado = probando.colisiona(alien);
            i++;
        }
        return chocado;
    }
*/
    /*
    public boolean detectarColision(NaveEnemiga naveEnemiga) {
        boolean colision = false;
        for (int i = 0; i < rafagaDisparos.size() && !colision; i++) {
            if (rafagaDisparos.get(i).colisiona(naveEnemiga)) {
                removeDisparo(i);
                colision = true;
            }
        }
        return colision;
    }
*/
    public void removeDisparo(int indice){
        rafagaDisparos.remove(indice);
    }

    @Override
    public void moverse() {
        posX += velX;
        posY += velY;
        if (posX <= 0) posX = 0;
        if (posX+70 >= Gdx.graphics.getWidth()) posX = Gdx.graphics.getWidth()-70;
    }


    @Override
    public void draw(SpriteBatch batch) {


        //Para poder dibujar los disparos
        for (DisparoAmigo unDisparo : rafagaDisparos) {
            if (!rafagaDisparos.isEmpty()) {
                unDisparo.draw(batch);
                unDisparo.moverse();

            }
        }
        //cada cierto tiempo dispara

        if (vecesQueMePinto == 15) {
            recargado =true;
            vecesQueMePinto=1;
        }

        vecesQueMePinto++;

        super.draw(batch);
    }


}