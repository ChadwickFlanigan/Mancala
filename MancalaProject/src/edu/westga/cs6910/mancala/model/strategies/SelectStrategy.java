package edu.westga.cs6910.mancala.model.strategies;

/**
 * This interface will define the common methods for all the game-play algorithyms for Mancala.
 * @author Chadwick Flanigan
 * 
 * @version 6/19/2022
 *
 */
public interface SelectStrategy {

	/**
	 * this method accepts an array of pits that may be selected. Returns the selected pit
	 * @param pitsToSelect array of ints representing pits
	 * @return a single int representing the pit selected
	 */
	int selectPit(int[] pitsToSelect);
	
}
