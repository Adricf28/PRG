package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class DisparoEnemigo extends Disparo{
    //CONSTRUCTOR
    public DisparoEnemigo(float posX, float posY, float velX, float velY, SpriteBatch batch, Texture imagen) {
        super(posX, posY, velX, velY, batch, imagen);
    }
}
