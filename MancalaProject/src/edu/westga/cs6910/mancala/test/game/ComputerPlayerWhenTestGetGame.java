package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test class for the getGameBoard method
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022
 *
 */
public class ComputerPlayerWhenTestGetGame {

	/**
	 * test method for returning the game board
	 */
	@Test
	public void testGetGameBoard() {
		Game newGame = new Game();
		assertEquals(newGame, newGame.getComputerPlayer().getGame());
	}

}
