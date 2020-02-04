package com.houarizegai.messengerfx.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        try {
            // get main views (fxml file)
            Parent root = FXMLLoader.load(getClass().getResource("/com/houarizegai/messengerfx/resources/views/Home.fxml"));
            // make icon for app
            stage.getIcons().add(new Image("/com/houarizegai/messengerfx/resources/images/icons/icon_app.png"));
            stage.setScene(new Scene(root));
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        stage.setTitle("MessengerFX");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
