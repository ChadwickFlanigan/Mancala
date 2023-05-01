package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test class for getting the name of the computer
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022
 *
 */
public class ComputerPlayerWhenTestGetName {

	/**
	 * tests the get name method
	 */
	@Test
	public void testGetName() {
		Game newGame = new Game();
		assertEquals("Simple computer", newGame.getComputerPlayer().getName());
	}

}
