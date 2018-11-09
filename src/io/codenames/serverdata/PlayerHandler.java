package io.codenames.serverdata;

import java.rmi.*;
import java.rmi.server.*;

import io.codenames.serverinterfaces.PlayerHandlerInterface;

public class PlayerHandler extends UnicastRemoteObject implements PlayerHandlerInterface{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -4825483869639346540L;

	public PlayerHandler() throws RemoteException {
    	
    }
    /**
     * Implement Singleton
     */
	private static PlayerHandler single_instance = null;
	
    public static PlayerHandler getInstance() throws RemoteException {
    	if (single_instance == null) 
            single_instance = new PlayerHandler();  
        return single_instance; 
    }
    
}
    
    
   