package com.example.intrus.state;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.intrus.R;
import com.example.intrus.state.GameActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Debug";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view){
        Intent i = new Intent(this, GameActivity.class) ;
        startActivity(i);
        Log.i(TAG, "start clicked");
    }

}
