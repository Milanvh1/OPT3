package com.example.alrijneziekenhuisapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;


public class HelloApplication extends Application{

    private static Stage stg;
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void start(Stage primaryStage) throws IOException {
        stg = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("scene/hello-view.fxml"));
        primaryStage.setTitle("Alrijne Ziekenhuis Bestellingsapplicatie");
        primaryStage.setScene(new Scene(root, 1060, 620));
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch(args);
        Menu.optiesPatiënt();
    }
}

