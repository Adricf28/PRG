package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.Random;

public class GDXSpaceInvaders extends ApplicationAdapter {

	//ESTADO
	private SpriteBatch batch;
	private ObjetoVolador ovni;

	private Texture naveT, naveE;

	private int contadorFrames;

	private EquipoTriangulo teamT;

	//COMPORTAMIENTO

	//RESTO COMPORTAMIENTOS

	//¿CONSTRUCTOR? NO TENGO, pero me dicen que create hace las veces de contructor
	@Override
	public void create () {
		ArrayList<Integer> posiciones = new ArrayList<>(6);
		for (int i = 0; i < 6; i++) {
			posiciones.add(i);
		}

		contadorFrames = 0;
		Random r = new Random();
        naveT = new Texture("nave.png");

		naveE = new Texture("enemy.png");

		batch = new SpriteBatch();
		ovni = new ObjetoVolador(r.nextInt(400)+50,r.nextInt(300)+100,0,0,naveT);

		teamT = new EquipoTriangulo(posiciones, 2, 2, naveE, 3, 3);
	}

	@Override
	public void render () {

		contadorFrames++;
		Random r = new Random();

		//Controlar lo que pasa
		ovni.moverse();
		if (contadorFrames == 29) {
			contadorFrames = 0;
			ovni.setVelX(r.nextFloat() * 10 - 5);
			ovni.setVelY(r.nextFloat() * 10 - 5);
		}

		if (ovni.getPosX()+ovni.getImg().getWidth()<-10) {
			ovni.setPosX(Gdx.graphics.getWidth()+5);
		}

		if (ovni.getPosY()+ovni.getImg().getHeight()<-10) {
			ovni.setPosY(Gdx.graphics.getHeight()+5);
		}

		if (ovni.getPosX()>Gdx.graphics.getWidth()+10) {
			ovni.setPosX(-5);
		}

		if (ovni.getPosY()>Gdx.graphics.getHeight()+10) {
			ovni.setPosY(-5);
		}


		//dibujar despues
		ScreenUtils.clear(0f, 0f, 0f, 1);

		batch.begin();
		ovni.render(batch);
		batch.end();


	}
	
	@Override
	public void dispose () {
		batch.dispose();
        naveT.dispose();

	}

}
