package edu.westga.cs6910.mancala.model;

/**
 * HumanPlayer represents a human player in the game Mancala.
 * 
 * @author 	Chadwick Flanigan
 * @version 6/5/2022
 */
public class HumanPlayer extends AbstractPlayer {

	/**
	 * Creates a new ComputerPlayer with the specified name.
	 * 
	 * @param 	name	this Player's name
	 * @param	theGame	The Game that this player represents
	 * 
	 * @requires	name != null
	 * @ensure		name().equals(name) && getTotal() == 0
	 */
	public HumanPlayer(String name, Game theGame) {
		super(theGame, name);
	}
	
	/**
	 * method for the human player to take its turn
	 * @param pitChoice integer representing the put the player chose to play
	 */
	public void takeTurn(int pitChoice) {
		while (super.getGame().getStones(pitChoice) == 0) {
			pitChoice--;
		}
		super.getGame().distributeStonesFrom(pitChoice);

		super.setIsMyTurn(false);
	}

}
