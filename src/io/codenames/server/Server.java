package io.codenames.server;


import io.codenames.serverdata.GamesHandler;
import io.codenames.serverdata.PlayersHandler;
import io.codenames.serverdata.WordList;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;


public class Server {

    public static void main(String argv[]){
        /**
         * Load instances
         */
        WordList.getInstance();
        System.out.println("WordList Handler Initialised");
        try {
            PlayersHandler playershandler = PlayersHandler.getInstance();
            Naming.rebind("rmi://localhost/GamesHandler", GamesHandler.getInstance());
            System.out.println("Game Handler Initialised");
            Naming.rebind("rmi://localhost/PlayersHandler", playershandler);
            System.out.println("Game Handler Initialised");
            /**
             * Create Exit hook
             */
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    playershandler.savePlayerList();
                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
