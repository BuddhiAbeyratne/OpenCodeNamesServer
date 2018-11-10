package io.codenames.serverinterfaces;

import java.rmi.*;

public interface PlayersHandlerInterface extends Remote{

	public boolean register(String userName, String password);
	
	public boolean athenticate (String userName, String password);
	
	public boolean playerStatistic(String playerName);
}
