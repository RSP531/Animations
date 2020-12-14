package com.android.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing = true;

    public void fade(View view){
        Log.i("Info", "Imageview tapped");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        bartImageView.animate().translationX(-1500).setDuration(2000);
        bartImageView.animate().rotation(-180).setDuration(1000);
        bartImageView.animate().translationY(1500).setDuration(2000);
        bartImageView.animate().alpha(0).setDuration(2000);
        bartImageView.animate().scaleX(0.5f).scaleY(.5f).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
