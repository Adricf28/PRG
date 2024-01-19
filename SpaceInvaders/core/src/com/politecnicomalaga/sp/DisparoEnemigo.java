package com.politecnicomalaga.sp;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class DisparoEnemigo extends Disparo{
    //CONSTRUCTOR
    public DisparoEnemigo(float posX, float posY, float velY, Texture imagen) {
        super(posX, posY, velY, imagen);
    }
}