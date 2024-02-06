package com.politecnicomalaga.sp;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class Batallon{

    private float posX;
    private ArrayList<Escuadron> misEscuadras;
    private boolean eliminado;

    public Batallon(int anchoPantalla, int altoPantalla, int numEscuadrones, float velX, float velY, Texture trajeMaloteT, Texture explosionT, Texture disparoT, int numNaves) {

        misEscuadras = new ArrayList<>();
        int y, trozo;
        trozo = (altoPantalla/2)/(numEscuadrones+1);
        y = altoPantalla - trozo;


        for (int i=0;i<numEscuadrones;i++) {
            Escuadron nuevo = new Escuadron(anchoPantalla, y, posX, velX, velY, trajeMaloteT, explosionT, disparoT, numNaves);
            misEscuadras.add(nuevo);
            y -= trozo;
        }
    }

// Metodo para que no se salgan

    public void moverse(){
        for(Escuadron unEscuadron: misEscuadras){
            unEscuadron.moverse();
        }
        limitesPantalla();
    }

    public void limitesPantalla(){
        boolean cambio = false;
        for(Escuadron unEscuadron: misEscuadras){
            if(unEscuadron.limitesPantalla()){
                cambio = true;
            }
        }
        if(cambio){
            for(Escuadron unEscuadron: misEscuadras){
                unEscuadron.cambioDireccionX();
                unEscuadron.cambioPosY();
            }
        }
    }


    public void draw(SpriteBatch pantalla) {
        // for each
        for (Escuadron elEscuadronQueTocaAhora: misEscuadras) {
            elEscuadronQueTocaAhora.draw(pantalla);
        }
        /*
    // for tradicional
        for (int i =0;i<misEscuadras.size();i++) {
            misEscuadras.get(i).draw(pantalla);
        }

         */
    }


}
