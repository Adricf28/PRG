package com.politecnicomalaga.sp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameSp extends ApplicationAdapter {
    protected float ancho, alto;
    protected SpriteBatch batch;
    protected Batallon empire;
    protected NaveAmiga luke;
    protected Texture imagen;

    @Override
    public void create () {
        batch = new SpriteBatch();
        imagen = new Texture("NaveAmiga.png");
        Nave naveAmiga;
    }

    @Override
    public void render () {
        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        batch.draw(imagen, 0, 0);
        batch.end();
    }

    @Override
    public void dispose () {
        batch.dispose();
        imagen.dispose();
    }
}