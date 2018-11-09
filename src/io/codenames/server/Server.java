package io.codenames.server;


import io.codenames.serverdata.GamesHandler;
import io.codenames.serverdata.PlayersHandler;
import io.codenames.serverdata.WordList;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;


public class Server {

    public static void main(String argv[]){
        WordList.getInstance();
        System.out.println("WordList Handler Initialised");
        try {
            Naming.rebind("rmi://localhost/GamesHandler", GamesHandler.getInstance());
            System.out.println("Game Handler Initialised");
            Naming.rebind("rmi://localhost/PlayersHandler", PlayersHandler.getInstance());
            System.out.println("Game Handler Initialised");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
