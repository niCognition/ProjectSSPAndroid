package com.example.projectsspandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

/**
 * A simple rock paper scissors app. In this app the user can play
 * against the computer or randomize rock, paper or scissors to settle
 * disputes between friends.
 * @author Herman Singh, Niclas Pettersson
 * @version 1.0
 * @since 2020-03-13
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background.start();

    }

    /**
     * This method creates a Thread that has a delay of two seconds.
     * This helps us to create a splashscreen when the app is launched.
     */
    Thread background = new Thread() {
        public void run() {
            try {
                sleep(2000);

                Intent i = new Intent(getBaseContext(), MainMenu.class);
                startActivity(i);

                finish();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    };

}
