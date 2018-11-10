package io.codenames.serverinterfaces;

import java.util.HashMap;

import io.codenames.serverdata.Card;
import io.codenames.serverdata.CardFactory;
import io.codenames.serverdata.Player;

import java.rmi.*;

public interface GameInterface extends Remote{

	    /**
	     * Gets Game Name
	     * @return String Game's name
	     */
	    String getName();
	    /**
	     * Gets Game Cards
	     * @return ArrayList<String, Card> CardList
	     */
	    HashMap<String,Card> getCards();
	    /**
	     * Set Game Name
	     * @return game name
	     */
	    void setName(String name);

	    /**
	     * Get Creator Name
	     * @return string Creator's name
	     */
	    String getCreator();

	    /**
	     * Set Creator Name
	     * @param creator
	     */
	    void setCreator(String creator);
	    /**
	     * Get number of seats
	     * @return
	     */
	    int getSeats();

	    /**
	     * Set Seats for game
	     * @param seats
	     */
	    void setSeats(int seats);

	    
	    int getSeatsAvailable();
	   

}
