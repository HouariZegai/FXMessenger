package com.houarizegai.messengerfx.java.controllers;

import com.houarizegai.messengerfx.java.utils.FXTools;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SignUpController {

    @FXML
    private JFXTextField fieldPhone;

    @FXML
    private void onContinue() {

    }

    @FXML
    private void onPrivacyPolicy() {

    }

    @FXML
    private void onTerms() {

    }

    @FXML
    private void onBack(ActionEvent e) {
        FXTools.changeView(e, getClass(), "SwitchAccount");
    }
}
