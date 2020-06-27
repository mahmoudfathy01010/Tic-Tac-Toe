package tic_tac_toe_server;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class fxBase extends AnchorPane {
protected final Label label;
    public fxBase() {
        label = new Label();
        label.setLayoutX(0.0);
        label.setLayoutY(-35.0);
        label.setPrefHeight(100.0);
        label.setPrefWidth(150.0);
        label.setWrapText(true);
        label.setText("  Tick_Tack_Toe Server");
        getChildren().add(label);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(200.0);
        setPrefWidth(200.0);

    }

}
