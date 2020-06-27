/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic_tac_toe;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author macproretina
 */
public class c_try extends xo_bordBase{
    
    public c_try()
    {
        
        btn9.setOnAction(new EventHandler<ActionEvent>() {
    @Override 
    public void handle(ActionEvent e) { 
    
        btn9.setText("o");
        btn9.setStyle(o_style_bt9);
         hitNormal = ("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/sounds/xo.mp3");
                    sound = new Media(new File(hitNormal).toURI().toString());
                    mediaPlayer = new MediaPlayer(sound);
                    mediaPlayer.setVolume(0.5);
                    mediaPlayer.stop();
                    mediaPlayer.play();

  
        
    }});
         
        
    }
   
    
    
}
