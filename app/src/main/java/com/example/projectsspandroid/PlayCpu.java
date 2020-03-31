package com.example.projectsspandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class PlayCpu extends Activity {

    String playerChoice,
           cpuChoice,
           result;

    Random random;

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

        rock.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                playerChoice = "rock";
                calculateWinner();

            }
        });

        paper.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playerChoice = "paper";
                calculateWinner();

            }
        });

        scissor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playerChoice = "scissors";
                calculateWinner();

            }
        });


    }

    public void calculateWinner() {
        int cpu = random.nextInt(3);

        if (cpu == 0) {
            cpuChoice = "rock";
        } else if (cpu == 1) {
            cpuChoice = "paper";
        } else if (cpu == 2) {
            cpuChoice = "scissors";
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

        Toast.makeText(PlayCpu.this, result, Toast.LENGTH_SHORT).show();

    }
}
