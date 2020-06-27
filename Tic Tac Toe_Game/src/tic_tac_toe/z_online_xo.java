package tic_tac_toe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Duration;

public class z_online_xo extends xo_bordBase implements Runnable {

    z_online_win zow;
    z_online_lose zol;
    z_online_tie zot;
    String s;
    boolean t = true;
    Thread th;
    boolean BackHomeFromReplay = true;

    /* methods of transition*/
 /*1-move to win :*/
    public void move_to_online_win() {
        zow = new z_online_win(this);

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

        zow.setOpacity(0);
        FadeTransition fd = new FadeTransition();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(zow);
        fd.setFromValue(0);
        fd.setToValue(1);
//      fd.setOnFinished(t -> {
//      this.getChildren().remove(this);
//        });

        fd.play();

//         Scene s=this.getScene();
//         s.setRoot(zow);
        Scene s = new Scene(zow);

        Stage cur = (Stage) this.getScene().getWindow();
        cur.setScene(s);

    }

    ////////////////////////////////////////
    /*2-move to lose:*/
    public void move_to_online_lose() {

        zol = new z_online_lose(this);
        mediaPlayer1_b.stop();

        FadeTransition fd = new FadeTransition();

        fd.setDuration(Duration.millis(500));
        fd.setNode(this);
        fd.setFromValue(1);
        fd.setToValue(0.0);
        fd.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                load_lo();
            }
        });

        fd.play();

    }

    private void load_lo() {

        System.out.println("hello from constructor");

        zol.setOpacity(0);
        FadeTransition fd = new FadeTransition();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(zol);
        fd.setFromValue(0);
        fd.setToValue(1);
        fd.play();

//       Scene s=this.getScene();
//         s.setRoot(zol);
        Scene s = new Scene(zol);
        Stage cur = (Stage) this.getScene().getWindow();
        cur.setScene(s);

    }

    /////////////////////////////
    /*3-move to tie :*/
    public void move_to_online_tie() {

        zot = new z_online_tie(this);
        mediaPlayer1_b.stop();

        FadeTransition fd = new FadeTransition();

        fd.setDuration(Duration.millis(500));
        fd.setNode(this);
        fd.setFromValue(1);
        fd.setToValue(0.0);
        fd.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                load_to();
            }
        });

        fd.play();

    }

    private void load_to() {

        System.out.println("hello from constructor");

        zot.setOpacity(0);
        FadeTransition fd = new FadeTransition();
        fd.setDuration(Duration.millis(1000));
        fd.setNode(zot);
        fd.setFromValue(0);
        fd.setToValue(1);
        fd.play();

//       Scene s=this.getScene();
//         s.setRoot(zot);
        Scene s = new Scene(zot);
        Stage cur = (Stage) this.getScene().getWindow();
        cur.setScene(s);

    }

    //end of the method   /* methods of transition*/
    Button currentButton;
    Socket connection;
    DataOutputStream DOS;
    DataInputStream DIS;
    String UserName;

    String ticTacToeHost;
    String myMark;
    boolean myTurn;
    String Xmark = "x";
    String Omark = "o";
    String w;
    String l;
    boolean flag = true;

    Stage st;
    Button[] bs = new Button[9];
    //int win=0;
    //int loss=0;

    public z_online_xo() {

        try {
            connection = new Socket("172.16.4.137", 12345);
           // connection = new Socket("192.168.1.2", 12345);
            DIS = new DataInputStream(connection.getInputStream());
            DOS = new DataOutputStream(connection.getOutputStream());
        } catch (IOException ioException) {
            System.out.println(ioException.toString());
        }
        UserName = user_nameBase.user;
        bs[0] = btn1;
        bs[1] = btn2;
        bs[2] = btn3;
        bs[3] = btn4;
        bs[4] = btn5;
        bs[5] = btn6;
        bs[6] = btn7;
        bs[7] = btn8;
        bs[8] = btn9;

        bs[0].setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                currentButton = bs[0];
                sendLocation(0);

            }
        });

        bs[1].setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                currentButton = bs[1];
                sendLocation(1);

            }
        });

        bs[2].setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                currentButton = bs[2];
                sendLocation(2);

            }
        });

        bs[3].setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                currentButton = bs[3];
                sendLocation(3);

            }
        });

        bs[4].setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                currentButton = bs[4];
                sendLocation(4);

            }
        });

        bs[5].setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                currentButton = bs[5];
                sendLocation(5);

            }
        });

        bs[6].setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                currentButton = bs[6];
                sendLocation(6);

            }
        });

        bs[7].setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                currentButton = bs[7];
                sendLocation(7);

            }
        });

        bs[8].setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                currentButton = bs[8];
                sendLocation(8);
            }
        });

        th = new Thread(this);
        th.start();

        home_image.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {

                try {
                    DOS.writeInt(15);

                } catch (IOException ex) {
                    Logger.getLogger(z_online_xo.class.getName()).log(Level.SEVERE, null, ex);
                }
                move_to_home();
            }
        });

    }

    @Override
    public void run() {
        try {
            myMark = DIS.readUTF();
        } catch (IOException ex) {
            Logger.getLogger(z_online_xo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            display("");
            Platform.runLater(() -> {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Server Problem");
                alert.setHeaderText(null);
                alert.setOnCloseRequest(e -> move_to_home());
                alert.setContentText("Sorry There is a a problem in the server try again later");
                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.OK) {
                    move_to_home();
                }

            });
        }

        message_label.setText("You are  \"" + myMark + "\"");

        myTurn = (myMark.equals(Xmark));

        while (true) {

            try {
                s = DIS.readUTF();
                if (s.equals("IAMOUT")) {
                    DIS.close();
                    DOS.close();
                }
                casesHandling(s);
                if (s.equals("OUT")) {
                    break;
                }

            } catch (Exception ex) {
                if (t) {
                    Platform.runLater(() -> {

                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Server Problem");
                        alert.setHeaderText(null);
                        alert.setOnCloseRequest(e -> move_to_home());
                        alert.setContentText("Sorry There is a a problem in the server try again later");
                        Optional<ButtonType> result = alert.showAndWait();
                        if (result.get() == ButtonType.OK) {
                            move_to_home();
                        }

                    });
                }

                break;
            }

        }
    }

    private void casesHandling(String input) {

        switch (input) {
            case "Valid Move.":

                setMark(currentButton, myMark);
                display("Valid Move");
                break;
            case "Invalid Move, Try Again":
                display(input + "\n");
                myTurn = true;
                break;
            case "Opponent moved":
                int location;
                try {
                    location = DIS.readInt();
                    setMark(bs[location], (myMark.equals(Xmark) ? Omark : Xmark));
                } catch (IOException ex) {
                    Logger.getLogger(z_online_xo.class.getName()).log(Level.SEVERE, null, ex);
                }
                display("Your Turn");
                myTurn = true;
                break;

            case "LOSS":
                display(input + "\n");
                myTurn = false;
                if (myMark.equals("o")) {
                    xo_bordBase.youWin++;
                    w = Integer.toString(xo_bordBase.youWin);
                    setCount(x_score_count, w);
                } else {
                    xo_bordBase.computerWins++;
                    l = Integer.toString(xo_bordBase.computerWins);
                    setCount(o_score_count, l);
                }
                SetWinningStyle();
                move_to_online_lose();
                break;

            case "TIE":
                display(input + "\n");
                myTurn = false;
                move_to_online_tie();
                break;
            case "WIN":

                if (myMark.equals("x")) {
                    xo_bordBase.youWin++;
                    w = Integer.toString(xo_bordBase.youWin);
                    setCount(x_score_count, w);

                } else {
                    xo_bordBase.computerWins++;
                    l = Integer.toString(xo_bordBase.computerWins);
                    setCount(o_score_count, l);
                }

                display(input + "\n");
                myTurn = false;
                SetWinningStyle();
                move_to_online_win();
                break;

            case "REPLAY":
                System.out.println("Iam in client replay");
                for (int i = 0; i < 9; i++) {
                    setMark(bs[i], "");
                }
                if (myMark.equals("x")) {
                    myTurn = true;
                }
                break;

            case "OUT":
                System.out.println("Iam in out");
                BackHomeFromReplay = false;
                 {
                    try {
                        DIS.close();
                        DOS.close();
                    } catch (IOException ex) {
                        Logger.getLogger(z_online_xo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                String y;
                if (myMark.equals("x")) {
                    y = "O is out,You will go home in 5 secs";
                } else {
                    y = "X is out,You will go home in 5 secs";
                }
                display(y);
                DisableAllButtons();
                goHomeTimer();
                move_to_home();
                break;

            case "ReplayTie":
                zot.ToPlayAgainAlert();
                System.out.println("ana gowa eltie");
                break;

            case "ReplayLoss":
                zow.ToPlayAgainAlert();
                System.out.println("ana gowa elloss");
                break;

            case "ReplayWin":
                System.out.println("ana gowa elwin");
                zol.ToPlayAgainAlert();
                break;

            case "ReplayConfirmation":
                if (zot != null) {
                    zot.move_to_xo_online();
                } else if (zow != null) {
                    zow.move_to_xo_online();
                } else if (zol != null) {
                    System.out.println("Iam in lossing replay");
                    zol.move_to_xo_online();
                }
                if (myMark.equals("x")) {
                    display("your turn");
                } else {
                    display("oppenent turn");
                }
                break;

            case "RefuseAlert":
                if (zot != null) {
                    zot.displayRefusingAlert();
                } else if (zow != null) {
                    zow.displayRefusingAlert();
                } else {
                    zol.displayRefusingAlert();
                }
                break;
            default:
                display(input + "\n");
                break;
        }
    }
    int i = 0;

    void display(String Todisplay) {
        System.out.println("in display");
        Platform.runLater(() -> {
            message_label.setText(Todisplay);
        });

    }

    public void setMark(Button ButtonToMark, String mark) {

        if (mark.equals(Xmark)) {

            if (ButtonToMark == bs[0] || ButtonToMark == bs[1] || ButtonToMark == bs[3] || ButtonToMark == bs[4]) {
                Platform.runLater(() -> {
                    ButtonToMark.setText(mark);
                });
                ButtonToMark.setStyle(x_style_bt1_2_4_5);
            } else if (ButtonToMark == bs[2] || ButtonToMark == bs[5]) {
                Platform.runLater(() -> {
                    ButtonToMark.setText(mark);
                });
                ButtonToMark.setStyle(x_style_bt3_6);
            } else if (ButtonToMark == bs[6] || ButtonToMark == bs[7]) {
                Platform.runLater(() -> {
                    ButtonToMark.setText(mark);
                });
                ButtonToMark.setStyle(x_style_bt7_8);

            } else {
                Platform.runLater(() -> {
                    ButtonToMark.setText(mark);
                });
                ButtonToMark.setStyle(x_style_bt9);

            }
        } else {

            if (ButtonToMark == bs[0] || ButtonToMark == bs[1] || ButtonToMark == bs[3] || ButtonToMark == bs[4]) {
                Platform.runLater(() -> {
                    ButtonToMark.setText(mark);
                    ButtonToMark.setStyle(o_style_bt1_2_4_5);
                });

            } else if (ButtonToMark == bs[2] || ButtonToMark == bs[5]) {
                Platform.runLater(() -> {
                    ButtonToMark.setText(mark);

                    ButtonToMark.setStyle(o_style_bt3_6);
                });

            } else if (ButtonToMark == bs[6] || ButtonToMark == bs[7]) {
                Platform.runLater(() -> {
                    ButtonToMark.setText(mark);

                    ButtonToMark.setStyle(o_style_bt7_8);
                });

            } else {
                Platform.runLater(() -> {
                    ButtonToMark.setText(mark);

                    ButtonToMark.setStyle(o_style_bt9);
                });

            }
        }

    }

    public void setCount(Label l, String mark) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                l.setText(mark);

            }
        });

    }

    ;
    

    public void sendLocation(int location) {

        if (myTurn) {
            try {
                DOS.writeInt(location);
            } catch (IOException ex) {
                Logger.getLogger(z_online_xo.class.getName()).log(Level.SEVERE, null, ex);
            }
            myTurn = false;
        }
    }

    public void setStage(Stage st) {
        this.st = st;
    }

    public void goHomeTimer() {
        try {
            th.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(z_online_xo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SetWinningStyle() {

        while (flag == true) {
            if (!bs[0].getText().equals("") && bs[0].getText().equals(bs[1].getText()) && bs[0].getText().equals(bs[2].getText())) {
                if (bs[0].getText().equals(Xmark)) {
                    bs[0].setStyle(x_style_suc);
                    bs[1].setStyle(x_style_suc);
                    bs[2].setStyle(x_style_suc);
                    flag = false;
                } else {
                    bs[0].setStyle(o_style_suc);
                    bs[1].setStyle(o_style_suc);
                    bs[2].setStyle(o_style_suc);
                    flag = false;
                }
            } else if (!bs[3].getText().equals("") && bs[3].getText().equals(bs[4].getText()) && bs[3].getText().equals(bs[5].getText())) {
                if (bs[3].getText().equals(Xmark)) {
                    bs[3].setStyle(x_style_suc);
                    bs[4].setStyle(x_style_suc);
                    bs[5].setStyle(x_style_suc);
                    flag = false;
                } else {
                    bs[3].setStyle(o_style_suc);
                    bs[4].setStyle(o_style_suc);
                    bs[5].setStyle(o_style_suc);
                    flag = false;
                }
            } else if (!bs[6].getText().equals("") && bs[6].getText().equals(bs[7].getText()) && bs[6].getText().equals(bs[8].getText())) {
                if (bs[6].getText().equals(Xmark)) {
                    bs[6].setStyle(x_style_suc);
                    bs[7].setStyle(x_style_suc);
                    bs[8].setStyle(x_style_suc);
                    flag = false;
                } else {
                    bs[6].setStyle(o_style_suc);
                    bs[7].setStyle(o_style_suc);
                    bs[8].setStyle(o_style_suc);
                    flag = false;
                }
            } else if (!bs[0].getText().equals("") && bs[0].getText().equals(bs[3].getText()) && bs[0].getText().equals(bs[6].getText())) {
                if (bs[0].getText().equals(Xmark)) {
                    bs[0].setStyle(x_style_suc);
                    bs[3].setStyle(x_style_suc);
                    bs[6].setStyle(x_style_suc);
                    flag = false;
                } else {
                    bs[0].setStyle(o_style_suc);
                    bs[3].setStyle(o_style_suc);
                    bs[6].setStyle(o_style_suc);
                    flag = false;
                }
            } else if (!bs[1].getText().equals("") && bs[1].getText().equals(bs[4].getText()) && bs[1].getText().equals(bs[7].getText())) {
                if (bs[1].getText().equals(Xmark)) {
                    bs[1].setStyle(x_style_suc);
                    bs[4].setStyle(x_style_suc);
                    bs[7].setStyle(x_style_suc);
                    flag = false;
                } else {
                    bs[1].setStyle(o_style_suc);
                    bs[4].setStyle(o_style_suc);
                    bs[7].setStyle(o_style_suc);
                    flag = false;
                }
            } else if (!bs[2].getText().equals("") && bs[2].getText().equals(bs[5].getText()) && bs[2].getText().equals(bs[8].getText())) {
                if (bs[2].getText().equals(Xmark)) {
                    bs[2].setStyle(x_style_suc);
                    bs[5].setStyle(x_style_suc);
                    bs[8].setStyle(x_style_suc);
                    flag = false;
                } else {
                    bs[2].setStyle(o_style_suc);
                    bs[5].setStyle(o_style_suc);
                    bs[8].setStyle(o_style_suc);
                    flag = false;
                }
            } else if (!bs[0].getText().equals("") && bs[0].getText().equals(bs[4].getText()) && bs[0].getText().equals(bs[8].getText())) {
                if (bs[0].getText().equals(Xmark)) {
                    bs[0].setStyle(x_style_suc);
                    bs[4].setStyle(x_style_suc);
                    bs[8].setStyle(x_style_suc);
                    flag = false;
                } else {
                    bs[0].setStyle(o_style_suc);
                    bs[4].setStyle(o_style_suc);
                    bs[8].setStyle(o_style_suc);
                    flag = false;
                }
            } else if (!bs[2].getText().equals("") && bs[2].getText().equals(bs[4].getText()) && bs[2].getText().equals(bs[6].getText())) {
                if (bs[2].getText().equals(Xmark)) {
                    bs[2].setStyle(x_style_suc);
                    bs[4].setStyle(x_style_suc);
                    bs[6].setStyle(x_style_suc);
                    flag = false;
                } else {
                    bs[2].setStyle(o_style_suc);
                    bs[4].setStyle(o_style_suc);
                    bs[6].setStyle(o_style_suc);
                    flag = false;
                }
            }
        }
    }

    public void DisableAllButtons() {
        for (int i = 0; i < bs.length; i++) {
            bs[i].setDisable(true);
        }
    }

}
