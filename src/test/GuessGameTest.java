package test;

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

}
