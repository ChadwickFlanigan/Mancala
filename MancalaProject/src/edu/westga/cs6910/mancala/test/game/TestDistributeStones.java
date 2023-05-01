package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test for distributing stones
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022	
 *
 */
public class TestDistributeStones {

	/**
	 * tests distributing stones from the first pit
	 */
	@Test
	public void testDistributeFirstPit() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getHumanPlayer());
		newGame.distributeStonesFrom(0);
		assertEquals(2, newGame.getStones(1));
	}
	
	/**
	 * testsDistributingStones from a pit that has two stones
	 */
	@Test
	public void testDistributeTwoStones() {
		Game newGame = new Game();
		newGame.startNewGame(newGame.getHumanPlayer());
		newGame.distributeStonesFrom(0);
		newGame.distributeStonesFrom(1);
		assertEquals(2, newGame.getStones(2));

	}

}
