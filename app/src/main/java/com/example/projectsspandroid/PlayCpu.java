package com.example.projectsspandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayCpu extends Activity {

    Button rock,
           paper,
           scissor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_cpu);


        //Buttons

        rock = findViewById(R.id.rockBtn);
        paper = findViewById(R.id.paperBtn);
        scissor = findViewById(R.id.scissorBtn);


    }
}
