package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.Game;

/**
 * test for the status of a game when created
 * @author Chadwick Flanigan
 * 
 * @version 6/12/2022	
 *
 */
public class TestGetIsGameOver {
	
	/**
	 * test for the status of a newly created game
	 */
	@Test
	public void testBeforeGameStartsIsNotOver() {
		Game newGame = new Game();
		assertEquals(false, newGame.getIsGameOver());
	}
	
	/**
	 * tests the state of the game when a game starts
	 */
	@Test
	public void testWhenGameFirstStartsIsNotOver() {
		Game newGame = new Game(); 
		newGame.startNewGame(newGame.getComputerPlayer());
		assertEquals(false, newGame.getIsGameOver());
	}
	
	/**
	 * tests the stat of the game when the game should be over.
	 */
	@Test
	public void testWhenGameShouldBeOver() { 
		Game newGame = new Game();
		newGame.startNewGame(newGame.getHumanPlayer());
		newGame.play(0);
		newGame.play(-1);
		newGame.play(1);
		newGame.play(-1);
		newGame.play(2);
		assertEquals(true, newGame.getIsGameOver());
	}

}
