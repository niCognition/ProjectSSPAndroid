package com.example.projectsspandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * The main menu contains two buttons. Help and New Game button.
 * When clicking on helpBtn, the view changes to the help menu.
 * When clicking on newGameBtn, the view changes to the PlayScreen.
 */

public class MainMenu extends Activity {

    Button newGameBtn,
           helpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        newGameBtn = findViewById(R.id.newGameBtn);
        helpBtn = findViewById(R.id.helpBtn);

        /**
         * When newGameBtn is clicked, the view changes to PlayScreen.
         */
        newGameBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, PlayScreen.class));
            }
        });

        /**
         * When helpBtn is clicked, the view changes to HelpScreen.
         */
        helpBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, HelpScreen.class));
            }
        });

    }

}
