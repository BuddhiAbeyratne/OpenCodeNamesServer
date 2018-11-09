package io.codenames.serverdata;

public class Player {
    private String name;
    private int numGames;
    private int cardsReviled;
    private int correctReviles;
    private int incorrectReviles;

    /**
     * Get player name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Set player name
     * @param name Player Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Number of names played
     * @return int
     */
    public int getNumGames() {
        return numGames;
    }

    /**
     * set number of games
     * @param numGames Number of Games Played
     */
    protected void setNumGames(int numGames) {
        this.numGames = numGames;
    }

    /**
     * Increment number of games played
     */
    public void playedGame() {
        this.numGames++;
    }

    /**
     * Get number of cards Reviled
     * @return int
     */
    public int getCardsReviled() {
        return cardsReviled;
    }

    /**
     * Set number of cards reviled by a player
     * @param cardsReviled Number of cards reviled
     */
    protected void setCardsReviled(int cardsReviled) {
        this.cardsReviled = cardsReviled;
    }

    /**
     * Get correct reveals by player
     * @return int
     */
    public int getCorrectReviles() {
        return correctReviles;
    }

    /**
     * Set correct cards reviled
     * @param correctReviles Number of Correct reviles
     */
    protected void setCorrectReviles(int correctReviles) {
        this.correctReviles = correctReviles;
    }

    /**
     * Get incorrect card reviles
     * @return int
     */
    public int getIncorrectReviles() {
        return incorrectReviles;
    }

    /**
     * Set Incorrect Revels
     * @param incorrectReviles number of incorrect reviles
     */
    protected void setIncorrectReviles(int incorrectReviles) {
        this.incorrectReviles = incorrectReviles;
    }


}
