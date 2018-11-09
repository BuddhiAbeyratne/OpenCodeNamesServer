package io.codenames.serverinterfaces;

public class PlayersHandlerInterface {
	
    public PlayersHandlerInterface() {
    	
    }
    /**
     * Implement Singleton
     */
	private static PlayersHandlerInterface single_instance = null;
	
    public static PlayersHandlerInterface getInstance() {
    	if (single_instance == null) 
            single_instance = new PlayersHandlerInterface();  
        return single_instance; 
    }
    
}
    
    
   