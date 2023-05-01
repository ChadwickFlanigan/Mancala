package edu.westga.cs6910.mancala.view;

import edu.westga.cs6910.mancala.model.Game;
import edu.westga.cs6910.mancala.model.Player;
import edu.westga.cs6910.mancala.model.strategies.FarStrategy;
import edu.westga.cs6910.mancala.model.strategies.NearStrategy;
import edu.westga.cs6910.mancala.model.strategies.RandomStrategy;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 * Defines a GUI for the Mancala game.
 * Started by CS6910.  Fill your name into Javadoc below
 * 
 * @author 	Chadwick Flanigan
 * @version  6/5/2022
 * 
 */
public class MancalaPane extends BorderPane {
	private Game theGame;
	private GridPane pnContent;
	private HumanPane pnHumanPlayer;
	private ComputerPane pnComputerPlayer;
	private StatusPane pnGameInfo;
	private Pane pnChooseFirstPlayer;
	private MenuBar mancalaMenu;
	
	/**
	 * Creates a pane object to provide the view for the specified
	 * Game model object.
	 * 
	 * @param 	theGame		the domain model object representing the Mancala game
	 * 
	 * @requires theGame != null
	 * @ensures	 the pane is displayed properly
	 */
	public MancalaPane(Game theGame) {
		this.theGame = theGame;
		
		this.pnContent = new GridPane();
		
		this.addFirstPlayerChooserPane(theGame);		
		
		this.addComputerPlayerPane(theGame);
		
		this.addHumanPlayerPane(theGame);

		this.addStatusPane(theGame);
		
		this.addMenuBars();
		
		this.setCenter(this.pnContent);
	}
	
	private void addMenuBars() {
		Menu gameMenu = new Menu("_Game");
		gameMenu.setMnemonicParsing(true);
		gameMenu.setAccelerator(KeyCombination.keyCombination("Ctrl+G"));
		Menu computerMenu = new Menu("_Computer Player");
		computerMenu.setMnemonicParsing(true);
		computerMenu.setAccelerator(KeyCombination.keyCombination("Ctrl+C"));
		
		MenuItem exitOption = new MenuItem("E_xit");
		exitOption.setMnemonicParsing(true);
		exitOption.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
		exitOption.setOnAction(new ExitGameListener());
		
		MenuItem nearOption = new MenuItem("_Near");
		nearOption.setMnemonicParsing(true);
		nearOption.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
		nearOption.setOnAction(new NearStrategyListener());
		
		MenuItem farOption = new MenuItem("F_ar");
		farOption.setMnemonicParsing(true);
		farOption.setAccelerator(KeyCombination.keyCombination("Ctrl+A"));
		farOption.setOnAction(new FarStrategyListener());
		
		MenuItem randomOption = new MenuItem("_Random");
		randomOption.setMnemonicParsing(true);
		randomOption.setAccelerator(KeyCombination.keyCombination("Ctrl+R"));
		randomOption.setOnAction(new RandomStrategyListener());
		
		gameMenu.getItems().add(exitOption);
		computerMenu.getItems().addAll(nearOption, farOption, randomOption);
		
		this.mancalaMenu = new MenuBar();
		this.mancalaMenu.getMenus().addAll(gameMenu, computerMenu);
		this.pnContent.add(this.mancalaMenu, 0, 0);
	}
	
	private void addComputerPlayerPane(Game theGame) {
		HBox computerBox = new HBox();
		computerBox.getStyleClass().add("pane-border");
		this.pnComputerPlayer = new ComputerPane(theGame);
		computerBox.getChildren().add(this.pnComputerPlayer);
		this.pnComputerPlayer.setDisable(true);
		this.pnContent.add(computerBox, 0, 2);
	}
	
	private void addHumanPlayerPane(Game theGame) {
		HBox humanBox = new HBox();
		humanBox.getStyleClass().add("pane-border");
		this.pnHumanPlayer = new HumanPane(theGame);
		humanBox.getChildren().add(this.pnHumanPlayer);
		this.pnHumanPlayer.setDisable(true);
		this.pnContent.add(humanBox, 0, 3);
	}
	
	private void addStatusPane(Game theGame) {
		HBox statusBox = new HBox();
		statusBox.getStyleClass().add("pane-border");
		this.pnGameInfo = new StatusPane(theGame);
		statusBox.getChildren().add(this.pnGameInfo);
		this.pnContent.add(statusBox, 0, 4);
	}

	private void addFirstPlayerChooserPane(Game theGame) {
		HBox topBox = new HBox();
		topBox.getStyleClass().add("pane-border");	
		this.pnChooseFirstPlayer = new NewGamePane(theGame);
		topBox.getChildren().add(this.pnChooseFirstPlayer);
		this.pnContent.add(topBox, 0, 1);
	}
	
	private class ExitGameListener implements EventHandler<ActionEvent> {
		/**
		 * listens for the button to be clicked that indicated the user wishes to close the gmame
		 */
		@Override
		public void handle(ActionEvent event) {
			System.exit(0);
		}
	}
	
	private class NearStrategyListener implements EventHandler<ActionEvent> {
		/**
		 * listens for the button to be clicked that sets the computer's strategy
		 */
		@Override
		public void handle(ActionEvent event) {
			MancalaPane.this.theGame.getComputerPlayer().setStrategy(new NearStrategy());
		}
	}
	
	private class FarStrategyListener implements EventHandler<ActionEvent> {
		/**
		 * listens for the user to select the far strategy
		 */
		@Override
		public void handle(ActionEvent event) {
			MancalaPane.this.theGame.getComputerPlayer().setStrategy(new FarStrategy());
		}
	}
	
	private class RandomStrategyListener implements EventHandler<ActionEvent> {
		/**
		 * listens for the user to select the random strategy
		 */
		@Override
		public void handle(ActionEvent event) {
			MancalaPane.this.theGame.getComputerPlayer().setStrategy(new RandomStrategy());
		}
	}
	
	/*
	 * Defines the panel in which the user selects which Player plays first.
	 */
	private final class NewGamePane extends GridPane {
		private RadioButton radHumanPlayer;
		private RadioButton radComputerPlayer;
		
		private Game theGame;
		private Player theHuman;
		private Player theComputer;

		private NewGamePane(Game theGame) {
			this.theGame = theGame;
			
			this.theHuman = this.theGame.getHumanPlayer();
			this.theComputer = this.theGame.getComputerPlayer();
			
			this.buildPane();
		}
		
		private void buildPane() {
			this.setHgap(20);
			
			this.radHumanPlayer = new RadioButton(this.theHuman.getName() + " first");	
			this.radHumanPlayer.setOnAction(new HumanFirstListener());
			
			this.radComputerPlayer = new RadioButton(this.theComputer.getName() + " first");
			this.radComputerPlayer.setOnAction(new ComputerFirstListener());
			
			ToggleGroup selectFirstPlayer = new ToggleGroup();
			this.radComputerPlayer.setToggleGroup(selectFirstPlayer);
			this.radHumanPlayer.setToggleGroup(selectFirstPlayer);

			HBox firstPlayerToggles = new HBox();
			firstPlayerToggles.getChildren().add(this.radComputerPlayer);
			firstPlayerToggles.getChildren().add(this.radHumanPlayer);
			this.getChildren().add(firstPlayerToggles);
			
		}
		
		/* 
		 * Defines the listener for computer player first button.
		 */		
		private class ComputerFirstListener implements EventHandler<ActionEvent> {
			@Override
			/** 
			 * Enables the ComputerPlayerPanel and starts a new game. 
			 * Event handler for a click in the computerPlayerButton.
			 */
			public void handle(ActionEvent arg0) {
				MancalaPane.this.pnComputerPlayer.setDisable(false);
				MancalaPane.this.pnChooseFirstPlayer.setDisable(true);
				MancalaPane.this.theGame.startNewGame(NewGamePane.this.theComputer);
			}
		}

		/* 
		 * Defines the listener for human player first button.
		 */	
		private class HumanFirstListener implements EventHandler<ActionEvent> {
			/* 
			 * Sets up user interface and starts a new game. 
			 * Event handler for a click in the human player button.
			 */
			@Override
			public void handle(ActionEvent event) {
				MancalaPane.this.pnChooseFirstPlayer.setDisable(true);
				MancalaPane.this.pnHumanPlayer.setDisable(false);
				MancalaPane.this.theGame.startNewGame(NewGamePane.this.theHuman);

			}
		}	
	}
}
