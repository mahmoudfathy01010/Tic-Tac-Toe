/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory_Game;

import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author mohamedelgharpawi
 */
public class Y_Memory_Computer extends BorderPane {
    
    
    y_memory_loseBase l;
    y_memory_tieBase t;
    Y_Memory_home_secreenBase h;
    
    
    
    
    
    
    
    
    
Label [] cells;
     Image image ;
     
     int turn =1;
     int counter=0;
     
     int ply1Score;
     int ply2Score;
      boolean flag=true;
    ArrayList<String> selectedRecently=new ArrayList<>();
    
    Label [] selectedLab=new Label[2];   
     protected final AnchorPane logo_pane;
    protected final Label logo_label;
    protected final Label label;
    protected final Label one_score;
    protected final Label label0;
    protected final Label two_score;
    protected final Label turnLab;
    protected final Label homeLabel;
    protected final AnchorPane anchorPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final Label lab0;
    protected final Label lab1;
    protected final Label lab2;
    protected final Label lab3;
    protected final Label lab4;
    protected final Label lab5;
    protected final Label lab6;
    protected final Label lab7;
    protected final Label lab8;
    protected final Label lab9;
    protected final Label lab10;
    protected final Label lab11;
    protected final Label lab12;
    protected final Label lab13;
    protected final Label lab14;
    protected final Label lab15;

    public Y_Memory_Computer () {

        logo_pane = new AnchorPane();
        logo_label = new Label();
        label = new Label();
        one_score = new Label();
        label0 = new Label();
        two_score = new Label();
        turnLab = new Label();
        homeLabel = new Label();
        anchorPane = new AnchorPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        lab0 = new Label();
        lab1 = new Label();
        lab2 = new Label();
        lab3 = new Label();
        lab4 = new Label();
        lab5 = new Label();
        lab6 = new Label();
        lab7 = new Label();
        lab8 = new Label();
        lab9 = new Label();
        lab10 = new Label();
        lab11 = new Label();
        lab12 = new Label();
        lab13 = new Label();
        lab14 = new Label();
        lab15 = new Label();

        setId("border");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(200.0);
        setPrefHeight(846.0);
        setPrefWidth(1059.0);
        setStyle("-fx-background-color: linear-gradient(to bottom right, white,DarkSlateGrey); -fx-border-color: BurlyWood; -fx-border-width: 7 7 7 7;");
        getStyleClass().add("LightCyan");

        BorderPane.setAlignment(logo_pane, javafx.geometry.Pos.CENTER);
        logo_pane.setPrefHeight(80.0);
        logo_pane.setPrefWidth(1045.0);

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
        logo_label.setText("Memory Game");
        logo_label.setFont(new Font("Monospaced Bold", 57.0));

        AnchorPane.setBottomAnchor(label, 46.0);
        AnchorPane.setLeftAnchor(label, 14.0);
        AnchorPane.setRightAnchor(label, 937.0);
        AnchorPane.setTopAnchor(label, 0.0);
        label.setLayoutX(14.0);
        label.setPrefHeight(27.0);
        label.setPrefWidth(94.0);
        label.setText("YOU:");
        label.setFont(new Font("Bodoni 72 Oldstyle Bold", 21.0));

        one_score.setLayoutX(102.0);
        one_score.setLayoutY(14.0);
        one_score.setPrefHeight(30.0);
        one_score.setPrefWidth(112.0);
        one_score.setText("0");
        one_score.setFont(new Font(25.0));

        AnchorPane.setBottomAnchor(label0, 8.0);
        AnchorPane.setLeftAnchor(label0, 14.0);
        AnchorPane.setRightAnchor(label0, 937.0);
        AnchorPane.setTopAnchor(label0, 38.0);
        label0.setLayoutX(14.0);
        label0.setLayoutY(38.0);
        label0.setPrefHeight(27.0);
        label0.setPrefWidth(94.0);
        label0.setText("CPU:");
        label0.setFont(new Font("Bodoni 72 Bold", 21.0));

        two_score.setLayoutX(102.0);
        two_score.setLayoutY(52.0);
        two_score.setPrefHeight(30.0);
        two_score.setPrefWidth(89.0);
        two_score.setText("0");
        two_score.setFont(new Font(25.0));

        AnchorPane.setBottomAnchor(turnLab, 45.0);
        AnchorPane.setRightAnchor(turnLab, 115.0);
        AnchorPane.setTopAnchor(turnLab, 31.0);
        turnLab.setLayoutX(783.0);
        turnLab.setLayoutY(31.0);
        turnLab.setPrefHeight(27.0);
        turnLab.setPrefWidth(147.0);
        turnLab.setText("Your Turn");
        turnLab.setFont(new Font("Bodoni 72 Bold", 21.0));

        AnchorPane.setBottomAnchor(homeLabel, 23.0);
        AnchorPane.setRightAnchor(homeLabel, 36.0);
        AnchorPane.setTopAnchor(homeLabel, 10.0);
        homeLabel.setLayoutX(937.0);
        homeLabel.setLayoutY(10.0);
        homeLabel.setPrefHeight(70.0);
        homeLabel.setPrefWidth(72.0);
        setTop(logo_pane);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(774.0);
        anchorPane.setPrefWidth(1036.0);
        anchorPane.setStyle("-fx-background-color: Transperent;");

        gridPane.setGridLinesVisible(true);
        gridPane.setLayoutX(145.0);
        gridPane.setLayoutY(35.0);
        gridPane.setPrefHeight(642.0);
        gridPane.setPrefWidth(743.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        lab0.setPrefHeight(161.0);
        lab0.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab1, 1);
        lab1.setPrefHeight(161.0);
        lab1.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab2, 2);
        lab2.setPrefHeight(161.0);
        lab2.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab3, 3);
        lab3.setPrefHeight(161.0);
        lab3.setPrefWidth(184.0);

        GridPane.setRowIndex(lab4, 1);
        lab4.setPrefHeight(161.0);
        lab4.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab5, 1);
        GridPane.setRowIndex(lab5, 1);
        lab5.setPrefHeight(161.0);
        lab5.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab6, 2);
        GridPane.setRowIndex(lab6, 1);
        lab6.setPrefHeight(161.0);
        lab6.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab7, 3);
        GridPane.setRowIndex(lab7, 1);
        lab7.setPrefHeight(161.0);
        lab7.setPrefWidth(184.0);

        GridPane.setRowIndex(lab8, 2);
        lab8.setPrefHeight(161.0);
        lab8.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab9, 1);
        GridPane.setRowIndex(lab9, 2);
        lab9.setPrefHeight(161.0);
        lab9.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab10, 2);
        GridPane.setRowIndex(lab10, 2);
        lab10.setPrefHeight(161.0);
        lab10.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab11, 3);
        GridPane.setRowIndex(lab11, 2);
        lab11.setPrefHeight(161.0);
        lab11.setPrefWidth(184.0);

        GridPane.setRowIndex(lab12, 3);
        lab12.setPrefHeight(161.0);
        lab12.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab13, 1);
        GridPane.setRowIndex(lab13, 3);
        lab13.setPrefHeight(161.0);
        lab13.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab14, 2);
        GridPane.setRowIndex(lab14, 3);
        lab14.setPrefHeight(161.0);
        lab14.setPrefWidth(184.0);

        GridPane.setColumnIndex(lab15, 3);
        GridPane.setRowIndex(lab15, 3);
        lab15.setPrefHeight(197.0);
        lab15.setPrefWidth(184.0);
        setCenter(anchorPane);

        logo_pane.getChildren().add(logo_label);
        logo_pane.getChildren().add(label);
        logo_pane.getChildren().add(one_score);
        logo_pane.getChildren().add(label0);
        logo_pane.getChildren().add(two_score);
        logo_pane.getChildren().add(turnLab);
        logo_pane.getChildren().add(homeLabel);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getChildren().add(lab0);
        gridPane.getChildren().add(lab1);
        gridPane.getChildren().add(lab2);
        gridPane.getChildren().add(lab3);
        gridPane.getChildren().add(lab4);
        gridPane.getChildren().add(lab5);
        gridPane.getChildren().add(lab6);
        gridPane.getChildren().add(lab7);
        gridPane.getChildren().add(lab8);
        gridPane.getChildren().add(lab9);
        gridPane.getChildren().add(lab10);
        gridPane.getChildren().add(lab11);
        gridPane.getChildren().add(lab12);
        gridPane.getChildren().add(lab13);
        gridPane.getChildren().add(lab14);
        gridPane.getChildren().add(lab15);
        anchorPane.getChildren().add(gridPane);
        homeLabel.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/imgs/Home.png"))));

  cells= new Label[]{lab0,lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11,lab12,lab13,lab14,lab15};
         
  
  
  
  
  
  
  
  
   
    
          //AND TO BE BUT in itialize       
             intialize();
         
   homeLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent e) { 
                  
               move_to_home();
                  
              }  
            });
   if(flag==true){
        lab0.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                System.out.println("ghgh+++++hgh");

                if (lab0.getGraphic() == null && selectedRecently.size() < 2) {
                    System.out.println("ghghhgh");

                    selectedRecently.add("img1");
                    selectedLab[counter] = lab0;
                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img1.jpg"));
                    lab0.setGraphic(new ImageView(image));
                  
                    flag=false;
                    began();
                }
                  
             

            }
        });

        
        lab1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab1.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img5");
                    selectedLab[counter] = lab1;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img5.jpg"));
                    lab1.setGraphic(new ImageView(image));
  flag=false;
               
                   began();
                
                }

             

            }
        });
        lab2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab2.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img6");
                    selectedLab[counter] = lab2;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img6.jpg"));
                    lab2.setGraphic(new ImageView(image));
                  flag=false;

                    began();
                    

                }

            }
        });
        lab3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab3.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img7");
                    selectedLab[counter] = lab3;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img7.jpg"));
                    lab3.setGraphic(new ImageView(image));
  flag=false;

                    began();

                }

            }
        });
        lab4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab4.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img4");
                    selectedLab[counter] = lab4;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img4.jpg"));
                    lab4.setGraphic(new ImageView(image));
  flag=false;

                    began();

                }

            }
        });
        lab5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab5.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img1");
                    selectedLab[counter] = lab5;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img1.jpg"));
                    lab5.setGraphic(new ImageView(image));
  flag=false;

                    began();

                }

            }
        });
        lab6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab6.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img3");
                    selectedLab[counter] = lab6;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img3.jpg"));
                    lab6.setGraphic(new ImageView(image));
  flag=false;

                    began();

                }

            }
        });
        lab7.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab7.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img3");
                    selectedLab[counter] = lab7;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img3.jpg"));
                    lab7.setGraphic(new ImageView(image));
  flag=false;

                    began();

                }

            }
        });
        lab8.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab8.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img4");
                    selectedLab[counter] = lab8;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img4.jpg"));
                    lab8.setGraphic(new ImageView(image));
  flag=false;

                    began();

                }

            }
        });
        lab9.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab9.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img2");
                    selectedLab[counter] = lab9;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img2.jpg"));
                    lab9.setGraphic(new ImageView(image));
  flag=false;

                    began();

                }

            }
        });
        lab10.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab10.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img5");
                    selectedLab[counter] = lab10;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img5.jpg"));
                    lab10.setGraphic(new ImageView(image));
  flag=false;

                    began();

                }

            }
        });
        lab11.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab11.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img8");
                    selectedLab[counter] = lab11;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img8.jpg"));
                    lab11.setGraphic(new ImageView(image));
                      flag=false;

                    began();

                }

            }
        });
        lab12.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab12.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img6");
                    selectedLab[counter] = lab12;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img6.jpg"));
                    lab12.setGraphic(new ImageView(image));
                      flag=false;

                    began();

                }

            }
        });
        lab13.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                if (lab13.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img2");
                    selectedLab[counter] = lab13;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img2.jpg"));
                    lab13.setGraphic(new ImageView(image));
  flag=false;

                    began();

                }

            }
        });
        lab14.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                if (lab14.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img7");
                    selectedLab[counter] = lab14;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img7.jpg"));
                    lab14.setGraphic(new ImageView(image));
    flag=false;
                      began();
                  

                }
              

            }
        });
        lab15.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                if (lab15.getGraphic() == null && selectedRecently.size() < 2) {

                    selectedRecently.add("img8");
                    selectedLab[counter] = lab15;

                    counter++;
                    image = new Image(getClass().getResourceAsStream("/imgs2/img8.jpg"));
                    lab15.setGraphic(new ImageView(image));
                    flag=false;
                    began();
                }

            }
        });
   }
    }

    //  image = new Image(getClass().getResourceAsStream("/try_agame/imgs/img1.jpg"));
    


    public void began() {

        if (selectedLab.length == 2 && selectedRecently.size() == 2) {
            checkMatching();

            if (turn == 1) {
                turn = 2;

              Platform.runLater(()-> turnLab.setText("Computer Turn"));
                  

            } else {

               // turn = 1;
                Platform.runLater(()->  turnLab.setText("Player 1 Turn"));
             
            }
        }

    }


    public void checkMatching() {

        if (selectedRecently.size() == 2 && selectedRecently.get(0).equalsIgnoreCase(selectedRecently.get(1))) {

            switch (selectedRecently.get(0)) {

                case "img1":
                    lab0.setDisable(true);
                    lab5.setDisable(true);
                    count(1);
               
                    break;
                case "img2":
                    lab9.setDisable(true);
                    lab13.setDisable(true);
                    count(1);
                    turn=2;

                    break;
                case "img3":
                    lab7.setDisable(true);
                    lab6.setDisable(true);
                    count(1);
                    turn=2;

                    break;
                case "img4":
                    lab4.setDisable(true);
                    lab8.setDisable(true);
                    count(1);
                    turn=2;

                    break;

                case "img5":
                    lab10.setDisable(true);
                    lab1.setDisable(true);
                    count(1);
                    turn=2;

                    break;
                case "img6":

                    lab12.setDisable(true);
                    lab2.setDisable(true);
                    count(1);
                    turn=2;

                    break;

                case "img7":

                    lab14.setDisable(true);
                    lab3.setDisable(true);
                    count(1);
                    turn=2;

                    break;

                case "img8":
                    lab11.setDisable(true);
                    lab15.setDisable(true);
                    count(1);
                    turn=2;

                    break;

            }
            counter = 0;
            selectedRecently.clear();

        }

        if (selectedRecently.size() == 2 && (!selectedRecently.get(0).equalsIgnoreCase(selectedRecently.get(1)))) {

            selectedLab[1].setGraphic(null);

            selectedLab[0].setGraphic(null);
            counter = 0;
//selectedLab[0]=null;

            selectedRecently.clear();

        }
        compPlay();


    }

    public void compPlay() {
       

                 int comIndex = -1;

        for (int i = 0; i < cells.length; i++) {

            if (cells[i].getGraphic() == null) {

                comIndex = i;
                break;

            }

        }
                switch (comIndex) {
                    
                    case 0:
                        setterHandller(lab0, lab5, "img1");
                       
                        break;
                        
                    case 1:
                        setterHandller(lab1, lab10, "img5");
                       
                        
                        break;
                    case 2:
                        setterHandller(lab2, lab12, "img6");
                      
                        break;
                    case 3:
                        setterHandller(lab3, lab14, "img7");
                       
                        
                        break;
                    case 4:
                        setterHandller(lab4, lab8, "img4");
                       
                        
                        break;
                    case 5:
                        setterHandller(lab0, lab5, "img1");
                       
                        
                        break;
                    case 6:
                        setterHandller(lab6, lab7, "img3");
                      
                        
                        
                        break;
                    case 7:
                        setterHandller(lab6, lab7, "img3");
                       
                        
                        break;
                    case 8:
                        setterHandller(lab4, lab8, "img4");
                
                        
                        break;
                    case 9:
                        setterHandller(lab9, lab13, "img2");
                    
                        
                        break;
                    case 10:
                        setterHandller(lab1, lab10, "img5");
             
                        
                        break;
                    case 11:
                        setterHandller(lab11, lab15, "img8");
           
                        
                        break;
                    case 12:
                        setterHandller(lab2, lab12, "img6");
              
                        
                        break;
                    case 13:
                        setterHandller(lab9, lab13, "img2");
               
                        
                        break;
                    case 14:
                        setterHandller(lab3, lab14, "img7");
             
                        
                        break;
                    case 15:
                        setterHandller(lab11, lab15, "img8");
                     
                        
                        break;
                        
                  }
    

    }

    public void setterHandller(Label l1, Label l2, String imgName) {
              Image compImg = new Image(getClass().getResourceAsStream("/imgs2/" + imgName + ".jpg"));

        
       
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), (ActionEvent event) -> {
            l1.setGraphic(new ImageView(compImg));
            System.out.println("Run after time slice");
            turnLab.setText("Your Turn");
               count(2);
                //turn=1;
               l1.setDisable(true);
              }));

timeline.play();
     
        
        

   
     l2.setGraphic(new ImageView(compImg));
 
       
        l2.setDisable(true);
        
      
        
        
        
        
        

        
        
   

}
     public  void intialize() {
        
        for (Label cell : cells) {
         

          // image = new Image(getClass().getResourceAsStream("/try_agame/imgs/img1.jpg"));
            
            cell.setGraphic(null);
            cell.setDisable(false);
             
            
        }
        ply1Score=0;
        one_score.setText("0");
        ply2Score=0;
         two_score.setText("0");
        counter=0;
        turn=1;
 selectedRecently=new ArrayList<>();
    
  selectedLab=new Label[2];  
        
        
    
    
    }
     public  void count(int p){
       
       switch(p)
       {
       
           case 1:
             ply1Score++; 
             checkTheWinner();
               break;
               
               
           case 2:
               ply2Score++;
               checkTheWinner();
               
               break;
       
       
       }
   
   one_score.setText(String.valueOf(ply1Score));
      two_score.setText(String.valueOf(ply2Score));

   
   
   }
     public void checkTheWinner(){

int c=0;

    for (int i = 0; i < cells.length; i++) {
        
        if(cells[i].getGraphic()==null)
        {
        c++;
        
        }
        
        
    }
    
    
    if(c ==0&&(ply1Score>ply2Score))
    {
        System.out.println("Player one win \n");
        Platform.runLater(() -> turnLab.setText("YOU WIN"));
        
        
      
    
    }
    if(c ==0&&(ply2Score>ply1Score))
    {
        System.out.println("CPU win \n");
Platform.runLater(() -> turnLab.setText("PLAYER TWO WIN"));  
move_to_lose();
    }
    
    if(c ==0&&(ply1Score==ply2Score))
    {
        System.out.println(" DRAW \n");
Platform.runLater(() -> turnLab.setText("DRAW"));
move_to_tie();

    }
    
    c=0;


}
     
     
     
     // method of taransition 
     /*****  to lose *******/ 
     
  public  void move_to_lose() {
      
     l= new y_memory_loseBase();

        

      FadeTransition fd=new  FadeTransition ();
       
      fd.setDuration(Duration.millis(500));
      fd.setNode(this);
      fd.setFromValue(1);
      fd.setToValue(0.0);
      fd.setOnFinished(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              load_l();
          }
      });
      
      fd.play();
      
      }
    
     private void load_l()
      {
          
        
        
       l.setOpacity(0);
      
        
        FadeTransition fd=new  FadeTransition ();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(l);
      fd.setFromValue(0);
      fd.setToValue(1);
      fd.play();
  
        
      Scene s=new Scene(l);
      Stage cur= (Stage) this.getScene().getWindow();
      cur.setScene(s);
      

      }
        
     
     
     /******* to tie ***********/
     
     
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
          
     
     
     //********to home ***************//
     
     
     
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
        
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
}