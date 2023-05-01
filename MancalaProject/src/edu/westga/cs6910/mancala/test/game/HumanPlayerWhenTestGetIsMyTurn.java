package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test class for getting the turn status of the player
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022
 *
 */
public class HumanPlayerWhenTestGetIsMyTurn {

	/**
	 * test the IsMyTurn method for true
	 */
	@Test
	public void testGetIsMyTurnTrue() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getHumanPlayer());
		assertEquals(true, newGame.getHumanPlayer().getIsMyTurn());
	}
	
	/**
	 * test the IsMyTurn method for false
	 */
	@Test
	public void testGetIsMyTurnFalse() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getComputerPlayer());
		assertEquals(false, newGame.getHumanPlayer().getIsMyTurn());
	}

}
