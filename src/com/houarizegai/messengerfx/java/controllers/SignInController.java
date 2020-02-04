package com.houarizegai.messengerfx.java.controllers;

import com.houarizegai.messengerfx.java.utils.FXTools;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SignInController {

    @FXML
    private JFXTextField fieldEmailPhone;

    @FXML
    private JFXPasswordField fieldPassword;

    @FXML
    private void onSignIn(ActionEvent e) {
        System.out.println("Sign In!");
    }

    @FXML
    private void onForgotPassword(ActionEvent e) {
        FXTools.changeView(e, getClass(), "ForgotPassword");
    }

    @FXML
    private void onNotOnFacebook(ActionEvent e) {
        FXTools.changeView(e, getClass(), "SwitchAccount");
    }

    @FXML
    private void onBack(ActionEvent e) {
        FXTools.changeView(e, getClass(), "SwitchAccount");
    }
}
