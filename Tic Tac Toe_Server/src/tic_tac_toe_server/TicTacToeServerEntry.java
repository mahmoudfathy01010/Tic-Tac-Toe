
/**
 *
 * @author MamoudFathy
 */
package tic_tac_toe_server;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class TicTacToeServerEntry extends Application implements Runnable {
fxBase c;

TicTacToeServer application ;
public TicTacToeServerEntry()
{
 c=new fxBase();
 
}

    public static void main(String[] args) {
        
          TicTacToeServerEntry.launch(args);
           
       
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        Scene scene;
        scene = new Scene(c);

        primaryStage.setScene(scene);
        primaryStage.show();
           
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
          @Override
          public void handle(WindowEvent we) {
             
             
               Platform.exit();
                System.exit(0);
          }
          
      }); 
        Thread th = new Thread(this);
        th.start();
    }

    @Override
    public void run() {
         application = new TicTacToeServer();
    }
}
    
