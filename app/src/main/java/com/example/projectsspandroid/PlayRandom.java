package com.example.projectsspandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

/**
 * In this view, the user clicks on the RandomChoiceBtn,
 * randomizing between rock, paper and scissors.
 */
public class PlayRandom extends Activity {

    Button randomBtn;
    ImageButton randomChoiceBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_random);

        randomBtn = findViewById(R.id.playRandomBtn);

        randomChoiceBtn = findViewById(R.id.randomChoiceBtn);

        /**
         * When randomBtn is clicked, the buttons visibility is set
         * to "GONE".
         * The method setRandomImage(); is also called.
         */
        randomBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                randomBtn.setVisibility(View.GONE);
                setRandomImage();
            }
        });
    }

    /**
     * This method has a random number generator that generates a number
     * between 1 and 3 and sets an image.
     */
    public void setRandomImage() {

        Random rand = new Random();
        int n = rand.nextInt(4);

        if (n == 1) {
            randomChoiceBtn.setImageResource(R.drawable.rock);
            randomChoiceBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setRandomImage();
                }
            });

        } else if (n == 2) {
            randomChoiceBtn.setImageResource(R.drawable.paper);
            randomChoiceBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setRandomImage();
                }
            });

        } else if (n == 3) {
            randomChoiceBtn.setImageResource(R.drawable.scissors);
            randomChoiceBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setRandomImage();
                }
            });

        } else {
            randomChoiceBtn.setImageResource(R.drawable.rock);
            randomChoiceBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setRandomImage();
                }
            });
        }
    }
}
