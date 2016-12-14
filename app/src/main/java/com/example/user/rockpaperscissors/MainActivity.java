package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView instructions;
    Button rockButton;
    Button paperButton;
    Button scissorButton;
    TextView gameResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        instructions = (TextView)findViewById(R.id.instructions_text);
        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorButton = (Button)findViewById(R.id.scissor_button);
        gameResult = (TextView)findViewById(R.id.game_result_text);



        rockButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Game game = new Game();
                OptionType player = OptionType.ROCK;
                OptionType computer = game.randomChoice();
                ResultType result = game.gameResult(player, computer);
                gameResult.setText("The computer picked: " + computer + " \n The result: " + result.toString());
            }
        });
        paperButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Game game = new Game();
                OptionType player = OptionType.PAPER;
                OptionType computer = game.randomChoice();
                ResultType result = game.gameResult(player, computer);
                gameResult.setText("The computer picked: " + computer + " \n The result: " + result.toString());
            }
        });
        scissorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Game game = new Game();
                OptionType player = OptionType.SCISSORS;
                OptionType computer = game.randomChoice();
                ResultType result = game.gameResult(player, computer);
                gameResult.setText("The computer picked: " + computer + " \n The result: " + result.toString());
            }
        });
    }


}
