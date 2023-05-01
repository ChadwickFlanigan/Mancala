package edu.westga.cs6910.mancala.model.strategies;

/**
 * creates the strategy for a computer player to select a pit randomly from which to play from
 * @author Chadwick Flanigan
 * 
 * @version 6/19/2022
 *
 */
public class RandomStrategy implements SelectStrategy {

	@Override
	public int selectPit(int[] pitsToSelect) {
		int pitChoice = this.randomPitNumber(pitsToSelect);
		
		while (pitsToSelect[pitChoice] == 0) {
			pitChoice = this.randomPitNumber(pitsToSelect);
		}
		return pitChoice;
	}
	
	private int randomPitNumber(int[]pitsToSelect) {
		int maxNumber = pitsToSelect.length - 1;
		int minNumber = (pitsToSelect.length + 1) / 2;
		int randomNumber = (int) Math.floor(Math.random() * (maxNumber - minNumber + 1) + minNumber);
		return randomNumber;
	}
}
