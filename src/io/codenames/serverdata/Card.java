package io.codenames.serverdata;

import java.io.Serializable;
import java.rmi.server.UnicastRemoteObject;

import io.codenames.serverinterfaces.CardInterface;

import java.rmi.*;

public class Card implements CardInterface, Serializable {

    private int type;
    private String codeName;
    private boolean hidden = true;


    /**
     * Create Card
     * @param type
     * @param codeName
     * @return Card
     */
    protected Card(int type, String codeName) throws RemoteException{
        this.type = type;
        this.codeName = codeName;
    }


    public int getType() {
        return type;
    }

 
    public void setType(int type) {
        this.type = type;
    }


    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

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

    public void revealCard() {
        setHidden(false);
    }

}
