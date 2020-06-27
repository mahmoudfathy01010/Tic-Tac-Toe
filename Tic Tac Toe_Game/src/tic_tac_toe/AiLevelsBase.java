package tic_tac_toe;


//friday 14 feb;
//8:12pm




import java.io.File;
import javafx.scene.effect.*;
import java.lang.*;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public  class AiLevelsBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Label label;
    protected final VBox vBox;
    protected final AnchorPane anchorPane0;
    protected final VBox boxPane;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final ProgressBar progressBar;
    protected final Button easybtn;
    protected final AnchorPane anchorPane3;
    protected final AnchorPane anchorPane4;
    protected final Bloom bloom;
    protected final AnchorPane anchorPane5;
    protected final AnchorPane anchorPane6;
    protected final Button medbtn;
    protected final ProgressBar progressBar0;
    protected final Bloom bloom0;
    protected final AnchorPane anchorPane7;
    protected final AnchorPane anchorPane8;
    protected final Button diffbtn;
    protected final ProgressBar progressBar1;
    protected final Bloom bloom1;
    protected final AnchorPane anchorPane9;
    protected final AnchorPane anchorPane10;
    protected final AnchorPane anchorPane11;
    protected final AnchorPane anchorPane12;
    protected final AnchorPane anchorPane13;
    protected final AnchorPane anchorPane14;
    protected final Line line_r;
    protected final ImageView musicImage;
    protected final AnchorPane anchorPane15;
    protected final AnchorPane anchorPane16;
    protected final AnchorPane anchorPane17;
    protected final Label logoLabel;
    
    String hitNormal ;
    Media sound ;
    MediaPlayer mediaPlayer1_b ;
    home_secreen h;
    z_ai_easy_xo ze;
    z_ai_med_xo zm;
    z_ai_difficult_xo zd;
    
   
    
     //function of transition : 
    public  void move_to_home() 
      {
          
          

        h=new  home_secreen();
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
        
       h.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(h);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
         Scene s=musicImage.getScene();
         s.setRoot(h);
      
      
      }
    ////////////////////////////////////////////
    
    /* move to easy */
     public  void move_to_easy_ai() {
      
 ze= new z_ai_easy_xo();
mediaPlayer1_b.stop();
        

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_e();
          }
      });
      
      fd.play();
      
      }
    
     private void load_e()
      {
          
          
          System.out.println("hello from constructor");
        
       ze.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(ze);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        Scene s=easybtn.getScene();
        s.setRoot(ze);

      }
     
     /*move to easy*/
    
     
      /* move to med */
     
     
       public  void move_to_med_ai() {
      
 zm= new z_ai_med_xo();
mediaPlayer1_b.stop();
        

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
        
       zm.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(zm);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        Scene s=medbtn.getScene();
        s.setRoot(zm);

      
      }
     
     
     
     /*move to med*/
    
     
      /* move to diff */
     
     public  void move_to_diff_ai() {
      
 zd= new z_ai_difficult_xo();
mediaPlayer1_b.stop();
        

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_d();
          }
      });
      
      fd.play();
      
      }
    
     private void load_d()
      {
          
          
          System.out.println("hello from constructor");
        
       zd.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(zd);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
      
         
        Scene s=diffbtn.getScene();
        
        s.setRoot(zd);
        

      
      }
     /*move to diff*/
    

    public AiLevelsBase(int m) {
        
        int mm=m;

        anchorPane = new AnchorPane();
        label = new Label();
        vBox = new VBox();
        anchorPane0 = new AnchorPane();
        boxPane = new VBox();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        progressBar = new ProgressBar();
        easybtn = new Button();
        anchorPane3 = new AnchorPane();
        anchorPane4 = new AnchorPane();
        bloom = new Bloom();
        anchorPane5 = new AnchorPane();
        anchorPane6 = new AnchorPane();
        medbtn = new Button();
        progressBar0 = new ProgressBar();
        bloom0 = new Bloom();
        anchorPane7 = new AnchorPane();
        anchorPane8 = new AnchorPane();
        diffbtn = new Button();
        progressBar1 = new ProgressBar();
        bloom1 = new Bloom();
        anchorPane9 = new AnchorPane();
        anchorPane10 = new AnchorPane();
        anchorPane11 = new AnchorPane();
        anchorPane12 = new AnchorPane();
        anchorPane13 = new AnchorPane();
        anchorPane14 = new AnchorPane();
        line_r = new Line();
        musicImage = new ImageView();
        anchorPane15 = new AnchorPane();
        anchorPane16 = new AnchorPane();
        anchorPane17 = new AnchorPane();
        logoLabel = new Label();

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

        AnchorPane.setRightAnchor(progressBar, 88.0);
        AnchorPane.setTopAnchor(progressBar, 22.0);
        progressBar.setLayoutX(251.0);
        progressBar.setLayoutY(22.0);
        progressBar.setMaxHeight(USE_PREF_SIZE);
        progressBar.setMaxWidth(USE_PREF_SIZE);
        progressBar.setMinHeight(USE_PREF_SIZE);
        progressBar.setMinWidth(USE_PREF_SIZE);
        progressBar.setPrefHeight(20.0);
        progressBar.setPrefWidth(148.0);
        progressBar.setProgress(0.24);
        progressBar.setStyle("-fx-border-width: 3 3 3 3; -fx-border-radius: 10 10 10 10; -fx-border-color: DarkGoldenRod;");

        AnchorPane.setBottomAnchor(easybtn, 0.0);
        AnchorPane.setLeftAnchor(easybtn, 0.0);
        AnchorPane.setRightAnchor(easybtn, 347.0);
        AnchorPane.setTopAnchor(easybtn, 0.0);
        easybtn.setLayoutX(21.0);
        easybtn.setLayoutY(10.0);
        easybtn.setMaxHeight(USE_PREF_SIZE);
        easybtn.setMaxWidth(USE_PREF_SIZE);
        easybtn.setMinHeight(USE_PREF_SIZE);
        easybtn.setMinWidth(USE_PREF_SIZE);
        easybtn.setMnemonicParsing(false);
        easybtn.setPrefHeight(70.0);
        easybtn.setPrefWidth(140.0);
        easybtn.setStyle("-fx-background-color: transperent;");
        easybtn.setText("Easy");
        easybtn.setTextFill(javafx.scene.paint.Color.AQUA);
        easybtn.setFont(new Font("System Bold", 30.0));

        anchorPane3.setLayoutX(43.0);
        anchorPane3.setLayoutY(-36.0);
        anchorPane3.setPrefHeight(69.0);
        anchorPane3.setPrefWidth(379.0);
        anchorPane3.setStyle("-fx-background-color: transperent;");

        AnchorPane.setBottomAnchor(anchorPane4, -38.0);
        AnchorPane.setLeftAnchor(anchorPane4, 137.0);
        AnchorPane.setRightAnchor(anchorPane4, 62.0);
        AnchorPane.setTopAnchor(anchorPane4, 38.0);
        anchorPane4.setLayoutX(137.0);
        anchorPane4.setLayoutY(38.0);
        anchorPane4.setMaxHeight(USE_PREF_SIZE);
        anchorPane4.setMaxWidth(USE_PREF_SIZE);
        anchorPane4.setMinHeight(USE_PREF_SIZE);
        anchorPane4.setMinWidth(USE_PREF_SIZE);
        anchorPane4.setPrefHeight(60.0);
        anchorPane4.setPrefWidth(204.0);

        anchorPane2.setEffect(bloom);

        anchorPane5.setPrefHeight(30.0);
        anchorPane5.setPrefWidth(405.0);

        anchorPane6.setPrefHeight(71.0);
        anchorPane6.setPrefWidth(405.0);

        AnchorPane.setBottomAnchor(medbtn, -3.0);
        AnchorPane.setLeftAnchor(medbtn, -8.0);
        AnchorPane.setTopAnchor(medbtn, 3.0);
        medbtn.setLayoutX(-8.0);
        medbtn.setLayoutY(3.0);
        medbtn.setMaxHeight(USE_PREF_SIZE);
        medbtn.setMaxWidth(USE_PREF_SIZE);
        medbtn.setMinHeight(USE_PREF_SIZE);
        medbtn.setMinWidth(USE_PREF_SIZE);
        medbtn.setMnemonicParsing(false);
        medbtn.setPrefHeight(71.0);
        medbtn.setPrefWidth(259.0);
        medbtn.setStyle("-fx-background-color: transperent;");
        medbtn.setText("Intermediate");
        medbtn.setTextFill(javafx.scene.paint.Color.AQUA);
        medbtn.setFont(new Font("System Bold", 30.0));

        progressBar0.setLayoutX(256.0);
        progressBar0.setLayoutY(26.0);
        progressBar0.setMaxHeight(USE_PREF_SIZE);
        progressBar0.setMaxWidth(USE_PREF_SIZE);
        progressBar0.setMinHeight(USE_PREF_SIZE);
        progressBar0.setMinWidth(USE_PREF_SIZE);
        progressBar0.setPrefHeight(20.0);
        progressBar0.setPrefWidth(148.0);
        progressBar0.setProgress(0.5);
        progressBar0.setStyle("-fx-border-color: DarkGoldenRod; -fx-border-width: 3 3 3 3; -fx-border-radius: 10 10 10 10;");

        anchorPane6.setEffect(bloom0);

        anchorPane7.setPrefHeight(30.0);
        anchorPane7.setPrefWidth(405.0);

        anchorPane8.setPrefHeight(59.0);
        anchorPane8.setPrefWidth(472.0);

        diffbtn.setLayoutX(3.0);
        diffbtn.setLayoutY(2.0);
        diffbtn.setMaxHeight(USE_PREF_SIZE);
        diffbtn.setMaxWidth(USE_PREF_SIZE);
        diffbtn.setMinHeight(USE_PREF_SIZE);
        diffbtn.setMinWidth(USE_PREF_SIZE);
        diffbtn.setMnemonicParsing(false);
        diffbtn.setPrefHeight(71.0);
        diffbtn.setPrefWidth(163.0);
        diffbtn.setStyle("-fx-background-color: transperent;");
        diffbtn.setText("Difficult");
        diffbtn.setTextFill(javafx.scene.paint.Color.AQUA);
        diffbtn.setFont(new Font("System Bold", 30.0));

        progressBar1.setLayoutX(250.0);
        progressBar1.setLayoutY(27.0);
        progressBar1.setMaxHeight(USE_PREF_SIZE);
        progressBar1.setMaxWidth(USE_PREF_SIZE);
        progressBar1.setMinHeight(USE_PREF_SIZE);
        progressBar1.setMinWidth(USE_PREF_SIZE);
        progressBar1.setPrefHeight(20.0);
        progressBar1.setPrefWidth(148.0);
        progressBar1.setProgress(0.86);
        progressBar1.setStyle("-fx-border-width: 3 3 3 3; -fx-border-color: DarkGoldenRod; -fx-border-radius: 10 10 10 10;");

        anchorPane8.setEffect(bloom1);

        anchorPane9.setPrefHeight(0.0);
        anchorPane9.setPrefWidth(487.0);

        anchorPane10.setMaxHeight(USE_PREF_SIZE);
        anchorPane10.setMaxWidth(USE_PREF_SIZE);
        anchorPane10.setMinHeight(USE_PREF_SIZE);
        anchorPane10.setMinWidth(USE_PREF_SIZE);
        anchorPane10.setPrefHeight(60.0);
        anchorPane10.setPrefWidth(403.0);
        anchorPane10.setStyle("-fx-background-color: transperent;");

        anchorPane11.setPrefHeight(74.0);
        anchorPane11.setPrefWidth(403.0);
        anchorPane11.setStyle("-fx-background-color: transperent;");

        anchorPane12.setPrefHeight(60.0);
        anchorPane12.setPrefWidth(403.0);

        anchorPane13.setMaxHeight(USE_PREF_SIZE);
        anchorPane13.setMaxWidth(USE_PREF_SIZE);
        anchorPane13.setMinHeight(USE_PREF_SIZE);
        anchorPane13.setMinWidth(USE_PREF_SIZE);
        anchorPane13.setPrefHeight(60.0);
        anchorPane13.setPrefWidth(403.0);
        anchorPane13.setStyle("-fx-background-color: Transperent;");

        AnchorPane.setBottomAnchor(anchorPane14, 0.0);
        AnchorPane.setLeftAnchor(anchorPane14, 0.0);
        AnchorPane.setTopAnchor(anchorPane14, 0.0);
        anchorPane14.setLayoutX(6.0);
        anchorPane14.setLayoutY(-12.0);
        anchorPane14.setMaxHeight(USE_PREF_SIZE);
        anchorPane14.setMaxWidth(USE_PREF_SIZE);
        anchorPane14.setMinHeight(USE_PREF_SIZE);
        anchorPane14.setMinWidth(USE_PREF_SIZE);
        anchorPane14.setPrefHeight(60.0);
        anchorPane14.setPrefWidth(200.0);
        anchorPane14.setStyle("-fx-background-color: transperent;");

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

        musicImage.setFitHeight(62.0);
        musicImage.setFitWidth(73.0);
        musicImage.setPickOnBounds(true);
        musicImage.setPreserveRatio(true);
        //musicImage.setImage(new Image(getClass().getResource("../../../Desktop/untitled%20folder/unnamed.png").toExternalForm()));
        setCenter(vBox);

        BorderPane.setAlignment(anchorPane15, javafx.geometry.Pos.CENTER);
        anchorPane15.setPrefHeight(333.0);
        anchorPane15.setPrefWidth(120.0);
        anchorPane15.setStyle("-fx-background-color: Transperent;");
        setLeft(anchorPane15);

        BorderPane.setAlignment(anchorPane16, javafx.geometry.Pos.CENTER);
        anchorPane16.setPrefHeight(333.0);
        anchorPane16.setPrefWidth(120.0);
        setRight(anchorPane16);

        BorderPane.setAlignment(anchorPane17, javafx.geometry.Pos.CENTER);
        anchorPane17.setPrefHeight(53.0);
        anchorPane17.setPrefWidth(600.0);

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
        logoLabel.setText("TIC TAC TOE");
        logoLabel.setFont(new Font("Monospaced Bold", 53.0));
        logoLabel.setStyle("-fx-text-fill:linear-gradient(to bottom right, WHITE, CYAN);");
        setTop(anchorPane17);

        anchorPane.getChildren().add(label);
        boxPane.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(progressBar);
        anchorPane2.getChildren().add(easybtn);
        anchorPane3.getChildren().add(anchorPane4);
        anchorPane2.getChildren().add(anchorPane3);
        boxPane.getChildren().add(anchorPane2);
        boxPane.getChildren().add(anchorPane5);
        anchorPane6.getChildren().add(medbtn);
        anchorPane6.getChildren().add(progressBar0);
        boxPane.getChildren().add(anchorPane6);
        boxPane.getChildren().add(anchorPane7);
        anchorPane8.getChildren().add(diffbtn);
        anchorPane8.getChildren().add(progressBar1);
        boxPane.getChildren().add(anchorPane8);
        boxPane.getChildren().add(anchorPane9);
        anchorPane0.getChildren().add(boxPane);
        vBox.getChildren().add(anchorPane0);
        vBox.getChildren().add(anchorPane10);
        vBox.getChildren().add(anchorPane11);
        vBox.getChildren().add(anchorPane12);
        anchorPane14.getChildren().add(line_r);
        anchorPane13.getChildren().add(anchorPane14);
        vBox.getChildren().add(anchorPane13);
        vBox.getChildren().add(musicImage);
        anchorPane17.getChildren().add(logoLabel);
        
        
        
        
        /********** hover style******/
        
        
        final String IDLE_BUTTON_STYLE = "-fx-background-color: transparent;";
        final String HOVERED_BUTTON_STYLE = "-fx-background-color: -fx-shadow-highlight-color, -fx-outer-border, -fx-inner-border, -fx-body-color;";

        easybtn.setStyle(IDLE_BUTTON_STYLE);
        easybtn.setOnMouseEntered(e -> easybtn.setStyle(HOVERED_BUTTON_STYLE));
        easybtn.setOnMouseExited(e -> easybtn.setStyle(IDLE_BUTTON_STYLE));

        medbtn.setStyle(IDLE_BUTTON_STYLE);
        medbtn.setOnMouseEntered(e -> medbtn.setStyle(HOVERED_BUTTON_STYLE));
        medbtn.setOnMouseExited(e -> medbtn.setStyle(IDLE_BUTTON_STYLE));

        diffbtn.setStyle(IDLE_BUTTON_STYLE);
        diffbtn.setOnMouseEntered(e -> diffbtn.setStyle(HOVERED_BUTTON_STYLE));
        diffbtn.setOnMouseExited(e -> diffbtn.setStyle(IDLE_BUTTON_STYLE));     
        



                /********************/



        /*music*/
        
         //hitNormal = ("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/sounds/Marimba-music.mp3");
        sound = new Media(getClass().getResource("/tic_tac_toe/sounds/Marimba-music.mp3").toExternalForm());

        mediaPlayer1_b = new MediaPlayer(sound);
        mediaPlayer1_b.setVolume(0.05);
        mediaPlayer1_b.stop();

        if (mm % 2 == 0) {

            mediaPlayer1_b.play();

        } else {

            mediaPlayer1_b.stop();

        }


        
        /*music*/
        
        
        
        //File file2 = new File("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/image/unnamed.png");
        Image image2 = new Image(getClass().getResource("/tic_tac_toe/image/unnamed.png").toExternalForm());
        musicImage.setImage(image2);
        
        
        
        musicImage.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                
                
                move_to_home();
                
                
            }
        }

         );
        
        
        easybtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            
            move_to_easy_ai();
            
            
            
            }
            
            
        });
         
        
         medbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            
            move_to_med_ai();
            
            
            
            }
            
            
        });
         
       
         
        
        diffbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            
            move_to_diff_ai();
            
            
            
            }
            
            
        });
         
   
    }
}
