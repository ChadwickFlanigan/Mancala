package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test for the status of a current player when created
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022	
 *
 */
public class TestGetCurrentPlayer {

	/**
	 * tests starting a new game with a computer player
	 */
	@Test
	public void testGetCurrentComputerPlayer() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getComputerPlayer());
		assertEquals(newGame.getComputerPlayer(), newGame.getCurrentPlayer());
	}
	
	/**
	 * tests starting a new game with a human player
	 */
	@Test
	public void testGetCurrentHumanPlayer() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getHumanPlayer());
		assertEquals(newGame.getHumanPlayer(), newGame.getCurrentPlayer());
	}
	
}
