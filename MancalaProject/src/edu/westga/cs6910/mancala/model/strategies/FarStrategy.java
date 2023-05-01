package edu.westga.cs6910.mancala.model.strategies;

/**
 * creates the class that will select a put with a stone furthest from the game's storehouse
 * @author Chadwick Flanigan
 * 
 * @version 6/19/2022
 *
 */
public class FarStrategy implements SelectStrategy {

	@Override
	public int selectPit(int[] pitsToSelect) {
		int pitChoice = (pitsToSelect.length + 1) / 2;
		while (pitsToSelect[pitChoice] == 0) {
			pitChoice++;
		}
		return pitChoice;
	}
}
