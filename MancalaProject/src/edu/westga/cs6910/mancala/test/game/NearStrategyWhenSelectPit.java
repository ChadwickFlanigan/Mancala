package edu.westga.cs6910.mancala.test.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.mancala.model.strategies.NearStrategy;

/**
 * test class for NearStaregy's selectPit method
 * @author Chadwick Flanigan
 * 
 * @version 6/19/2022
 *
 */
public class NearStrategyWhenSelectPit {

	/**
	 * tests the selectPit method
	 */
	@Test
	public void testFirstSelectPit() {
		NearStrategy testStrategy = new NearStrategy();
		int[] pits = {1, 2, 3, 4};
		assertEquals(2, testStrategy.selectPit(pits));
	}
	
	/**
	 * tests for selecting the second pit
	 */
	@Test
	public void testSecondSelectPit() {
		NearStrategy testStrategy = new NearStrategy();
		int[] pits = {1, 2, 3, 0};
		assertEquals(2, testStrategy.selectPit(pits));
	}
	
	/**
	 * tests for selecting the last pit
	 */
	@Test
	public void testFinalPit() {
		NearStrategy testStrategy = new NearStrategy();
		int[] pits = {1, 0, 0, 0};
		assertEquals(0, testStrategy.selectPit(pits));
	}

}
