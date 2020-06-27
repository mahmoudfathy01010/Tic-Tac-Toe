package Memory_Game;

import javafx.scene.effect.*;
import java.lang.*;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public  class Y_Memory_ModesBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final VBox vBox;
    protected final AnchorPane anchorPane0;
    protected final VBox boxPane;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final Button animalBtn;
    protected final Bloom bloom;
    protected final AnchorPane anchorPane3;
    protected final AnchorPane anchorPane4;
    protected final Button transBtn;
    protected final Bloom bloom0;
    protected final AnchorPane anchorPane5;
    protected final AnchorPane anchorPane6;
    protected final Button mixBtn;
    protected final Bloom bloom1;
    protected final AnchorPane anchorPane7;
    protected final AnchorPane anchorPane8;
    protected final AnchorPane anchorPane9;
    protected final AnchorPane anchorPane10;
    protected final Label logoLabel;
    protected final ImageView musicImage;
    
    Y_Memory_MemoryDesign an;
    Y_MemoryTransportation tr;
    Y_Memory_Mixed_shapes mix;
    Y_Memory_home_secreenBase h;
    
    y_memory_winBase w;

    public Y_Memory_ModesBase() {

        anchorPane = new AnchorPane();
        vBox = new VBox();
        anchorPane0 = new AnchorPane();
        boxPane = new VBox();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        animalBtn = new Button();
        bloom = new Bloom();
        anchorPane3 = new AnchorPane();
        anchorPane4 = new AnchorPane();
        transBtn = new Button();
        bloom0 = new Bloom();
        anchorPane5 = new AnchorPane();
        anchorPane6 = new AnchorPane();
        mixBtn = new Button();
        bloom1 = new Bloom();
        anchorPane7 = new AnchorPane();
        anchorPane8 = new AnchorPane();
        anchorPane9 = new AnchorPane();
        anchorPane10 = new AnchorPane();
        logoLabel = new Label();
         musicImage = new ImageView();

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
        anchorPane.setPrefHeight(19.0);
        anchorPane.setPrefWidth(800.0);
        setBottom(anchorPane);
        
        
        musicImage.setLayoutY(2.0);
        musicImage.setFitHeight(62.0);
        musicImage.setFitWidth(73.0);
        musicImage.setPickOnBounds(true);
        musicImage.setPreserveRatio(true);
        //musicImage.setImage(new Image(getClass().getResource("../../../Desktop/untitled%20folder/unnamed.png").toExternalForm()));
//        setCenter(vBox);

        BorderPane.setAlignment(vBox, javafx.geometry.Pos.CENTER);
        vBox.setMaxHeight(USE_PREF_SIZE);
        vBox.setMaxWidth(USE_PREF_SIZE);
        vBox.setPrefHeight(365.0);
        vBox.setPrefWidth(405.0);
        vBox.setStyle("-fx-border-color: f BurlyWood; -fx-border-width: 7 7 7 7;");

        anchorPane0.setMaxHeight(USE_PREF_SIZE);
        anchorPane0.setMaxWidth(USE_PREF_SIZE);
        anchorPane0.setMinHeight(USE_PREF_SIZE);
        anchorPane0.setMinWidth(USE_PREF_SIZE);
        anchorPane0.setPrefHeight(44.0);
        anchorPane0.setPrefWidth(363.0);
        anchorPane0.setStyle("-fx-background-color: transperetnt;");

        boxPane.setLayoutX(-49.0);
        boxPane.setLayoutY(28.0);
        boxPane.setMaxHeight(USE_PREF_SIZE);
        boxPane.setMaxWidth(USE_PREF_SIZE);
        boxPane.setPrefHeight(247.0);
        boxPane.setPrefWidth(486.0);
        boxPane.setStyle("-fx-border-width: 7 7 7 7; -fx-border-radius: 30 30 30 30; -fx-border-color: NavajoWhite;");

        anchorPane1.setMaxHeight(USE_PREF_SIZE);
        anchorPane1.setMaxWidth(USE_PREF_SIZE);
        anchorPane1.setMinHeight(USE_PREF_SIZE);
        anchorPane1.setMinWidth(USE_PREF_SIZE);
        anchorPane1.setPrefHeight(18.0);
        anchorPane1.setPrefWidth(478.0);
        anchorPane1.setStyle("-fx-background-color: transperetnt;");

        anchorPane2.setPrefHeight(71.0);
        anchorPane2.setPrefWidth(405.0);

        AnchorPane.setBottomAnchor(animalBtn, 0.0);
        AnchorPane.setLeftAnchor(animalBtn, 114.0);
        AnchorPane.setRightAnchor(animalBtn, 113.0);
        AnchorPane.setTopAnchor(animalBtn, 0.0);
        animalBtn.setLayoutX(114.0);
        animalBtn.setMaxHeight(USE_PREF_SIZE);
        animalBtn.setMaxWidth(USE_PREF_SIZE);
        animalBtn.setMinHeight(USE_PREF_SIZE);
        animalBtn.setMinWidth(USE_PREF_SIZE);
        animalBtn.setMnemonicParsing(false);
        animalBtn.setPrefHeight(70.0);
        animalBtn.setPrefWidth(260.0);
        animalBtn.setStyle("-fx-background-color: transperent;");
        animalBtn.setText("Animals & birds");
        animalBtn.setTextFill(javafx.scene.paint.Color.valueOf("#070707"));
        animalBtn.setFont(new Font("System Bold", 20.0));

        anchorPane2.setEffect(bloom);

        anchorPane3.setPrefHeight(30.0);
        anchorPane3.setPrefWidth(405.0);

        anchorPane4.setPrefHeight(71.0);
        anchorPane4.setPrefWidth(405.0);

        AnchorPane.setBottomAnchor(transBtn, 0.0);
        AnchorPane.setLeftAnchor(transBtn, 114.0);
        AnchorPane.setTopAnchor(transBtn, 0.0);
        transBtn.setLayoutX(114.0);
        transBtn.setMaxHeight(USE_PREF_SIZE);
        transBtn.setMaxWidth(USE_PREF_SIZE);
        transBtn.setMinHeight(USE_PREF_SIZE);
        transBtn.setMinWidth(USE_PREF_SIZE);
        transBtn.setMnemonicParsing(false);
        transBtn.setPrefHeight(71.0);
        transBtn.setPrefWidth(259.0);
        transBtn.setStyle("-fx-background-color: transperent;");
        transBtn.setText("Transportation");
        transBtn.setTextFill(javafx.scene.paint.Color.valueOf("#1e1e1e"));
        transBtn.setFont(new Font("System Bold", 20.0));

        anchorPane4.setEffect(bloom0);

        anchorPane5.setPrefHeight(30.0);
        anchorPane5.setPrefWidth(405.0);

        anchorPane6.setPrefHeight(59.0);
        anchorPane6.setPrefWidth(472.0);

        mixBtn.setLayoutX(162.0);
        mixBtn.setLayoutY(1.0);
        mixBtn.setMaxHeight(USE_PREF_SIZE);
        mixBtn.setMaxWidth(USE_PREF_SIZE);
        mixBtn.setMinHeight(USE_PREF_SIZE);
        mixBtn.setMinWidth(USE_PREF_SIZE);
        mixBtn.setMnemonicParsing(false);
        mixBtn.setPrefHeight(71.0);
        mixBtn.setPrefWidth(163.0);
        mixBtn.setStyle("-fx-background-color: transperent;");
        mixBtn.setText("Mix");
        mixBtn.setTextFill(javafx.scene.paint.Color.valueOf("#0a0a0a"));
        mixBtn.setFont(new Font("System Bold", 20.0));

        anchorPane6.setEffect(bloom1);

        anchorPane7.setPrefHeight(0.0);
        anchorPane7.setPrefWidth(487.0);
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

        AnchorPane.setBottomAnchor(logoLabel, -4.0);
        AnchorPane.setLeftAnchor(logoLabel, 0.0);
        AnchorPane.setRightAnchor(logoLabel, 0.0);
        AnchorPane.setTopAnchor(logoLabel, 7.0);
        logoLabel.setAlignment(javafx.geometry.Pos.CENTER);
        logoLabel.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        logoLabel.setLayoutY(7.0);
        logoLabel.setMaxWidth(USE_PREF_SIZE);
        logoLabel.setMinHeight(USE_PREF_SIZE);
        logoLabel.setMinWidth(USE_PREF_SIZE);
        logoLabel.setPrefHeight(64.0);
        logoLabel.setPrefWidth(600.0);
        logoLabel.setText("Memory Game");
        logoLabel.setFont(new Font("Monospaced Bold", 53.0));
        setTop(anchorPane10);

        boxPane.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(animalBtn);
        boxPane.getChildren().add(anchorPane2);
        boxPane.getChildren().add(anchorPane3);
        anchorPane4.getChildren().add(transBtn);
        boxPane.getChildren().add(anchorPane4);
        boxPane.getChildren().add(anchorPane5);
        anchorPane6.getChildren().add(mixBtn);
        boxPane.getChildren().add(anchorPane6);
        boxPane.getChildren().add(anchorPane7);
        anchorPane0.getChildren().add(boxPane);
        vBox.getChildren().add(anchorPane0);
        vBox.getChildren().add(musicImage);
        anchorPane10.getChildren().add(logoLabel);

   transBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) { 
                  
                  move_to_trans();
                  
              }  
            });
   
   animalBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) { 
                  
                move_to_animal();
                  
              }  
            });
   
   mixBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) { 
                  
              move_to_mix();
                  
              }  
            });
    
   
   
   
   
   
   
   
   
    final String IDLE_BUTTON_STYLE = "-fx-background-color: transparent;";
        final String HOVERED_BUTTON_STYLE = "-fx-background-color: -fx-shadow-highlight-color, -fx-outer-border, -fx-inner-border, -fx-body-color;";

        animalBtn.setStyle(IDLE_BUTTON_STYLE);
        animalBtn.setOnMouseEntered(e -> animalBtn.setStyle(HOVERED_BUTTON_STYLE));
        animalBtn.setOnMouseExited(e -> animalBtn.setStyle(IDLE_BUTTON_STYLE));

        transBtn.setStyle(IDLE_BUTTON_STYLE);
        transBtn.setOnMouseEntered(e -> transBtn.setStyle(HOVERED_BUTTON_STYLE));
        transBtn.setOnMouseExited(e ->transBtn.setStyle(IDLE_BUTTON_STYLE));

        mixBtn.setStyle(IDLE_BUTTON_STYLE);
        mixBtn.setOnMouseEntered(e -> mixBtn.setStyle(HOVERED_BUTTON_STYLE));
        mixBtn.setOnMouseExited(e -> mixBtn.setStyle(IDLE_BUTTON_STYLE));   
        
        
        
        
        
        
         Image image2 = new Image(getClass().getResource("/imgs/Home.png").toExternalForm());
        musicImage.setImage(image2);
        
        
        
        musicImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) { 
                  
                  move_to_home();
                  
              }  
            });
        
        
        
        
   
    
    }
    
    
    
     public  void move_to_animal() {
      
 an = new Y_Memory_MemoryDesign();

        

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
        
       an.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(an);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=new Scene(an);
      Stage cur= (Stage) this.getScene().getWindow();
      cur.setScene(s);
      

      }

    
    
    
     
     
     
       public  void move_to_trans() {
      
 tr= new Y_MemoryTransportation();

        

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
        
       tr.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(tr);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=new Scene(tr);
      Stage cur= (Stage) this.getScene().getWindow();
      cur.setScene(s);
      

      }

    
    
    
    
     
       public  void move_to_mix() {
      
     mix= new Y_Memory_Mixed_shapes();

        

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
        
       mix.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(mix);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=new Scene(mix);
      Stage cur= (Stage) this.getScene().getWindow();
      cur.setScene(s);
      

      }

     
     
    
     
      public  void move_to_home() {
      
     h= new Y_Memory_home_secreenBase();

        

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_h();
          }
      });
      
      fd.play();
      
      }
    
     private void load_h()
      {
          
          
          System.out.println("hello from constructor");
        
       h.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(h);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=new Scene(h);
      Stage cur= (Stage) this.getScene().getWindow();
      cur.setScene(s);
      

      }

     
     
     
     
     
     
      
     
     
     
     
     
     
     
     
    
    
    
    
    
    
    
}
