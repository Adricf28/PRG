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
    protected Texture fondo, texAliados, texEnemigos, explosionAmiga, explosionEnemiga;
    protected Nave nEnemiga, nAmiga, disparos;

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

        //Naves
        nAmiga = new NaveAmiga(400, 600, 3, 0, texAliados, explosionAmiga, nAmiga.isVivo());
        nEnemiga = new NaveEnemiga(0, 0, 0, 0, texEnemigos, explosionEnemiga, nEnemiga.isVivo());
        empire = new Batallon(texEnemigos);
    }

    @Override
    public void render () {
        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        batch.draw(aliados, 0, 0);
        batch.draw(enemigos, 0, 0);
        batch.end();
    }

    @Override
    public void dispose () {
        batch.dispose();
        aliados.dispose();
        enemigos.dispose();
    }
}