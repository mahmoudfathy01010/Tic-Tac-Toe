
package tic_tac_toe;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
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
public class z_ai_difficult_xo extends xo_bordBase {
    
    /////////////////////////////
    
     z_ai_difficult_win zw;
      z_ai_difficult_lose zl ;
      z_ai_difficult_tie zt;
      
    
     public  void move_to_win () 
      {

        zw=new z_ai_difficult_win();
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

        zl=new z_ai_difficult_lose();
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

        zt=new z_ai_difficult_tie();
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
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/////////////////////
    GameGrid gameGrid = new GameGrid();
   // private int youWin = 0;
   // private int computerWins = 0;
    private int Draws = 0;
    private int gameNotEnded = 1;

    //***********************
    public static String[] toSave = {null, null, null, null, null, null, null, null, null};

    int arrayCounter = 0;

    Button[] cells;

    public z_ai_difficult_xo() {
        
         for(int i =0;i<toSave.length;i++){
         toSave[i]=null;
         
         }
        
        
        
        for(String s : z_ai_difficult_xo.toSave){

System.out.print("+++++22222++++++");
    System.out.println(s);
}

        intializeAgain();

        for (Button cell : cells) {

            cell.setOnMouseClicked(event -> {

                if (gameNotEnded == 1) {

                    if (((boolean) cell.getUserData()) == false) {
                        cell.setText("x");

                        int index = -1;
                        for (int i = 0; i < cells.length; ++i) {
                            if (cell == cells[i]) {
                                index = i;
                                setStyle("x", cell, index);
                                System.out.println("x" + "-" + index);
                                toSave[arrayCounter] = "x-" + index;
                                arrayCounter++;

                            }
                        }

                        gameGrid.placeAMove(new Point(index / 3, index % 3), 2);

                        System.out.println("Placed a move at: (" + index / 3 + ", " + index % 3 + ")");
                        boolean mark = true;
                        int next = gameGrid.returnNextMove();

                        if (next != -1) {
                            int indexCell = next;

                            System.out.println("o" + "-" + indexCell);
                            toSave[arrayCounter] = "o-" + indexCell;
                            arrayCounter++;
                            cells[indexCell].setText("o");
                            setStyle("o", cells[indexCell], indexCell);

                            cells[indexCell].setUserData(mark); //Used!
                            System.out.println("Computer has evaluated the next move! " + indexCell);
                            gameGrid.placeAMove(new Point(indexCell / 3, indexCell % 3), 1);
                            cell.setUserData(mark);
                        }

                        if (gameGrid.isGameOver()) {

                            gameNotEnded = 0;

                            if (gameGrid.computerWon()) {
//                                Alert a2 = new Alert(Alert.AlertType.INFORMATION, " Computer WIn");
//
//                                a2.showAndWait();
                                computerWins++;
                                o_score_count.setText((String.valueOf(computerWins)));

                                winningEffect("o");
                                
                                
                                move_to_lose();

                                /*   
     ////*************************
     
         Computer win  SCREEEEEEEEEN    
     
     
     
     
     
                                 */
                                //just for testing(Saved Array)
                                for (int i = 0; i < 9; i++) {
                                    System.out.println(toSave[i]);
                                }

                            } else {

                                if (gameGrid.youWon()) {

                                    youWin++;
                                    o_score_count.setText((String.valueOf(youWin)));

                                    winningEffect("x");
                                    
                                    move_to_win();

                                    /*   
     ////*************************
     
you win  SCREEEEEEEEEN     
     
     
     
     
     
                                     */
                                } else {

                                    gameNotEnded = 0;

//                                    Alert a2 = new Alert(Alert.AlertType.INFORMATION, " Draw");
//                                    a2.showAndWait();
                                    
                                    move_to_tie();
                                    /*   
     ////*************************
     
         DRAW SCREEEEEEEEEN     
     
     
     
     
     
                                     */

                                }

                            }

                        }

                    }
                }
            });
        }

    }

    //for reset and new btn
    public void intializeAgain() {
      
        message_label.setText("Try,To Win!");
        
        gameNotEnded = 1;

        cells = new Button[]{btn1, btn2, btn3,
            btn4, btn5, btn6,
            btn7, btn8, btn9};
        for (Button cell : cells) {
            // cell.setMaxSize(100, 100);
            cell.setText("");
            arrayCounter = 0;
            boolean isUsed = false;
            cell.setDisable(false);
            cell.setUserData(isUsed);
        }
        for (int i = 0; i < 9; i++) {
            toSave[i] = null;

        }

        gameGrid.resetBoard();

    }

    public void setStyle(String indicator, Button cellToStyle, int cellNum) {

        if (indicator.equalsIgnoreCase("x")) {
            if (cellNum == 0 || cellNum == 1 || cellNum == 3 || cellNum == 4) {
                cellToStyle.setStyle(x_style_bt1_2_4_5);
            }
            if (cellNum == 2 || cellNum == 5) {
                cellToStyle.setStyle(x_style_bt3_6);

            }
            if (cellNum == 6 || cellNum == 7) {
                cellToStyle.setStyle(x_style_bt7_8);

            }
            if (cellNum == 8) {
                cellToStyle.setStyle(x_style_bt9);

            }
        } else {

            if (cellNum == 0 || cellNum == 1 || cellNum == 3 || cellNum == 4) {
                cellToStyle.setStyle(o_style_bt1_2_4_5);
            }
            if (cellNum == 2 || cellNum == 5) {
                cellToStyle.setStyle(o_style_bt3_6);

            }
            if (cellNum == 6 || cellNum == 7) {
                cellToStyle.setStyle(o_style_bt7_8);

            }
            if (cellNum == 8) {
                cellToStyle.setStyle(o_style_bt9);

            }

        }

    }

    public void winningEffect(String Winnerindicator) {

        boolean b = btn1.getText().equals("o") && btn2.getText().equals("o") && btn3.getText().equals("o");
        if (b) {
            btn1.setStyle(o_style_suc);
            btn2.setStyle(o_style_suc);
            btn3.setStyle(o_style_suc);
        }
        boolean b2 = btn4.getText().equals("o") && btn5.getText().equals("o") && btn6.getText().equals("o");
        if (b2) {
            btn4.setStyle(o_style_suc);
            btn5.setStyle(o_style_suc);
            btn6.setStyle(o_style_suc);
        }
        boolean b3 = btn7.getText().equals("o") && btn8.getText().equals("o") && btn9.getText().equals("o");
        if (b3) {
            btn7.setStyle(o_style_suc);
            btn8.setStyle(o_style_suc);
            btn9.setStyle(o_style_suc);
        }
        boolean b4 = btn1.getText().equals("o") && btn4.getText().equals("o") && btn7.getText().equals("o");
        if (b4) {
            btn1.setStyle(o_style_suc);
            btn4.setStyle(o_style_suc);
            btn7.setStyle(o_style_suc);
        }
        boolean b5 = btn2.getText().equals("o") && btn5.getText().equals("o") && btn8.getText().equals("o");
        if (b5) {
            btn2.setStyle(o_style_suc);
            btn5.setStyle(o_style_suc);
            btn8.setStyle(o_style_suc);
        }
        boolean b6 = btn3.getText().equals("o") && btn6.getText().equals("o") && btn9.getText().equals("o");
        if (b6) {
            btn3.setStyle(o_style_suc);
            btn6.setStyle(o_style_suc);
            btn9.setStyle(o_style_suc);
        }

        boolean b7 = btn1.getText().equals("o") && btn5.getText().equals("o") && btn9.getText().equals("o");
        if (b7) {
            btn1.setStyle(o_style_suc);
            btn5.setStyle(o_style_suc);
            btn9.setStyle(o_style_suc);
        }

        boolean b8 = btn3.getText().equals("o") && btn5.getText().equals("o") && btn7.getText().equals("o");
        if (b8) {

            btn3.setStyle(o_style_suc);
            btn5.setStyle(o_style_suc);
            btn7.setStyle(o_style_suc);
        }

    }

}

