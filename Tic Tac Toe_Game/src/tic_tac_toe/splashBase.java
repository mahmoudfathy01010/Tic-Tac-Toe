package tic_tac_toe;

import javafx.scene.effect.*;
import java.lang.*;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import Memory_Game.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public  class splashBase extends BorderPane {
    
    
    Y_Memory_home_secreenBase yh;
    user_nameBase u;
    
    String hitNormal;
    Media sound;
   
    MediaPlayer mediaPlayer1_b; 
     

    

    protected final AnchorPane anchorPane;
    protected final Label label;
    protected final AnchorPane anchorPane0;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final Label logolabel;
    protected final Reflection reflection;
    protected final AnchorPane anchorPane3;
    protected final AnchorPane mem_pane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final ImageView imageView;
    protected final ImageView second_f;
    protected final AnchorPane anchorPane4;
    protected final ImageView first_f;
    protected final AnchorPane anchorPane5;
    protected final ImageView first_b;
    protected final ImageView second_b;
    protected final AnchorPane xo_pane;
    protected final ImageView x_im;
    protected final ImageView o_im;
    protected final AnchorPane anchorPane6;
    protected final Button exit_btn;
    protected final AnchorPane anchorPane7;
    protected final Button xo_btn;
    protected final AnchorPane anchorPane8;
    protected final Button memory_btn;

    public splashBase() {

        anchorPane = new AnchorPane();
        label = new Label();
        anchorPane0 = new AnchorPane();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        logolabel = new Label();
        reflection = new Reflection();
        anchorPane3 = new AnchorPane();
        mem_pane = new AnchorPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        imageView = new ImageView();
        second_f = new ImageView();
        anchorPane4 = new AnchorPane();
        first_f = new ImageView();
        anchorPane5 = new AnchorPane();
        first_b = new ImageView();
        second_b = new ImageView();
        xo_pane = new AnchorPane();
        x_im = new ImageView();
        o_im = new ImageView();
        anchorPane6 = new AnchorPane();
        exit_btn = new Button();
        anchorPane7 = new AnchorPane();
        xo_btn = new Button();
        anchorPane8 = new AnchorPane();
        memory_btn = new Button();

        setId("border");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(200.0);
        setPrefHeight(650.0);
        setPrefWidth(800.0);
        setStyle("-fx-background-color: linear-gradient(to bottom right, BLACK,BurlyWood); -fx-border-color: BurlyWood; -fx-border-width: 7 7 7 7;");
        getStyleClass().add("LightCyan");

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(38.0);
        anchorPane.setPrefWidth(786.0);

        AnchorPane.setBottomAnchor(label, 0.0);
        AnchorPane.setLeftAnchor(label, 0.0);
        AnchorPane.setRightAnchor(label, 0.0);
        AnchorPane.setTopAnchor(label, 0.0);
        label.setLayoutX(135.0);
        label.setLayoutY(1.0);
        label.setText("Copyright © 2010 by Wily E. Coyote");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#f5f5f5"));
        setBottom(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(333.0);
        anchorPane0.setPrefWidth(120.0);
        anchorPane0.setStyle("-fx-background-color: Transperent;");
        setLeft(anchorPane0);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(333.0);
        anchorPane1.setPrefWidth(120.0);
        setRight(anchorPane1);

        BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
        anchorPane2.setPrefHeight(104.0);
        anchorPane2.setPrefWidth(786.0);

        AnchorPane.setBottomAnchor(logolabel, 0.0);
        AnchorPane.setLeftAnchor(logolabel, 0.0);
        AnchorPane.setRightAnchor(logolabel, 0.0);
        AnchorPane.setTopAnchor(logolabel, 1.0);
        logolabel.setAlignment(javafx.geometry.Pos.CENTER);
        logolabel.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        logolabel.setLayoutY(1.0);
        logolabel.setMaxWidth(USE_PREF_SIZE);
        logolabel.setMinHeight(USE_PREF_SIZE);
        logolabel.setMinWidth(USE_PREF_SIZE);
        logolabel.setPrefHeight(103.0);
        logolabel.setPrefWidth(786.0);
        logolabel.setText("Games Store");
        logolabel.setStyle("-fx-text-fill:cornsilk;");
        logolabel.setFont(new Font("Monospaced Bold", 80.0));

        logolabel.setEffect(reflection);
     
        setTop(anchorPane2);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setMaxHeight(USE_PREF_SIZE);
        anchorPane3.setMaxWidth(USE_PREF_SIZE);
        anchorPane3.setMinHeight(USE_PREF_SIZE);
        anchorPane3.setPrefHeight(543.0);
        anchorPane3.setPrefWidth(538.0);

        mem_pane.setLayoutX(-3.0);
        mem_pane.setLayoutY(180.0);
        mem_pane.setMaxHeight(USE_PREF_SIZE);
        mem_pane.setMaxWidth(USE_PREF_SIZE);
        mem_pane.setMinHeight(USE_PREF_SIZE);
        mem_pane.setMinWidth(USE_PREF_SIZE);
        mem_pane.setPrefHeight(196.0);
        mem_pane.setPrefWidth(198.0);
        mem_pane.setStyle("-fx-background-color: linear-gradient(to bottom right, white,DarkSlateGrey); -fx-border-color: BurlyWood; -fx-border-width: 7 7 7 7;");

        AnchorPane.setBottomAnchor(gridPane, 0.0);
        AnchorPane.setLeftAnchor(gridPane, 0.0);
        AnchorPane.setRightAnchor(gridPane, 0.0);
        AnchorPane.setTopAnchor(gridPane, 0.0);
        gridPane.setGridLinesVisible(true);
        gridPane.setLayoutX(14.0);
        gridPane.setLayoutY(3.0);
        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(175.0);
        gridPane.setPrefWidth(185.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(imageView, 1);
        GridPane.setRowIndex(imageView, 1);
        imageView.setFitHeight(88.0);
        imageView.setFitWidth(100.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);

        GridPane.setColumnIndex(second_f, 1);
        GridPane.setRowIndex(second_f, 1);
        second_f.setFitHeight(94.0);
        second_f.setFitWidth(85.0);
        second_f.setOpacity(0.4);
        second_f.setPickOnBounds(true);
        second_f.setPreserveRatio(true);

        anchorPane4.setPrefHeight(200.0);
        anchorPane4.setPrefWidth(200.0);

        first_f.setFitHeight(115.0);
        first_f.setFitWidth(81.0);
        first_f.setLayoutX(5.0);
        first_f.setLayoutY(13.0);
        first_f.setPickOnBounds(true);
        first_f.setPreserveRatio(true);

        GridPane.setColumnIndex(anchorPane5, 1);
        anchorPane5.setPrefHeight(200.0);
        anchorPane5.setPrefWidth(200.0);

        first_b.setFitHeight(115.0);
        first_b.setFitWidth(81.0);
        first_b.setLayoutX(7.0);
        first_b.setLayoutY(14.0);
        first_b.setPickOnBounds(true);
        first_b.setPreserveRatio(true);

        GridPane.setRowIndex(second_b, 1);
        second_b.setFitHeight(69.0);
        second_b.setFitWidth(84.0);
        second_b.setPickOnBounds(true);
        second_b.setPreserveRatio(true);

        xo_pane.setLayoutX(356.0);
        xo_pane.setLayoutY(180.0);
        xo_pane.setMaxHeight(USE_PREF_SIZE);
        xo_pane.setMaxWidth(USE_PREF_SIZE);
        xo_pane.setMinHeight(USE_PREF_SIZE);
        xo_pane.setMinWidth(USE_PREF_SIZE);
        xo_pane.setPrefHeight(196.0);
        xo_pane.setPrefWidth(211.0);
        xo_pane.setStyle("-fx-background-color: linear-gradient(to bottom right, BLACK,DarkSlateGrey); -fx-border-color: BurlyWood; -fx-border-width: 7 7 7 7;");

        x_im.setFitHeight(90.0);
        x_im.setFitWidth(80.0);
        x_im.setLayoutX(14.0);
        x_im.setLayoutY(16.0);
        x_im.setPickOnBounds(true);
        x_im.setPreserveRatio(true);

        o_im.setFitHeight(70.0);
        o_im.setFitWidth(60.0);
        o_im.setLayoutX(115.0);
        o_im.setLayoutY(16.0);
        o_im.setPickOnBounds(true);
        o_im.setPreserveRatio(true);

        anchorPane6.setLayoutX(227.0);
        anchorPane6.setLayoutY(497.0);
        anchorPane6.setMaxHeight(USE_PREF_SIZE);
        anchorPane6.setMaxWidth(USE_PREF_SIZE);
        anchorPane6.setMinHeight(USE_PREF_SIZE);
        anchorPane6.setMinWidth(USE_PREF_SIZE);
        anchorPane6.setPrefHeight(47.0);
        anchorPane6.setPrefWidth(106.0);

        AnchorPane.setBottomAnchor(exit_btn, 0.0);
        AnchorPane.setLeftAnchor(exit_btn, 9.0);
        AnchorPane.setRightAnchor(exit_btn, 4.0);
        AnchorPane.setTopAnchor(exit_btn, 1.0);
        exit_btn.setLayoutX(9.0);
        exit_btn.setLayoutY(1.0);
        exit_btn.setMaxHeight(USE_PREF_SIZE);
        exit_btn.setMaxWidth(USE_PREF_SIZE);
        exit_btn.setMinHeight(USE_PREF_SIZE);
        exit_btn.setMinWidth(USE_PREF_SIZE);
        exit_btn.setMnemonicParsing(false);
        exit_btn.setPrefHeight(46.0);
        exit_btn.setPrefWidth(93.0);
        exit_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, BLACK,SaddleBrown)6; -fx-border-color: BurlyWood; -fx-border-width: 7 7 7 7;");
        exit_btn.setText("EXIT");
        exit_btn.setTextFill(javafx.scene.paint.Color.valueOf("#d7d0d0"));
        exit_btn.setFont(new Font(18.0));

        anchorPane7.setLayoutX(360.0);
        anchorPane7.setLayoutY(411.0);
        anchorPane7.setMaxHeight(USE_PREF_SIZE);
        anchorPane7.setMaxWidth(USE_PREF_SIZE);
        anchorPane7.setMinHeight(USE_PREF_SIZE);
        anchorPane7.setMinWidth(USE_PREF_SIZE);
        anchorPane7.setPrefHeight(66.0);
        anchorPane7.setPrefWidth(209.0);

        AnchorPane.setBottomAnchor(xo_btn, 1.0);
        AnchorPane.setLeftAnchor(xo_btn, 0.0);
        AnchorPane.setRightAnchor(xo_btn, -1.0);
        AnchorPane.setTopAnchor(xo_btn, 0.0);
        xo_btn.setLayoutX(45.0);
        xo_btn.setMnemonicParsing(false);
        xo_btn.setPrefHeight(62.0);
        xo_btn.setPrefWidth(210.0);
        xo_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, BLACK,DarkSlateGrey)6; -fx-border-color: BurlyWood; -fx-border-width: 7 7 7  7;");
        xo_btn.setText("Tic Tack Toe");
        xo_btn.setTextFill(javafx.scene.paint.Color.valueOf("#cdbfc8"));
        xo_btn.setFont(new Font("System Bold", 18.0));

        anchorPane8.setLayoutY(416.0);
        anchorPane8.setMaxHeight(USE_PREF_SIZE);
        anchorPane8.setMaxWidth(USE_PREF_SIZE);
        anchorPane8.setMinHeight(USE_PREF_SIZE);
        anchorPane8.setMinWidth(USE_PREF_SIZE);
        anchorPane8.setPrefHeight(59.0);
        anchorPane8.setPrefWidth(196.0);
        anchorPane8.setStyle("-fx-background-color: pink;");

        AnchorPane.setBottomAnchor(memory_btn, 0.0);
        AnchorPane.setLeftAnchor(memory_btn, 0.0);
        AnchorPane.setRightAnchor(memory_btn, 0.0);
        AnchorPane.setTopAnchor(memory_btn, 0.0);
        memory_btn.setLayoutX(38.0);
        memory_btn.setLayoutY(18.0);
        memory_btn.setMnemonicParsing(false);
        memory_btn.setPrefHeight(65.0);
        memory_btn.setPrefWidth(196.0);
        memory_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, white,DarkSlateGrey); -fx-border-color: BurlyWood; -fx-border-width: 7 7 7 7;");
        memory_btn.setText("Memory game");
        memory_btn.setTextFill(javafx.scene.paint.Color.valueOf("#724224"));
        memory_btn.setFont(new Font(20.0));
        setCenter(anchorPane3);

        anchorPane.getChildren().add(label);
        anchorPane2.getChildren().add(logolabel);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getChildren().add(imageView);
        gridPane.getChildren().add(second_f);
        anchorPane4.getChildren().add(first_f);
        gridPane.getChildren().add(anchorPane4);
        anchorPane5.getChildren().add(first_b);
        gridPane.getChildren().add(anchorPane5);
        gridPane.getChildren().add(second_b);
        mem_pane.getChildren().add(gridPane);
        anchorPane3.getChildren().add(mem_pane);
        xo_pane.getChildren().add(x_im);
        xo_pane.getChildren().add(o_im);
        anchorPane3.getChildren().add(xo_pane);
        anchorPane6.getChildren().add(exit_btn);
        anchorPane3.getChildren().add(anchorPane6);
        anchorPane7.getChildren().add(xo_btn);
        anchorPane3.getChildren().add(anchorPane7);
        anchorPane8.getChildren().add(memory_btn);
        anchorPane3.getChildren().add(anchorPane8);
        
        exit_btn.setOpacity(0);
        
        /* music*/
        
        sound = new Media(getClass().getResource("/tic_tac_toe/sounds/Jingle-bells-piano-song.mp3").toExternalForm());
        mediaPlayer1_b = new MediaPlayer(sound);
        mediaPlayer1_b.setVolume(0.09);
        mediaPlayer1_b.stop();
           
        mediaPlayer1_b.setAutoPlay(true);
        mediaPlayer1_b.setVolume(0.09);
        
        ///Users/macproretina/Downloads/java_lec/after_finishing_database/after database/Tic_tack_v5/Tic_Tac_Toe/src/tic_tac_toe/image/
        Image image1 =new Image(getClass().getResource("/tic_tac_toe/image/x1.png").toExternalForm());
        x_im.setImage(image1);
        
        
          Image image2 =new Image(getClass().getResource("/tic_tac_toe/image/neon-circle-png-1.png").toExternalForm());
        o_im.setImage(image2);
        
         Image image3 =new Image(getClass().getResource("/tic_tac_toe/image/f.JPG").toExternalForm());
        first_f.setImage(image3);
        second_f.setImage(image3);
        
        
          Image image4 =new Image(getClass().getResource("/tic_tac_toe/image/IMG_0790.JPG").toExternalForm());
          first_b.setImage(image4);
          second_b.setImage(image4);

        TranslateTransition t=new TranslateTransition();
        
        t.setAutoReverse(true);
        t.setToX(112);
        t.setToY(100);
        t.setCycleCount(Animation.INDEFINITE);
        t.setDuration(javafx.util.Duration.seconds(3));
        t.setNode(x_im);
        t.play();
          
          
          TranslateTransition t2=new TranslateTransition();
        
        t2.setAutoReverse(true);
        t2.setToX(-112);
        t2.setToY(100);
        t2.setCycleCount(Animation.INDEFINITE);
        t2.setDuration(javafx.util.Duration.seconds(3));
        t2.setNode(o_im);
        t2.play();
          
          
          
          
        RotateTransition rotate = new RotateTransition();  
          
        
        rotate.setByAngle(360);  
          
        
        rotate.setCycleCount(500);  
          
     
        rotate.setDuration(Duration.millis(1000));  
          
        
        rotate.setAutoReverse(true);  
              
       
        rotate.setNode(first_f);  
       
        rotate.play();  
           
          
          RotateTransition rotate2 = new RotateTransition();  
          
    
        rotate2.setByAngle(360);  
          
         
        rotate2.setCycleCount(500);  
          
  
        rotate2.setDuration(Duration.millis(1000));  
          
       
        rotate2.setAutoReverse(true);  
              
  
        rotate2.setNode(second_f);  
          
     
        rotate2.play(); 
          
        
        
        
        
        
         this.getStylesheets().add(getClass().getResource("splash.css").toString());
         
         
         
         
         
         
         
         
         
         
         memory_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
         
            
            move_to_memory_game();
            
            }
            
            
        });
         
         
         
         
         xo_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
         
            
            move_to_xo_game();
            
            }
            
            
        });
           
         
         
         
         
         
         
         
          

    }
    
    
    
    
    
    
    
    public  void move_to_memory_game() {
        mediaPlayer1_b.stop();
      
yh = new Y_Memory_home_secreenBase();

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
        
       yh.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(yh);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=memory_btn.getScene();
      s.setRoot(yh);
      

      }
   
     
     
     
     
     
     
     
     
     
     
     
     
     public  void move_to_xo_game() {
         
         mediaPlayer1_b.stop();
      
u = new user_nameBase();

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_xo();
          }
      });
      
      fd.play();
      
      }
    
     private void load_xo()
      {
          
          
          System.out.println("hello from constructor");
        
       u.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(u);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=xo_btn.getScene();
      s.setRoot(u);
      

      }
   
    
    
    
    
}
