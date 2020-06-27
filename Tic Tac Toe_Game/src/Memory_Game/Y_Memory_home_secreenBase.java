package Memory_Game;

import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import java.lang.*;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import tic_tac_toe.*;

public  class Y_Memory_home_secreenBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Label logolabel;
    protected final AnchorPane anchorPane0;
    protected final AnchorPane anchorPane1;
    protected final VBox vBox;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final Button towPlayerBtn;
    protected final AnchorPane anchorPane4;
    protected final AnchorPane anchorPane5;
    protected final Button singlePlayerbtn;
    protected final AnchorPane anchorPane6;
    protected final AnchorPane anchorPane7;
    protected final AnchorPane anchorPane8;
    protected final ImageView music_img;
    protected final Line line_r;
    protected final AnchorPane anchorPane9;
    protected final ImageView record_img;
    protected final AnchorPane anchorPane10;
    protected final Label label;
     protected final Button exitbutton;
    
      Y_Memory_Computer c;
      Y_Memory_ModesBase mo;
      splashBase s;
   

    public Y_Memory_home_secreenBase() {
        
  
        anchorPane = new AnchorPane();
        logolabel = new Label();
        anchorPane0 = new AnchorPane();
        anchorPane1 = new AnchorPane();
        vBox = new VBox();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        towPlayerBtn = new Button();
        anchorPane4 = new AnchorPane();
        anchorPane5 = new AnchorPane();
        singlePlayerbtn = new Button();
        anchorPane6 = new AnchorPane();
        anchorPane7 = new AnchorPane();
        anchorPane8 = new AnchorPane();
        music_img = new ImageView();
        line_r = new Line();
        anchorPane9 = new AnchorPane();
        record_img = new ImageView();
        anchorPane10 = new AnchorPane();
        label = new Label();
         exitbutton = new Button();

        setId("border");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(200.0);
        setPrefHeight(487.0);
        setPrefWidth(800.0);
        setStyle("-fx-background-color: linear-gradient(to bottom right, white,DarkSlateGrey); -fx-border-color: BurlyWood; -fx-border-width: 7 7 7 7;");
        getStyleClass().add("LightCyan");

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(53.0);
        anchorPane.setPrefWidth(600.0);

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
        logolabel.setText("Memory Game");
        logolabel.setFont(new Font("Monospaced Bold", 53.0));
        setTop(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(333.0);
        anchorPane0.setPrefWidth(120.0);
        anchorPane0.setStyle("-fx-background-color: Transperent;");
        setLeft(anchorPane0);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(333.0);
        anchorPane1.setPrefWidth(120.0);
        setRight(anchorPane1);

        BorderPane.setAlignment(vBox, javafx.geometry.Pos.CENTER);
        vBox.setMaxHeight(USE_PREF_SIZE);
        vBox.setMaxWidth(USE_PREF_SIZE);
        vBox.setPrefHeight(500.0);
        vBox.setPrefWidth(363.0);

        anchorPane2.setMaxHeight(USE_PREF_SIZE);
        anchorPane2.setMaxWidth(USE_PREF_SIZE);
        anchorPane2.setMinHeight(USE_PREF_SIZE);
        anchorPane2.setMinWidth(USE_PREF_SIZE);
        anchorPane2.setPrefHeight(44.0);
        anchorPane2.setPrefWidth(363.0);
        anchorPane2.setStyle("-fx-background-color: transperetnt;");

        anchorPane3.setPrefHeight(65.0);
        anchorPane3.setPrefWidth(403.0);
        anchorPane3.setStyle("-fx-background-color: transperent;");

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
        towPlayerBtn.getStylesheets().add("/Memory_Game/../../../Desktop/spli.css");
        towPlayerBtn.setText("Two Player");
        towPlayerBtn.setFont(new Font("Monospaced Bold", 32.0));

        anchorPane4.setMaxHeight(USE_PREF_SIZE);
        anchorPane4.setMaxWidth(USE_PREF_SIZE);
        anchorPane4.setMinHeight(USE_PREF_SIZE);
        anchorPane4.setMinWidth(USE_PREF_SIZE);
        anchorPane4.setPrefHeight(60.0);
        anchorPane4.setPrefWidth(403.0);
        anchorPane4.setStyle("-fx-background-color: transperent;");

        anchorPane5.setPrefHeight(74.0);
        anchorPane5.setPrefWidth(403.0);
        anchorPane5.setStyle("-fx-background-color: transperent;");

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
        singlePlayerbtn.setFont(new Font("Monospaced Bold", 33.0));

        anchorPane6.setPrefHeight(60.0);
        anchorPane6.setPrefWidth(403.0);
        anchorPane6.setStyle("-fx-background-color: whitetransperent;");

        anchorPane7.setMaxHeight(USE_PREF_SIZE);
        anchorPane7.setMaxWidth(USE_PREF_SIZE);
        anchorPane7.setMinHeight(USE_PREF_SIZE);
        anchorPane7.setMinWidth(USE_PREF_SIZE);
        anchorPane7.setPrefHeight(60.0);
        anchorPane7.setPrefWidth(403.0);
        anchorPane7.setStyle("-fx-background-color: Transperent;");

        AnchorPane.setBottomAnchor(anchorPane8, 0.0);
        AnchorPane.setLeftAnchor(anchorPane8, 0.0);
        AnchorPane.setTopAnchor(anchorPane8, 0.0);
        anchorPane8.setLayoutX(6.0);
        anchorPane8.setLayoutY(-12.0);
        anchorPane8.setMaxHeight(USE_PREF_SIZE);
        anchorPane8.setMaxWidth(USE_PREF_SIZE);
        anchorPane8.setMinHeight(USE_PREF_SIZE);
        anchorPane8.setMinWidth(USE_PREF_SIZE);
        anchorPane8.setPrefHeight(60.0);
        anchorPane8.setPrefWidth(200.0);
        anchorPane8.setStyle("-fx-background-color: transperent;");

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

        AnchorPane.setBottomAnchor(anchorPane9, 0.0);
        AnchorPane.setLeftAnchor(anchorPane9, 199.0);
        AnchorPane.setRightAnchor(anchorPane9, 0.0);
        AnchorPane.setTopAnchor(anchorPane9, 0.0);
        anchorPane9.setLayoutX(199.0);
        anchorPane9.setLayoutY(1.0);
        anchorPane9.setMaxHeight(USE_PREF_SIZE);
        anchorPane9.setMaxWidth(USE_PREF_SIZE);
        anchorPane9.setMinHeight(USE_PREF_SIZE);
        anchorPane9.setMinWidth(USE_PREF_SIZE);
        anchorPane9.setPrefHeight(60.0);
        anchorPane9.setPrefWidth(204.0);

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
        exitbutton.setTextFill(javafx.scene.paint.Color.valueOf("BLACK"));
        exitbutton.setFont(new Font("System Bold", 23.0));
        
        
        setCenter(vBox);

        BorderPane.setAlignment(anchorPane10, javafx.geometry.Pos.CENTER);
        anchorPane10.setPrefHeight(19.0);
        anchorPane10.setPrefWidth(800.0);

        AnchorPane.setBottomAnchor(label, 0.0);
        AnchorPane.setLeftAnchor(label, 0.0);
        AnchorPane.setRightAnchor(label, 0.0);
        AnchorPane.setTopAnchor(label, 0.0);
        label.setLayoutX(135.0);
        label.setLayoutY(1.0);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#f5f5f5"));
        setBottom(anchorPane10);

        anchorPane.getChildren().add(logolabel);
        vBox.getChildren().add(anchorPane2);
        anchorPane3.getChildren().add(towPlayerBtn);
        vBox.getChildren().add(anchorPane3);
        vBox.getChildren().add(anchorPane4);
        anchorPane5.getChildren().add(singlePlayerbtn);
        vBox.getChildren().add(anchorPane5);
        vBox.getChildren().add(anchorPane6);
        anchorPane8.getChildren().add(music_img);
        anchorPane8.getChildren().add(line_r);
        anchorPane7.getChildren().add(anchorPane8);
        anchorPane9.getChildren().add(record_img);
        anchorPane7.getChildren().add(exitbutton);
        anchorPane7.getChildren().add(anchorPane9);
        vBox.getChildren().add(anchorPane7);
        anchorPane10.getChildren().add(label);
        
        
        singlePlayerbtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) { 
                  
                 move_to_pc();
                  
              }  
            });
        towPlayerBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) { 
                  
                 move_to_modes();
                  
              }  
            });
        
        
        
        
        
        exitbutton.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) { 
                  
                 move_to_splash();
                  
              }  
            });
        
        
        
        
        
        
        
        
        
        
        
        
        
          

    }
    
    
  
        
        
        
        
        public  void move_to_pc() {
      
 c= new Y_Memory_Computer();

        

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
        
       c.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(c);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=new Scene(c);
      Stage cur= (Stage) this.getScene().getWindow();
      cur.setScene(s);
      

      }

    
     
     
     
     
     public  void move_to_modes() {
      
 mo= new Y_Memory_ModesBase();

        

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_m();
          }
      });
      
      fd.play();
      
      }
    
     private void load_m()
      {
          
          
          System.out.println("hello from constructor");
        
       mo.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(mo);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=towPlayerBtn.getScene();
      s.setRoot(mo);
      

      }

     
    
     
     
     
     
     
     
     
     
      public  void move_to_splash() {
      
 s= new splashBase();

        

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
  
        
      Scene sc=new Scene(s);
      Stage cur= (Stage) this.getScene().getWindow();
      cur.setScene(sc);
      

      }
     
     
     
     
     
     
     
    
    
}
