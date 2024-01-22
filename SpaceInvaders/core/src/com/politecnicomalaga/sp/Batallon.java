package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class Batallon{
    //ATRIBUTOS
    protected ArrayList<Escuadron> escuadrones;

    //CONSTRUCTORES
    public Batallon() {
        this.escuadrones = new ArrayList<>(2);
    }

    public Batallon(Texture texEnemigos, Texture explosion, float ancho, float altura, float velX, float velY, int numEsc, int numNaves) {
        float y, trozo;
        trozo = (altura / 2) / (numEsc + 1);
        y = trozo;

        escuadrones = new ArrayList<>(numEsc);

        for (int i = 0; i < numEsc; i++) {
            Escuadron unEscuadron = new Escuadron(texEnemigos, explosion, ancho, y, velX, velY, numNaves);
            escuadrones.add(unEscuadron);
            y += trozo;
        }
    }

    //GETTERS & SETTERS
    public ArrayList<Escuadron> getEscuadrones() {
        return escuadrones;
    }

    public void setEscuadrones(ArrayList<Escuadron> escuadrones) {
        this.escuadrones = escuadrones;
    }

    //METODOS
    public void draw(SpriteBatch batch) {
        for (Escuadron unEscuadron:escuadrones) {
            unEscuadron.draw(batch);
        }
    }
}
