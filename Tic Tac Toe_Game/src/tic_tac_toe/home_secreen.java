package tic_tac_toe;

import java.io.File;
import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import java.lang.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public  class home_secreen extends BorderPane {

    
     protected final AnchorPane anchorPane;
    protected final Label label;
    protected final VBox vBox;
    protected final AnchorPane anchorPane0;
    protected final AnchorPane anchorPane1;
    protected final Button towPlayerBtn;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final Button singlePlayerbtn;
    protected final AnchorPane anchorPane4;
    protected final Label label0;
    protected final Label label1;
    protected final AnchorPane anchorPane5;
    protected final AnchorPane anchorPane6;
    protected final ImageView music_img;
    protected final Line line_r;
    protected final AnchorPane anchorPane7;
    protected final ImageView record_img;
    protected final Button exitbutton;
    protected final AnchorPane anchorPane8;
    protected final AnchorPane anchorPane9;
    protected final AnchorPane anchorPane10;
    protected final Label logolabel;
    online_offlineBase onof;
    AiLevelsBase ai;
    game_listBase g;
   splashBase s;

    
public static int m = 0;//flag for music ;

    /*music*/
    String hitNormal;
    Media sound;
   //MediaPlayer mediaPlayer;
 MediaPlayer mediaPlayer1_b; // for background music
   
   
    
   /* music*/
   
   // function of transition :
   //1-tow player btn:
   
   public  void move_to_online_offline() {
      
 onof= new online_offlineBase(m);
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
        
       onof.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(onof);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=towPlayerBtn.getScene();
      s.setRoot(onof);
      

      }
   
   ///////////
     
     public  void move_to_ai() {
      
 ai= new AiLevelsBase(m);

 mediaPlayer1_b.stop();
        

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_ai();
          }
      });
      
      fd.play();
      
      }
    
     private void load_ai()
      {
          
          
          System.out.println("hello from constructor");
        
       ai.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(500));
        fd.setNode(ai);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
      Scene s=singlePlayerbtn.getScene();
      s.setRoot(ai);
      

      
      }
   
   
     
     ///////
   
     
     
     /****************/
     
       public  void move_to_list() 
      {

       g=new  game_listBase(m);
           mediaPlayer1_b.stop();

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_g();
          }
      });
      
      fd.play();
      
      }
    
     private void load_g()
      {
          
          
          System.out.println("hello from constructor");
        
       g.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(g);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
     Scene s=record_img.getScene();
     s.setRoot(g);
      
      
      }
     
     /****************/
     
     
     public  void move_to_splash() 
      {

       s=new splashBase();
           mediaPlayer1_b.stop();

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_s();
          }
      });
      
      fd.play();
      
      }
    
     private void load_s()
      {
          
          
          System.out.println("hello from constructor");
        
       s.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(s);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
     Scene ss=exitbutton.getScene();
     ss.setRoot(s);
      
      
      }
     
     
     
     /***************/

    public home_secreen() {
       xo_bordBase.computerWins=0;
       xo_bordBase.youWin=0;

       
        anchorPane = new AnchorPane();
        label = new Label();
        vBox = new VBox();
        anchorPane0 = new AnchorPane();
        anchorPane1 = new AnchorPane();
        towPlayerBtn = new Button();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        singlePlayerbtn = new Button();
        anchorPane4 = new AnchorPane();
        label0 = new Label();
        label1 = new Label();
        anchorPane5 = new AnchorPane();
        anchorPane6 = new AnchorPane();
        music_img = new ImageView();
        line_r = new Line();
        anchorPane7 = new AnchorPane();
        record_img = new ImageView();
        exitbutton = new Button();
        anchorPane8 = new AnchorPane();
        anchorPane9 = new AnchorPane();
        anchorPane10 = new AnchorPane();
        logolabel = new Label();

        setId("border");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(200.0);
        setPrefHeight(650.0);
        setPrefWidth(800.0);
        setStyle("-fx-background-color: linear-gradient(to bottom right, BLACK,DarkSlateGrey); -fx-border-color: BurlyWood; -fx-border-width: 7 7 7 7;");
        getStyleClass().add("LightCyan");

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(19.0);
        anchorPane.setPrefWidth(800.0);

        AnchorPane.setBottomAnchor(label, 0.0);
        AnchorPane.setLeftAnchor(label, 0.0);
        AnchorPane.setRightAnchor(label, 0.0);
        AnchorPane.setTopAnchor(label, 0.0);
        label.setLayoutX(135.0);
        label.setLayoutY(1.0);
        label.setText("Copyright © 2010 by Wily E. Coyote");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#f5f5f5"));
        setBottom(anchorPane);

        BorderPane.setAlignment(vBox, javafx.geometry.Pos.CENTER);
        vBox.setMaxHeight(USE_PREF_SIZE);
        vBox.setMaxWidth(USE_PREF_SIZE);
        vBox.setPrefHeight(500.0);
        vBox.setPrefWidth(363.0);

        anchorPane0.setMaxHeight(USE_PREF_SIZE);
        anchorPane0.setMaxWidth(USE_PREF_SIZE);
        anchorPane0.setMinHeight(USE_PREF_SIZE);
        anchorPane0.setMinWidth(USE_PREF_SIZE);
        anchorPane0.setPrefHeight(44.0);
        anchorPane0.setPrefWidth(363.0);
        anchorPane0.setStyle("-fx-background-color: transperetnt;");

        anchorPane1.setPrefHeight(65.0);
        anchorPane1.setPrefWidth(403.0);
        anchorPane1.setStyle("-fx-background-color: transperent;");

        AnchorPane.setBottomAnchor(towPlayerBtn, 0.0);
        AnchorPane.setLeftAnchor(towPlayerBtn, 0.0);
        AnchorPane.setRightAnchor(towPlayerBtn, 0.0);
        AnchorPane.setTopAnchor(towPlayerBtn, 0.0);
        towPlayerBtn.setLayoutX(74.0);
        towPlayerBtn.setLayoutY(19.0);
        towPlayerBtn.setMaxHeight(USE_PREF_SIZE);
        towPlayerBtn.setMaxWidth(USE_PREF_SIZE);
        towPlayerBtn.setMnemonicParsing(false);
        towPlayerBtn.setStyle("-fx-border-color: Turquoise; -fx-border-width: 7 7 7 7; -fx-background-color: transperent; -fx-border-radius: 30 30 30 30;");
        towPlayerBtn.getStylesheets().add("/y_transition/../Desktop/spli.css");
        towPlayerBtn.setText("Two Player");
        towPlayerBtn.setTextFill(javafx.scene.paint.Color.valueOf("#ddd7d7"));
        towPlayerBtn.setFont(new Font("Monospaced Bold", 32.0));

        anchorPane2.setMaxHeight(USE_PREF_SIZE);
        anchorPane2.setMaxWidth(USE_PREF_SIZE);
        anchorPane2.setMinHeight(USE_PREF_SIZE);
        anchorPane2.setMinWidth(USE_PREF_SIZE);
        anchorPane2.setPrefHeight(60.0);
        anchorPane2.setPrefWidth(403.0);
        anchorPane2.setStyle("-fx-background-color: transperent;");

        anchorPane3.setPrefHeight(74.0);
        anchorPane3.setPrefWidth(403.0);
        anchorPane3.setStyle("-fx-background-color: transperent;");

        AnchorPane.setBottomAnchor(singlePlayerbtn, 0.0);
        AnchorPane.setLeftAnchor(singlePlayerbtn, -2.0);
        AnchorPane.setRightAnchor(singlePlayerbtn, -2.0);
        AnchorPane.setTopAnchor(singlePlayerbtn, -5.0);
        singlePlayerbtn.setLayoutX(-2.0);
        singlePlayerbtn.setLayoutY(-5.0);
        singlePlayerbtn.setMinHeight(USE_PREF_SIZE);
        singlePlayerbtn.setMinWidth(USE_PREF_SIZE);
        singlePlayerbtn.setMnemonicParsing(false);
        singlePlayerbtn.setPrefHeight(70.0);
        singlePlayerbtn.setPrefWidth(407.0);
        singlePlayerbtn.setStyle("-fx-border-color: Turquoise; -fx-border-width: 7 7 7 7; -fx-border-radius: 30 30 30 30; -fx-background-color: transperent;");
        singlePlayerbtn.setText("Single Player");
        singlePlayerbtn.setTextFill(javafx.scene.paint.Color.valueOf("#e8dede"));
        singlePlayerbtn.setFont(new Font("Monospaced Bold", 33.0));

        anchorPane4.setPrefHeight(60.0);
        anchorPane4.setPrefWidth(403.0);
        anchorPane4.setStyle("-fx-background-color: whitetransperent;");

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(303.0);
        label0.setLayoutY(23.0);
        label0.setPrefHeight(39.0);
        label0.setPrefWidth(131.0);
        label0.setText("Records");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#fff6f6"));
        label0.setFont(new Font("Monospaced Bold", 23.0));

        label1.setAlignment(javafx.geometry.Pos.CENTER);
        label1.setLayoutX(6.0);
        label1.setLayoutY(28.0);
        label1.setPrefHeight(27.0);
        label1.setPrefWidth(76.0);
        label1.setText("Music");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#fff6f6"));
        label1.setFont(new Font("Monospaced Bold", 25.0));

        anchorPane5.setMaxHeight(USE_PREF_SIZE);
        anchorPane5.setMaxWidth(USE_PREF_SIZE);
        anchorPane5.setMinHeight(USE_PREF_SIZE);
        anchorPane5.setMinWidth(USE_PREF_SIZE);
        anchorPane5.setPrefHeight(60.0);
        anchorPane5.setPrefWidth(403.0);
        anchorPane5.setStyle("-fx-background-color: Transperent;");

        AnchorPane.setBottomAnchor(anchorPane6, 0.0);
        AnchorPane.setLeftAnchor(anchorPane6, 0.0);
        AnchorPane.setTopAnchor(anchorPane6, 0.0);
        anchorPane6.setLayoutX(6.0);
        anchorPane6.setLayoutY(-12.0);
        anchorPane6.setMaxHeight(USE_PREF_SIZE);
        anchorPane6.setMaxWidth(USE_PREF_SIZE);
        anchorPane6.setMinHeight(USE_PREF_SIZE);
        anchorPane6.setMinWidth(USE_PREF_SIZE);
        anchorPane6.setPrefHeight(60.0);
        anchorPane6.setPrefWidth(200.0);
        anchorPane6.setStyle("-fx-background-color: transperent;");

        AnchorPane.setBottomAnchor(music_img, -5.0);
        AnchorPane.setLeftAnchor(music_img, 3.0);
        AnchorPane.setRightAnchor(music_img, 137.58333206176758);
        AnchorPane.setTopAnchor(music_img, 3.0);
        music_img.setFitHeight(62.0);
        music_img.setFitWidth(73.0);
        music_img.setLayoutX(3.0);
        music_img.setLayoutY(3.0);
        music_img.setPickOnBounds(true);
        music_img.setPreserveRatio(true);

        line_r.setEndX(25.0);
        line_r.setFill(javafx.scene.paint.Color.valueOf("#b91f1f"));
        line_r.setLayoutX(29.0);
        line_r.setLayoutY(31.0);
        line_r.setOpacity(0.0);
        line_r.setRotate(41.2);
        line_r.setStartX(-20.0);
        line_r.setStroke(javafx.scene.paint.Color.valueOf("#9a1c1c"));
        line_r.setStrokeMiterLimit(0.0);
        line_r.setStrokeWidth(3.0);

        AnchorPane.setBottomAnchor(anchorPane7, 0.0);
        AnchorPane.setLeftAnchor(anchorPane7, 199.0);
        AnchorPane.setRightAnchor(anchorPane7, 0.0);
        AnchorPane.setTopAnchor(anchorPane7, 0.0);
        anchorPane7.setLayoutX(199.0);
        anchorPane7.setLayoutY(1.0);
        anchorPane7.setMaxHeight(USE_PREF_SIZE);
        anchorPane7.setMaxWidth(USE_PREF_SIZE);
        anchorPane7.setMinHeight(USE_PREF_SIZE);
        anchorPane7.setMinWidth(USE_PREF_SIZE);
        anchorPane7.setPrefHeight(60.0);
        anchorPane7.setPrefWidth(204.0);

        AnchorPane.setBottomAnchor(record_img, 2.0);
        AnchorPane.setLeftAnchor(record_img, 148.0);
        AnchorPane.setRightAnchor(record_img, 0.0);
        AnchorPane.setTopAnchor(record_img, 2.0);
        record_img.setFitHeight(56.0);
        record_img.setFitWidth(175.0);
        record_img.setLayoutX(148.0);
        record_img.setLayoutY(2.0);
        record_img.setPickOnBounds(true);
        record_img.setPreserveRatio(true);

        exitbutton.setLayoutX(-43.0);
        exitbutton.setLayoutY(15.0);
        exitbutton.setMnemonicParsing(false);
        exitbutton.setPrefHeight(51.0);
        exitbutton.setPrefWidth(90.0);
        exitbutton.setStyle("-fx-background-color: transperent; -fx-border-color: Turquoise; -fx-border-width: 7 7 7 7; -fx-border-radius: 30 30 30 30;");
        exitbutton.setText("Exit");
        exitbutton.setTextFill(javafx.scene.paint.Color.valueOf("#d3cbcb"));
        exitbutton.setFont(new Font("System Bold", 23.0));
        setCenter(vBox);

        BorderPane.setAlignment(anchorPane8, javafx.geometry.Pos.CENTER);
        anchorPane8.setPrefHeight(333.0);
        anchorPane8.setPrefWidth(120.0);
        anchorPane8.setStyle("-fx-background-color: Transperent;");
        setLeft(anchorPane8);

        BorderPane.setAlignment(anchorPane9, javafx.geometry.Pos.CENTER);
        anchorPane9.setPrefHeight(333.0);
        anchorPane9.setPrefWidth(120.0);
        setRight(anchorPane9);

        BorderPane.setAlignment(anchorPane10, javafx.geometry.Pos.CENTER);
        anchorPane10.setPrefHeight(53.0);
        anchorPane10.setPrefWidth(600.0);

        AnchorPane.setBottomAnchor(logolabel, -4.0);
        AnchorPane.setLeftAnchor(logolabel, 0.0);
        AnchorPane.setRightAnchor(logolabel, 0.0);
        AnchorPane.setTopAnchor(logolabel, 7.0);
        logolabel.setAlignment(javafx.geometry.Pos.CENTER);
        logolabel.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        logolabel.setLayoutY(7.0);
        logolabel.setMaxWidth(USE_PREF_SIZE);
        logolabel.setMinHeight(USE_PREF_SIZE);
        logolabel.setMinWidth(USE_PREF_SIZE);
        logolabel.setPrefHeight(64.0);
        logolabel.setPrefWidth(600.0);
        logolabel.setText("TIC TAC TOE");
        logolabel.setFont(new Font("Monospaced Bold", 53.0));
        logolabel.setStyle("-fx-text-fill:linear-gradient(to bottom right, WHITE, CYAN);");
        setTop(anchorPane10);

        anchorPane.getChildren().add(label);
        vBox.getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(towPlayerBtn);
        vBox.getChildren().add(anchorPane1);
        vBox.getChildren().add(anchorPane2);
        anchorPane3.getChildren().add(singlePlayerbtn);
        vBox.getChildren().add(anchorPane3);
        anchorPane4.getChildren().add(label0);
        anchorPane4.getChildren().add(label1);
        vBox.getChildren().add(anchorPane4);
        anchorPane6.getChildren().add(music_img);
        anchorPane6.getChildren().add(line_r);
        anchorPane5.getChildren().add(anchorPane6);
        anchorPane7.getChildren().add(record_img);
        anchorPane7.getChildren().add(exitbutton);
        anchorPane5.getChildren().add(anchorPane7);
        vBox.getChildren().add(anchorPane5);
        anchorPane10.getChildren().add(logolabel);
       
       
        
         /*music*/
       // hitNormal = ("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/sounds/Marimba-music.mp3");
       sound = new Media(getClass().getResource("/tic_tac_toe/sounds/Marimba-music.mp3").toExternalForm());
        mediaPlayer1_b = new MediaPlayer(sound);
        mediaPlayer1_b.setVolume(0.09);
        mediaPlayer1_b.stop();
           if(m==0){
        mediaPlayer1_b.setAutoPlay(true);
        mediaPlayer1_b.setVolume(0.09);
        /*music*/
        }else{
        
        line_r.setOpacity(1);
        }
        /*music*/
        
        
        
        
        
          // File file2 = new File("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/image/imageedit_1_9667648477.png");
        Image image2 = new Image(getClass().getResource("/tic_tac_toe/image/imageedit_1_9667648477.png").toExternalForm());
        music_img.setImage(image2);

       // File file3 = new File("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/image/score.png");
        Image image3 =new Image(getClass().getResource("/tic_tac_toe/image/score.png").toExternalForm());
        record_img.setImage(image3);
        
        
        
         music_img.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {

                if (m % 2 == 0) {
                    music_img.setOpacity(.5);

                    mediaPlayer1_b.stop();
                    m++;
                     line_r.setOpacity(1);
                } else {

                    mediaPlayer1_b.play();
                    m++;
                    music_img.setOpacity(1);
                     line_r.setOpacity(0);
                   
                }
            }
        });

        

         
         
        towPlayerBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            
            move_to_online_offline();
            
            
            
            }
            
            
        });
        
        
        
         singlePlayerbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            
            move_to_ai();
            
            
            
            }
            
            
        });
         
         
         
         
         
         
         record_img.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                
                System.out.println("helo from records");
                move_to_list();
                
            
                
            }
         });
         
         
         
         
         
         
        exitbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    user_nameBase.con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(home_secreen.class.getName()).log(Level.SEVERE, null, ex);
                }
        move_to_splash();
            
            
            
            }
            
            
        });
         
         
         
         
         
         
         
         
         
         
         
         
    }
}
