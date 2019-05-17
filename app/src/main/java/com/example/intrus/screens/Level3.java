package com.example.intrus.screens;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.intrus.assets.Decor;

public class Level3 extends Screen {

    private Sprite bg ;


    public Level3(Game game) {
        super(game);

        bg = new Sprite(Decor.bg3,0,0,game.getGraphics().getHeight(), game.getGraphics().getWidth()) ;
        addSprite(bg);

    }

    @Override
    public void render(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void backButton() {

    }
}
