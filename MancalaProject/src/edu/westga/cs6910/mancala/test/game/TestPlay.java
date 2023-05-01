package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test for playing a move
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022	
 *
 */
public class TestPlay {

	/**
	 * 
	 */
	@Test
	void testPlayFromAPit() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getHumanPlayer());
		newGame.play(1);
		assertEquals(0, newGame.getStones(1));
	}

}
