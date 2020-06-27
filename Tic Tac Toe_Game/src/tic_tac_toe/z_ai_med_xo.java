
package tic_tac_toe;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;
import static tic_tac_toe.z_ai_easy_xo.toSave;


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








public class z_ai_med_xo  extends xo_bordBase{
    
      /////////////////////////////
    
     z_ai_med_win zw;
      z_ai_med_lose zl ;
      z_ai_med_tie zt;
 
    
     public  void move_to_win () 
      {

        zw=new z_ai_med_win();
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
      
      Scene s= this.getScene();
      s.setRoot(zw);
        

      
      }
    


    
      public  void move_to_lose () 
      {

        zl=new z_ai_med_lose();
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
      
       Scene s= this.getScene();
      s.setRoot(zl);
        

      
      }
    


    
    
     
     public  void move_to_tie () 
      {
          
          System.out.println("here is tieee");

        zt=new z_ai_med_tie();
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
        
     Scene s= this.getScene();
      s.setRoot(zt);
      
      }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    String bestDirection = "";
    int turn = 1;
//   static int youWin = 0;
//   static int computerWins = 0;

    //***********Array to save Data************
    public static String[] toSave = {null, null, null, null, null, null, null, null, null};

    int arrayCounter = 0;

    Button[] cells;


    public z_ai_med_xo() {
//        System.out.println("computerrr" + computerWins);
//        System.out.println("winnn" + youWin);
        
               
for(int i =0;i<toSave.length;i++){
         toSave[i]=null;
         
         }
        
        
        
        for(String s : z_ai_med_xo.toSave){

System.out.print("+++++22222++++++");
    System.out.println(s);
}

intialization();

        
        //Relesing events 
        btn1.setOnMouseReleased(e -> {

            mouseReleased(btn1,0);

        });
        btn2.setOnMouseReleased(e -> {

            mouseReleased(btn2,1);

        });
        btn3.setOnMouseReleased(e -> {

            mouseReleased(btn3,2);

        });
        btn4.setOnMouseReleased(e -> {

            mouseReleased(btn4,3);

        });
        btn5.setOnMouseReleased(e -> {

            mouseReleased(btn5,4);

        });
        btn6.setOnMouseReleased(e -> {

            mouseReleased(btn6,5);

        });
        btn7.setOnMouseReleased(e -> {

            mouseReleased(btn7,6);

        });
        btn8.setOnMouseReleased(e -> {

            mouseReleased(btn8,7);

        });
        btn9.setOnMouseReleased(e -> {

            mouseReleased(btn9,8);

        });

    }
        //enter your code here 
    
    
    
  //intialization  
    public void intialization() {
        cells = new Button[]{btn1, btn2, btn3,
            btn4, btn5, btn6,
            btn7, btn8, btn9};
        
        message_label.setText("Try,To Win!");
        for (Button cell : cells) {
            cell.setText("");
arrayCounter=0;
            cell.setDisable(false);
            turn = 1;
        }

    } 
    
     
 public void mouseReleased(Button btn,int n) {
        if (turn == 1) {
            if (btn.getText().equalsIgnoreCase("")) {
                btn.setText("x");
                if(n==0||n==1||n==3||n==4)
                {btn.setStyle(x_style_bt1_2_4_5);}
                if(n==2||n==5){
                    btn.setStyle(x_style_bt3_6);
                
                }
                
                if(n==6||n==7){
                btn.setStyle(x_style_bt7_8);
                
                }
                if (n==8) {
                    btn.setStyle(x_style_bt9);
                    
                }
                
                toSave[arrayCounter]="x-"+n;
                
                arrayCounter++;
                
                if (!checkImmediatewin()) {
                    if (!checkDangerous()) {

                        checkers();
                    }
                }

                System.out.println(bestDirection);

                check_Winner_No(check_Winner_X(), check_Winner_O());

                computerMove(bestDirection);
            }
        }
    }
 
 
 //check to try finding the best play
 public boolean checkDangerous() {
        //int max = -1;
        int fRow = 0;
        int sRow = 0;
        int thRow = 0;
        int fCol = 0;
        int sCol = 0;
        int thCol = 0;
        int crossR = 0;
        int crossL = 0;
        int nullIndecator = 0;

        for (int i = 0; i < 3; i++) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("x")) {
                fRow++;
            }

        }

        if ((fRow == 2) && (nullIndecator > 0)) {

            bestDirection = "fRow";
            //max = fRow;
            return true;
        }

        nullIndecator = 0;
        //...2....
        for (int i = 3; i < 6; i++) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("x")) {
                sRow++;
            }

        }

        if ((sRow == 2) && (nullIndecator > 0)) {

            bestDirection = "sRow";
            //max = sRow;
            return true;
        }

        nullIndecator = 0;

//..3....
        for (int i = 6; i < 9; i++) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("x")) {
                thRow++;
            }

        }

        if ((thRow == 2) && (nullIndecator > 0)) {

            bestDirection = "thRow";
            // max = thRow;
            return true;
        }

        nullIndecator = 0;

//.....4.....
        for (int i = 0; i < 9; i = i + 4) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("x")) {
                crossR++;
            }

        }

        if ((crossR == 2) && (nullIndecator > 0)) {

            bestDirection = "crossR";
            //max = crossR;
            return true;
        }

        nullIndecator = 0;
//...5...

        for (int i = 2; i < 7; i = i + 2) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("x")) {
                crossL++;
            }

        }

        if ((crossL == 2) && (nullIndecator > 0)) {

            bestDirection = "crossL";
            //max = crossL;
            return true;
        }

        nullIndecator = 0;
        //......6..........
        for (int i = 0; i < 7; i = i + 3) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("x")) {
                fCol++;
            }

        }

        if ((fCol == 2) && (nullIndecator > 0)) {

            bestDirection = "fCol";
            //max = fCol;
            return true;
        }

        nullIndecator = 0;
        //...7..
        for (int i = 1; i < 8; i = i + 3) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("x")) {
                sCol++;
            }

        }

        if ((sCol == 2) && (nullIndecator > 0)) {

            bestDirection = "sCol";
            //max = sCol;
            return true;
        }

        nullIndecator = 0;
        //....8...
        for (int i = 2; i < 9; i = i + 3) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("x")) {
                thCol++;
            }

        }

        if ((thCol == 2) && (nullIndecator > 0)) {

            bestDirection = "thCol";
            // max = thCol;
            return true;
        }

        nullIndecator = 0;

        return false;
    }

 
 public void checkers() {
        int max = -1;
        int fRow = 0;
        int sRow = 0;
        int thRow = 0;
        int fCol = 0;
        int sCol = 0;
        int thCol = 0;
        int crossR = 0;
        int crossL = 0;
        int nullIndecator = 0;

        for (int i = 0; i < 3; i++) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                fRow++;
            }

        }

        if ((fRow > max) && (nullIndecator > 0)) {

            bestDirection = "fRow";
            max = fRow;
        }

        nullIndecator = 0;
        //...2....
        for (int i = 3; i < 6; i++) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                sRow++;
            }

        }

        if ((sRow > max) && (nullIndecator > 0)) {

            bestDirection = "sRow";
            max = sRow;
        }

        nullIndecator = 0;

//..3....
        for (int i = 6; i < 9; i++) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                thRow++;
            }

        }

        if ((thRow > max) && (nullIndecator > 0)) {

            bestDirection = "thRow";
            max = thRow;
        }

        nullIndecator = 0;

//.....4.....
        for (int i = 0; i < 9; i = i + 4) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                crossR++;
            }

        }

        if ((crossR > max) && (nullIndecator > 0)) {

            bestDirection = "crossR";
            max = crossR;
        }

        nullIndecator = 0;
//...5...

        for (int i = 2; i < 7; i = i + 2) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                crossL++;
            }

        }

        if ((crossL > max) && (nullIndecator > 0)) {

            bestDirection = "crossL";
            max = crossL;
        }

        nullIndecator = 0;
        //......6..........
        for (int i = 0; i < 7; i = i + 3) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                fCol++;
            }

        }

        if ((fCol > max) && (nullIndecator > 0)) {

            bestDirection = "fCol";
            max = fCol;
        }

        nullIndecator = 0;
        //...7..
        for (int i = 1; i < 8; i = i + 3) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                sCol++;
            }

        }

        if ((sCol > max) && (nullIndecator > 0)) {

            bestDirection = "sCol";
            max = sCol;
        }

        nullIndecator = 0;
        //....8...
        for (int i = 2; i < 9; i = i + 3) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                thCol++;
            }

        }

        if ((thCol > max) && (nullIndecator > 0)) {

            bestDirection = "thCol";
            max = thCol;
        }

        nullIndecator = 0;

    }

 
 public void computerMove(String dir) {

        if (turn == 1) {

            switch (dir) {

                case "fRow":

                    for (int i = 0; i < 3; i++) {
                        if (cells[i].getText().equalsIgnoreCase("")) {
                            cells[i].setText("o");
                            if(i==0||i==1) {cells[i].setStyle(o_style_bt1_2_4_5);}
                            else{cells[i].setStyle(o_style_bt3_6);}
                            
                            toSave[arrayCounter]="o-"+i;
                            arrayCounter++;
                            check_Winner_No(check_Winner_X(), check_Winner_O());

                            break;
                        }
                    }
                    break;
                case "sRow":
                    for (int i = 3; i < 6; i++) {
                        if (cells[i].getText().equalsIgnoreCase("")) {
                            cells[i].setText("o");
                             if(i==3||i==4) {cells[i].setStyle(o_style_bt1_2_4_5);}
                            else{cells[i].setStyle(o_style_bt3_6);}
                            
                            toSave[arrayCounter]="o-"+i;
                            arrayCounter++;
                            check_Winner_No(check_Winner_X(), check_Winner_O());

                            break;
                        }
                    }

                    break;
                case "thRow":
                    for (int i = 6; i < 9; i++) {
                        if (cells[i].getText().equalsIgnoreCase("")) {
                            cells[i].setText("o");
                            
                            if(i==6||i==7) {cells[i].setStyle(o_style_bt7_8);}
                            else{cells[i].setStyle(o_style_bt9);}
                            
                            toSave[arrayCounter]="o-"+i;
                            arrayCounter++;
                            check_Winner_No(check_Winner_X(), check_Winner_O());

                            break;
                        }

                    }
                    break;

                case "fCol":
                    for (int i = 0; i < 7; i = i + 3) {
                        if (cells[i].getText().equalsIgnoreCase("")) {
                            cells[i].setText("o");
                            //1 4  7
                            
                            if(i==0||i==3){
                            cells[i].setStyle(o_style_bt1_2_4_5);
                            }
                            else{cells[i].setStyle(o_style_bt7_8);}
                            
                            
                            toSave[arrayCounter]="o-"+i;
                            arrayCounter++;
                            check_Winner_No(check_Winner_X(), check_Winner_O());

                            break;

                        }
                    }

                    break;

                case "sCol":

                    for (int i = 1; i < 8; i = i + 3) {
                        if (cells[i].getText().equalsIgnoreCase("")) {

                            cells[i].setText("o");
                            //2 5 8
                            
                            
                            if(i==1||i==4){
                            
                            cells[i].setStyle(o_style_bt1_2_4_5);
                            }
                            else{ cells[i].setStyle(o_style_bt7_8);}
                            
                            
                            
                            
                            toSave[arrayCounter]="o-"+i;
                            arrayCounter++;
                            check_Winner_No(check_Winner_X(), check_Winner_O());

                            break;

                        }
                    }

                    break;
                case "thCol":

                    for (int i = 2; i < 9; i = i + 3) {
                        if (cells[i].getText().equalsIgnoreCase("")) {
                            cells[i].setText("o");
                            //3  6 9
                            
                            if(i==2||i==5){ cells[i].setStyle(o_style_bt3_6);}
                            else{cells[i].setStyle(o_style_bt9);}
                            
                            
                            toSave[arrayCounter]="o-"+i;
                            arrayCounter++;
                            check_Winner_No(check_Winner_X(), check_Winner_O());

                            break;

                        }
                    }

                    break;

                case "crossR":
                    for (int i = 0; i < 9; i = i + 4) {
                        if (cells[i].getText().equalsIgnoreCase("")) {
                            cells[i].setText("o");
                            //1 5 9
                            
                             if(i==0||i==4){ cells[i].setStyle(o_style_bt1_2_4_5);}
                            else{cells[i].setStyle(o_style_bt9);}
                            
                            
                            toSave[arrayCounter]="o-"+i;
                            arrayCounter++;
                            check_Winner_No(check_Winner_X(), check_Winner_O());

                            break;
                        }
                    }

                    break;
                case "crossL":

                    for (int i = 2; i < 7; i = i + 2) {
                        if (cells[i].getText().equalsIgnoreCase("")) {
                            cells[i].setText("o");
                            // 3 5 7
                            
                             if(i==2){ cells[i].setStyle(o_style_bt3_6);}
                           
                                 if(i==4){cells[i].setStyle(o_style_bt1_2_4_5);}
                                 
                                 if(i==6){cells[i].setStyle(o_style_bt7_8);}
                                 
                            
                            
                            toSave[arrayCounter]="o-"+i;
                            arrayCounter++;
                            check_Winner_No(check_Winner_X(), check_Winner_O());

                            break;
                        }
                    }

                    break;

            }

        }
    }

 
 
 
 //try harder 
    public boolean checkImmediatewin() {
        //int max = -1;
        int fRow = 0;
        int sRow = 0;
        int thRow = 0;
        int fCol = 0;
        int sCol = 0;
        int thCol = 0;
        int crossR = 0;
        int crossL = 0;
        int nullIndecator = 0;

        for (int i = 0; i < 3; i++) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                fRow++;
            }

        }

        if ((fRow == 2) && (nullIndecator > 0)) {

            bestDirection = "fRow";
            //max = fRow;
            return true;
        }

        nullIndecator = 0;
        //...2....
        for (int i = 3; i < 6; i++) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                sRow++;
            }

        }

        if ((sRow == 2) && (nullIndecator > 0)) {

            bestDirection = "sRow";
            //max = sRow;
            return true;
        }

        nullIndecator = 0;

//..3....
        for (int i = 6; i < 9; i++) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                thRow++;
            }

        }

        if ((thRow == 2) && (nullIndecator > 0)) {

            bestDirection = "thRow";
            // max = thRow;
            return true;
        }

        nullIndecator = 0;

//.....4.....
        for (int i = 0; i < 9; i = i + 4) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                crossR++;
            }

        }

        if ((crossR == 2) && (nullIndecator > 0)) {

            bestDirection = "crossR";
            //max = crossR;
            return true;
        }

        nullIndecator = 0;
//...5...

        for (int i = 2; i < 7; i = i + 2) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                crossL++;
            }

        }

        if ((crossL == 2) && (nullIndecator > 0)) {

            bestDirection = "crossL";
            //max = crossL;
            return true;
        }

        nullIndecator = 0;
        //......6..........
        for (int i = 0; i < 7; i = i + 3) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                fCol++;
            }

        }

        if ((fCol == 2) && (nullIndecator > 0)) {

            bestDirection = "fCol";
            //max = fCol;
            return true;
        }

        nullIndecator = 0;
        //...7..
        for (int i = 1; i < 8; i = i + 3) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                sCol++;
            }

        }

        if ((sCol == 2) && (nullIndecator > 0)) {

            bestDirection = "sCol";
            //max = sCol;
            return true;
        }

        nullIndecator = 0;
        //....8...
        for (int i = 2; i < 9; i = i + 3) {
            if (cells[i].getText().equalsIgnoreCase("")) {
                nullIndecator++;
            }

            if (cells[i].getText().equalsIgnoreCase("o")) {
                thCol++;
            }

        }

        if ((thCol == 2) && (nullIndecator > 0)) {

            bestDirection = "thCol";
            // max = thCol;
            return true;
        }

        nullIndecator = 0;

        return false;
    }
//>>>>>>>>>Winning Conditions >>>>>>
     public int check_Winner_X() {

      boolean b = btn1.getText().equals("x") && btn2.getText().equals("x") && btn3.getText().equals("x");
         if (b) {

             btn1.setStyle(x_style_suc);  btn2.setStyle(x_style_suc);  btn3.setStyle(x_style_suc);
             turn = 0;
            SetCounters(1);
            
            getSaved();
            
            move_to_win();
            
            return 1;
            
        }

        boolean b2 = btn4.getText().equals("x") && btn5.getText().equals("x") && btn6.getText().equals("x");
        if (b2) {
             turn = 0;
            SetCounters(1);
            //x WINNING
            
            getSaved();
            btn4.setStyle(x_style_suc);  btn5.setStyle(x_style_suc);  btn6.setStyle(x_style_suc);
            
            
            move_to_win();
            return 1;
            
        }

        boolean b3 = btn7.getText().equals("x") && btn8.getText().equals("x") && btn9.getText().equals("x");
        if (b3) {
             turn = 0;
            SetCounters(1);
            
            //x WINNING
            
            getSaved();
            btn7.setStyle(x_style_suc);  btn8.setStyle(x_style_suc);  btn9.setStyle(x_style_suc);
            
                move_to_win();
            return 1;
            
        }

        boolean b4 = btn1.getText().equals("x") && btn4.getText().equals("x") && btn7.getText().equals("x");
        if (b4) {
             turn = 0;
            SetCounters(1);
            //x WINNING
            
            getSaved();
            btn1.setStyle(x_style_suc);  btn4.setStyle(x_style_suc);  btn7.setStyle(x_style_suc);
            
                move_to_win();
            return 1;
            
        }
        boolean b5 = btn2.getText().equals("x") && btn5.getText().equals("x") && btn8.getText().equals("x");
        if (b5) {
             turn = 0;
            SetCounters(1);
            
            //x WINNING
            
            getSaved();
            btn2.setStyle(x_style_suc);  btn5.setStyle(x_style_suc);  btn8.setStyle(x_style_suc);
            
                move_to_win();
            return 1;
            
        }

        boolean b6 = btn3.getText().equals("x") && btn6.getText().equals("x") && btn9.getText().equals("x");
        if (b6) {
             turn = 0;
            SetCounters(1);
            
            //x WINNING
            
            getSaved();
            btn3.setStyle(x_style_suc);  btn6.setStyle(x_style_suc);  btn9.setStyle(x_style_suc);
            
                move_to_win();
            return 1;
            
        }

        boolean b7 = btn1.getText().equals("x") && btn5.getText().equals("x") && btn9.getText().equals("x");
        if (b7) {
             turn = 0;
            SetCounters(1);
            
            //x WINNING
            
            getSaved();
            btn1.setStyle(x_style_suc);  btn5.setStyle(x_style_suc);  btn9.setStyle(x_style_suc);
            
                move_to_win();
            return 1;
            
        }
        boolean b8 = btn3.getText().equals("x") && btn5.getText().equals("x") && btn7.getText().equals("x");
        if (b8) {
             turn = 0;
            SetCounters(1);
            
            //x WINNING
            
            getSaved();
            btn3.setStyle(x_style_suc);  btn5.setStyle(x_style_suc);  btn7.setStyle(x_style_suc);
            
                move_to_win();
            return 1;
            
        }
        
        

        
        return 0;


    }

    public int check_Winner_O() {

      boolean b = btn1.getText().equals("o") && btn2.getText().equals("o") && btn3.getText().equals("o");
        if (b) {
             turn = 0;
            SetCounters(2);
            
            //O WINNING
            getSaved();

            btn1.setStyle(o_style_suc);  btn2.setStyle(o_style_suc);  btn3.setStyle(o_style_suc);
            
            move_to_lose();
            return 2;
            
        }

        boolean b2 = btn4.getText().equals("o") && btn5.getText().equals("o") && btn6.getText().equals("o");
        if (b2) {
             turn = 0;
            SetCounters(2);
            //O WINNING
            getSaved();
            btn4.setStyle(o_style_suc);  btn5.setStyle(o_style_suc);  btn6.setStyle(o_style_suc);
            
             move_to_lose();
            return 2;
            
        }

        boolean b3 = btn7.getText().equals("o") && btn8.getText().equals("o") && btn9.getText().equals("o");
        if (b3) {
             turn = 0;
            SetCounters(2);
            //O WINNING
            getSaved();
            btn7.setStyle(o_style_suc);  btn8.setStyle(o_style_suc);  btn9.setStyle(o_style_suc);
            
             move_to_lose();
            return 2;
            
        }

        boolean b4 = btn1.getText().equals("o") && btn4.getText().equals("o") && btn7.getText().equals("o");
        if (b4) {
             turn = 0;
            SetCounters(2);
            //O WINNING
            getSaved();
            btn1.setStyle(o_style_suc);  btn4.setStyle(o_style_suc);  btn7.setStyle(o_style_suc);
            
             move_to_lose();
            return 2;
            
        }
        boolean b5 = btn2.getText().equals("o") && btn5.getText().equals("o") && btn8.getText().equals("o");
        if (b5) {
             turn = 0;
            SetCounters(2);
            //O WINNING
            getSaved();
            btn2.setStyle(o_style_suc);  btn5.setStyle(o_style_suc);  btn8.setStyle(o_style_suc);
            
             move_to_lose();
            return 2;
            
        }

        boolean b6 = btn3.getText().equals("o") && btn6.getText().equals("o") && btn9.getText().equals("o");
        if (b6) {
             turn = 0;
            SetCounters(2);
            //O WINNING
            getSaved();
            btn3.setStyle(o_style_suc);  btn6.setStyle(o_style_suc);  btn9.setStyle(o_style_suc);
            
             move_to_lose();
            return 2;
            
        }

        boolean b7 = btn1.getText().equals("o") && btn5.getText().equals("o") && btn9.getText().equals("o");
        if (b7) {
             turn = 0;
            SetCounters(2);
            //O WINNING
            getSaved();
            btn1.setStyle(o_style_suc);  btn5.setStyle(o_style_suc);  btn9.setStyle(o_style_suc);
            
             move_to_lose();
            return 2;
            
        }
        boolean b8 = btn3.getText().equals("o") && btn5.getText().equals("o") && btn7.getText().equals("o");
        if (b8) {
             turn = 0;
            SetCounters(2);
            
            //O WINNING
            getSaved();
            btn3.setStyle(o_style_suc);  btn5.setStyle(o_style_suc);  btn7.setStyle(o_style_suc);
             move_to_lose();
            return 2;
            
        }

       
        return 0;

    }

    public int check_Winner_No(int o, int x) {

        int c = 0;
        for (Button cell : cells) {
            if (cell.getText().equals("")) {
                c++;

            }

        }

        if (o == 0 && x == 0 && c == 0) {

            //if game end for tie
            turn = 0;
            
            move_to_tie();
            
            System.out.println("tie gameeeee");
            return 3;

        }

        return 0;

    }

public  void getSaved(){
    
        for (String s : toSave) {
            System.out.println(s);
            
        }
    
    
    }

//if we need it
    
    
    public  void SetCounters(int Num) {
        switch (Num) {
            case 1:
                youWin++;
                break;
            case 2:
                computerWins++;
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
