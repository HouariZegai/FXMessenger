package com.houarizegai.messengerfx.java.controllers;

import com.jfoenix.controls.JFXRadioButton;
import javafx.fxml.FXML;

public class SwitchAccountController {
    @FXML
    private JFXRadioButton radioHaveAccount, radioDoNotHaveAccount;

    @FXML
    private void onBack() {
        System.out.println("Back to welcome !");
    }

    @FXML
    private void onContinue() {
        System.out.println("Continue !");
    }
}
