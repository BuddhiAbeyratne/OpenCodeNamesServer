package io.codenames.serverdata;

import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

import io.codenames.serverinterfaces.GameInterface;

public class Game extends UnicastRemoteObject implements GameInterface{
    private String name;
    private String creator;
    private int seats;
    private int seatsAvailable;

    private CardFactory cardfactory= new CardFactory();
    private static HashMap<Integer, Player> playerMap = new HashMap<Integer, Player>();

    
    public Game(String name, String creator, int seats) throws RemoteException {
        this.name = name;
        this.creator = creator;
        setSeats(seats);
    }
    
    
	public String getName(){
        return name;
    }
	 
	 
	 public HashMap<String,Card> getCards(){
        return cardfactory.getCardMap();
    }

    public void setName(String name) {
        this.name = name;
    }

 
    public String getCreator() {
        return creator;
    }

   
    public void setCreator(String creator) {
        this.creator = creator;
    }

  
    public int getSeats() {
        return seats;
    }

   
    public void setSeats(int seats) {
        this.seats = seats;
        setSeatsAvailable(seats);
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    /**
     * 
     * @param seatsAvailable
     */
    private void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }



}
