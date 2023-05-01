package edu.westga.cs6910.mancala.model;

/**
 * abstract class for the methods to be used by both human and computer controlled players
 * @author Chadwick Flanigan
 * @version 6/4/2022
 *
 */
public abstract class AbstractPlayer implements Player {

	private String name;
	private Game theGame;
	private boolean isMyTurn;
	
	/**
	 * creates the player objects
	 * @param theGame the game that this player represents
	 * @param name the name of this player
	 */
	public AbstractPlayer(Game theGame, String name) {
		if (theGame == null) {
			throw new IllegalArgumentException("Invalid Game object");
		}
		if (name == null) {
			throw new IllegalArgumentException("Invalid player name");
		}
		this.theGame = theGame;
		this.name = name;
	}
	
	@Override	
	/**
	 * @see Player#getIsMyTurn()
	 */
	public boolean getIsMyTurn() {
		return this.isMyTurn;
	}	

	@Override	
	/**
	 * @see Player#getName()
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * returns the game being played
	 * @return Game the game being played
	 */
	public Game getGame() {
		return this.theGame;
	}

	@Override	
	/**
	 * @see Player#setIsMyTurn()
	 */
	public void setIsMyTurn(boolean isMyTurn) {
		this.isMyTurn = isMyTurn;
	}
	
	@Override
	/**
	 * @see Player#takeTurn()
	 */	
	public abstract void takeTurn(int pitChoice);		
}
