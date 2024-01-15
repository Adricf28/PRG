package com.politecnicomalaga.sp;

import java.util.ArrayList;
public class Escuadron{
    //ATRIBUTOS
    protected ArrayList<NaveEnemiga> navesEnemigas;

    //CONSTRUCTORES
    public Escuadron() {
        this.navesEnemigas = new ArrayList<>(12);
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
