/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory_Game;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author mohamedelgharpawi
 */
public class Y_MemoryTransportation extends Y_Memory_MemoryDesign{
    
    
    y_memory_winBase w;
    y_memory_tieBase t;
    
    
  public Y_MemoryTransportation(){
    
       
    

    
    
    
 
    
 lab0.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                   System.out.println("ghgh+++++hgh");
   
  if(lab0.getGraphic()==null&&selectedRecently.size()<2){
      System.out.println("ghghhgh");
     
  selectedRecently.add("img1");
  selectedLab[counter]=lab0;
  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img1.jpg"));
           lab0.setGraphic(new ImageView(image));
  
      
      
  }
 
   
      began();

                  
              }
            });
 
 
 /////slllllllep
 //                  try {
//                      Thread.sleep(2000);
//                  } catch (InterruptedException ex) {
//                      Logger.getLogger(Y_Memory_MemoryDesign.class.getName()).log(Level.SEVERE, null, ex);
//                  }
//////////////////////////////////////////////////////
// lab2.setGraphic(null);
 
  lab1.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                 
                if(lab1.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img5");
    selectedLab[counter]=lab1;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img5.jpg"));
            lab1.setGraphic(new ImageView(image));
      
      
  }
   
                  
                 
               
      began();
        
             
             
                  
                           
                           
 
                  
              }
            });
  lab2.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                 if(lab2.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img6");
    selectedLab[counter]=lab2;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img6.jpg"));
             lab2.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab3.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                  if(lab3.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img7");
    selectedLab[counter]=lab3;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img7.jpg"));
             lab3.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab4.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                if(lab4.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img4");
    selectedLab[counter]=lab4;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img4.jpg"));
             lab4.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab5.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                  if(lab5.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img1");
    selectedLab[counter]=lab5;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img1.jpg"));
             lab5.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab6.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                  if(lab6.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img3");
    selectedLab[counter]=lab6;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img3.jpg"));
             lab6.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab7.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                  if(lab7.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img3");
    selectedLab[counter]=lab7;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img3.jpg"));
             lab7.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab8.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                 if(lab8.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img4");
    selectedLab[counter]=lab8;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img4.jpg"));
             lab8.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab9.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                   if(lab9.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img2");
    selectedLab[counter]=lab9;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img2.jpg"));
             lab9.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab10.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                  if(lab10.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img5");
    selectedLab[counter]=lab10;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img5.jpg"));
             lab10.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab11.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                 if(lab11.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img8");
    selectedLab[counter]=lab11;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img8.jpg"));
             lab11.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab12.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                  if(lab12.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img6");
    selectedLab[counter]=lab12;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img6.jpg"));
             lab12.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab13.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
               if(lab13.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img2");
    selectedLab[counter]=lab13;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img2.jpg"));
             lab13.setGraphic(new ImageView(image));
      
      began();
      
  }
 
                  
              }
            });
  lab14.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                  if(lab14.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img7");
    selectedLab[counter]=lab14;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img7.jpg"));
             lab14.setGraphic(new ImageView(image));
      
      
  }
       began();

                  
              }
            });
  lab15.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) {
                
                  if(lab15.getGraphic()==null&&selectedRecently.size()<2){
     
  selectedRecently.add("img8");
    selectedLab[counter]=lab15;

  counter++;
  image = new Image(getClass().getResourceAsStream("/imgs2/img8.jpg"));
             lab15.setGraphic(new ImageView(image));
      
   
      began();
  }
 
                  
              }
            });
  
  
  
  
       

    }
   
   //  image = new Image(getClass().getResourceAsStream("/try_agame/imgs/img1.jpg"));
    
   
    
    public  void began(){
    
    if(selectedLab.length==2&&selectedRecently.size()==2){
        checkMatching();
        
        if(turn==1){
        turn=2;
        
        turnLab.setText("Player 2 Turn");
        
        }
        else{
        
        turn=1;
                turnLab.setText("Player 1 Turn");

        }
    }
    
    }
    
    public void checkMatching(){
    
    if(selectedRecently.size()==2&&selectedRecently.get(0).equalsIgnoreCase(selectedRecently.get(1)))
    {
       
       switch(selectedRecently.get(0)){
       
           case "img1":
               lab0.setDisable(true);
                lab5.setDisable(true);
                count(turn);
                
                
               break;
        case "img2":
             lab9.setDisable(true);
                lab13.setDisable(true);  
                                count(turn);

               
               break;
        case "img3":
               lab7.setDisable(true);
                lab6.setDisable(true);
                                count(turn);

               
               break;
                case "img4":
          lab4.setDisable(true);
                lab8.setDisable(true);  
                                count(turn);

               
               break;
       
        case "img5":
               lab10.setDisable(true);
                lab1.setDisable(true);
                                count(turn);

               
               break;
        case "img6":
               
             lab12.setDisable(true);
                lab2.setDisable(true); 
                                count(turn);

               break;
       
       
        case "img7":
               
            lab14.setDisable(true);
                lab3.setDisable(true); 
                                count(turn);

               break;
               
                case "img8":
               lab11.setDisable(true);
                lab15.setDisable(true);
                                count(turn);

               
               break;
       
       
       }
        counter=0;
        selectedRecently.clear();
    
    }
    
     if(selectedRecently.size()==2&&(!selectedRecently.get(0).equalsIgnoreCase(selectedRecently.get(1))))
    {
        
                    selectedLab[1].setGraphic(null);
                    
                    selectedLab[0].setGraphic(null);
        counter=0;
//selectedLab[0]=null;

selectedRecently.clear();


      
                   
               
            

    
    }
    
    
    
    
    }
    
    /******** method of transition *******/
    
    //***** to win ************//
    
    
    public  void move_to_win() {
      
     w= new y_memory_winBase("");

        

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_w();
          }
      });
      
      fd.play();
      
      }
    
     private void load_w()
      {
          
          
          System.out.println("hello from constructor");
        
       w.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(w);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=new Scene(w);
      Stage cur= (Stage) this.getScene().getWindow();
      cur.setScene(s);
      

      }

      
     
     
     //********** to tie **********//
     
     
     
      public  void move_to_tie() {
      
     t= new y_memory_tieBase();

        

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
          
        
        
       t.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(t);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=new Scene(t);
      Stage cur= (Stage) this.getScene().getWindow();
      cur.setScene(s);
      

      }
     
     
     
     
     
     
     
     
    
}
