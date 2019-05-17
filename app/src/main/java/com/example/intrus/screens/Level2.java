package com.example.intrus.screens;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.intrus.assets.Decor;
import com.example.intrus.assets.Next1;
import com.example.intrus.sprites.Next1Button;
import com.example.intrus.sprites.ToLevel1;


public class Level2 extends Screen {
    private Sprite bg ;
    private ToLevel1 toLevel1 ;

    public Level2(Game game) {
        super(game);

        bg = new Sprite(Decor.bg2, 0,0,game.getGraphics().getHeight(), game.getGraphics().getWidth()) ;
        toLevel1 = new ToLevel1(game, Next1.image2, 500,250, 800,200) ;
        addSprite(bg);
        addSprite(toLevel1);
    }


    @Override
    public void handleTouchDown(int x ,int y, int pointer ){
        super.handleTouchDown(x,y,pointer);
        Sprite s = getDraggedSprite();
        if(s!=null && s.getClass()==ToLevel1.class){
            //a way around a little problem I had
            ToLevel1 ss = (ToLevel1) s;
            ss.go();
        }

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
