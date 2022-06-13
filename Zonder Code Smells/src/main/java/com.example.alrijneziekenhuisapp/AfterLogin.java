package com.example.alrijneziekenhuisapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AfterLogin {

    @FXML
    private Button logout;
    @FXML
    private AnchorPane scenePane;
    @FXML
    private Button bestellen;

    Stage primaryStage;

    public void userLogOut(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("scene/hello-view.fxml");
    }

    public void userBestellen(ActionEvent event) {
        primaryStage = (Stage) scenePane.getScene().getWindow();
        primaryStage.close();
    }
}
