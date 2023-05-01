package edu.westga.cs6910.mancala.model.strategies;

/**
 * creates a class that implements a strategy for selecting the nearest pit, implements the 
 *  SelectStrategy interface
 * @author Chadwick Flanigan
 * 
 * @version 6/19/2022
 *
 */
public class NearStrategy implements SelectStrategy {
	
	@Override
	public int selectPit(int[] pitsToSelect) {
		int pitChoice = pitsToSelect.length - 2;
		while (pitsToSelect[pitChoice] == 0) {
			pitChoice--;
		}
		return pitChoice;
	}
	
}
