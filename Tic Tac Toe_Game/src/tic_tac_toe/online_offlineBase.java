package tic_tac_toe;

import java.io.File;
import java.io.IOException;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.stage.WindowEvent;
import javafx.util.Duration;

public class online_offlineBase extends BorderPane {

    home_secreen h;

    public static Scene myscene;
    //function of transition : 

    public void move_to_home() {

        h = new home_secreen();
        mediaPlayer1_b.stop();

        FadeTransition fd = new FadeTransition();

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

    private void load() {

        System.out.println("hello from constructor");

        h.setOpacity(0);

        FadeTransition fd = new FadeTransition();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(h);
        fd.setFromValue(0);
        fd.setToValue(1);
        fd.play();

        Scene s = homeimage.getScene();
        s.setRoot(h);

    }
    ////////////////////////////////////////////

    protected final AnchorPane anchorPane;
    protected final Label label;
    protected final VBox vBox;
    protected final AnchorPane anchorPane0;
    protected final AnchorPane anchorPane1;
    protected final Button offlinebtn;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final Button onlinebtn;
    protected final AnchorPane anchorPane4;
    protected final AnchorPane anchorPane5;
    protected final AnchorPane anchorPane6;
    protected final ImageView homeimage;
    protected final AnchorPane anchorPane7;
    protected final AnchorPane anchorPane8;
    protected final AnchorPane anchorPane9;
    protected final AnchorPane anchorPane10;
    protected final Label logoLabel;

    String hitNormal;
    Media sound;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer1_b;

    /* method of moving to difficult ai*/
    z_offline_xo off;
    z_online_xo on;

    /* music*/
    // function of transition :
    //1-method to moving online :
    public void move_to_online() {

        on = new z_online_xo();
        mediaPlayer1_b.stop();

        FadeTransition fd = new FadeTransition();

        fd.setDuration(Duration.millis(500));
        fd.setNode(this);
        fd.setFromValue(1);
        fd.setToValue(0.0);
        fd.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                load_on();
            }
        });

        fd.play();

    }

    private void load_on() {

        System.out.println("hello from constructor");

        on.setOpacity(0);

        FadeTransition fd = new FadeTransition();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(on);
        fd.setFromValue(0);
        fd.setToValue(1);
        fd.play();

        //  myscene=new Scene(on);
        myscene = onlinebtn.getScene();
        myscene.setRoot(on);
        Stage cur = (Stage) on.getScene().getWindow();

        cur.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent e) {
                System.out.println("iam in colse");
                try {

                    System.out.println("AUTO CLOOOSEEE");
                    on.t = false;
                    on.DOS.writeInt(15);
                    on.DIS.close();
                    on.DOS.close();
                    on.connection.close();

                } catch (IOException ex) {
                    Logger.getLogger(Tic_Tac_Toe.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        cur.setScene(myscene);

    }

    /*method of moving to offline*/
    public void move_to_offline() {

        off = new z_offline_xo();
        mediaPlayer1_b.stop();

        FadeTransition fd = new FadeTransition();

        fd.setDuration(Duration.millis(500));
        fd.setNode(this);
        fd.setFromValue(1);
        fd.setToValue(0.0);
        fd.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                load_off();
            }
        });

        fd.play();

    }

    private void load_off() {

        System.out.println("hello from constructor");

        off.setOpacity(0);

        FadeTransition fd = new FadeTransition();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(off);
        fd.setFromValue(0);
        fd.setToValue(1);
        fd.play();

        Scene s = offlinebtn.getScene();
        s.setRoot(off);

    }

    /* methods of moving to offline*/
    public online_offlineBase(int m) {

        int mm = m;    //for music;

        anchorPane = new AnchorPane();
        label = new Label();
        vBox = new VBox();
        anchorPane0 = new AnchorPane();
        anchorPane1 = new AnchorPane();
        offlinebtn = new Button();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        onlinebtn = new Button();
        anchorPane4 = new AnchorPane();
        anchorPane5 = new AnchorPane();
        anchorPane6 = new AnchorPane();
        homeimage = new ImageView();
        anchorPane7 = new AnchorPane();
        anchorPane8 = new AnchorPane();
        anchorPane9 = new AnchorPane();
        anchorPane10 = new AnchorPane();
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
        vBox.setStyle("-fx-border-width: 7 7 7 7;");

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

        AnchorPane.setBottomAnchor(offlinebtn, 0.0);
        AnchorPane.setLeftAnchor(offlinebtn, 34.0);
        AnchorPane.setRightAnchor(offlinebtn, 21.0);
        AnchorPane.setTopAnchor(offlinebtn, 0.0);
        offlinebtn.setLayoutX(34.0);
        offlinebtn.setLayoutY(19.0);
        offlinebtn.setMaxHeight(USE_PREF_SIZE);
        offlinebtn.setMaxWidth(USE_PREF_SIZE);
        offlinebtn.setMnemonicParsing(false);
        offlinebtn.setPrefHeight(75.0);
        offlinebtn.setPrefWidth(348.0);
        offlinebtn.setStyle("-fx-border-color: Turquoise; -fx-border-width: 7 7 7 7; -fx-background-color: transperent; -fx-border-radius: 30 30 30 30;");
        offlinebtn.getStylesheets().add("/tic_tac_toe/../../../Desktop/spli.css");
        offlinebtn.setText("Offline");
        offlinebtn.setTextFill(javafx.scene.paint.Color.valueOf("#ddd7d7"));
        offlinebtn.setFont(new Font("Monospaced Bold", 32.0));

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

        AnchorPane.setBottomAnchor(onlinebtn, -1.0);
        AnchorPane.setLeftAnchor(onlinebtn, 24.0);
        AnchorPane.setRightAnchor(onlinebtn, 22.0);
        AnchorPane.setTopAnchor(onlinebtn, -4.0);
        onlinebtn.setLayoutX(24.0);
        onlinebtn.setLayoutY(-4.0);
        onlinebtn.setMinHeight(USE_PREF_SIZE);
        onlinebtn.setMinWidth(USE_PREF_SIZE);
        onlinebtn.setMnemonicParsing(false);
        onlinebtn.setPrefHeight(71.0);
        onlinebtn.setPrefWidth(357.0);
        onlinebtn.setStyle("-fx-border-color: Turquoise; -fx-border-width: 7 7 7 7; -fx-border-radius: 30 30 30 30; -fx-background-color: transperent;");
        onlinebtn.setText("Online");
        onlinebtn.setTextFill(javafx.scene.paint.Color.valueOf("#e8dede"));
        onlinebtn.setFont(new Font("Monospaced Bold", 33.0));

        anchorPane4.setPrefHeight(60.0);
        anchorPane4.setPrefWidth(403.0);

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

        AnchorPane.setBottomAnchor(homeimage, -1.0);
        AnchorPane.setLeftAnchor(homeimage, 2.0);
        AnchorPane.setRightAnchor(homeimage, 138.58333206176758);
        AnchorPane.setTopAnchor(homeimage, -1.0);
        homeimage.setFitHeight(62.0);
        homeimage.setFitWidth(73.0);
        homeimage.setLayoutX(2.0);
        homeimage.setLayoutY(-1.0);
        homeimage.setPickOnBounds(true);
        homeimage.setPreserveRatio(true);

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
        logoLabel.setText("TIC TAC TOE");
        logoLabel.setFont(new Font("Monospaced Bold", 53.0));
        logoLabel.setStyle("-fx-text-fill:linear-gradient(to bottom right, WHITE, CYAN);");

        setTop(anchorPane10);

        anchorPane.getChildren().add(label);
        vBox.getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(offlinebtn);
        vBox.getChildren().add(anchorPane1);
        vBox.getChildren().add(anchorPane2);
        anchorPane3.getChildren().add(onlinebtn);
        vBox.getChildren().add(anchorPane3);
        vBox.getChildren().add(anchorPane4);
        anchorPane6.getChildren().add(homeimage);
        anchorPane5.getChildren().add(anchorPane6);
        anchorPane5.getChildren().add(anchorPane7);
        vBox.getChildren().add(anchorPane5);
        anchorPane10.getChildren().add(logoLabel);

        // hitNormal = ("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/sounds/Marimba-music.mp3");
        sound = new Media(getClass().getResource("/tic_tac_toe/sounds/Marimba-music.mp3").toExternalForm());
        mediaPlayer1_b = new MediaPlayer(sound);
        mediaPlayer1_b.setVolume(0.09);
        mediaPlayer1_b.stop();
        if (mm % 2 == 0) {

            mediaPlayer1_b.play();

        } else {

            mediaPlayer1_b.stop();

        }

//        mediaPlayer1_b.setAutoPlay(true);
//        mediaPlayer1_b.setVolume(.09);
        //File file2 = new File("/Users/macproretina/Downloads/java_tasks/Tic_Tac_Toe/src/tic_tac_toe/image/unnamed.png");
        Image image2 = new Image(getClass().getResource("/tic_tac_toe/image/unnamed.png").toExternalForm());
        homeimage.setImage(image2);

        homeimage.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                move_to_home();

            }
        }
        );

        // online go to diff_ai;
        onlinebtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                move_to_online();

            }

        });

        offlinebtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                move_to_offline();

            }

        });

    }
}
