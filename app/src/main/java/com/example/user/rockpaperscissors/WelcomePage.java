package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */

public class WelcomePage extends AppCompatActivity {

    TextView welcomePage;
    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomePage = (TextView)findViewById(R.id.welcome_page_text);
        playButton = (Button)findViewById(R.id.play_button);


        playButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomePage.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}














