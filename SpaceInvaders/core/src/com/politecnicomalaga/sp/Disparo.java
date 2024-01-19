package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Disparo extends ObjVolador{
    //CONSTRUCTOR
    public Disparo(float posX, float posY, float velY, Texture imagen) {
        super(posX, posY, 0.0f, velY, imagen);
    }
}
