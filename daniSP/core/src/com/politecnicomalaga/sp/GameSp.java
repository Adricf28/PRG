package com.politecnicomalaga.sp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameSp extends ApplicationAdapter {
    private SpriteBatch batch;
    private int fondoMovimiento = 0;
    private final int altoMundo =500;
    private final int anchoMundo = 650;
    private Texture fondo, naveamiga, trajeMaloteT, explosionNave, explosionAlien, disparoAmigoT, disparoEnemigo;
    private NaveAmiga amiguita;
    private DisparoAmigo disparosA;
    private Batallon empire;
    private Bichito bichitoChingon;



    @Override
    public void create () {
        batch = new SpriteBatch();

        //Inicializamos texturas
        disparoAmigoT = new Texture("disparo.png");
        disparoEnemigo = new Texture("ExplosionPlayer.png");
        fondo = new Texture("Starscape00.png");
        naveamiga = new Texture("NaveAmiga.png");
        trajeMaloteT = new Texture("Enemigo.png");
        explosionAlien = new Texture("ExplosionAliens.png");
        explosionNave = new Texture("ExplosionPlayer.png");


                //Creamos objetos

        //disparosA = new DisparoAmigo(Gdx.graphics.getWidth()/2-14,32,20,disparoAmigoT);
        amiguita = new NaveAmiga(Gdx.graphics.getWidth()/2-40,10,0,0,naveamiga,explosionNave,disparoAmigoT, true, anchoMundo);//amiguita.isVivo()
        empire = new Batallon(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), 3, 0.5f,0f,  trajeMaloteT,explosionAlien, disparoEnemigo, 7);
        bichitoChingon = new Bichito(100, 100, 0, 0, explosionAlien, explosionNave, disparoEnemigo);
    }

    @Override
    public void render () {
        //Control de entrada
        if (Gdx.input.justTouched()){
            int x = Gdx.input.getX();
            int y = Gdx.input.getY();
            if(y > Gdx.graphics.getHeight()/2){
                if (x < Gdx.graphics.getWidth()/2){
                    amiguita.setVelX(-5f);
                } else {
                    amiguita.setVelX(+5f);
                }
            }

        }

        if (Gdx.input.justTouched()) {
            int y = Gdx.input.getY();
            if(y < Gdx.graphics.getHeight()- Gdx.graphics.getHeight()/3){
                //Disparo amigo
                amiguita.crearDisparo(disparoAmigoT);
                }
        }

        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            amiguita.setVelX(-5);
        } else if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            amiguita.setVelX(5);
        } else {
            amiguita.setVelX(0f);
        }

        if (Gdx.input.isKeyPressed(Input.Keys.P)) {
            amiguita.crearDisparo(disparoAmigoT);
        }






        //Calculo el siguiente momento para el modelo
        amiguita.moverse();
        empire.moverse();

        //Dibujamos
        ScreenUtils.clear(0, 0, 0, 1);
        batch.begin();
        //fondo en movimiento
        fondoMovimiento+=10;
        if (fondoMovimiento % altoMundo == 0) {
            fondoMovimiento = 0;
        }

        //pinto el modelo
        batch.draw(fondo, 0, -fondoMovimiento, anchoMundo, altoMundo);
        batch.draw(fondo, 0, -fondoMovimiento+altoMundo, anchoMundo, altoMundo);
        //disparosA.draw(batch);
        amiguita.draw(batch);
        empire.draw(batch);
        bichitoChingon.draw(batch);
        //disparosA.draw(batch);

        batch.end();
    }

    @Override
    public void dispose () {
        batch.dispose();
        disparoAmigoT.dispose();
        disparoEnemigo.dispose();
        fondo.dispose();
        naveamiga.dispose();
        trajeMaloteT.dispose();
        explosionAlien.dispose();
        explosionNave.dispose();
    }
}


