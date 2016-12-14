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

    public ResultType gameResult(OptionType player, OptionType computer) {
        if (player == computer) {
            return ResultType.DRAW;
        }

        switch (player) {
            case ROCK:
                if (computer == OptionType.SCISSORS) {
                    return ResultType.PLAYER_WIN;
                } else {

                    return ResultType.COMPUTER_WIN;
                }
            case PAPER:
                if (computer == OptionType.SCISSORS) {
                    return ResultType.COMPUTER_WIN;
                } else {
                    return ResultType.PLAYER_WIN;
                }
            case SCISSORS:
                if (computer == OptionType.PAPER) {
                    return ResultType.PLAYER_WIN;
                } else {
                    return ResultType.COMPUTER_WIN;


                }


        }
                return null;
    }

}