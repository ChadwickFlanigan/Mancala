package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test class for the human player to take a turn
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022
 *
 */
public class HumanPlayerWhenTestTakeTurn {

	/**
	 * tests the take turn method
	 */
	@Test
	public void testTakeTurn() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getHumanPlayer());
		newGame.getHumanPlayer().takeTurn(1);
		assertEquals(false, newGame.getHumanPlayer().getIsMyTurn());
	}

}
