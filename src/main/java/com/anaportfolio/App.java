package com.anaportfolio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label welcomeLabel = new Label("Welcome to your Personal Finance Tracker!");
        VBox root = new VBox(20);
        root.getChildren().add(welcomeLabel);

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Finance Tracker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}