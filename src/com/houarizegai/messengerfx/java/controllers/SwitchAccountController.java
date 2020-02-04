package com.houarizegai.messengerfx.java.controllers;

import com.houarizegai.messengerfx.java.utils.FXTools;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class SwitchAccountController {
    @FXML
    private JFXRadioButton radioHaveAccount, radioDoNotHaveAccount;

    @FXML
    ToggleGroup tglGrpSwitchAccount;

    @FXML
    private void onBack(ActionEvent e) {
        FXTools.changeView(e, getClass(), "Welcome");
    }

    @FXML
    private void onContinue(ActionEvent e) {
        if (!radioHaveAccount.isSelected() && !radioDoNotHaveAccount.isSelected())
            return;

        FXTools.changeView(e, getClass(), (radioHaveAccount.isSelected() ? "SignIn" : "SignUp"));
    }
}
