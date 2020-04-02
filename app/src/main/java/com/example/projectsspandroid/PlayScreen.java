package com.example.projectsspandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * This view contains two buttons, play versus the computer
 * and just play.
 */

public class PlayScreen extends AppCompatActivity {

    Button cpuBtn,
           playBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen2);

        cpuBtn = findViewById(R.id.CpuBtn);
        playBtn = findViewById(R.id.PlayBtn);

        /**
         * When clicking the cpuBtn, we change the view to PlayCpu.
         */
        cpuBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayScreen.this, PlayCpu.class));
            }
        });

        /**
         * When clicking the playBtn, we change the view to PlayRandom.
         */
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayScreen.this, PlayRandom.class));
            }
        });

    }
}
