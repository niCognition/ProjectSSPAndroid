package com.example.projectsspandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * This view contains the help view.
 * The background image contains a brief description of the different gamemodes.
 * There is also a back button that takes the user back to the main menu.
 */
public class HelpScreen extends Activity {

    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_screen);

        backButton = findViewById(R.id.backButton);

        /**
         * When the backButton is clicked, the view changes to the Main Menu.
         */
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HelpScreen.this, MainMenu.class));
            }
        });
    }
}
