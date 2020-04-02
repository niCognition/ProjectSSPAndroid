package com.example.projectsspandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayScreen extends AppCompatActivity {

    Button cpuBtn,
           playBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen2);

        cpuBtn = findViewById(R.id.CpuBtn);
        playBtn = findViewById(R.id.PlayBtn);

        cpuBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayScreen.this, PlayCpu.class));
            }
        });

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayScreen.this, PlayRandom.class));
            }
        });

    }
}
