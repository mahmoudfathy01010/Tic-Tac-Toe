
package tic_tac_toe_server;

import java.net.ServerSocket;
import java.io.IOException;
public class TicTacToeServer {

    
    GamePartner[] gamePartner;
    ServerSocket server; 
    int currentPartner;
    int X = 0;
    int O = 1; 
    String[] Signs = {"x", "o"};
    
   
    
    
    
   
    public TicTacToeServer() {
        
        
        gamePartner = new GamePartner[2]; 
        System.out.print("hello");

        try {
            server = new ServerSocket(12345, 2); 
        } catch (IOException ioException) {
            System.out.println(ioException.toString());
            System.exit(1);
        }
        
        
       while(true)
       {
          Room R=new Room();
         for (int i = 0; i < gamePartner.length; i++) {
            try {
                gamePartner[i] = new GamePartner(server.accept(), i,R);
                R.gamePartner[i]=gamePartner[i];
            } catch (IOException ioException) {
                System.out.println(ioException.toString());
                System.out.println("here ya ");
                System.exit(1);
            }
        }
          gamePartner[X].ToLock.lock(); // lock game to signal player X's thread

        try {
            gamePartner[X].Pause=false;// resume player X
             gamePartner[X].oppenentConnected.signal();
           
        } finally {
            gamePartner[X].ToLock.unlock(); // unlock game after signalling player X
        }
       
    }
        
             
        
        
    }
    
   

  
  
}
   
    

