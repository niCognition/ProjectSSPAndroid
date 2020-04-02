package com.example.projectsspandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background.start();

    }


    Thread background = new Thread() {
        public void run() {
            try {
                sleep(3000);

                Intent i = new Intent(getBaseContext(), MainMenu.class);
                startActivity(i);

                finish();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    };


}
