package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test for the status of a game when restarted
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022	
 *
 */
public class TestStartNewGame {

	/**
	 * test for restarting the game with a specific first player computer
	 */
	@Test
	public void testRestartGame() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getComputerPlayer());
		assertEquals(newGame.getComputerPlayer(), newGame.getCurrentPlayer());
	}

	/**
	 * test for restarting the game with a specific first player computer
	 */
	@Test
	public void testRestartGameWitHumanFirst() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getHumanPlayer());
		assertEquals(newGame.getHumanPlayer(), newGame.getCurrentPlayer());
	}
}
