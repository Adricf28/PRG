package com.politecnicomalaga.sp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameSp extends ApplicationAdapter {
    protected float ancho, alto;
    protected SpriteBatch batch;
    protected Batallon empire;
    protected Texture fondo, texAliados, texEnemigos, explosionAmiga, explosionEnemiga, dAmigo, dEnemigo;
    protected NaveAmiga nAmiga;

    @Override
    public void create () {
        //Pantalla
        batch = new SpriteBatch();

        //Texturas
        fondo = new Texture("Starscape00.png");
        texAliados = new Texture("NaveAmiga.png");
        texEnemigos = new Texture("Enemigo.png");
        explosionAmiga = new Texture("ExplosionPlayer.png");
        explosionEnemiga = new Texture("ExplosionAliens.png");
        dAmigo = new Texture("DisparoAmigo.png");
        dEnemigo = new Texture("DisparoEnemigo.png");

        //Naves
        nAmiga = new NaveAmiga(400, 600, 3, 0, texAliados, explosionAmiga, nAmiga.isVivo());
        empire = new Batallon(texEnemigos, explosionEnemiga, Gdx.graphics.getHeight(), 2, Gdx.graphics.getWidth(), 3, 2, 12);
    }

    @Override
    public void render () {
        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        empire.draw(batch);
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