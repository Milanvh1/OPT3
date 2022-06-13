package com.example.alrijneziekenhuisapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Patiënt {

    @FXML
    private Button button;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField naam;
    @FXML
    private TextField patiëntnummer;

    public void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        HelloApplication m = new HelloApplication();
        if (naam.getText().toString().equals("Henk van der Steen") && patiëntnummer.getText().toString().equals("123")) {
            wrongLogin.setText("Gelukt!");
            m.changeScene("scene/afterLogin.fxml");
        } else if (naam.getText().toString().equals("Kees Baksteen") && patiëntnummer.getText().toString().equals("001")) {
            wrongLogin.setText("Gelukt!");
            m.changeScene("scene/afterLogin.fxml");
        } else if (naam.getText().isEmpty() && patiëntnummer.getText().isEmpty()) {
            wrongLogin.setText("Voer uw gegevens in!");
        } else {
            wrongLogin.setText("Verkeerde naam of patiëntnummer!");
        }
    }
}



