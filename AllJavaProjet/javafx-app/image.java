// package com.example;

// import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.layout.VBox;
// import javafx.stage.Stage;


// // Charger l'image depuis les ressources
// Image image = new Image(getClass().getResourceAsStream("/images/rose.jpg"));

// // Créer un BackgroundImage
// BackgroundImage backgroundImage = new BackgroundImage(
// 		image,
// 		BackgroundRepeat.NO_REPEAT,  // Répétition horizontale
// 		BackgroundRepeat.NO_REPEAT,  // Répétition verticale
// 		BackgroundPosition.CENTER,  // Position de l'image
// 		new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true) // Taille de l'image
// );

// // Créer un Background avec l'image
// Background background = new Background(backgroundImage);

// // Appliquer le fond au Pane
// root.setBackground(background);