public void render() {
    //me han pulsado la pantalla? -- pseudocodigo
    if (mehanpulsadolapantalla) {
        recogerX y recogerY de la pulsacion;
    }

    //codigo
    if (Gdx.input.justTouched()) {
        xPantalla = Gdx.input.getX();
        yPantalla = Gdx.input.getY();
    }

    //codigo
    if (Gdx.graphics.getWidth() - xPantalla > x) desplX = 3;
    else if (Gdx.graphics.getWidth() - xPantalla < x) desplX = -3; 
    else desplX = 0;

    if (Gdx.graphics.getHeight() - yPantalla > y) desplY = 3;
    else if (Gdx.graphics.getHeight() - yPantalla < y) desplY = -3; 
    else desplY = 0;

    ScreenUtils.clear(0,0,0,1);
}

public void create() {
    batch = new SpriteBatch();
    img = new Texture("badlogic.png")
}