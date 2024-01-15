package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Disparo extends ObjVolador{
    //CONSTRUCTOR
    public Disparo(float posX, float posY, float velX, float velY, SpriteBatch batch, Texture imagen) {
        super(posX, posY, velX, velY, batch, imagen);
    }
}
