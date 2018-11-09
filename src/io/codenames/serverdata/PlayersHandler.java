package io.codenames.serverdata;

import java.rmi.*;
import java.rmi.server.*;

import io.codenames.serverinterfaces.PlayersHandlerInterface;

public class PlayersHandler extends UnicastRemoteObject implements PlayersHandlerInterface {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -4825483869639346540L;

	public PlayersHandler() throws RemoteException {
    	
    }
    /**
     * Implement Singleton
     */
	private static PlayersHandler single_instance = null;
	
    public static PlayersHandler getInstance() throws RemoteException {
    	if (single_instance == null) 
            single_instance = new PlayersHandler();
        return single_instance; 
    }
    
}
    
    
   