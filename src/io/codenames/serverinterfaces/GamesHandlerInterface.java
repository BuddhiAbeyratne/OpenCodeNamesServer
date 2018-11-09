package io.codenames.serverinterfaces;

public class GamesHandlerInterface {

    public GamesHandlerInterface() {
    	
    }
    /**
     * Implement Singleton
     */
	private static GamesHandlerInterface single_instance = null;
	
    public static GamesHandlerInterface getInstance() {
    	if (single_instance == null) 
            single_instance = new GamesHandlerInterface();  
        return single_instance; 
    }
  
}
