package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;

import org.junit.Test;
import main.*;

public class GuessGameTest {

    @Test
    public void testIfNumberIsCreated() {
        GuessGame game = new GuessGame();
        assertNotNull(game.createRandomNum());
    }

    @Test
    public void testIfThereIsInput() {
        GuessGame game = new GuessGame();
        String input = "50";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertNotNull(game.getUserGuesses());
    }

    @Test
    public void testIfInputIsCorrect() {
        GuessGame game = new GuessGame();
        String input = "50";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(50, game.getUserGuesses());
    }

    @Test
    public void testIfInputIsNotInteger() {
        GuessGame game = new GuessGame();
        String input = "five";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertThrows(InputMismatchException.class, game::getUserGuesses);
    }

    @Test
    public void testIfGuessIsCorrect() {
        GuessGame game = new GuessGame();
        assertEquals(0, game.checkGuess(50, 50));
    }

    @Test
    public void testIfGuessIsTooHigh() {
        GuessGame game = new GuessGame();
        assertEquals(1, game.checkGuess(50, 51));
    }

    @Test
    public void testIfGuessIsTooLow() {
        GuessGame game = new GuessGame();
        assertEquals(2, game.checkGuess(50, 49));
    }

}
