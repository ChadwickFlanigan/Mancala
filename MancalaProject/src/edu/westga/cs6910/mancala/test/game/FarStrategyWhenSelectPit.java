package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.strategies.FarStrategy;

/**
 * test class for FarStrategy's selectPit method
 * @author Chadwick Flanigan
 * 
 * @version 6/19/2022
 *
 */
public class FarStrategyWhenSelectPit {

	/**
	 * tests for FarStrategy's selectpit method
	 */
	@Test
	public void testFurthestPit() {
		FarStrategy testGame = new FarStrategy();
		int[] board = {0, 0, 0, 0, 5, 6, 7, 8};
		assertEquals(4, testGame.selectPit(board));
	}

	/**
	 * tests for FarStrategy's selectpit method
	 */
	@Test
	public void testsecondFurthestPit() {
		FarStrategy testGame = new FarStrategy();
		int[] board = {0, 0, 0, 0, 0, 6, 7, 8};
		assertEquals(5, testGame.selectPit(board));
	}
	
	/**
	 * tests for FarStrategy's selectpit method
	 */
	@Test
	public void testClosestPit() {
		FarStrategy testGame = new FarStrategy();
		int[] board = {0, 0, 0, 0, 0, 0, 7, 8};
		assertEquals(6, testGame.selectPit(board));
	}
}
