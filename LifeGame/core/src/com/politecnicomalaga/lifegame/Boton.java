package com.politecnicomalaga.lifegame;

public class Boton extends Ovni{
    public boolean pulsado(int x, int y) {return true;}
    public void accion(Trabajador t) {
        t.run();
    }
}