package Memory_Game;

import java.lang.*;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public  class y_memory_winBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Label label;
    protected final AnchorPane mainancban;
    protected final GridPane gridPane;
    protected final AnchorPane anchorPane0;
    protected final ImageView replay_image;
    protected final Label label0;
    protected final AnchorPane anchorPane1;
    protected final ImageView home;
    protected final Label label1;
    protected final ImageView save_image;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final AnchorPane anchorPane2;
    protected final ImageView trophy;
    protected final Label label2;
    protected final AnchorPane anchorPane3;
    protected final AnchorPane anchorPane4;
    protected final AnchorPane anchorPane5;
    protected final Label logo_label;
    
    Y_Memory_home_secreenBase h;
    
    
    
    Y_Memory_Computer c;
    Y_Memory_MemoryDesign an;
    Y_Memory_Mixed_shapes mix;
    Y_MemoryTransportation tr;
   

    public y_memory_winBase(String winner) {

        anchorPane = new AnchorPane();
        label = new Label();
        mainancban = new AnchorPane();
        gridPane = new GridPane();
        anchorPane0 = new AnchorPane();
        replay_image = new ImageView();
        label0 = new Label();
        anchorPane1 = new AnchorPane();
        home = new ImageView();
        label1 = new Label();
        save_image = new ImageView();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        anchorPane2 = new AnchorPane();
        trophy = new ImageView();
        label2 = new Label();
        anchorPane3 = new AnchorPane();
        anchorPane4 = new AnchorPane();
        anchorPane5 = new AnchorPane();
        logo_label = new Label();

        setId("border");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(200.0);
        setPrefHeight(650.0);
        setPrefWidth(800.0);
        setStyle("-fx-background-color: linear-gradient(to bottom right, WHITE,DarkSlateGrey); -fx-border-color: BurlyWood; -fx-border-width: 7 7 7 7;");
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
        label.setTextFill(javafx.scene.paint.Color.valueOf("#f5f5f5"));
        setBottom(anchorPane);

        BorderPane.setAlignment(mainancban, javafx.geometry.Pos.CENTER);
        mainancban.setMaxHeight(USE_PREF_SIZE);
        mainancban.setMaxWidth(USE_PREF_SIZE);
        mainancban.setMinHeight(USE_PREF_SIZE);
        mainancban.setMinWidth(USE_PREF_SIZE);
        mainancban.setPrefHeight(534.0);
        mainancban.setPrefWidth(753.0);

        AnchorPane.setBottomAnchor(gridPane, 27.0);
        AnchorPane.setRightAnchor(gridPane, 53.0);
        AnchorPane.setTopAnchor(gridPane, 401.0);
        gridPane.setLayoutX(52.0);
        gridPane.setLayoutY(408.0);
        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(106.0);
        gridPane.setPrefWidth(645.0);

        GridPane.setRowIndex(anchorPane0, 2);
        anchorPane0.setMaxHeight(USE_PREF_SIZE);
        anchorPane0.setMaxWidth(USE_PREF_SIZE);
        anchorPane0.setMinHeight(USE_PREF_SIZE);
        anchorPane0.setMinWidth(USE_PREF_SIZE);
        anchorPane0.setPrefHeight(98.0);
        anchorPane0.setPrefWidth(305.0);

        replay_image.setFitHeight(50.0);
        replay_image.setFitWidth(55.0);
        replay_image.setLayoutX(125.0);
        replay_image.setLayoutY(12.0);
        replay_image.setPickOnBounds(true);
        replay_image.setPreserveRatio(true);

        AnchorPane.setLeftAnchor(label0, -3.0);
        AnchorPane.setRightAnchor(label0, 3.0);
        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(-3.0);
        label0.setLayoutY(72.0);
        label0.setMaxHeight(USE_PREF_SIZE);
        label0.setMaxWidth(USE_PREF_SIZE);
        label0.setMinHeight(USE_PREF_SIZE);
        label0.setMinWidth(USE_PREF_SIZE);
        label0.setPrefHeight(37.0);
        label0.setPrefWidth(305.0);
        label0.setText("Reply");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#171717"));
        label0.setFont(new Font(19.0));

        GridPane.setColumnIndex(anchorPane1, 1);
        GridPane.setRowIndex(anchorPane1, 2);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        home.setFitHeight(56.0);
        home.setFitWidth(57.0);
        home.setLayoutX(200.0);
        home.setLayoutY(13.0);
        home.setPickOnBounds(true);
        home.setPreserveRatio(true);

        label1.setAlignment(javafx.geometry.Pos.CENTER);
        label1.setLayoutX(113.0);
        label1.setLayoutY(89.0);
        label1.setMaxHeight(USE_PREF_SIZE);
        label1.setMaxWidth(USE_PREF_SIZE);
        label1.setMinHeight(USE_PREF_SIZE);
        label1.setMinWidth(USE_PREF_SIZE);
        label1.setPrefHeight(37.0);
        label1.setPrefWidth(235.0);
        label1.setText("Home");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#111010"));
        label1.setFont(new Font(19.0));

        save_image.setFitHeight(50.0);
        save_image.setFitWidth(55.0);
        save_image.setLayoutX(25.0);
        save_image.setLayoutY(22.0);
        save_image.setOpacity(0.66);
        save_image.setPickOnBounds(true);
        save_image.setPreserveRatio(true);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(317.27703857421875);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(265.7701721191406);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(380.66058349609375);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(379.2298278808594);


        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        AnchorPane.setBottomAnchor(anchorPane2, 209.0);
        AnchorPane.setLeftAnchor(anchorPane2, 193.0);
        AnchorPane.setRightAnchor(anchorPane2, 171.0);
        AnchorPane.setTopAnchor(anchorPane2, 14.0);
        anchorPane2.setLayoutX(200.0);
        anchorPane2.setLayoutY(21.0);
        anchorPane2.setMaxHeight(USE_PREF_SIZE);
        anchorPane2.setMaxWidth(USE_PREF_SIZE);
        anchorPane2.setMinHeight(USE_PREF_SIZE);
        anchorPane2.setMinWidth(USE_PREF_SIZE);
        anchorPane2.setPrefHeight(311.0);
        anchorPane2.setPrefWidth(389.0);

        AnchorPane.setBottomAnchor(trophy, -4.0);
        AnchorPane.setTopAnchor(trophy, 7.0);
        trophy.setFitHeight(308.0);
        trophy.setFitWidth(412.0);
        trophy.setLayoutX(23.0);
        trophy.setLayoutY(7.0);
        trophy.setPickOnBounds(true);
        trophy.setPreserveRatio(true);

        label2.setAlignment(javafx.geometry.Pos.CENTER);
        label2.setLayoutX(-2.0);
        label2.setLayoutY(327.0);
        label2.setPrefHeight(87.0);
        label2.setPrefWidth(757.0);
        label2.setText(winner);
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#f5ee1b"));
        label2.setFont(new Font(48.0));
        setCenter(mainancban);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setPrefHeight(333.0);
        anchorPane3.setPrefWidth(120.0);
        anchorPane3.setStyle("-fx-background-color: Transperent;");
        setLeft(anchorPane3);

        BorderPane.setAlignment(anchorPane4, javafx.geometry.Pos.CENTER);
        anchorPane4.setPrefHeight(333.0);
        anchorPane4.setPrefWidth(120.0);
        setRight(anchorPane4);

        BorderPane.setAlignment(anchorPane5, javafx.geometry.Pos.CENTER);
        anchorPane5.setPrefHeight(80.0);
        anchorPane5.setPrefWidth(800.0);

        AnchorPane.setBottomAnchor(logo_label, 12.0);
        AnchorPane.setLeftAnchor(logo_label, 0.0);
        AnchorPane.setRightAnchor(logo_label, 0.0);
        AnchorPane.setTopAnchor(logo_label, 0.0);
        logo_label.setAlignment(javafx.geometry.Pos.CENTER);
        logo_label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        logo_label.setLayoutX(4.0);
        logo_label.setLayoutY(-22.0);
        logo_label.setMaxWidth(USE_PREF_SIZE);
        logo_label.setMinHeight(USE_PREF_SIZE);
        logo_label.setMinWidth(USE_PREF_SIZE);
        logo_label.setPrefHeight(68.0);
        logo_label.setPrefWidth(800.0);
        logo_label.setText("Memory Game");
        logo_label.setTextFill(javafx.scene.paint.Color.valueOf("#0f0f0f"));
        logo_label.setFont(new Font("Monospaced Bold", 53.0));
        setTop(anchorPane5);

        anchorPane.getChildren().add(label);
        anchorPane0.getChildren().add(replay_image);
        anchorPane0.getChildren().add(label0);
        gridPane.getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(home);
        anchorPane1.getChildren().add(label1);
        anchorPane1.getChildren().add(save_image);
        gridPane.getChildren().add(anchorPane1);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        mainancban.getChildren().add(gridPane);
        anchorPane2.getChildren().add(trophy);
        mainancban.getChildren().add(anchorPane2);
        mainancban.getChildren().add(label2);
        anchorPane5.getChildren().add(logo_label);
        
        save_image.setOpacity(1);
        replay_image.setOpacity(0);
        home.setOpacity(0);
        
        
        
          Image image = new Image(getClass().getResource("/tic_tac_toe/image/trophy.gif").toExternalForm());
        trophy.setImage(image);
   
         //File file2 = new File("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/image/unnamed.png");
        Image image2 = new Image(getClass().getResource("/tic_tac_toe/image/unnamed.png").toExternalForm());
        save_image.setImage(image2);
        
        
        //File file3 = new File("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/image/arrow.png");
        Image image3 = new Image(getClass().getResource("/tic_tac_toe/image/arrow.png").toExternalForm());
        replay_image.setImage(image3);
        
        
        
        
         replay_image.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                System.out.print("replay");
                
                
                
                
                //enter code here 
                
                
                
                
                
            }
        }

         );

        
        
        
        
         save_image.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                
                move_to_home();
                
                
                
            }
        }

         );
        
        
        
        
        
        

    }
    
    
    
    
    
    
    /****** methods of transition ***/
    
    
    /**** to home **/
    
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
        /******* to computer*******/
     
     
     
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
     
     
     
     
     
     
     
     
     
    
    
    
    /******** to animal *********/
     
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
              load_a();
          }
      });
      
      fd.play();
      
      }
    
     private void load_a()
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


     
     /******** to mixed**********/
     
     
     
     
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
     
     
     /******** to transport**/
    
    
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


    
}
