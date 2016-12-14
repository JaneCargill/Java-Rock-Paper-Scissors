package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by user on 14/12/2016.
 */

public class GameTest {
    Game game;


//    @Before
//    public void before() {
//        game = new Game(OptionType);
//    }

    @Test
    public void canGetRandomChoice() {
        game = new Game();
        OptionType string = game.randomChoice();
        System.out.println("Computer chose: " + string );
        assertNotNull(string);
    }

    @Test
    public void canGetResult() {
        game = new Game();
        assertEquals(ResultType.PLAYER_WIN, game.gameResult(OptionType.PAPER, OptionType.ROCK));
        assertEquals(ResultType.DRAW, game.gameResult(OptionType.SCISSORS, OptionType.SCISSORS));
        assertEquals(ResultType.COMPUTER_WIN, game.gameResult(OptionType.SCISSORS, OptionType.ROCK));

    }

    @Test
    public void canCountComputerWins() {
        game = new Game();
        assertEquals(1, game.computerWinCounter(OptionType.SCISSORS, OptionType.ROCK));
    }
    @Test
    public void canCountPlayerWins() {
        game = new Game();
        assertEquals(1, game.playerWinCounter(OptionType.LIZARD, OptionType.SPOCK));
    }
    @Test
    public void canCountDraws() {
        game = new Game();
        assertEquals(1, game.drawCounter(OptionType.SCISSORS, OptionType.SCISSORS));
    }
}
