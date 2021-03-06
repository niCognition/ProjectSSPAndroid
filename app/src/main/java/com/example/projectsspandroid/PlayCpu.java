package com.example.projectsspandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * In this view the user plays against the computer.
 */
public class PlayCpu extends Activity {

    ImageView imageViewCpu,
              imageViewPlayer;

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

            rock = findViewById(R.id.rockBtn);
            paper = findViewById(R.id.paperBtn);
            scissor = findViewById(R.id.scissorBtn);

            imageViewPlayer = findViewById(R.id.playerView);
            imageViewCpu = findViewById(R.id.cpuView);

            displayWinner = findViewById(R.id.winnerText);

            /**
             * If the player chooses rock, the string playerChoice is set to "rock" and
             * the imageView is also set to the relevant picture (rock).
             * The method calculateWinner(); is called to determine who wins the game.
             *
             */
            rock.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    playerChoice = "rock";
                    imageViewPlayer.setImageResource(R.drawable.rock);
                    calculateWinner();
                }
            });
            /**
             * If the player chooses paper, the string playerChoice is set to "paper" and
             * the imageView is also set to the relevant picture (rock).
             * The method calculateWinner(); is called to determine who wins the game.
             *
             */
            paper.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    playerChoice = "paper";
                    imageViewPlayer.setImageResource(R.drawable.paper);
                    calculateWinner();
                }
            });
            /**
             * If the player chooses scissors, the string playerChoice is set to "scissors" and
             * the imageView is also set to the relevant picture (rock).
             * The method calculateWinner(); is called to determine who wins the game.
             *
             */
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

    /**
     * This method is used to calculate the winner when playing against the computer.
     * A random number generator is used to calculate the CPU's move. When the
     * number has been generated, the relevant image is set and we compare
     * the choice that the user has made against the computer and set the label.
     *
     */
    public void calculateWinner() {

        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        if (n == 1) {
            cpuChoice = "rock";
            imageViewCpu.setImageResource(R.drawable.rock);

        } else if (n == 2) {
            cpuChoice = "paper";
            imageViewCpu.setImageResource(R.drawable.paper);

        } else if (n == 3) {
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
