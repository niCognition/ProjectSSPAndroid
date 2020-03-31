package com.example.projectsspandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class PlayRandom extends Activity {

    Random random = new Random();
    int i = random.nextInt(4 - 1) + 4;

    Button randomBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_random);

        randomBtn = findViewById(R.id.playRandomBtn);

        randomBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });





    }

}
