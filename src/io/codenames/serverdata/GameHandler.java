package io.codenames.serverdata;

import java.rmi.*;
import java.rmi.server.*;

import io.codenames.serverinterfaces.GameHandlerInterface;

public class GameHandler extends UnicastRemoteObject implements GameHandlerInterface {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6002464202108439172L;

	public GameHandler() throws RemoteException {
    	
    }
    /**
     * Implement Singleton
     */
	private static GameHandler single_instance = null;
	
    public static GameHandler getInstance() throws RemoteException  {
    	if (single_instance == null) 
            single_instance = new GameHandler();  
        return single_instance; 
    }
  
}
