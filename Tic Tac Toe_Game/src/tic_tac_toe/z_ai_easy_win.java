
package tic_tac_toe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;


public class z_ai_easy_win extends newwinnerBase{
    
    
     z_ai_easy_xo x ;
         Connection conn=user_nameBase.con;
    Statement stmt = null;
    ResultSet resultSet = null;
    int i=0;
    String[] Game_Array=new String[9];
    int index=0;
    String usr_name=user_nameBase.user;
    
        public  void move_to_xo () 
      {
       mediaPlayer.stop();
       x= new  z_ai_easy_xo();
            //mediaPlayer1_b.stop();

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load();
          }
      });
      
      fd.play();
      
      }
    
     private void load()
      {
          
          
          System.out.println("hello from constructor");
        
       x.setOpacity(0);
       
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(x);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
        
       Scene s=replay_image.getScene();
       s.setRoot(x);
      
//      Scene s=new Scene(x);
//      Stage cur= (Stage) this.getScene().getWindow();
//      cur.setScene(s);
      
      }
     
    
    
    
    
    
      ///////////////////////////
     
     //start from here : 

    public z_ai_easy_win() {
        
        
        
          //to handle saving :
               
        
        try {
            stmt=conn.createStatement();
                            
             resultSet = stmt.executeQuery("select * from Game");
             //int i=0;
             while(resultSet.next()){i++;}
             stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(z_ai_easy_win.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        save_image.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {




              //enter your code here 

for(String s : z_ai_easy_xo.toSave){

                Game_Array[index]=s;
                index++;
  
System.out.print("+++++++++++");
    System.out.println(s);
}
save_game();


                save_image.setOpacity(1); // don't remove this line ,related to design 
            }
        }

         );

        
        
        //to handle replaying :
        
        replay_image.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
               
                
                
                move_to_xo () ;
                //enter your code here 
                
                
            }
        }

         );
        
    }
    
    
    
 public void save_game()
 {
               try{              
              Date date;
              date= new Date();
              long time = date.getTime();
                      
              Timestamp ts = new Timestamp(time);
             
             PreparedStatement preparedStmt = conn.prepareStatement("insert into GAME values(?,?,?,?,?,?,?,?,?,?,?,?)");
             preparedStmt.setInt(1, i);
             preparedStmt.setTimestamp(2, ts);
               preparedStmt.setString(3, usr_name);
               for(int j=0;j<9;j++)
               {
                 preparedStmt.setString(j+4, Game_Array[j]);
               }  

               
               preparedStmt.executeUpdate();
               preparedStmt.close();
             
             
         } catch (SQLException ex) {
            Logger.getLogger(z_ai_easy_win.class.getName()).log(Level.SEVERE, null, ex);
        }
    
 
 
 
 
 
 
 }  
    
    
}
