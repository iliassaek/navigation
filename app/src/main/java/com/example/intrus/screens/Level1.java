package com.example.intrus.screens;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.intrus.assets.Decor;
import com.example.intrus.assets.Next1;
import com.example.intrus.sprites.Next1Button;

public class Level1 extends Screen {


    private Sprite bg ;
    private Next1Button next1Button ;

    public Level1(Game game) {
        super(game);

        bg = new Sprite(Decor.bg,0,0,game.getGraphics().getHeight(), game.getGraphics().getWidth()) ;
        next1Button = new Next1Button(game, Next1.image, 800,50, 800,200) ;
        addSprite(bg);
        addSprite(next1Button);
    }

    @Override
    public void handleTouchDown(int x ,int y, int pointer ){
        super.handleTouchDown(x,y,pointer);
        Sprite s = getDraggedSprite();
        if(s!=null && s.getClass()==Next1Button.class){
            //a way around a little problem I had
            Next1Button ss = (Next1Button) s;
            ss.toLevel2();
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
