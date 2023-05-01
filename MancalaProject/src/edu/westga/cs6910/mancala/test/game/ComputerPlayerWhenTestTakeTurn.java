package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test class for the computer to take its turn
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022
 *
 */
public class ComputerPlayerWhenTestTakeTurn {

	/**
	 * tests the take turn method
	 */
	@Test
	public void testTakeTurn() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getComputerPlayer());
		newGame.getComputerPlayer().takeTurn(-1);
		assertEquals(false, newGame.getComputerPlayer().getIsMyTurn());
	}

}
