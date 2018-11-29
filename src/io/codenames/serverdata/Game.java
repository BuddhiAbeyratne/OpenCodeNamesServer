package io.codenames.serverdata;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.security.MessageDigest;

import io.codenames.serverinterfaces.GameInterface;

public class Game  implements GameInterface, Serializable {
    private String gameID;
    private String name;
    private String creator;
    private int seats;
    private int seatsAvailable;
    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();


    private CardFactory cardfactory= new CardFactory();
    private ArrayList<Player> playerMap = new ArrayList<Player>();

    
    public Game(String name, String creator, int seats) {
        try {
            this.name = name;
            this.creator = creator;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String gameIDToHash = name+creator+ Long.toString(System.currentTimeMillis());
            messageDigest.update(gameIDToHash.getBytes());
            this.gameID = bytesToHex(messageDigest.digest());
            setSeats(seats);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
    
	public String getName(){
        return name;
    }


    public Card getCard(int i) {
        return cardfactory.getCard(i);
    }

    public ArrayList<String> getCardsArray(){ return cardfactory.getCardsArray(); }

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


    public String getGameID() {
        return gameID;
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

    protected boolean addPlayer(Player player){
        int seats = getSeatsAvailable();
        if(seats>0 && !playerExists(player)){
            this.playerMap.add(player);
            setSeatsAvailable(seats-1);
            return true;
        }else{
            return false;
        }

    }

    protected boolean removePlayer(Player player){
        int seats = getSeatsAvailable();
        if(seats>0 && playerExists(player)){
            this.playerMap.remove(player);
            setSeatsAvailable(seats-1);
            return true;
        }else{
            return false;
        }

    }

    protected boolean playerExists(Player player){
        return playerMap.contains(player);
    }
    
    protected boolean startGame(){
    	for (Player player: playerMap ) {
    	   try {
			if(!player.getClientCallBackInterface().startGame() ) {
				   return false;
			   }
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
    	}
    	return true;
    	
    }
    
    

}
