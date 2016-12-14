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

public class ResultsActivity extends AppCompatActivity {
    TextView results;
    Button playAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_activity);

        results = (TextView)findViewById(R.id.result_text);
        playAgain = (Button)findViewById(R.id.play_again_button);




                Intent intent = getIntent();
                Bundle extras = intent.getExtras();
                String winner = extras.getString("results");
                results.setText(winner);

        playAgain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultsActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }

}













