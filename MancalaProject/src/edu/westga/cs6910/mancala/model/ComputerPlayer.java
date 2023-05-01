package edu.westga.cs6910.mancala.model;

import edu.westga.cs6910.mancala.model.strategies.NearStrategy;
import edu.westga.cs6910.mancala.model.strategies.SelectStrategy;

/**
 * ComputerPlayer represents a very simple automated player in the game Mancala.
 * It always selects the closest pit for stones to be distributed
 * 
 * @author 	Chadwick Flanigan
 * @version 6/4/2022
 */
public class ComputerPlayer extends AbstractPlayer {
	private static final String NAME = "Simple computer";
	private SelectStrategy selectedStrategy;
	
	/**
	 * Creates a new ComputerPlayer with the specified name.
	 * 
	 * @param	theGame	The Game that this player represents
	 * 
	 */
	public ComputerPlayer(Game theGame) {
		super(theGame, NAME);
		this.selectedStrategy = new NearStrategy();
	}
	
	/**
	 * implements abstract method, making the computer take its turn
	 * @param pitChoice integer representing the pit to be played
	 */
	public void takeTurn(int pitChoice) {				
		pitChoice = this.selectedStrategy.selectPit(super.getGame().getGameBoard());
		
		super.getGame().distributeStonesFrom(pitChoice);

		super.setIsMyTurn(false);
		
	}
	
	/**
	 * setter method to change the computer player's strategy
	 * @param selectedStrategy a SelectStrategy object
	 */
	public void setStrategy(SelectStrategy selectedStrategy) {
		this.selectedStrategy = selectedStrategy;
	}
	
	/**
	 * getter method for the current strategy of the computer player
	 * @return SelectStrategy currently selected strategy
	 */
	public SelectStrategy getStrategy() {
		return this.selectedStrategy;
	}

}
