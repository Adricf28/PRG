package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
public class Escuadron{

    private ArrayList<NaveEnemiga> navesEnemigas;
    private float velocidadEscE = 100;

    public Escuadron(int anchoPantalla, float posY, float posX, float velX, float velY, Texture trajeMaloteT, Texture explosionT, Texture disparoT, int numNaves) {

        navesEnemigas = new ArrayList<>();
        int trozo = anchoPantalla / (numNaves+1);
        int x = trozo;

        for (int i=0; i<numNaves; i++) {
            NaveEnemiga nuevo = new NaveEnemiga(x , posY, velX, velY, trajeMaloteT, explosionT, disparoT, true, anchoPantalla);
            x+=trozo;
            navesEnemigas.add(nuevo);
        }

    }

    public void draw(SpriteBatch pantalla) {
        // for each
        for (NaveEnemiga elMaloQueTocaAhora: navesEnemigas) {
            elMaloQueTocaAhora.draw(pantalla);
        }
        /*
    // for tradicional
        for (int i =0;i<navesEnemigas.size();i++) {
            navesEnemigas.get(i).draw(pantalla);
        }

         */
    }
    public boolean limitesPantalla(){
        return (navesEnemigas.get(navesEnemigas.size()-1).limitesPantalla() || navesEnemigas.get(0).limitesPantalla());

    }

    public void moverse(){
        for(int i = 0; i < navesEnemigas.size(); i++){
            navesEnemigas.get(i).moverse();
        }
    }
    public void cambioDireccionX(){
        for(NaveEnemiga unaNave: navesEnemigas){
            unaNave.setPosX(unaNave.getPosX());
            unaNave.setVelX(-1 * unaNave.getVelX());
        }
    }

    public void cambioPosY(){
        for(NaveEnemiga unaNave: navesEnemigas){
            unaNave.setPosY(unaNave.getPosY()-10);

        }
    }


}
