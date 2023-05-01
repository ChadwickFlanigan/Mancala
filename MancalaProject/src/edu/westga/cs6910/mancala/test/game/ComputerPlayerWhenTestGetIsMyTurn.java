package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test class for the getismyturn method
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022
 *
 */
public class ComputerPlayerWhenTestGetIsMyTurn {

	/**
	 * test the IsMyTurn method for true
	 */
	@Test
	public void testGetIsMyTurnTrue() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getComputerPlayer());
		assertEquals(true, newGame.getComputerPlayer().getIsMyTurn());
	}
	
	/**
	 * test the IsMyTurn method for false
	 */
	@Test
	public void testGetIsMyTurnFalse() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getHumanPlayer());
		assertEquals(false, newGame.getComputerPlayer().getIsMyTurn());
	}
}
