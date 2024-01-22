package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;
public class Escuadron{
    //ATRIBUTOS
    protected ArrayList<NaveEnemiga> navesEnemigas;

    //CONSTRUCTORES
    public Escuadron() {
        this.navesEnemigas = new ArrayList<>(12);
    }

    public Escuadron(float ancho, float posY, float velX, float velY, Texture texEnemigos, Texture explosion, boolean vivo, int numNaves) {
        float x, trozo;
        trozo = ancho / (numNaves+1);
        x = trozo;

        navesEnemigas = new ArrayList<>(numNaves);

        for (int i = 0; i < numNaves; i++) {
            NaveEnemiga unaNaveEnemiga = new NaveEnemiga(x, posY, velX, velY, texEnemigos, explosion, vivo);
            this.navesEnemigas.add(unaNaveEnemiga);
            x += trozo;
        }
    }

    //GETTERS & SETTERS
    public ArrayList<NaveEnemiga> getNavesEnemigas() {
        return navesEnemigas;
    }

    public void setNavesEnemigas(ArrayList<NaveEnemiga> navesEnemigas) {
        this.navesEnemigas = navesEnemigas;
    }

    //METODOS
    public void draw() {}
    public void mover() {}
}
