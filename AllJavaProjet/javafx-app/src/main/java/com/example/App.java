package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Créer un label
        // Label label = new Label("Bonjour, JavaFX !");
        VBox root = FXMLLoader.load(getClass().getResource("/layout/App.fxml"));

        // Créer une scène avec le label
        Scene scene = new Scene(root, 300, 200);

        // Configurer la fenêtre principale
        primaryStage.setTitle("Ma Première Application JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}