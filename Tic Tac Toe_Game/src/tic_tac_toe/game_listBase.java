package tic_tac_toe;

import java.lang.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
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

public class game_listBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Label label;
    protected final AnchorPane mainancban;
    protected final AnchorPane anchorPane0;
    protected final ListView game_list; ///////// the list 
    protected final AnchorPane anchorPane1;
    protected final Button play_btn;
    protected final AnchorPane anchorPane2;
    protected final ImageView home_img;
    protected final ImageView music_img;
    protected final AnchorPane anchorPane3;
    protected final AnchorPane play_btn0;
    protected final AnchorPane anchorPane4;
    protected final Label logo_label;
    home_secreen h;
    
    String hitNormal;
    Media sound;
   //MediaPlayer mediaPlayer;
 MediaPlayer mediaPlayer1_b; // for background music
    
    
    String[] dataXO=new String[9];
    ResultSet rsretrieve;

    public game_listBase(AnchorPane anchorPane, Label label, AnchorPane mainancban, AnchorPane anchorPane0, ListView game_list, AnchorPane anchorPane1, Button play_btn, AnchorPane anchorPane2, ImageView home_img, ImageView music_img, AnchorPane anchorPane3, AnchorPane play_btn0, AnchorPane anchorPane4, Label logo_label) {
        this.anchorPane = anchorPane;
        this.label = label;
        this.mainancban = mainancban;
        this.anchorPane0 = anchorPane0;
        this.game_list = game_list;
        this.anchorPane1 = anchorPane1;
        this.play_btn = play_btn;
        this.anchorPane2 = anchorPane2;
        this.home_img = home_img;
        this.music_img = music_img;
        this.anchorPane3 = anchorPane3;
        this.play_btn0 = play_btn0;
        this.anchorPane4 = anchorPane4;
        this.logo_label = logo_label;
    }

    public game_listBase(AnchorPane anchorPane, Label label, AnchorPane mainancban, AnchorPane anchorPane0, ListView game_list, AnchorPane anchorPane1, Button play_btn, AnchorPane anchorPane2, ImageView home_img, ImageView music_img, AnchorPane anchorPane3, AnchorPane play_btn0, AnchorPane anchorPane4, Label logo_label, Node center) {
        super(center);
        this.anchorPane = anchorPane;
        this.label = label;
        this.mainancban = mainancban;
        this.anchorPane0 = anchorPane0;
        this.game_list = game_list;
        this.anchorPane1 = anchorPane1;
        this.play_btn = play_btn;
        this.anchorPane2 = anchorPane2;
        this.home_img = home_img;
        this.music_img = music_img;
        this.anchorPane3 = anchorPane3;
        this.play_btn0 = play_btn0;
        this.anchorPane4 = anchorPane4;
        this.logo_label = logo_label;
    }
    g_saved_game_screenBase g;
    
    
    /******* method of transition *******/
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

          FadeTransition fd = new FadeTransition();
          fd.setDuration(Duration.millis(500));
          fd.setNode(h);
          fd.setFromValue(0);
          fd.setToValue(1);
          fd.play();

          Scene s = home_img.getScene();
          s.setRoot(h);
      }
    
    
     /******* method of transition to saved game*******/
     
     
     
      public  void move_to_saved_game() 
      {

      //  h=new  home_secreen();
       g=new g_saved_game_screenBase(dataXO);
       
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
  
         Scene s=play_btn.getScene();
         s.setRoot(g);
//      Scene s=new Scene(g);
//      Stage cur= (Stage) this.getScene().getWindow();
//      cur.setScene(s);
//      
      }
    
     
     
     /********* method of transition saved game****/
    

    public game_listBase(int m) {
        
        int mm=m;

        anchorPane = new AnchorPane();
        label = new Label();
        mainancban = new AnchorPane();
        anchorPane0 = new AnchorPane();
        game_list = new ListView();
        anchorPane1 = new AnchorPane();
        play_btn = new Button();
        anchorPane2 = new AnchorPane();
        home_img = new ImageView();
        music_img = new ImageView();
        anchorPane3 = new AnchorPane();
        play_btn0 = new AnchorPane();
        anchorPane4 = new AnchorPane();
        logo_label = new Label();

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
        label.setTextFill(javafx.scene.paint.Color.valueOf("#f5f5f5"));
        setBottom(anchorPane);

        BorderPane.setAlignment(mainancban, javafx.geometry.Pos.CENTER);
        mainancban.setMaxHeight(USE_PREF_SIZE);
        mainancban.setMaxWidth(USE_PREF_SIZE);
        mainancban.setMinHeight(USE_PREF_SIZE);
        mainancban.setMinWidth(USE_PREF_SIZE);
        mainancban.setPrefHeight(456.0);
        mainancban.setPrefWidth(759.0);

        AnchorPane.setBottomAnchor(anchorPane0, -26.0);
        AnchorPane.setLeftAnchor(anchorPane0, -3.0);
        AnchorPane.setRightAnchor(anchorPane0, 2.0);
        AnchorPane.setTopAnchor(anchorPane0, 25.0);
        anchorPane0.setLayoutX(-3.0);
        anchorPane0.setLayoutY(25.0);
        anchorPane0.setMaxHeight(USE_PREF_SIZE);
        anchorPane0.setMaxWidth(USE_PREF_SIZE);
        anchorPane0.setMinHeight(USE_PREF_SIZE);
        anchorPane0.setMinWidth(USE_PREF_SIZE);
        anchorPane0.setPrefHeight(457.0);
        anchorPane0.setPrefWidth(760.0);

        game_list.setLayoutX(114.0);
        game_list.setLayoutY(74.0);
        game_list.setPrefHeight(267.0);
        game_list.setPrefWidth(516.0);
        game_list.setStyle("-fx-background-color: #FFE4C4;");

        anchorPane1.setLayoutX(115.0);
        anchorPane1.setLayoutY(356.0);
        anchorPane1.setMaxHeight(USE_PREF_SIZE);
        anchorPane1.setMaxWidth(USE_PREF_SIZE);
        anchorPane1.setMinHeight(USE_PREF_SIZE);
        anchorPane1.setMinWidth(USE_PREF_SIZE);
        anchorPane1.setPrefHeight(60.0);
        anchorPane1.setPrefWidth(200.0);
        anchorPane1.setStyle("-fx-background-color: pink;");

        AnchorPane.setBottomAnchor(play_btn, 0.0);
        AnchorPane.setLeftAnchor(play_btn, 0.0);
        AnchorPane.setRightAnchor(play_btn, 0.0);
        AnchorPane.setTopAnchor(play_btn, 0.0);
        play_btn.setLayoutX(56.0);
        play_btn.setLayoutY(17.0);
        play_btn.setMaxHeight(USE_PREF_SIZE);
        play_btn.setMaxWidth(USE_PREF_SIZE);
        play_btn.setMinHeight(USE_PREF_SIZE);
        play_btn.setMinWidth(USE_PREF_SIZE);
        play_btn.setMnemonicParsing(false);
        play_btn.setStyle("-fx-background-color: #577c79;");
        play_btn.setText("Play");
        play_btn.setTextFill(javafx.scene.paint.Color.valueOf("#e1e4e4"));
        play_btn.setFont(new Font("System Bold", 29.0));

        anchorPane2.setLayoutX(441.0);
        anchorPane2.setLayoutY(358.0);
        anchorPane2.setMaxHeight(USE_PREF_SIZE);
        anchorPane2.setMaxWidth(USE_PREF_SIZE);
        anchorPane2.setMinHeight(USE_PREF_SIZE);
        anchorPane2.setMinWidth(USE_PREF_SIZE);
        anchorPane2.setPrefHeight(60.0);
        anchorPane2.setPrefWidth(184.0);

        home_img.setFitHeight(56.0);
        home_img.setFitWidth(82.0);
        home_img.setLayoutX(137.0);
        home_img.setLayoutY(-6.0);
        home_img.setPickOnBounds(true);
        home_img.setPreserveRatio(true);

        music_img.setFitHeight(66.0);
        music_img.setFitWidth(67.0);
        music_img.setLayoutX(35.0);
        music_img.setLayoutY(-8.0);
        music_img.setPickOnBounds(true);
        music_img.setPreserveRatio(true);
        setCenter(mainancban);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setPrefHeight(333.0);
        anchorPane3.setPrefWidth(120.0);
        anchorPane3.setStyle("-fx-background-color: Transperent;");
        setLeft(anchorPane3);

        BorderPane.setAlignment(play_btn0, javafx.geometry.Pos.CENTER);
        play_btn0.setPrefHeight(333.0);
        play_btn0.setPrefWidth(120.0);
        setRight(play_btn0);

        BorderPane.setAlignment(anchorPane4, javafx.geometry.Pos.CENTER);
        anchorPane4.setPrefHeight(80.0);
        anchorPane4.setPrefWidth(800.0);

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
        logo_label.setText("TIC TAC TOE");
        logo_label.setFont(new Font("Monospaced Bold", 53.0));
        logo_label.setStyle("-fx-text-fill:linear-gradient(to bottom right, WHITE, CYAN);");
        
        setTop(anchorPane4);

        anchorPane.getChildren().add(label);
        anchorPane0.getChildren().add(game_list);
        anchorPane1.getChildren().add(play_btn);
        anchorPane0.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(home_img);
        anchorPane2.getChildren().add(music_img);
        anchorPane0.getChildren().add(anchorPane2);
        mainancban.getChildren().add(anchorPane0);
        anchorPane4.getChildren().add(logo_label);
        
        /****** for music*****/
        
          /*********************************/
        
         sound = new Media(getClass().getResource("/tic_tac_toe/sounds/Marimba-music.mp3").toExternalForm());

       mediaPlayer1_b = new MediaPlayer(sound);
       mediaPlayer1_b.setVolume(0.05);
        mediaPlayer1_b.stop();
        
         if (mm % 2 == 0) {
                   

                    mediaPlayer1_b.play();
                    
                    
                } else {

                    mediaPlayer1_b.stop();
                     
                 
                   
                }
         
            /*********************************/
        
        
        
        
        
        
        Connection conn=user_nameBase.con;
        String UsrName = user_nameBase.user;
        try {
            
            Statement Stmt = conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE );
            //ResultSet rsretrieve=stmt.executeQuery("select * from Game where G_ID in (select GAME_ID from GAMESAVER where S_USERNAME=?)");
            //pStmt.setString(1,'Amira');
            
            rsretrieve=Stmt.executeQuery("select * from GAME where G_ID in (select G_ID from GAME where S_USERNAME='"+UsrName+"')");
            //{System.out.println(rsretrieve.next());}
                            
                if(rsretrieve.next()){
                 do
                 {
                     game_list.getItems().add(rsretrieve.getTimestamp(2));
                         
                 }
                 while(rsretrieve.next());
                }
                else
                {
                    game_list.getItems().add("No Previous Games");
                }
                
               
            
            //return ;
        } catch (SQLException ex) {
            Logger.getLogger(game_listBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
         Image image2 = new Image(getClass().getResource("/tic_tac_toe/image/unnamed.png").toExternalForm());
        home_img.setImage(image2);
        
         home_img.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                
                
                move_to_home();
                
                
            }
        }

         );
        
        
         
  play_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    int I = game_list.getSelectionModel().getSelectedIndex();
                    System.out.println(I);
                    // try {
                    System.out.println(rsretrieve.first());
                    for(int j=0;j<I;j++)
                    {rsretrieve.next();}
                    int k=4;
                    String Move;
                    int loc;
                    while(k<=12)
                    {
                        Move=rsretrieve.getString(k);
                        System.out.println(Move);
                        dataXO[k-4]=Move;

                        k++;

                    }

                    
                    move_to_saved_game();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(game_listBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            
            }
            
            
        });       
         
        
        
        
        

    }
}
