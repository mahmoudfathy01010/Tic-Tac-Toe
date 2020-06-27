package tic_tac_toe;

import java.io.File;
import javafx.scene.shape.*;
import javafx.scene.effect.*;
import java.lang.*;
import java.util.ArrayList;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class xo_bordBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final Label message_label;
    protected final AnchorPane anchorPane1;
    protected final ImageView imageView1;
    protected final Label x_score_count;
    protected final Label x_score_label;
    protected final AnchorPane anchorPane2;
    protected final ImageView imageView2;
    protected final Label o_score_label;
    protected final Label o_score_count;
    protected final AnchorPane anchorPane3;
    protected final AnchorPane anchorPane4;
    protected final AnchorPane logo_pane;
    protected final Label logo_label;
    protected final AnchorPane image_pane;
    protected final ImageView music_image;
    protected final ImageView home_image;
    protected final Line line;
    protected final AnchorPane anchorPane5;
    protected final GridPane mygrid;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final AnchorPane anchorPane6;
    protected final Button btn1;
    protected final Glow glow;
    protected final AnchorPane anchorPane7;
    protected final Button btn2;
    protected final AnchorPane anchorPane8;
    protected final Button btn3;
    protected final AnchorPane anchorPane9;
    protected final Button btn4;
    protected final AnchorPane anchorPane10;
    protected final Button btn5;
    protected final AnchorPane anchorPane11;
    protected final Button btn6;
    protected final AnchorPane anchorPane12;
    protected final Button btn7;
    protected final AnchorPane anchorPane13;
    protected final Button btn8;
    protected final AnchorPane anchorPane14;
    protected final Button btn9;

   public static int m = 0; //flag for music ;

    /*music*/
    String hitNormal;
    String hitNormal_b;
    Media sound;
    Media sound_b;
   MediaPlayer mediaPlayer;
   MediaPlayer mediaPlayer1_b; // for background music

    /*music*/
 /* style text button*/
    String x_style_bt1_2_4_5;
    String o_style_bt1_2_4_5;

    String x_style_bt3_6;
    String o_style_bt3_6;

    String x_style_bt7_8;
    String o_style_bt7_8;
    
    String x_style_bt9;
    String o_style_bt9;
    
    
    String x_style_suc;
    String o_style_suc;
    
    home_secreen h;
    
    
     public static  int youWin =0;
    public static int computerWins =0;
   
   

    /* style text button*/
    
    
    // function of transition home : 
    
    
    
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
     
        
         Scene s=home_image.getScene();
         s.setRoot(h);

      
      }
    
    
    //
    
    
    
    public xo_bordBase() {
        
        
        System.out.println("heloooo++++");
        System.out.println("winner count"+youWin);
        System.out.println("computer count"+computerWins);

        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        message_label = new Label();
        anchorPane1 = new AnchorPane();
        imageView1 = new ImageView();
        x_score_count = new Label();
        x_score_label = new Label();
        anchorPane2 = new AnchorPane();
        imageView2 = new ImageView();
        o_score_label = new Label();
        o_score_count = new Label();
        anchorPane3 = new AnchorPane();
        anchorPane4 = new AnchorPane();
        logo_pane = new AnchorPane();
        logo_label = new Label();
        image_pane = new AnchorPane();
        music_image = new ImageView();
        home_image = new ImageView();
        line = new Line();
        anchorPane5 = new AnchorPane();
        mygrid = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        anchorPane6 = new AnchorPane();
        btn1 = new Button();
        glow = new Glow();
        anchorPane7 = new AnchorPane();
        btn2 = new Button();
        anchorPane8 = new AnchorPane();
        btn3 = new Button();
        anchorPane9 = new AnchorPane();
        btn4 = new Button();
        anchorPane10 = new AnchorPane();
        btn5 = new Button();
        anchorPane11 = new AnchorPane();
        btn6 = new Button();
        anchorPane12 = new AnchorPane();
        btn7 = new Button();
        anchorPane13 = new AnchorPane();
        btn8 = new Button();
        anchorPane14 = new AnchorPane();
        btn9 = new Button();

        /*style*/
        x_style_bt1_2_4_5 = "-fx-background-color:transperent ;-fx-border-color: turquoise; -fx-border-width: 0 1 1 0;-fx-text-fill: linear-gradient(#FF5555 40%, white 70%,  #fe1493 20%,white 40%);";
        o_style_bt1_2_4_5 = "-fx-background-color:transperent ;-fx-border-color: turquoise; -fx-border-width:0 1 1 0;-fx-text-fill: linear-gradient(  #FFCF00 40%, white 70%,  #fffc00 20%,white 40%);";

        x_style_bt3_6 = "-fx-background-color:transperent ;-fx-border-color: turquoise; -fx-border-width: 0 0 1 0;-fx-text-fill: linear-gradient( #FF5555 40%, white 70%,  #fe1493 20%,white 40%);";
        o_style_bt3_6 = "-fx-background-color:transperent ;-fx-border-color: turquoise; -fx-border-width:0 0 1 0;-fx-text-fill:  linear-gradient(#FFCF00 40%, white 70%,  #fffc00 20%,white 40%);";

        x_style_bt7_8 = "-fx-background-color:transperent ;-fx-border-color: turquoise; -fx-border-width: 0 1 0 0;-fx-text-fill: linear-gradient( #FF5555 40%, white 70%,  #fe1493 20%,white 40%);";
        o_style_bt7_8 = "-fx-background-color:transperent ;-fx-border-color: turquoise; -fx-border-width:0 1 0 0;-fx-text-fill: linear-gradient(#FFCF00 40%, white 70%,  #fffc00 20%,white 40%);;";

        
        x_style_bt9 = "-fx-background-color:transperent ;-fx-border-color: turquoise; -fx-border-width: 0 0 0 0;-fx-text-fill: linear-gradient( #FF5555 40%, white 70%,  #fe1493 20%,white 40%);";
        o_style_bt9 = "-fx-background-color:transperent ;-fx-border-color: turquoise; -fx-border-width:0 0 0 0;-fx-text-fill:linear-gradient(#FFCF00 40%, white 70%,  #fffc00 20%,white 40%);;";
        
         x_style_suc= "-fx-text-fill:linear-gradient(#FF5555 40%, white 70%,  #fe1493 20%,white 40%);-fx-background-color:linear-gradient(#08ff08, white);-fx-border-color:DarkSlateGrey; -fx-border-width: 4 4 4 4;";
          o_style_suc= "-fx-text-fill:linear-gradient(#FFCF00 40%, white 70%,  #fffc00 20%,white 40%);-fx-background-color:linear-gradient(#08ff08, white);-fx-border-color:DarkSlateGrey; -fx-border-width: 4 4 4 4;";
        
        /*style*/
 /*music*/
     //hitNormal = ("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/sounds/Marimba-music.mp3"); 
     //sound= new Media(new File(hitNormal).toURI().toString());
     
   sound = new Media(getClass().getResource("/tic_tac_toe/sounds/Marimba-music.mp3").toExternalForm());

        mediaPlayer1_b = new MediaPlayer(sound);
        mediaPlayer1_b.setVolume(0.09);
        mediaPlayer1_b.stop();
        if(m==0){
        mediaPlayer1_b.setAutoPlay(true);
        mediaPlayer1_b.setVolume(0.09);
        /*music*/
        }else{
        
        line.setOpacity(1);
        }
        
        /*
        

        */
        
        /*music*/
        
        
              //hitNormal_b = ("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/sounds/xo.mp3");
                    //sound_b= new Media(new File(hitNormal_b).toURI().toString());
                   sound_b= new Media(getClass().getResource("/tic_tac_toe/sounds/xo.mp3").toExternalForm());
                    mediaPlayer = new MediaPlayer(sound_b);
                    mediaPlayer.setVolume(0.5);
        
        
 /*music*/
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
        anchorPane.setId("anc");
        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(123.0);
        anchorPane.setPrefWidth(601.0);
        anchorPane.setStyle("-fx-background-color: Transperent;");

        anchorPane0.setLayoutX(147.0);
        anchorPane0.setLayoutY(-1.0);
        anchorPane0.setMaxHeight(USE_PREF_SIZE);
        anchorPane0.setMaxWidth(USE_PREF_SIZE);
        anchorPane0.setMinHeight(USE_PREF_SIZE);
        anchorPane0.setMinWidth(USE_PREF_SIZE);
        anchorPane0.setPrefHeight(98.0);
        anchorPane0.setPrefWidth(311.0);
        anchorPane0.setStyle("-fx-background-color: transperent; -fx-border-width: 5 5 5 5; -fx-border-color: linear-gradient(to bottom right, WHITE, CYAN); -fx-border-radius: 20 20 20 20;");

        AnchorPane.setLeftAnchor(message_label, 27.0);
        AnchorPane.setRightAnchor(message_label, 31.0);
        AnchorPane.setTopAnchor(message_label, 10.0);
        message_label.setAlignment(javafx.geometry.Pos.CENTER);
        message_label.setLayoutX(27.0);
        message_label.setLayoutY(10.0);
        message_label.setMaxHeight(USE_PREF_SIZE);
        message_label.setMaxWidth(USE_PREF_SIZE);
        message_label.setMinHeight(USE_PREF_SIZE);
        message_label.setMinWidth(USE_PREF_SIZE);
        message_label.setPrefHeight(68.0);
        message_label.setPrefWidth(193.0);
        message_label.setTextFill(javafx.scene.paint.Color.valueOf("#e1dada"));
        message_label.setFont(new Font(15.0));

        anchorPane1.setLayoutX(1.0);
        anchorPane1.setLayoutY(-1.0);
        anchorPane1.setMaxHeight(USE_PREF_SIZE);
        anchorPane1.setMaxWidth(USE_PREF_SIZE);
        anchorPane1.setMinHeight(USE_PREF_SIZE);
        anchorPane1.setMinWidth(100.0);
        anchorPane1.setPrefHeight(112.0);
        anchorPane1.setPrefWidth(163.0);
        anchorPane1.setStyle("-fx-background-color: transperent;");

        imageView1.setFitHeight(63.0);
        imageView1.setFitWidth(65.0);
        imageView1.setLayoutX(10.0);
        imageView1.setLayoutY(36.0);

        x_score_count.setAlignment(javafx.geometry.Pos.CENTER);
        x_score_count.setLayoutX(82.0);
        x_score_count.setLayoutY(39.0);
        x_score_count.setPrefHeight(58.0);
        x_score_count.setPrefWidth(46.0);
       x_score_count.setText(String.valueOf(youWin));
        x_score_count.setTextFill(javafx.scene.paint.Color.valueOf("#fff3f3"));
        x_score_count.setFont(new Font(36.0));
        x_score_label.setStyle("-fx-text-fill:linear-gradient( #ff5555 40%, white 70%,  #fe1493 20%,white 40%);");

        AnchorPane.setLeftAnchor(x_score_label, 0.0);
        AnchorPane.setRightAnchor(x_score_label, 0.0);
        AnchorPane.setTopAnchor(x_score_label, 0.0);
        x_score_label.setLayoutX(65.0);
        x_score_label.setLayoutY(17.0);
        x_score_label.setPrefHeight(34.0);
        x_score_label.setPrefWidth(163.0);
        x_score_label.setText("X score ");
        x_score_label.setFont(new Font("Monospaced Bold", 28.0));

        anchorPane2.setLayoutX(466.0);
        anchorPane2.setLayoutY(-3.0);
        anchorPane2.setMaxHeight(USE_PREF_SIZE);
        anchorPane2.setMaxWidth(USE_PREF_SIZE);
        anchorPane2.setMinHeight(USE_PREF_SIZE);
        anchorPane2.setMinWidth(USE_PREF_SIZE);
        anchorPane2.setPrefHeight(112.0);
        anchorPane2.setPrefWidth(163.0);
        anchorPane2.setStyle("-fx-background-color: transperent;");

        imageView2.setFitHeight(63.0);
        imageView2.setFitWidth(67.0);
        imageView2.setLayoutX(22.0);
        imageView2.setLayoutY(37.0);

        o_score_label.setAlignment(javafx.geometry.Pos.CENTER);
        o_score_label.setLayoutX(-2.0);
        o_score_label.setLayoutY(-2.0);
        o_score_label.setPrefHeight(34.0);
        o_score_label.setPrefWidth(163.0);
        o_score_label.setText("O score ");
        o_score_label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        o_score_label.setFont(new Font("Monospaced Bold", 28.0));
        o_score_label.setStyle("-fx-text-fill: linear-gradient(  #FFCF00 40%, white 70%,  #fffc00 20%,white 40%)");

        o_score_count.setAlignment(javafx.geometry.Pos.CENTER);
        o_score_count.setLayoutX(87.0);
        o_score_count.setLayoutY(40.0);
        o_score_count.setPrefHeight(58.0);
        o_score_count.setPrefWidth(46.0);
        o_score_count.setText(String.valueOf(computerWins));
        o_score_count.setTextFill(javafx.scene.paint.Color.valueOf("#fff3f3"));
        o_score_count.setFont(new Font(36.0));
        setBottom(anchorPane);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setPrefHeight(333.0);
        anchorPane3.setPrefWidth(120.0);
        anchorPane3.setStyle("-fx-background-color: transperent;");
        setLeft(anchorPane3);

        BorderPane.setAlignment(anchorPane4, javafx.geometry.Pos.CENTER);
        anchorPane4.setPrefHeight(333.0);
        anchorPane4.setPrefWidth(120.0);
        anchorPane4.setStyle("-fx-background-color: transperent;");
        setRight(anchorPane4);

        BorderPane.setAlignment(logo_pane, javafx.geometry.Pos.CENTER);
        logo_pane.setPrefHeight(73.0);
        logo_pane.setPrefWidth(800.0);

        AnchorPane.setBottomAnchor(logo_label, 20.0);
        AnchorPane.setLeftAnchor(logo_label, -15.0);
        AnchorPane.setRightAnchor(logo_label, 15.0);
        AnchorPane.setTopAnchor(logo_label, -7.0);
        logo_label.setAlignment(javafx.geometry.Pos.CENTER);
        logo_label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        logo_label.setLayoutX(-15.0);
        logo_label.setLayoutY(-7.0);
        logo_label.setMaxWidth(USE_PREF_SIZE);
        logo_label.setMinHeight(USE_PREF_SIZE);
        logo_label.setMinWidth(USE_PREF_SIZE);
        logo_label.setPrefHeight(54.0);
        logo_label.setPrefWidth(800.0);
        logo_label.setText("TIC TAC TOE");
        logo_label.setFont(new Font("Monospaced Bold", 57.0));
        logo_label.setStyle("-fx-text-fill:linear-gradient(to bottom right, WHITE, CYAN);");

        AnchorPane.setBottomAnchor(image_pane, -114.0);
        AnchorPane.setRightAnchor(image_pane, 63.0);
        AnchorPane.setTopAnchor(image_pane, 64.0);
        image_pane.setLayoutX(687.0);
        image_pane.setLayoutY(64.0);
        image_pane.setMaxHeight(USE_PREF_SIZE);
        image_pane.setMaxWidth(USE_PREF_SIZE);
        image_pane.setMinHeight(USE_PREF_SIZE);
        image_pane.setMinWidth(USE_PREF_SIZE);
        image_pane.setPrefHeight(123.0);
        image_pane.setPrefWidth(59.0);
        image_pane.setStyle("-fx-background-color: tranperent;");

        music_image.setFitHeight(53.0);
        music_image.setFitWidth(54.0);
        music_image.setLayoutX(3.0);
        music_image.setLayoutY(-3.0);
        music_image.setPickOnBounds(true);
        music_image.setPreserveRatio(true);

        home_image.setFitHeight(62.0);
        home_image.setFitWidth(53.0);
        home_image.setLayoutX(3.0);
        home_image.setLayoutY(56.0);
        home_image.setPickOnBounds(true);
        home_image.setPreserveRatio(true);

        line.setEndX(80.0);
        line.setLayoutX(-32.0);
        line.setLayoutY(18.0);
        line.setOpacity(0.0);
        line.setRotate(54.0);
        line.setStartX(42.0);
        line.setStartY(10.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#e81919"));
        line.setStrokeWidth(3.0);
        setTop(logo_pane);

        BorderPane.setAlignment(anchorPane5, javafx.geometry.Pos.CENTER);
        anchorPane5.setMaxHeight(USE_PREF_SIZE);
        anchorPane5.setMaxWidth(USE_PREF_SIZE);
        anchorPane5.setMinHeight(USE_PREF_SIZE);
        anchorPane5.setMinWidth(USE_PREF_SIZE);
        anchorPane5.setPrefHeight(401.0);
        anchorPane5.setPrefWidth(400.0);
        anchorPane5.setStyle("-fx-background-color: Transperent;");

        AnchorPane.setBottomAnchor(mygrid, 0.0);
        AnchorPane.setLeftAnchor(mygrid, 0.0);
        AnchorPane.setRightAnchor(mygrid, 0.0);
        AnchorPane.setTopAnchor(mygrid, 0.0);
        mygrid.setId("grid");
        mygrid.setLayoutX(180.0);
        mygrid.setLayoutY(104.0);
        mygrid.setMaxHeight(USE_PREF_SIZE);
        mygrid.setMaxWidth(USE_PREF_SIZE);
        mygrid.setMinHeight(USE_PREF_SIZE);
        mygrid.setMinWidth(USE_PREF_SIZE);
        mygrid.setStyle("-fx-background-color: transperent; -fx-stroke-line: red;");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane6.setPrefHeight(153.0);
        anchorPane6.setPrefWidth(126.0);

        AnchorPane.setBottomAnchor(btn1, 0.0);
        AnchorPane.setLeftAnchor(btn1, 0.0);
        AnchorPane.setRightAnchor(btn1, 0.0);
        AnchorPane.setTopAnchor(btn1, 0.0);
        btn1.setMnemonicParsing(false);
        btn1.setStyle("-fx-text-fill: linear-gradient(#FF5555 40%, white 70%,  #fe1493 20%,white 40%); -fx-border-color: Turquoise; -fx-background-color: transperent; -fx-border-width: 0 1 1 0;");
        btn1.setFont(new Font(64.0));


        GridPane.setColumnIndex(anchorPane7, 1);
        anchorPane7.setPrefHeight(200.0);
        anchorPane7.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(btn2, 0.0);
        AnchorPane.setLeftAnchor(btn2, 0.0);
        AnchorPane.setRightAnchor(btn2, 0.0);
        AnchorPane.setTopAnchor(btn2, 0.0);
        btn2.setMnemonicParsing(false);
        btn2.setStyle("-fx-text-fill: linear-gradient(#FF5555 40%, white 70%,  #fe1493 20%,white 40%); -fx-background-color: transperent; -fx-border-color: Turquoise; -fx-border-width: 0 1 1 0;");
        btn2.setFont(new Font(64.0));

        GridPane.setColumnIndex(anchorPane8, 2);
        anchorPane8.setPrefHeight(200.0);
        anchorPane8.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(btn3, 0.0);
        AnchorPane.setLeftAnchor(btn3, 0.0);
        AnchorPane.setRightAnchor(btn3, 0.0);
        AnchorPane.setTopAnchor(btn3, 0.0);
        btn3.setMnemonicParsing(false);
        btn3.setStyle("-fx-text-fill: linear-gradient(#FF5555 40%, white 70%,  #fe1493 20%,white 40%); -fx-background-color: transperent; -fx-border-color: turquoise; -fx-border-width: 0 0 1 0;");
        btn3.setFont(new Font(64.0));

        GridPane.setRowIndex(anchorPane9, 1);
        anchorPane9.setPrefHeight(200.0);
        anchorPane9.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(btn4, 0.0);
        AnchorPane.setLeftAnchor(btn4, 0.0);
        AnchorPane.setRightAnchor(btn4, 0.0);
        AnchorPane.setTopAnchor(btn4, 0.0);
        btn4.setMnemonicParsing(false);
        btn4.setStyle("-fx-text-fill: linear-gradient(#FF5555 40%, white 70%,  #fe1493 20%,white 40%); -fx-background-color: transperent; -fx-border-color: Turquoise; -fx-border-width: 0 1 1 0;");
        btn4.setFont(new Font(64.0));

        GridPane.setColumnIndex(anchorPane10, 1);
        GridPane.setRowIndex(anchorPane10, 1);
        anchorPane10.setPrefHeight(200.0);
        anchorPane10.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(btn5, 0.0);
        AnchorPane.setLeftAnchor(btn5, 0.0);
        AnchorPane.setRightAnchor(btn5, 0.0);
        AnchorPane.setTopAnchor(btn5, 0.0);
        btn5.setMnemonicParsing(false);
        btn5.setStyle("-fx-text-fill: linear-gradient(#FF5555 40%, white 70%,  #fe1493 20%,white 40%); -fx-background-color: transperent; -fx-border-color: Turquoise; -fx-border-width: 0 1 1 0;");
        btn5.setFont(new Font(64.0));

        GridPane.setColumnIndex(anchorPane11, 2);
        GridPane.setRowIndex(anchorPane11, 1);
        anchorPane11.setPrefHeight(200.0);
        anchorPane11.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(btn6, 0.0);
        AnchorPane.setLeftAnchor(btn6, 0.0);
        AnchorPane.setRightAnchor(btn6, 0.0);
        AnchorPane.setTopAnchor(btn6, 0.0);
        btn6.setMnemonicParsing(false);
        btn6.setStyle("-fx-text-fill: linear-gradient(#FF5555 40%, white 70%,  #fe1493 20%,white 40%); -fx-background-color: transperent; -fx-border-color: turquoise; -fx-border-width: 0 0 1 0;");
        btn6.setFont(new Font(64.0));

        GridPane.setRowIndex(anchorPane12, 2);
        anchorPane12.setPrefHeight(200.0);
        anchorPane12.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(btn7, 0.0);
        AnchorPane.setLeftAnchor(btn7, 0.0);
        AnchorPane.setRightAnchor(btn7, 0.0);
        AnchorPane.setTopAnchor(btn7, 0.0);
        btn7.setMnemonicParsing(false);
        btn7.setStyle("-fx-text-fill: linear-gradient(#FF5555 40%, white 70%,  #fe1493 20%,white 40%); -fx-background-color: transperent; -fx-border-color: turquoise; -fx-border-width: 0 1 0 0;");
        btn7.setFont(new Font(64.0));

        GridPane.setColumnIndex(anchorPane13, 1);
        GridPane.setRowIndex(anchorPane13, 2);
        anchorPane13.setPrefHeight(200.0);
        anchorPane13.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(btn8, 0.0);
        AnchorPane.setLeftAnchor(btn8, 0.0);
        AnchorPane.setRightAnchor(btn8, 0.0);
        AnchorPane.setTopAnchor(btn8, 0.0);
        btn8.setMnemonicParsing(false);
        btn8.setStyle("-fx-text-fill: linear-gradient(#FF5555 40%, white 70%,  #fe1493 20%,white 40%); -fx-background-color: transperent; -fx-border-width: 0 1 0 0; -fx-border-color: turquoise;");
        btn8.setFont(new Font(64.0));

        GridPane.setColumnIndex(anchorPane14, 2);
        GridPane.setRowIndex(anchorPane14, 2);
        anchorPane14.setPrefHeight(200.0);
        anchorPane14.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(btn9, 0.0);
        AnchorPane.setLeftAnchor(btn9, 0.0);
        AnchorPane.setRightAnchor(btn9, 0.0);
        AnchorPane.setTopAnchor(btn9, 0.0);
        btn9.setMnemonicParsing(false);
        btn9.setStyle("-fx-text-fill: linear-gradient(#FF5555 40%, white 70%,  #fe1493 20%,white 40%); -fx-background-color: transperent; -fx-border-width: 0 1 0 0;");
        btn9.setFont(new Font(64.0));
        setCenter(anchorPane5);

        anchorPane0.getChildren().add(message_label);
        anchorPane.getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(imageView1);
        anchorPane1.getChildren().add(x_score_count);
        anchorPane1.getChildren().add(x_score_label);
        anchorPane.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(imageView2);
        anchorPane2.getChildren().add(o_score_label);
        anchorPane2.getChildren().add(o_score_count);
        anchorPane.getChildren().add(anchorPane2);
        logo_pane.getChildren().add(logo_label);
        image_pane.getChildren().add(music_image);
        image_pane.getChildren().add(home_image);
        image_pane.getChildren().add(line);
        logo_pane.getChildren().add(image_pane);
        mygrid.getColumnConstraints().add(columnConstraints);
        mygrid.getColumnConstraints().add(columnConstraints0);
        mygrid.getColumnConstraints().add(columnConstraints1);
        mygrid.getRowConstraints().add(rowConstraints);
        mygrid.getRowConstraints().add(rowConstraints0);
        mygrid.getRowConstraints().add(rowConstraints1);
        anchorPane6.getChildren().add(btn1);
        mygrid.getChildren().add(anchorPane6);
        anchorPane7.getChildren().add(btn2);
        mygrid.getChildren().add(anchorPane7);
        anchorPane8.getChildren().add(btn3);
        mygrid.getChildren().add(anchorPane8);
        anchorPane9.getChildren().add(btn4);
        mygrid.getChildren().add(anchorPane9);
        anchorPane10.getChildren().add(btn5);
        mygrid.getChildren().add(anchorPane10);
        anchorPane11.getChildren().add(btn6);
        mygrid.getChildren().add(anchorPane11);
        anchorPane12.getChildren().add(btn7);
        mygrid.getChildren().add(anchorPane12);
        anchorPane13.getChildren().add(btn8);
        mygrid.getChildren().add(anchorPane13);
        anchorPane14.getChildren().add(btn9);
        mygrid.getChildren().add(anchorPane14);
        anchorPane5.getChildren().add(mygrid);

        /*style*/
        //File file = new File("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/image/gold-coins-clipart-png-6_1.png");
       // Image image = new Image(file.toURI().toString());
        
        
        Image image =new Image(getClass().getResource("/tic_tac_toe/image/gold-coins-clipart-png-6_1.png").toExternalForm());
        imageView1.setImage(image);
        imageView2.setImage(image);


        Image image2=new Image(getClass().getResource("/tic_tac_toe/image/imageedit_1_9667648477.png").toExternalForm());
        music_image.setImage(image2);

        //File file3 = new File("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/image/unnamed.png");
        Image image3=new Image(getClass().getResource("/tic_tac_toe/image/unnamed.png").toExternalForm());
        home_image.setImage(image3);

        
        
        
        
        music_image.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {

                if (m % 2 == 0) {
                    music_image.setOpacity(.5);

                    mediaPlayer1_b.stop();
                    m++;
                     line.setOpacity(1);
                } else {

                    mediaPlayer1_b.play();
                    m++;
                    music_image.setOpacity(1);
                     line.setOpacity(0);
                   
                }
            }
        });
        
        
        
         home_image.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                
                
                move_to_home() ;
                
            }
         });
        
        

        /*style*/
        
        
        
        /* array_list_button*/
        ArrayList<Button> b = new ArrayList<Button>();

        b.add(btn1);
        b.add(btn2);
        b.add(btn3);
        b.add(btn4);
        b.add(btn5);
        b.add(btn6);
        b.add(btn7);
        b.add(btn8);
        b.add(btn9);

        /* array_list_button*/
        
        
        /*button_func*/  
        for(int i=0;i<b.size();i++)
        {
        b.get(i).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

             
                
           
                    mediaPlayer.stop();
                    mediaPlayer.play();
            }
        });

        } 

        
        

         
        
        
    }
     
    
}
