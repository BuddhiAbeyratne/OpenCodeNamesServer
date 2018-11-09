package io.codenames.serverdata;

public class Card {

    private int type;
    private String codeName;
    private boolean hidden = true;


    /**
     * Create Card
     * @param type
     * @param codeName
     * @return Card
     */
    protected Card(int type, String codeName) {
        this.type = type;
        this.codeName = codeName;
    }

    /**
     * Get type of card
     *
     * @return
     */
    public int getType() {
        return type;
    }

    /**
     * Set type of cards
     *
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * get codeName of Card
     *
     * @return
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * Set codeName of card
     *
     * @param codeName
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    /**
     * check if card is hidden
     *
     * @return
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Set card hidden state
     *
     * @param hidden
     */
    private void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    /*
     * reveal card andSet hidden state to false
     */
    public void revealCard() {
        setHidden(false);
    }

}
