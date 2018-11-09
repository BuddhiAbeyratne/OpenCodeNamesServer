package io.codenames.serverdata;


import java.util.HashMap;

public class Game {
    private String name;
    private String creator;
    private int seats;
    private int seatsAvailable;

    private CardFactory cardfactory= new CardFactory();
    private static HashMap<Integer, Player> playerMap = new HashMap<Integer, Player>();


    public Game(String name, String creator, int seats) {
        this.name = name;
        this.creator = creator;
        setSeats(seats);
    }

    /**
     * Gets Game Name
     * @return String Game's name
     */
    public String getName() {
        return name;
    }
    /**
     * Gets Game Cards
     * @return ArrayList<String, Card> CardList
     */
    public HashMap<String,Card> getCards(){
        return cardfactory.getCardMap();
    }
    /**
     * Set Game Name
     * @return game name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Creator Name
     * @return string Creator's name
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Set Creator Name
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * Get number of seats
     * @return
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Set Seats for game
     * @param seats
     */
    public void setSeats(int seats) {
        this.seats = seats;
        setSeatsAvailable(seats);
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    private void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }



}
