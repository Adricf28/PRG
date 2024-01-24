package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
public class Escuadron{
    //ATRIBUTOS
    protected ArrayList<NaveEnemiga> navesEnemigas;

    //CONSTRUCTORES
    public Escuadron() {
        this.navesEnemigas = new ArrayList<>(12);
    }

    public Escuadron(Texture texEnemigos, Texture explosion, float ancho, float posY, float velX, float velY, int numNaves) {
        float x, trozo;
        trozo = ancho / (numNaves+1);
        x = trozo;

        navesEnemigas = new ArrayList<>(numNaves);

        for (int i = 0; i < numNaves; i++) {
            NaveEnemiga unaNaveEnemiga = new NaveEnemiga(texEnemigos, explosion, x, posY, velX, velY);
            this.navesEnemigas.add(unaNaveEnemiga);
            x += trozo;
        }
    }

    //GETTERS & SETTERS
    public ArrayList<NaveEnemiga> getNavesEnemigas() {
        return navesEnemigas;
    }

    public void setNavesEnemigas(ArrayList<NaveEnemiga> navesEnemigas) {
        for (NaveEnemiga unEnemigo:navesEnemigas) {
            unEnemigo.dispose();
        }
        this.navesEnemigas = navesEnemigas;
    }

    //METODOS
    public void draw(SpriteBatch batch) {
        for (NaveEnemiga unEnemigo:navesEnemigas) {
            unEnemigo.draw(batch);
        }
    }

    public void mover() {
        for (NaveEnemiga unEnemigo:navesEnemigas) {
            unEnemigo.mover();
        }
    }

    public void disparar() {
        //Disparan naves aleatorias || una de cada x
        for (NaveEnemiga unEnemigo:navesEnemigas) {
            int randInt = (int)(Math.random() * 100 + 1);
            if (randInt > 50) {
                unEnemigo.disparar();
            }
        }
    }
}
