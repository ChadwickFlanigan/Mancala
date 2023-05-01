package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test class for the creation of Game objects
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022
 *
 */
public class TestCreateGame {

	/**
	 * test method for new Game objects
	 */
	@Test
	public void testShouldProduceGameWithNoScore() {
		Game newGame = new Game();
		assertEquals("Human: 0" + System.getProperty("line.separator") 
				+ "Simple computer: 0" + System.getProperty("line.separator"), newGame.toString());
	}

}
