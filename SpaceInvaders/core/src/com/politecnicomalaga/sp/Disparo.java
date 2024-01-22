package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Disparo extends ObjVolador{
    //CONSTRUCTOR
    public Disparo(Texture disparo, float posX, float posY, float velY) {
        super(disparo, posX, posY, 0.0f, velY);
    }
}
