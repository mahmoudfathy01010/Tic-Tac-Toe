
package tic_tac_toe;

import java.io.File;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;
import static tic_tac_toe.z_ai_easy_xo.toSave;


// version 5 

/* buttons*/

//btn1 ,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

// x_score_count;  ->(count label for x score)
// o_score_count;  ->(count label  for o score)
// message_label   -> (message from server or your turn )



/*style*/

// x_style_bt1_2_4_5; 
// o_style_bt1_2_4_5;

// x_style_bt3_6;
// o_style_bt3_6;

// x_style_bt7_8;
// o_style_bt7_8;


/* style in success*/
// x_style_suc;
// o_style_suc;

public class z_offline_xo extends xo_bordBase{
   
    //// for x-wining////
    z_offline_win zwx;
      z_offline_win zwo ;
      z_offline_tie zt;
   
    
     public  void move_to_win_x () 
      {

        zwx=new  z_offline_win ();
            mediaPlayer1_b.stop();

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
        
       zwx.setOpacity(0);
       zwx.label2.setText("Congratulation X-player");
        zwx.label2.setTextFill(javafx.scene.paint.Color.valueOf("#c3c032"));
        zwx.label2.setFont(new Font(30.0));
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(zwx);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
        
       Scene s=this.getScene();
      s.setRoot(zwx);
      
      
      }
    
     
     
     //////////for o_wining//////
      public  void move_to_win_o() 
      {

        zwo=new  z_offline_win ();
            mediaPlayer1_b.stop();

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_o();
          }
      });
      
      fd.play();
      
      }
    
     private void load_o()
      {
          
          
          System.out.println("hello from constructor");
        
       zwo.setOpacity(0);
       zwo.label2.setText("Congratulation O-player");
        zwo.label2.setTextFill(javafx.scene.paint.Color.valueOf("#c3c032"));
        zwo.label2.setFont(new Font(30.0));
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(zwo);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
        
     Scene s=this.getScene();
      s.setRoot(zwo);
      
      }
    
     
     /// in tie condition //
     
       public  void move_to_tie () 
      {

        zt=new z_offline_tie();
            mediaPlayer1_b.stop();

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_t();
          }
      });
      
      fd.play();
      
      }
    
     private void load_t()
      {
          
          
          System.out.println("hello from constructor");
        
       zt.setOpacity(0);
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(zt);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
        
     Scene s=this.getScene();
      s.setRoot(zt);
      
      }
    

     
////////////////////////////////////
    
     public static String[] toSave = {null, null, null, null, null, null, null, null, null};
       
    public z_offline_xo()
    {
        
        
        
        isButtonPressed();
        //enter your code here
        
           
        for(String s : z_offline_xo.toSave){

System.out.print("+++++22222++++++");
    System.out.println(s);
}
     
    }   
        boolean isGameEnds= false;
        boolean isFirstPlayerTurn = false;
        int XOCounter=0;
        public String[] s= new String[10];

    @Override
    public Bounds sceneToLocal(Bounds sceneBounds) {
        return super.sceneToLocal(sceneBounds); //To change body of generated methods, choose Tools | Templates.
    }
         private void checkIfGameEnds() {
            
        String t00 = btn1.getText();
        String t01 = btn2.getText();
        String t02 = btn3.getText();
        String t10 = btn4.getText();
        String t11 = btn5.getText();
        String t12 = btn6.getText();
        String t20=  btn7.getText();
        String t21 = btn8.getText();
        String t22 = btn9.getText();
        
  
        if (t00.equals(t01) && t00.equals(t02) && !t00.equals("")) {
            isGameEnds = true;
            if("X".equals(btn1.getText())  &"X".equals(btn2.getText())& "X".equals(btn3.getText()) ){
                btn1.setStyle(x_style_suc);
                btn2.setStyle(x_style_suc);
                btn3.setStyle(x_style_suc);
                message_label.setText("Player X is winner");
                youWin++;
                
               move_to_win_x();
            }
            
            else if("o".equals(btn1.getText())  &"o".equals(btn2.getText())& "o".equals(btn3.getText())){
                btn1.setStyle(o_style_suc);
                btn2.setStyle(o_style_suc);
                btn3.setStyle(o_style_suc);
                message_label.setText("Player O is winner");
                computerWins++;
                move_to_win_o();
                
            } //winner scene for o
  
                          
        }
 
        if (t10.equals(t11) && t10.equals(t12) && !t10.equals("")) {
            isGameEnds = true;
            
          if("X".equals(btn4.getText())  &"X".equals(btn5.getText())& "X".equals(btn6.getText()) ){
                btn4.setStyle(x_style_suc);
                btn5.setStyle(x_style_suc);
                btn6.setStyle(x_style_suc);
                message_label.setText("Player X is winner");
                //winner scene for x
                
                youWin++;
                move_to_win_x();
                
                
            }
            
            else if(t10.equals("o") & t11.equals("o") & t12.equals("o")){
                btn4.setStyle(o_style_suc);
                btn5.setStyle(o_style_suc);
                btn6.setStyle(o_style_suc);
                message_label.setText("Player O is winner");
                computerWins++;
                //winner scene for o
                move_to_win_o();
            }
        }
 
        if (t20.equals(t21) && t20.equals(t22) && !t20.equals("")) {
            isGameEnds = true;
            
       if("X".equals(btn7.getText())  &"X".equals(btn8.getText())& "X".equals(btn9.getText()) ){
                btn7.setStyle(x_style_suc);
                btn8.setStyle(x_style_suc);
                btn9.setStyle(x_style_suc);
                message_label.setText("Player X is winner");
                youWin++;
                //winner scene for x
                move_to_win_x();
            }
            
            else if("o".equals(btn7.getText())  &"o".equals(btn8.getText())& "o".equals(btn9.getText())){
                btn7.setStyle(o_style_suc);
                btn8.setStyle(o_style_suc);
                btn9.setStyle(o_style_suc);
                message_label.setText("Player O is winner");
                computerWins++;
                //winner scene for o
                move_to_win_o();
            }
        }
 
        if (t00.equals(t10) && t00.equals(t20) && !t00.equals("")) {
            isGameEnds = true;
            
        if("X".equals(btn1.getText())  &"X".equals(btn4.getText())& "X".equals(btn7.getText()) ){
                btn1.setStyle(x_style_suc);
                btn4.setStyle(x_style_suc);
                btn7.setStyle(x_style_suc);
                message_label.setText("Player X is winner");
               youWin++;
                move_to_win_x();
            }
            
            else if("o".equals(btn1.getText())  &"o".equals(btn4.getText())& "o".equals(btn7.getText())){
                btn1.setStyle(o_style_suc);
                btn4.setStyle(o_style_suc);
                btn7.setStyle(o_style_suc);
                message_label.setText("Player O is winner");
                computerWins++;
                move_to_win_o();
                //winner scene for o
            }
        }
 
        if (t01.equals(t11) && t01.equals(t21) && !t01.equals("")) {
            isGameEnds = true;
            
    if("X".equals(btn2.getText())  &"X".equals(btn5.getText())& "X".equals(btn8.getText()) ){
                btn2.setStyle(x_style_suc);
                btn5.setStyle(x_style_suc);
                btn8.setStyle(x_style_suc);
                message_label.setText("Player X is winner");
                //winner scene for x
                youWin++;
                move_to_win_x();
            }
            
            else if("o".equals(btn2.getText())  &"o".equals(btn5.getText())& "o".equals(btn8.getText())){
                btn2.setStyle(o_style_suc);
                btn5.setStyle(o_style_suc);
                btn8.setStyle(o_style_suc);
                message_label.setText("Player O is winner");
                //winner scene for o
                computerWins++;
                move_to_win_o();
            }
        }
 
        if (t02.equals(t12) && t02.equals(t22) && !t02.equals("")) {
            isGameEnds = true;
            
    if("X".equals(btn3.getText())  &"X".equals(btn6.getText())& "X".equals(btn9.getText()) ){
                btn3.setStyle(x_style_suc);
                btn6.setStyle(x_style_suc);
                btn9.setStyle(x_style_suc);
                message_label.setText("Player X is winner");
                youWin++;
                //winner scene for x
                move_to_win_x();
            }
            
            else if("o".equals(btn3.getText())  &"o".equals(btn6.getText())& "o".equals(btn9.getText())){
                btn3.setStyle(o_style_suc);
                btn6.setStyle(o_style_suc);
                btn9.setStyle(o_style_suc);
                message_label.setText("Player O is winner");
                computerWins++;
                //winner scene for o
                move_to_win_o();
            }
        }
 
        if (t00.equals(t11) && t00.equals(t22) && !t00.equals("")) {
            isGameEnds = true;
            
            if("X".equals(btn1.getText())  &"X".equals(btn5.getText())& "X".equals(btn9.getText()) ){
                btn1.setStyle(x_style_suc);
                btn5.setStyle(x_style_suc);
                btn9.setStyle(x_style_suc);
                message_label.setText("Player X is winner");
                youWin++;
              move_to_win_x();
             
            
            }
            
            else if("o".equals(btn1.getText())  &"o".equals(btn5.getText())& "o".equals(btn9.getText())){
                btn1.setStyle(o_style_suc);
                btn5.setStyle(o_style_suc);
                btn9.setStyle(o_style_suc);
                message_label.setText("Player O is winner");
                computerWins++;
                //winner scene for o
                
                move_to_win_o();
            }
        }
 
        if (t02.equals(t11) && t02.equals(t20) && !t02.equals("")) {
            isGameEnds = true;
            
    if("X".equals(btn3.getText())  &"X".equals(btn5.getText())& "X".equals(btn7.getText()) ){
                btn3.setStyle(x_style_suc);
                btn5.setStyle(x_style_suc);
                btn7.setStyle(x_style_suc);
                message_label.setText("Player X is winner");
                youWin++;
                //winner scene for x
                move_to_win_x();
            }
            
            else if("o".equals(btn3.getText())  &"o".equals(btn5.getText())& "o".equals(btn7.getText())){
                btn3.setStyle(o_style_suc);
                btn5.setStyle(o_style_suc);
                btn7.setStyle(o_style_suc);
                message_label.setText("Player O is winner");
                computerWins++;
                //winner scene for o
                move_to_win_o();
            }
        }
        
        if( !t10.equals("") && !t11.equals("") &&  !t12.equals("")
             &&   !t00.equals("") &&  !t01.equals("") &&  !t02.equals("")
                && !t20.equals("") && !t21.equals("") && !t22.equals(""))
        {  
            isGameEnds=true;
            message_label.setText("Game is a tie");
            System.out.println(" It is a tie");
            
             x_score_count.setText("0");
             o_score_count.setText("0");
             // tie scene here
             
             move_to_tie();
            
        }
        
//           if( XOCounter >= 9)
//        {
//            isGameEnds = true;
//            isFirstPlayerTurn = true;
//            XOCounter = 0;
//           message_label.setText("Game is draw");
//           System.out.println("XOCOUNTER "+ XOCounter);
//        }
        
        if(isGameEnds == true)
        { 
            if(isFirstPlayerTurn==false)
                x_score_count.setText(Integer.parseInt(x_score_count.getText()) +1 + "");
    
            else
                o_score_count.setText(Integer.parseInt(o_score_count.getText())  +1+ "");
            XOCounter = 0;
        }
        
         }
         
         private void isButtonPressed() {
             
             
             
             
        
         btn1.setOnAction(new EventHandler(){
          
            public void handle(Event event)

            {   
                mediaPlayer.stop();
                mediaPlayer.play();
                if(isGameEnds == false && btn1.getText().equals(""))
                {   
                     if(isFirstPlayerTurn==false) {
                         
                        btn1.setText("X");
                        btn1.setStyle(x_style_bt1_2_4_5);
                        message_label.setText("Now, O's turn");
                         toSave[0]="x-0";
                        checkIfGameEnds();
                        
                          isFirstPlayerTurn=true;
                          System.out.println("Saving"+ s);
                          XOCounter ++;
                     } 
                   
                    else
                    {
                        btn1.setText("o");
                        btn1.setStyle(o_style_bt1_2_4_5);
                        message_label.setText("Now, X's turn");
                        toSave[0]="o-0";
                        checkIfGameEnds();
                        isFirstPlayerTurn=false;
                        System.out.println("Saving"+ s);
                       XOCounter ++;
                        
                    }
                }
            }
            
            });
         
            
         btn2.setOnAction(new EventHandler(){
              
            public void handle(Event event)

            {  mediaPlayer.stop();
                mediaPlayer.play();
                
                
                if(isGameEnds == false && btn2.getText().equals(""))
                {   
                     if(isFirstPlayerTurn==false) {
                        btn2.setText("X");
                        btn2.setStyle(x_style_bt1_2_4_5);
                        message_label.setText("Now, O's turn");
                         toSave[1]="x-1";
                        checkIfGameEnds();
                      
                        isFirstPlayerTurn=true;
                        XOCounter ++;
                       System.out.println("Saving"+ s);
                     } 
                   
                    else
                    {
                        btn2.setText("o");
                        btn2.setStyle(o_style_bt1_2_4_5);
                        
                        message_label.setText("Now, X's turn");
                        toSave[1]="o-1";
                        checkIfGameEnds();
 
                        isFirstPlayerTurn=false;
                        System.out.println("Saving"+ s);
                       XOCounter ++;
                        
                    }

                }
            }
            
            });
                 
         btn3.setOnAction(new EventHandler(){
              
            public void handle(Event event)

            {  
                mediaPlayer.stop();
                mediaPlayer.play();
                
                if(isGameEnds == false && btn3.getText()=="")
                {   
                     if(isFirstPlayerTurn==false) {
                        btn3.setText("X");
                        btn3.setStyle(x_style_bt3_6);
                        message_label.setText("Now, O's turn");
                         toSave[2]="x-2";
                        checkIfGameEnds();
                       
                        isFirstPlayerTurn=true;
                        System.out.println("Saving"+ s);
                        XOCounter ++;
                     } 
                   
                    else
                    {
                        btn3.setText("o");
                        btn3.setStyle(o_style_bt3_6);
              
                        message_label.setText("Now, X's turn");
                        toSave[2]="o-2";
                        checkIfGameEnds();
                        isFirstPlayerTurn=false; 
                        System.out.println("Saving"+ s);
                        XOCounter ++;
                    }
                }
            }
            
            });
         
         btn4.setOnAction(new EventHandler(){
          
            public void handle(Event event)

            {  
                mediaPlayer.stop();
                mediaPlayer.play();
                
                if(isGameEnds == false && btn4.getText().equals(""))
                {   
                     if(isFirstPlayerTurn==false) {
                         
                        btn4.setText("X");
                        btn4.setStyle(x_style_bt1_2_4_5);
                        message_label.setText("Now, O's turn");
                        toSave[3]="x-3";
                        checkIfGameEnds();
                        
                          isFirstPlayerTurn=true;
                          System.out.println("Saving"+ s);
                        XOCounter ++;
                     } 
                   
                    else
                    {
                        btn4.setText("o");
                        btn4.setStyle(o_style_bt1_2_4_5);
                        message_label.setText("Now, X's turn");
                        toSave[3]="o-3";
                        checkIfGameEnds();
                        isFirstPlayerTurn=false;
                        System.out.println("Saving"+ s);
                        XOCounter ++;
                    }
                     
                }
            }
            
            });
         
            btn5.setOnAction(new EventHandler(){
              
            public void handle(Event event)

            {  
                mediaPlayer.stop();
                mediaPlayer.play();
                
                if(isGameEnds == false && btn5.getText().equals(""))
                {   
                     if(isFirstPlayerTurn==false) {
                        XOCounter ++;
                        btn5.setText("X");
                        btn5.setStyle(x_style_bt1_2_4_5);
                        message_label.setText("Now, O's turn");
                        toSave[4]="x-4";
                        checkIfGameEnds();
                        
                        isFirstPlayerTurn=true;
                        System.out.println("Saving"+ s);
                          System.out.println("XOCOUNTER "+ XOCounter);

                     } 
                   
                    else
                    {
                         XOCounter ++;
                        btn5.setText("o");
                        btn5.setStyle(o_style_bt1_2_4_5);
                      
                        message_label.setText("Now, X's turn");
                          toSave[4]="o-4";
                        checkIfGameEnds();
                        isFirstPlayerTurn=false;
                        System.out.println("Saving"+ s);
                       
                        
                    }

                }
            }
            
            });
                 
                          
         btn6.setOnAction(new EventHandler(){
              
            public void handle(Event event)

            {  
                mediaPlayer.stop();
                mediaPlayer.play();
                if(isGameEnds == false && btn6.getText()=="")
                {   
                     if(isFirstPlayerTurn==false) {
                        btn6.setText("X");
                        btn6.setStyle(x_style_bt3_6);
                        message_label.setText("Now, O's turn");
                         toSave[5]="x-5";
                        checkIfGameEnds();
                       
                        isFirstPlayerTurn=true;
                        XOCounter ++;
                     } 
                   
                    else
                    {
                        btn6.setText("o");
                        btn6.setStyle(o_style_bt3_6);
                       toSave[5]="o-5";
                        message_label.setText("Now, X's turn");
                        checkIfGameEnds();
                        isFirstPlayerTurn=false;  
                        XOCounter ++;
                    }
                }
            }
            
            });
         
                  
         btn7.setOnAction(new EventHandler(){
              
            public void handle(Event event)

            { 
                mediaPlayer.stop();
                mediaPlayer.play();
                
                if(isGameEnds == false && btn7.getText()=="")
                {   
                     if(isFirstPlayerTurn==false) {
                        btn7.setText("X");
                        btn7.setStyle(x_style_bt7_8);
                        message_label.setText("Now, O's turn");
                        toSave[6]="x-6";
                        checkIfGameEnds();
                        
                        isFirstPlayerTurn=true;
                        XOCounter ++;
                     } 
                   
                    else
                    {
                        btn7.setText("o");
                        btn7.setStyle(o_style_bt7_8);
                        toSave[6]="o-6";
                        message_label.setText("Now, X's turn");
                        checkIfGameEnds();
                        isFirstPlayerTurn=false; 
                        XOCounter ++;
                          
                    }
                }
            }
            
            });
                  
            btn8.setOnAction(new EventHandler(){
              
            public void handle(Event event)

            { 
                mediaPlayer.stop();
                mediaPlayer.play();
                
                
                if(isGameEnds == false && btn8.getText()=="")
                {   
                     if(isFirstPlayerTurn==false) {
                        btn8.setText("X");
                        btn8.setStyle(x_style_bt7_8);
                        message_label.setText("Now, O's turn");
                        toSave[7]="x-7";
                        checkIfGameEnds();
                        isFirstPlayerTurn=true;
                        XOCounter ++;
                     } 
                   
                    else
                    {
                        btn8.setText("o");
                        btn8.setStyle(o_style_bt7_8);
                       toSave[7]="o-7";
                        message_label.setText("Now, X's turn");
                        checkIfGameEnds();
                        
                        isFirstPlayerTurn=false;
                        XOCounter ++;
                    }
                }
            }
            
            });  
            
            btn9.setOnAction(new EventHandler(){
              
            public void handle(Event event)

            {  
                mediaPlayer.stop();
                mediaPlayer.play();
                
                if(isGameEnds == false && btn9.getText()=="")
                {   
                     if(isFirstPlayerTurn==false) {
                        btn9.setText("X");
                        btn9.setStyle(x_style_bt9);
                        message_label.setText("Now, O's turn");
                        toSave[8]="x-8";
                        checkIfGameEnds();
                        
                        isFirstPlayerTurn=true;
                        XOCounter ++;
                     } 
                   
                    else
                    {
                        btn9.setText("o");
                        btn9.setStyle(o_style_bt9);
                       toSave[8]="o-8";
                        message_label.setText("Now, X's turn");
                        checkIfGameEnds();
                       
                        isFirstPlayerTurn=false; 
                        XOCounter ++;
                       
                    }
                }
            }
            
            }); 
}
         
}