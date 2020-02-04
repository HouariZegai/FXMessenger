package com.houarizegai.messengerfx.java.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private VBox boxContact, boxMoreConversations;
    @FXML
    private HBox boxActiveNow;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadConversationsSamples();
        loadActiveNowSamples();
    }

    private void loadConversationsSamples() {
        for(int i = 0; i < 5; i++) {
            try {
                boxContact.getChildren().add(FXMLLoader.load(getClass().getResource("/com/houarizegai/messengerfx/resources/views/cards/Contact.fxml")));
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
        }

        for(int i = 0; i < 3; i++) {
            try {
                boxMoreConversations.getChildren().add(FXMLLoader.load(getClass().getResource("/com/houarizegai/messengerfx/resources/views/cards/Contact.fxml")));
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    private void loadActiveNowSamples() {
        for(int i = 0; i < 7; i++) {
            try {
                boxActiveNow.getChildren().add(FXMLLoader.load(getClass().getResource("/com/houarizegai/messengerfx/resources/views/cards/ActiveNow.fxml")));
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
