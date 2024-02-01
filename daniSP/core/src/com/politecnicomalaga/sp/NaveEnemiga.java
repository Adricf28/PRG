package com.politecnicomalaga.sp;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class NaveEnemiga extends Nave{

    private ArrayList<DisparoEnemigo> rafagaDisparos;
    private float velocidadNaveE = 100;
    private Texture disparoT;

    public NaveEnemiga(float posX, float posY, float velX, float velY, Texture trajeMalote, Texture explosionT, Texture disparoT, boolean vivo, int anchoPantalla) {
        super(posX, posY, velX, velY, trajeMalote, explosionT, vivo, anchoPantalla);
        this.rafagaDisparos = new ArrayList<>();
        this.disparoT = disparoT;
    }
/*
    public void setRafagaDisparos(ArrayList <DisparoEnemigo> lista) {
        //for (int i = 0; i<disparosAmigos.size();i++) disparosAmigos.get(i).dispose();

        //Esto es for each
        for (DisparoEnemigo unDisparo : rafagaDisparos) {
            unDisparo.dispose();
        }

        this.rafagaDisparos = lista;
    }
*/
    public void crearDisparo(Texture imagenDisparo) {
        DisparoEnemigo unDisparo = new DisparoEnemigo(posX, posY, 20.0f, imagenDisparo);
        rafagaDisparos.add(unDisparo);

        /*
        Generalizacion
        public void crearObjetoItem(argumentos...) {
            ClaseItem objetoItem = new ClaseItem(argumentosItem...);
            contenedor.add(objetoItem);
        }
        */
    }





    @Override
    public void draw(SpriteBatch pantalla) {
        super.draw(pantalla);


    }

}
