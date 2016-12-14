package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 14/12/2016.
 */

public class Game {


    public OptionType randomChoice() {
        Random random = new Random();
        OptionType[] options = OptionType.values();
        int numOfOptions = options.length;
        int index = random.nextInt(numOfOptions);
        return options[index];
    }

    public int computerWinCounter(OptionType player, OptionType computer) {
        int Computer_win = 0;
                if (gameResult(player, computer) == ResultType.COMPUTER_WIN) {
                    Computer_win++;
                }
        return Computer_win;
        }

    public int playerWinCounter(OptionType player, OptionType computer) {
        int Player_win = 0;
         if (gameResult(player, computer) == ResultType.PLAYER_WIN){
            Player_win++;
        }
        return Player_win;
    }

    public int drawCounter(OptionType player, OptionType computer) {
        int Draw = 0;
         if (gameResult(player, computer) == ResultType.DRAW){
            Draw++;
        }
        return Draw;
    }


    public ResultType gameResult(OptionType player, OptionType computer) {
        if (player == computer) {
            return ResultType.DRAW;
        }

        switch (player) {
            case ROCK:
                if (computer == OptionType.SCISSORS || computer == OptionType.LIZARD) {
                    return ResultType.PLAYER_WIN;
                } else {
                    return ResultType.COMPUTER_WIN;
                }
            case PAPER:
                if (computer == OptionType.SCISSORS || computer == OptionType.LIZARD) {
                    return ResultType.COMPUTER_WIN;
                } else {
                    return ResultType.PLAYER_WIN;
                }
            case SCISSORS:
                if (computer == OptionType.PAPER || computer == OptionType.LIZARD) {
                    return ResultType.PLAYER_WIN;
                } else {
                    return ResultType.COMPUTER_WIN;
                }
            case LIZARD:
                if (computer == OptionType.ROCK || computer == OptionType.SCISSORS) {
                    return ResultType.COMPUTER_WIN;
                } else {
                    return ResultType.PLAYER_WIN;
                }
            case SPOCK:
                if (computer == OptionType.SCISSORS || computer == OptionType.ROCK) {
                    return ResultType.PLAYER_WIN;
                } else {
                    return ResultType.COMPUTER_WIN;
                }


        }
                return null;
    }

}