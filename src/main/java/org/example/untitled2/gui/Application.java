package org.example.untitled2.gui;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    public void start(Stage stage) {
        Label label = new Label("Hello JavaFX!");
        Scene scene = new Scene(label, 400, 200);        stage.setTitle("はじめてのJavaFX");
        stage.setScene(scene);
        stage.show();
    }
}
