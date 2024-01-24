package com.politecnicomalaga.sp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameSp extends ApplicationAdapter {
    protected SpriteBatch batch;
    protected Batallon empire;
    protected Texture fondo, texAliados, texEnemigos, explosionAmiga, explosionEnemiga, dAmigo, dEnemigo;
    protected NaveAmiga nAmiga;

    @Override
    public void create () {
        //Pantalla
        batch = new SpriteBatch();

        //Texturas
        fondo = new Texture("fondo2.png");
        texAliados = new Texture("NaveAmiga.png");
        texEnemigos = new Texture("Enemigo.png");
        explosionAmiga = new Texture("ExplosionPlayer.png");
        explosionEnemiga = new Texture("ExplosionAliens.png");
        dAmigo = new Texture("disparo.png");
        dEnemigo = new Texture("disparo.png");

        //Naves
        nAmiga = new NaveAmiga(texAliados, explosionAmiga, (Gdx.graphics.getWidth()-315), 60, 3, 2);
        empire = new Batallon(texEnemigos, explosionEnemiga, Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), 3, 2, 5, 5);
    }

    @Override
    public void render () {
        ScreenUtils.clear(0, 0, 0, 0);
        batch.begin();
        batch.draw(fondo, 0, 0);
        empire.draw(batch);
        nAmiga.draw(batch);
        batch.end();
    }

    @Override
    public void dispose () {
        batch.dispose();
        fondo.dispose();
        texAliados.dispose();
        texEnemigos.dispose();
        explosionAmiga.dispose();
        explosionEnemiga.dispose();
        dAmigo.dispose();
        dEnemigo.dispose();
    }
}