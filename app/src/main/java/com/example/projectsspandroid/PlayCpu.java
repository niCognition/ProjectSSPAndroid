package com.example.projectsspandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PlayCpu extends Activity {

    ImageView imageViewCpu, imageViewPlayer;

    String playerChoice,
            cpuChoice,
            result;

    TextView displayWinner;

    Button rock,
            paper,
            scissor;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_cpu);

        try {

            //Buttons
            rock = findViewById(R.id.rockBtn);
            paper = findViewById(R.id.paperBtn);
            scissor = findViewById(R.id.scissorBtn);

            //ImageViews
            imageViewPlayer = findViewById(R.id.playerView);
            imageViewCpu = findViewById(R.id.cpuView);

            //TextView
            displayWinner = findViewById(R.id.winnerText);


            rock.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    playerChoice = "rock";
                    imageViewPlayer.setImageResource(R.drawable.rock);
                    calculateWinner();

                }
            });

            paper.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    playerChoice = "paper";
                    imageViewPlayer.setImageResource(R.drawable.paper);
                    calculateWinner();

                }
            });

            scissor.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    playerChoice = "scissors";
                    imageViewPlayer.setImageResource(R.drawable.scissors);
                    calculateWinner();

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void calculateWinner() {

        Random rand = new Random();
        int n = rand.nextInt(4);

        if (n == 0) {
            cpuChoice = "rock";
            imageViewCpu.setImageResource(R.drawable.rock);

        } else if (n == 1) {
            cpuChoice = "paper";
            imageViewCpu.setImageResource(R.drawable.paper);



        } else if (n == 2) {
            cpuChoice = "scissors";
            imageViewCpu.setImageResource(R.drawable.scissors);



        }

        if (playerChoice.equals("rock") && cpuChoice.equals("paper")) {
            result = "CPU WINS!";
        }
        if (playerChoice.equals("rock") && cpuChoice.equals("scissors")) {
            result = "You WIN!";
        }
        if (playerChoice.equals("rock") && cpuChoice.equals("rock")) {
            result = "Its a TIE!";
        }
        if (playerChoice.equals("paper") && cpuChoice.equals("rock")) {
            result = "You WIN!";
        }
        if (playerChoice.equals("paper") && cpuChoice.equals("scissors")) {
            result = "CPU Wins!";
        }
        if (playerChoice.equals("paper") && cpuChoice.equals("paper")) {
            result = "Its a TIE!";
        }
        if (playerChoice.equals("scissors") && cpuChoice.equals("rock")) {
            result = "CPU Wins!";
        }
        if (playerChoice.equals("scissors") && cpuChoice.equals("paper")) {
            result = "You WIN!";
        }
        if (playerChoice.equals("scissors") && cpuChoice.equals("scissors")) {
            result = "Its a TIE!";
        }

        displayWinner.setText(result);

    }
}
