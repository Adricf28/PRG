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
        nAmiga = new NaveAmiga(texAliados, explosionAmiga, dAmigo, Gdx.graphics.getWidth(), 60, 3, 2);
        empire = new Batallon(texEnemigos, explosionEnemiga, dEnemigo, Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), 3, 2, 5, 5);
    }

    @Override
    public void render () {
        //Control de entrada
        if (Gdx.input.justTouched()) {
            int x = Gdx.input.getX();
            int y = Gdx.input.getY();

            if (y > Gdx.graphics.getHeight()/2) {
                if (x < Gdx.graphics.getWidth()/2) {
                    nAmiga.setVelX(-nAmiga.getVelX());
                } else {
                    nAmiga.setVelX(nAmiga.getVelX());
                }
            }
        }

        //Si la nave llega al borde, cambiar velocidad al 0
        //Guardar como atributo en naveEnemiga al maxwidth para que no se pase al pintar
        //Eliminar cosas si se pasan de la altura o anchura


        nAmiga.mover();

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