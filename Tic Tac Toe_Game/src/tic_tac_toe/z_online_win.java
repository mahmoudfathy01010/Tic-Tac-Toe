package tic_tac_toe;

import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.util.Duration;

public class z_online_win extends newwinnerBase {

    /* method of transition */
 /*start*/
    z_online_xo xon;
    //Scene myxo;

    public void move_to_xo_online() {
        mediaPlayer.stop();
        //  xon= online_offlineBase.on;
        //xon=new z_online_xo();
        //mediaPlayer1_b.stop();

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

        xon.setOpacity(0);
        xon.mediaPlayer1_b.play();

        FadeTransition fd = new FadeTransition();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(this.xon);
        fd.setFromValue(0);
        fd.setToValue(1);
        fd.play();

        //Scene s=new Scene(this.xon);
        Stage cur = (Stage) this.getScene().getWindow();
        if (cur == null) {
            System.err.println("cur is null");
        } else {
            System.err.println("Cur is not null");
        }
        System.out.println("before null pointer exception");
        cur.setScene(online_offlineBase.myscene);
        System.out.println("after null pointer exception");
//        xon.mediaPlayer1_b.play();

    }

    /* end */
    public z_online_win(z_online_xo x) {

        xon = x;
        //to handle saving :

        save_image.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                xon.t=false;
                try {
                    xon.DOS.writeInt(10);
                    xon.DOS.writeUTF(xon.UserName);
                } catch (IOException ex) {
                    Logger.getLogger(z_online_win.class.getName()).log(Level.SEVERE, null, ex);
                }

                save_image.setOpacity(1); // don't remove this line ,related to design 

            }
        }
        );

        //to handle replaying :
        replay_image.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {

                //   move_to_xo_online();
                try {
                    System.out.println("Iam in sending");
                    xon.DOS.writeInt(300);
                    System.out.println("Iam after sending");
                } catch (IOException ex) {
                    Logger.getLogger(z_online_lose.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (xon.BackHomeFromReplay == false) {
                    Platform.runLater(() -> {

                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Server Problem");
                        alert.setHeaderText(null);
                        alert.setOnCloseRequest(e -> move_to_home());
                        alert.setContentText("The other player is OUT");
                        Optional<ButtonType> result = alert.showAndWait();
                        if (result.get() == ButtonType.OK) {
                            move_to_home();
                        }

                    });
                }

            }
        }
        );

        home.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                xon.t=false;
                try {
                    xon.DOS.writeInt(15);

                } catch (IOException ex) {
                    Logger.getLogger(z_online_xo.class.getName()).log(Level.SEVERE, null, ex);
                }
                move_to_home();
            }
        });

    }

    public void ToPlayAgainAlert() {
        Platform.runLater(() -> {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Play Again Confirmation");
            alert.setHeaderText(null);
            alert.setContentText("The other player asks to play");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                try {
                    xon.DOS.writeInt(300);
                    xon.DOS.writeInt(50);

                    if (xon.myMark.equals("x")) {
                        xon.display("your turn");
                    } else {
                        xon.display("oppenent turn");
                    }

                    move_to_xo_online();
                } catch (IOException ex) {
                    Logger.getLogger(z_online_tie.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    xon.DOS.writeInt(13);
                } catch (IOException ex) {
                    Logger.getLogger(z_online_win.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    //Show alert That tells the oppenent refusing
    public void displayRefusingAlert() {
        Platform.runLater(() -> {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Oppenent Answer");
            alert.setHeaderText(null);
            alert.setContentText("Sorry, The other player refused to play again!");

            alert.showAndWait();
        });
    }

}
