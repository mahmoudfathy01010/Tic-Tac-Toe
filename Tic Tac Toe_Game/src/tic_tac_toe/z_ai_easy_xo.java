
package tic_tac_toe;

import java.util.ArrayList;
import java.util.Random;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

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


public class z_ai_easy_xo extends xo_bordBase{
    
    // transition method :
      z_ai_easy_win zw;
      z_ai_easy_lose zl ;
      z_ai_easy_tie zt;
      //mediaPlayer.stop();
    
     public  void move_to_win () 
      {

        zw=new z_ai_easy_win();
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
        
       zw.setOpacity(0);
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(zw);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
      
       Scene s=this.getScene();
      s.setRoot(zw);
        

      
      }
    


    
      public  void move_to_lose () 
      {

        zl=new z_ai_easy_lose();
         mediaPlayer1_b.stop();
      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_l();
          }
      });
      
      fd.play();
      
      }
    
     private void load_l()
      {
          
          
          System.out.println("hello from constructor");
        
       zl.setOpacity(0);
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(zl);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
        
       Scene s=this.getScene();
      s.setRoot(zl);
      
     
      
      }
    


    
    
     
     public  void move_to_tie () 
      {

        zt=new z_ai_easy_tie();
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
    

    
    
    
    
    
    
    
    
    
    
    
    
    
     //static int XWins = 0;
    //static int OWins = 0;
     ArrayList<Integer> available_Positions = new ArrayList<>();

    int turn = 0;

 ///test
    ArrayList<Boolean> b= new ArrayList<>();
    Random r = new Random();
    public static String [] toSave={null,null,null,null,null,null,null,null,null};

    int arrayCounter = 0;
    

    public z_ai_easy_xo() {
        

        for(int i =0;i<toSave.length;i++){
         toSave[i]=null;
         
         }
        
        
        
        for(String s : z_ai_easy_xo.toSave){

System.out.print("+++++22222++++++");
    System.out.println(s);
}
        //intialize the game 
         
          
          //Relesing events 
        btn1.setOnMouseReleased(e -> {

            mouseReleased(btn1, 1);

        });
        btn2.setOnMouseReleased(e -> {

            mouseReleased(btn2, 2);

        });
        btn3.setOnMouseReleased(e -> {

            mouseReleased(btn3, 3);

        });
        btn4.setOnMouseReleased(e -> {

            mouseReleased(btn4, 4);

        });
        btn5.setOnMouseReleased(e -> {

            mouseReleased(btn5, 5);

        });
        btn6.setOnMouseReleased(e -> {

            mouseReleased(btn6, 6);

        });
        btn7.setOnMouseReleased(e -> {

            mouseReleased(btn7, 7);

        });
        btn8.setOnMouseReleased(e -> {

            mouseReleased(btn8, 8);

        });
        btn9.setOnMouseReleased(e -> {

            mouseReleased(btn9, 9);

        });
         intialization();

    }

        //enter your code here 
        
    
    
    
    
    public final void intialization() {
        available_Positions.clear();

        for (int i = 0; i < 9; i++) {
            available_Positions.add(i + 1);
            turn = 0;

        }
  btn1.setText("");
                
                btn2.setText("");
               
                btn3.setText("");
               
                btn4.setText("");
             
                btn5.setText("");
            
                btn6.setText("");
               
                btn7.setText("");
              
                btn8.setText("");
              
                btn9.setText("");
              message_label.setText("Try,To Win!");

arrayCounter=0;


    }
    
    //release Events
    
    
     public void mouseReleased(Button btn, int n) {
        if (turn == 0) {

            for (int i = 0; i < available_Positions.size(); i++) {

                if (available_Positions.get(i) == n) {

                    available_Positions.remove(new Integer(n));

if(n==1||n==2||n==4||n==5) {btn.setStyle(x_style_bt1_2_4_5);}

if(n==3||n==6){btn.setStyle(x_style_bt3_6);}
if(n==7||n==8){btn.setStyle(x_style_bt7_8);}

if(n==9){btn9.setStyle(x_style_bt9);}
                    
                   


                    btn.setText("x");
                 toSave[arrayCounter]="x-"+(n-1);
                 arrayCounter++;
                    check_Winner_No(check_Winner_X(), check_Winner_O());

                    computer(available_Positions);

                }

            }

        }

    }
     
     public void computer(ArrayList<Integer> modified_List) {
        int comp_move = -1;

        if (modified_List.size() > 0) {

            comp_move = getRandom(modified_List);

            System.out.println("cmove " + comp_move);

        }
        if (turn == 0) {
            switch (comp_move) {
                case 1:
                    btn1.setStyle(o_style_bt1_2_4_5);
                    btn1.setText("o");
                    available_Positions.remove(new Integer(1));
               toSave[arrayCounter]="o-"+(0);
                 arrayCounter++;
                    check_Winner_No(check_Winner_X(), check_Winner_O());

                    break;
                case 2:
                    btn2.setStyle(o_style_bt1_2_4_5);
                    btn2.setText("o");
                    available_Positions.remove(new Integer(2));
                     toSave[arrayCounter]="o-"+(1);
                 arrayCounter++;

                    check_Winner_No(check_Winner_X(), check_Winner_O());

                    break;
                case 3:
                    btn3.setStyle(o_style_bt3_6);
                    btn3.setText("o");
                    available_Positions.remove(new Integer(3));
                     toSave[arrayCounter]="o-"+(2);
                 arrayCounter++;

                    check_Winner_No(check_Winner_X(), check_Winner_O());

                    break;
                case 4:
                    btn4.setStyle(o_style_bt1_2_4_5);
                    btn4.setText("o");
                    available_Positions.remove(new Integer(4));
 toSave[arrayCounter]="o-"+(3);
                 arrayCounter++;
                    check_Winner_No(check_Winner_X(), check_Winner_O());

                    break;
                case 5:
                    btn5.setStyle(o_style_bt1_2_4_5);
                    btn5.setText("o");
                    available_Positions.remove(new Integer(5));
 toSave[arrayCounter]="o-"+(4);
                 arrayCounter++;
                    check_Winner_No(check_Winner_X(), check_Winner_O());

                    break;
                case 6:
                    btn6.setStyle(o_style_bt3_6);
                    btn6.setText("o");
                    available_Positions.remove(new Integer(6));
 toSave[arrayCounter]="o-"+(5);
                 arrayCounter++;
                    check_Winner_No(check_Winner_X(), check_Winner_O());

                    break;
                case 7:
                    btn7.setStyle(o_style_bt7_8);
                    btn7.setText("o");
                    available_Positions.remove(new Integer(7));
 toSave[arrayCounter]="o-"+(6);
                 arrayCounter++;
                    check_Winner_No(check_Winner_X(), check_Winner_O());

                    break;
                case 8:
                    btn8.setStyle(o_style_bt7_8);
                    btn8.setText("o");
                    available_Positions.remove(new Integer(8));
                     toSave[arrayCounter]="o-"+(7);
                 arrayCounter++;
                    check_Winner_No(check_Winner_X(), check_Winner_O());

                    break;
                case 9:
                    ///???????
                    btn9.setStyle(o_style_bt9);
                    btn9.setText("o");
                    available_Positions.remove(new Integer(9));
                    toSave[arrayCounter]="o-"+(8);
                 arrayCounter++;
                    check_Winner_No(check_Winner_X(), check_Winner_O());

                    break;
            }
        }

    }

    public int check_Winner_X() {

        boolean b = btn1.getText().equals("x") && btn2.getText().equals("x") && btn3.getText().equals("x");
         if (b) {

             btn1.setStyle(x_style_suc);  btn2.setStyle(x_style_suc);  btn3.setStyle(x_style_suc);
             turn = 1;
            SetCounters(1);
            getSaved();
           
             move_to_win () ;
            
            return 1;
             
            
        }

        boolean b2 = btn4.getText().equals("x") && btn5.getText().equals("x") && btn6.getText().equals("x");
        if (b2) {
             turn = 1;
            SetCounters(1);
            
            getSaved();
            btn4.setStyle(x_style_suc);  btn5.setStyle(x_style_suc);  btn6.setStyle(x_style_suc);
           
             move_to_win () ;
            
            return 1;
            
        }

        boolean b3 = btn7.getText().equals("x") && btn8.getText().equals("x") && btn9.getText().equals("x");
        if (b3) {
             turn = 1;
            SetCounters(1);
            getSaved();
            btn7.setStyle(x_style_suc);  btn8.setStyle(x_style_suc);  btn9.setStyle(x_style_suc);
            
            move_to_win () ;
            return 1;
            
        }

        boolean b4 = btn1.getText().equals("x") && btn4.getText().equals("x") && btn7.getText().equals("x");
        if (b4) {
             turn = 1;
            SetCounters(1);
            getSaved();
            btn1.setStyle(x_style_suc);  btn4.setStyle(x_style_suc);  btn7.setStyle(x_style_suc);
            
            move_to_win () ;
            return 1;
            
        }
        boolean b5 = btn2.getText().equals("x") && btn5.getText().equals("x") && btn8.getText().equals("x");
        if (b5) {
             turn = 1;
            SetCounters(1);
            getSaved();
            btn2.setStyle(x_style_suc);  btn5.setStyle(x_style_suc);  btn8.setStyle(x_style_suc);
            
             move_to_win () ;
            return 1;
            
        }

        boolean b6 = btn3.getText().equals("x") && btn6.getText().equals("x") && btn9.getText().equals("x");
        if (b6) {
             turn = 1;
            SetCounters(1);
            getSaved();
            btn3.setStyle(x_style_suc);  btn6.setStyle(x_style_suc);  btn9.setStyle(x_style_suc);
            
            
             move_to_win () ;
            return 1;
            
        }

        boolean b7 = btn1.getText().equals("x") && btn5.getText().equals("x") && btn9.getText().equals("x");
        if (b7) {
             turn = 1;
            SetCounters(1);
            getSaved();
            btn1.setStyle(x_style_suc);  btn5.setStyle(x_style_suc);  btn9.setStyle(x_style_suc);
            
             move_to_win () ;
            return 1;
            
        }
        boolean b8 = btn3.getText().equals("x") && btn5.getText().equals("x") && btn7.getText().equals("x");
        if (b8) {
             turn = 1;
            SetCounters(1);
            getSaved();
            btn3.setStyle(x_style_suc);  btn5.setStyle(x_style_suc);  btn7.setStyle(x_style_suc);
            
            move_to_win () ;
            return 1;
            
        }
        
        

        
        return 0;

    }

    public int check_Winner_O() {

        boolean b = btn1.getText().equals("o") && btn2.getText().equals("o") && btn3.getText().equals("o");
        if (b) {
             turn = 1;
            SetCounters(2);
            getSaved();

            btn1.setStyle(o_style_suc);  btn2.setStyle(o_style_suc);  btn3.setStyle(o_style_suc);
            
            move_to_lose () ;
            return 2;
            
        }

        boolean b2 = btn4.getText().equals("o") && btn5.getText().equals("o") && btn6.getText().equals("o");
        if (b2) {
             turn = 1;
            SetCounters(2);
            getSaved();
            btn4.setStyle(o_style_suc);  btn5.setStyle(o_style_suc);  btn6.setStyle(o_style_suc);
            
           move_to_lose () ;
            return 2;
            
        }

        boolean b3 = btn7.getText().equals("o") && btn8.getText().equals("o") && btn9.getText().equals("o");
        if (b3) {
             turn = 1;
            SetCounters(2);
            getSaved();
            btn7.setStyle(o_style_suc);  btn8.setStyle(o_style_suc);  btn9.setStyle(o_style_suc);
            
          move_to_lose () ;
            return 2;
            
        }

        boolean b4 = btn1.getText().equals("o") && btn4.getText().equals("o") && btn7.getText().equals("o");
        if (b4) {
             turn = 1;
            SetCounters(2);
            getSaved();
            btn1.setStyle(o_style_suc);  btn4.setStyle(o_style_suc);  btn7.setStyle(o_style_suc);
            
           move_to_lose () ;
            return 2;
            
        }
        boolean b5 = btn2.getText().equals("o") && btn5.getText().equals("o") && btn8.getText().equals("o");
        if (b5) {
             turn = 1;
            SetCounters(2);
            getSaved();
            btn2.setStyle(o_style_suc);  btn5.setStyle(o_style_suc);  btn8.setStyle(o_style_suc);
            
            move_to_lose () ;
            return 2;
            
        }

        boolean b6 = btn3.getText().equals("o") && btn6.getText().equals("o") && btn9.getText().equals("o");
        if (b6) {
             turn = 1;
            SetCounters(2);
            getSaved();
            btn3.setStyle(o_style_suc);  btn6.setStyle(o_style_suc);  btn9.setStyle(o_style_suc);
            
            move_to_lose () ;
            
            return 2;
            
        }

        boolean b7 = btn1.getText().equals("o") && btn5.getText().equals("o") && btn9.getText().equals("o");
        if (b7) {
             turn = 1;
            SetCounters(2);
            getSaved();
            btn1.setStyle(o_style_suc);  btn5.setStyle(o_style_suc);  btn9.setStyle(o_style_suc);
            
           move_to_lose () ;
            return 2;
            
        }
        boolean b8 = btn3.getText().equals("o") && btn5.getText().equals("o") && btn7.getText().equals("o");
        if (b8) {
             turn = 1;
            SetCounters(2);
            getSaved();
            btn3.setStyle(o_style_suc);  btn5.setStyle(o_style_suc);  btn7.setStyle(o_style_suc);
            
            move_to_lose () ;
            return 2;
            
        }

       
        return 0;

    }

    public int check_Winner_No(int o, int x) {

        if (o == 0 && x == 0 && available_Positions.size() == 0) {

            SetCounters(3);
            getSaved();
            
            
            move_to_tie () ;
            return 3;

        }
     
        return 0;

    }

    public int getRandom(ArrayList<Integer> modified_List) {

        int check = r.nextInt((9 - 1) + 1) + 1;
        System.out.println("from rand" + check);

        if (modified_List.contains(new Integer(check))) {

            return check;

        } else {

            computer(modified_List);

        }

        return 0;
    }
    
    public  void getSaved(){
    
        for (String s : toSave) {
            System.out.println(s);
            
        }
    
    
    }

//if we need it
    
    
    public void SetCounters(int Num) {
        switch (Num) {
            case 1:
                youWin++;
                break;
            case 2:
                computerWins++;
                break;
            case 3:
              
                break;
            case 0:
                youWin = 0;
                computerWins = 0;
                
                break;
        }
        x_score_count.setText(youWin +"");
        o_score_count.setText(computerWins + "");
       
    }
    
    
       
    
}
