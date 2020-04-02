package com.example.projectsspandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends Activity {

    Button newGameBtn,
           helpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        newGameBtn = findViewById(R.id.newGameBtn);
        helpBtn = findViewById(R.id.helpBtn);

        newGameBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, PlayScreen.class));
            }
        });

        helpBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, HelpScreen.class));
            }
        });

    }

}
