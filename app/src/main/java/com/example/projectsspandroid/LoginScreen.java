package com.example.projectsspandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends Activity {

    Button signUpBtn,
            logInBtn;

    @Override
    public void onCreate(Bundle SavedInstance) {
        super.onCreate(SavedInstance);
        setContentView(R.layout.activity_login_screen);

        signUpBtn = findViewById(R.id.sign_up_btn);
        logInBtn = findViewById(R.id.logIn_btn);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginScreen.this, SignUp.class));
            }
        });

        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginScreen.this, MainMenu.class));
            }
        });

    }
}
