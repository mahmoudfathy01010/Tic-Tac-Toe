/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic_tac_toe;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author macproretina
 */
public class Tic_Tac_Toe extends Application {
    
 //z_online_xo z= new z_online_xo();
//z_offline_xo z=new z_offline_xo();
//z_ai_difficult_xo z= new z_ai_difficult_xo();
 //home_secreen z= new home_secreen();
 // AiLevelsBase z= new AiLevelsBase();
   // z_ai_med_xo z =new z_ai_med_xo();
    //z_ai_easy_xo z=new z_ai_easy_xo();
//user_nameBase z=new user_nameBase();
    //LosingBase z=new LosingBase();
    //g_saved_game_screenBase z= new g_saved_game_screenBase();
    //newwinnerBase z=new newwinnerBase();
    //tieBase z=new tieBase();
 splashBase z= new splashBase();
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = z;
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        
        
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
          public void handle(WindowEvent we) {
              System.out.println("Stage is closing");
              
               Platform.exit();
               System.exit(0);
          }
      });        
        
        
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
