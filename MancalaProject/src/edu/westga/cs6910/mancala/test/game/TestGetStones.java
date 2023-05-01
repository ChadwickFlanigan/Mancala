package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test for getting the number of stones in a pit
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022	
 *
 */
public class TestGetStones {

	/**
	 * tests the getStones method on board that was not started
	 */
	@Test
	public void testGetStonesShouldBeZero() {
		Game newGame = new Game();
		assertEquals(0, newGame.getStones(1));
	}
	
	/**
	 * tests the getStones method on board that was started
	 */
	@Test
	public void testGetStonesShouldBeOne() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getComputerPlayer());
		assertEquals(1, newGame.getStones(1));
	}

}
