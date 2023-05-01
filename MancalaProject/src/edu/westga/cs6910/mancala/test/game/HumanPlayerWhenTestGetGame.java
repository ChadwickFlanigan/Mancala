package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test class for getting the game board
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022
 *
 */
public class HumanPlayerWhenTestGetGame {

	/**
	 * test method for returning the game board
	 */
	@Test
	public void testGetGameBoard() {
		Game newGame = new Game();
		assertEquals(newGame, newGame.getHumanPlayer().getGame());
	}

}
