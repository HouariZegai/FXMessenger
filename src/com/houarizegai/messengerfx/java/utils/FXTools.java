package com.houarizegai.messengerfx.java.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FXTools {
    public static void changeView(ActionEvent e, Class c, String viewName) {
        Stage mStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        try {
            mStage.setScene(new Scene(FXMLLoader.load(c.getClass().getResource(String.format("/com/houarizegai/messengerfx/resources/views/%s.fxml", viewName)))));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
