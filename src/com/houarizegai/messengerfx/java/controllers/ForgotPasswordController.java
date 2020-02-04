package com.houarizegai.messengerfx.java.controllers;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ForgotPasswordController {

    @FXML
    private JFXTextField fieldEmailPhone;

    @FXML
    private void onContinue(ActionEvent e) {

    }

    @FXML
    private void onBack(ActionEvent e) {
        Stage mStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        try {
            mStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/com/houarizegai/messengerfx/resources/views/SignIn.fxml"))));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
