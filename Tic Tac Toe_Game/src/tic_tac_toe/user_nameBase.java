package tic_tac_toe;

import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.util.Duration;

public  class user_nameBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Label label;
    protected final AnchorPane anchorPane0;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final Label logo_label;
    protected final AnchorPane mainancban;
    protected final Label label0;
    protected final TextField user_name_textf;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final AnchorPane anchorPane3;
    protected final Button oldPlayer;
    protected final AnchorPane anchorPane4;
    protected final Button newPlayer;
    
    //Connection con=null;
    Statement stmt;
    
    home_secreen h;
     public  static String user;
    // public static Connection con;
    
    /*************/
    // methof of moving to home : 
 public  static Connection con = null;
     //String url = "jdbc:mysql://localhost:3306/game_xo";
    String url = "jdbc:mysql://172.16.4.137:3306/game_xo";
    String dbUser = "xoclient";
    //String dbUser = "root";
    String password = "xoiti";
    ResultSet rs ;
    
    
     public  void move_to_home() 
      {

        h=new  home_secreen();
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
  
       Scene s=this.getScene();
         s.setRoot(h); 
      

      
      }
    
  
     /*************/
    
    
    /*************/
    
   
 
    
    
    
    
   
    public user_nameBase() {

        anchorPane = new AnchorPane();
        label = new Label();
        anchorPane0 = new AnchorPane();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        logo_label = new Label();
        mainancban = new AnchorPane();
        label0 = new Label();
        user_name_textf = new TextField();    // text field for user name;
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        anchorPane3 = new AnchorPane();
        oldPlayer = new Button();
        anchorPane4 = new AnchorPane();
        newPlayer = new Button();

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
        anchorPane2.setPrefHeight(80.0);
        anchorPane2.setPrefWidth(800.0);

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
        setTop(anchorPane2);

        BorderPane.setAlignment(mainancban, javafx.geometry.Pos.CENTER);
        mainancban.setMaxHeight(USE_PREF_SIZE);
        mainancban.setMaxWidth(USE_PREF_SIZE);
        mainancban.setMinHeight(USE_PREF_SIZE);
        mainancban.setMinWidth(USE_PREF_SIZE);
        mainancban.setPrefHeight(363.0);
        mainancban.setPrefWidth(538.0);
        mainancban.setStyle("-fx-border-color: BurlyWood; -fx-border-width: 7 7 7 7;");

        AnchorPane.setBottomAnchor(label0, 299.0);
        AnchorPane.setLeftAnchor(label0, 7.0);
        AnchorPane.setRightAnchor(label0, 7.0);
        AnchorPane.setTopAnchor(label0, 7.0);
        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(14.0);
        label0.setLayoutY(14.0);
        label0.setMaxHeight(USE_PREF_SIZE);
        label0.setMaxWidth(USE_PREF_SIZE);
        label0.setMinHeight(USE_PREF_SIZE);
        label0.setMinWidth(USE_PREF_SIZE);
        label0.setPrefHeight(54.0);
        label0.setPrefWidth(499.0);
        label0.setText("Enter User Name");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#d39999"));
        label0.setFont(new Font("Monospaced Bold", 26.0));

        user_name_textf.setLayoutX(128.0);
        user_name_textf.setLayoutY(92.0);
        user_name_textf.setMaxHeight(USE_PREF_SIZE);
        user_name_textf.setMaxWidth(USE_PREF_SIZE);
        user_name_textf.setMinHeight(USE_PREF_SIZE);
        user_name_textf.setMinWidth(USE_PREF_SIZE);
        user_name_textf.setPrefHeight(47.0);
        user_name_textf.setPrefWidth(296.0);
        user_name_textf.setStyle("-fx-border-width: 5 5 5 5; -fx-border-color: Turquoise; -fx-border-radius: 20 20 20 20; -fx-background-color: transperent;-fx-text-inner-color:white;");
        user_name_textf.setFont(new Font(20.0));
//      user_name_textf.setStyle("-fx-color:white;");

        AnchorPane.setBottomAnchor(gridPane, 14.0);
        AnchorPane.setLeftAnchor(gridPane, 14.0);
        AnchorPane.setRightAnchor(gridPane, 14.0);
        AnchorPane.setTopAnchor(gridPane, 261.0);
        gridPane.setLayoutX(21.0);
        gridPane.setLayoutY(268.0);
        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(88.0);
        gridPane.setPrefWidth(510.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane3.setPrefHeight(200.0);
        anchorPane3.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(oldPlayer, 0.0);
        AnchorPane.setLeftAnchor(oldPlayer, 38.0);
        AnchorPane.setRightAnchor(oldPlayer, 38.0);
        AnchorPane.setTopAnchor(oldPlayer, 0.0);
        oldPlayer.setLayoutX(27.0);
        oldPlayer.setLayoutY(65.0);
        oldPlayer.setMnemonicParsing(false);
        oldPlayer.setPrefHeight(74.0);
        oldPlayer.setPrefWidth(183.0);
        oldPlayer.setStyle("-fx-border-color: Turquoise; -fx-border-width: 7 7 7 7; -fx-border-radius: 30 30 30 30; -fx-background-color: transperent;");
        oldPlayer.setText("Old Player");
        oldPlayer.setTextFill(javafx.scene.paint.Color.valueOf("#d39999"));
        oldPlayer.setFont(new Font(25.0));

        GridPane.setColumnIndex(anchorPane4, 1);
        anchorPane4.setPrefHeight(112.0);
        anchorPane4.setPrefWidth(247.0);

        AnchorPane.setBottomAnchor(newPlayer, 0.0);
        AnchorPane.setLeftAnchor(newPlayer, 38.0);
        AnchorPane.setRightAnchor(newPlayer, 27.0);
        AnchorPane.setTopAnchor(newPlayer, 0.0);
        newPlayer.setLayoutX(34.0);
        newPlayer.setLayoutY(-14.0);
        newPlayer.setMnemonicParsing(false);
        newPlayer.setPrefHeight(74.0);
        newPlayer.setPrefWidth(183.0);
        newPlayer.setStyle("-fx-background-color: transperent; -fx-border-color: Turquoise; -fx-border-width: 7 7 7 7; -fx-border-radius: 30 30 30 30; -fx-text-fill: #d39999;");
        newPlayer.setText("New Player");
        newPlayer.setTextFill(javafx.scene.paint.Color.valueOf("#d39999"));
        newPlayer.setFont(new Font(25.0));
        setCenter(mainancban);

        anchorPane.getChildren().add(label);
        anchorPane2.getChildren().add(logo_label);
        mainancban.getChildren().add(label0);
        mainancban.getChildren().add(user_name_textf);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        anchorPane3.getChildren().add(oldPlayer);
        gridPane.getChildren().add(anchorPane3);
        anchorPane4.getChildren().add(newPlayer);
        gridPane.getChildren().add(anchorPane4);
        mainancban.getChildren().add(gridPane);
        
        try {
    // db parameters
   
//    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            Class.forName("com.mysql.jdbc.Driver()");
    con = DriverManager.getConnection(url, dbUser, "xoiti");
        } catch (SQLException ex) {
            System.out.println("exception here");
            Logger.getLogger(user_nameBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

       
        
        /********* Handle old player ********/
        
        
        
         oldPlayer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                user=user_name_textf.getText();
                System.out.println("this is old");
                System.out.println(user);
                
                
                try {
                    stmt=con.createStatement();
                     ResultSet rs=stmt.executeQuery("select * from PLAYER");
                     //ResultSet rs=stmt.executeQuery("select * from PLAYER where P_USERNAME ='"+user+"'");
                     int found=0;
                     while(rs.next())
                     {
                        System.out.println(rs.getString(1));
                        // System.out.println(rs.getString(1).equalsIgnoreCase(user));
                       if(rs.getString(1).trim().equals(user))
                       {
                         found=1;
                         
                        
                       }
        
                       
                     }
                     if(found==1){
                        System.out.println("found");
                        move_to_home();
                         
                     }
                     else
                     {
                         Alert a = new Alert(AlertType.NONE);
                         a.setAlertType(AlertType.ERROR); 
  
                // set content text 
                        a.setContentText("This user name doesn't exist"); 
  
                // show the dialog 
                        a.show(); 
                         System.out.println("this user name doesn't exist");
                     
                     }
                     

                } catch (SQLException ex) {
                    Logger.getLogger(user_nameBase.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
    
                
                //enter your code here
                
                
                
                
            
            
            
            }
           });
         
        
        
        
        
           /********* Handle new player ********/
        
        
       newPlayer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                                try {
                     stmt=con.createStatement();
                     user=user_name_textf.getText();
                     System.out.println(user);
                     ResultSet rs=stmt.executeQuery("select * from PLAYER");
                     int not_found=1;
                     while(rs.next())
                     {
                       if(rs.getString(1).trim().equals(user))
                       {
                         not_found=0;
                       }
                       
                     }
                     if(not_found==1){
                         //PreparedStatement pstmt=new PreparedStatement();
                       PreparedStatement preparedStmt = con.prepareStatement("insert into PLAYER values(?)");
                       preparedStmt.setString(1, user); 
                       preparedStmt.executeUpdate();
                         System.out.println("data entered");
                       move_to_home();
                     }
                     else
                     {
                        Alert a = new Alert(AlertType.NONE);
                         a.setAlertType(AlertType.ERROR); 
  
                // set content text 
                        a.setContentText("This user name exists before"); 
  
                // show the dialog 
                        a.show(); 
                         System.out.println("\nthis user name exists before");
                     
                     }
                } catch (SQLException ex) {
                    Logger.getLogger(user_nameBase.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            
            
                
                //enter your code here 
                
                
                
           // move_to_home();
            
            
            }
           });
         
        

    }
 
}
