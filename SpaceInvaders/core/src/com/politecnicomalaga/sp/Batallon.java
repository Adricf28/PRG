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

    public Batallon(Texture texEnemigos, Texture explosion, float altura, int numEsc, float ancho, float velX, float velY, int numNaves) {
        float y, trozo;
        trozo = (altura / 2) / (numEsc + 1);
        y = trozo;

        escuadrones = new ArrayList<>(numEsc);

        for (int i = 0; i < numEsc; i++) {
            Escuadron unEscuadron = new Escuadron(ancho, y, velX, velY, texEnemigos, explosion, numNaves);
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
    @Override
    public void draw(SpriteBatch batch) {
        
    }
}
