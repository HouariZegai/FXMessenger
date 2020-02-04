package com.houarizegai.messengerfx.java.controllers;

import com.houarizegai.messengerfx.java.utils.FXTools;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class WelcomeController {

    @FXML
    private void onContinueAs() {
        System.out.println("Hello Houari ZEGAI!");
    }

    @FXML
    private void onSwitchAccount(ActionEvent e) {
        FXTools.changeView(e, getClass(), "SwitchAccount");
    }
}
