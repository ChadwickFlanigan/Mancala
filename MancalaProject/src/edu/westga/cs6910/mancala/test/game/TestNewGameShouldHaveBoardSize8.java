package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test for the board size
 * 
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022
 *
 */
public class TestNewGameShouldHaveBoardSize8 {

	/**
	 * test method for a board size
	 */
	@Test
	public void testNewGameShouldHaveBoardSize8() {
		Game newGame = new Game();
		assertEquals(8, newGame.getBoardSize());
	}

}
