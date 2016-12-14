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
    Button lizardButton;
    Button spockButton;
    TextView gameResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        instructions = (TextView)findViewById(R.id.instructions_text);
        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorButton = (Button)findViewById(R.id.scissor_button);
        lizardButton = (Button)findViewById(R.id.lizard_button);
        spockButton = (Button)findViewById(R.id.spock_button);
        gameResult = (TextView)findViewById(R.id.game_result_text);



        rockButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Game game = new Game();
                OptionType player = OptionType.ROCK;
                OptionType computer = game.randomChoice();
                ResultType result = game.gameResult(player, computer);
                Integer playerWins = game.playerWinCounter(player, computer);
                Integer compWins = game.computerWinCounter(player, computer);
                Integer draws = game.drawCounter(player, computer);
                String who_wins = ("Player picked: " + player.toString() + "\nThe computer picked: " + computer + "\n\n The result: " + result.toString() + "\n\n Player has won: " + playerWins.toString() + " games" + "\n Computer has won: " + compWins.toString() + " games" + "\n Drawn: " + draws.toString() + " games");
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);

                intent.putExtra("results", who_wins);

                startActivity(intent);
            }
        });
        paperButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Game game = new Game();
                OptionType player = OptionType.PAPER;
                OptionType computer = game.randomChoice();
                ResultType result = game.gameResult(player, computer);
                Integer playerWins = game.playerWinCounter(player, computer);
                Integer compWins = game.computerWinCounter(player, computer);
                Integer draws = game.drawCounter(player, computer);
                String who_wins = ("Player picked: " + player.toString() + "\nThe computer picked: " + computer + "\n\n The result: " + result.toString() + "\n\n Player has won: " + playerWins.toString() + " games" + "\n Computer has won: " + compWins.toString() + " games" + "\n Drawn: " + draws.toString() + " games" );
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);

                intent.putExtra("results", who_wins);

                startActivity(intent);

            }
        });
        scissorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Game game = new Game();
                OptionType player = OptionType.SCISSORS;
                OptionType computer = game.randomChoice();
                ResultType result = game.gameResult(player, computer);
                Integer playerWins = game.playerWinCounter(player, computer);
                Integer compWins = game.computerWinCounter(player, computer);
                Integer draws = game.drawCounter(player, computer);
                String who_wins = ("Player picked: " + player.toString() + "\nThe computer picked: " + computer + "\n\n The result: " + result.toString() + "\n\n Player has won: " + playerWins.toString() + " games" + "\n Computer has won: " + compWins.toString() + " games" + "\n Drawn: " + draws.toString() + " games" );
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);

                intent.putExtra("results", who_wins);

                startActivity(intent);
            }
        });

        lizardButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Game game = new Game();
                OptionType player = OptionType.LIZARD;
                OptionType computer = game.randomChoice();
                ResultType result = game.gameResult(player, computer);
                Integer playerWins = game.playerWinCounter(player, computer);
                Integer compWins = game.computerWinCounter(player, computer);
                Integer draws = game.drawCounter(player, computer);
                String who_wins = ("Player picked: " + player.toString() + "\nThe computer picked: " + computer + "\n\n The result: " + result.toString() + "\n\n Player has won: " + playerWins.toString() + " games" + "\n Computer has won: " + compWins.toString() + " games" + "\n Drawn: " + draws.toString() + " games" );
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);

                intent.putExtra("results", who_wins);

                startActivity(intent);
            }
        });

        spockButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Game game = new Game();
                OptionType player = OptionType.SPOCK;
                OptionType computer = game.randomChoice();
                ResultType result = game.gameResult(player, computer);
                Integer playerWins = game.playerWinCounter(player, computer);
                Integer compWins = game.computerWinCounter(player, computer);
                Integer draws = game.drawCounter(player, computer);
                String who_wins = ("Player picked: " + player.toString() + "\nThe computer picked: " + computer + "\n\n The result: " + result.toString() + "\n\n Player has won: " + playerWins.toString() + " games" + "\n Computer has won: " + compWins.toString() + " games" + "\n Drawn: " + draws.toString() + " games" );
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);

                intent.putExtra("results", who_wins);

                startActivity(intent);
            }
        });
    }


}
