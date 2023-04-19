package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;
import main.*;

public class GuessGameTest {

    @Test
    public void testIfNumberIsCreated() {
        GuessGame game = new GuessGame();
        assertNotNull(game.createRandomNum());
    }

    @Test
    public void checkIfThereIsInput() {
        GuessGame game = new GuessGame();
        String input = "50";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertNotNull(game.getUserGuesses());
    }

    @Test
    public void checkIfGuessIsCorrect() {
        GuessGame game = new GuessGame();
        assertEquals(0, game.checkGuess(50, 50));
    }

    @Test
    public void checkIfGuessIsTooHigh() {
        GuessGame game = new GuessGame();
        assertEquals(1, game.checkGuess(50, 51));
    }

    @Test
    public void checkIfGuessIsTooLow() {
        GuessGame game = new GuessGame();
        assertEquals(2, game.checkGuess(50, 49));
    }

}
