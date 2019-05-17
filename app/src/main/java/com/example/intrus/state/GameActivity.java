package com.example.intrus.state;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Implementation.AndroidGame;
import com.example.intrus.R;
import com.example.intrus.assets.Decor;
import com.example.intrus.assets.Next1;
import com.example.intrus.screens.Level1;
import com.example.intrus.screens.Level2;
import com.example.intrus.screens.Level3;
import com.example.intrus.screens.MainScreen;

public class GameActivity extends AndroidGame {

    @Override
    public Screen getInitScreen() {
        initAssets();
        return new Level2(this);
    }

    public void  initAssets(){
        Decor.bg = getGraphics().newImage(R.drawable.background, Graphics.ImageFormat.ARGB8888,getResources()) ;
        Decor.bg2 = getGraphics().newImage(R.drawable.bg2, Graphics.ImageFormat.ARGB8888,getResources()) ;
        Decor.bg3 = getGraphics().newImage(R.drawable.bg3, Graphics.ImageFormat.ARGB8888,getResources()) ;
        Decor.bgMain = getGraphics().newImage(R.drawable.bg_main, Graphics.ImageFormat.ARGB8888,getResources()) ;
        Next1.image = getGraphics().newImage(R.drawable.next, Graphics.ImageFormat.ARGB8888,getResources()) ;
        Next1.image2 = getGraphics().newImage(R.drawable.next, Graphics.ImageFormat.ARGB8888,getResources()) ;
    }
}
