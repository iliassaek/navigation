package com.example.intrus.sprites;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.intrus.screens.Level1;
import com.example.intrus.screens.Level2;

public class Next1Button extends Sprite {

    Game g ;


    /**
     * Constructor
     *
     * @param image  Bitmap of the Sprite
     * @param x      LeftTop Corner X-coordinate from where to start drawing
     * @param y      LeftTop Corner Y-coordinate from where to start drawing
     * @param height Height of the Sprite
     * @param width  Width of the sprite
     */
    public Next1Button(Game game , Image image, int x, int y, int height, int width) {
        super(image, x, y, height, width);
        this.g = game ;
    }

    public void toLevel2(){
        g.setScreen(new Level2(g));
    }
}
