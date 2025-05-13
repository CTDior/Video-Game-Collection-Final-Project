package main.java.Controllers;
package com.example.gametracker.models;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class GameDetailsController {
    @FXML private ImageView coverImageView;
    @FXML private Label titleLabel;
    @FXML private Label platformLabel;
    @FXML private Label genreLabel;
    @FXML private CheckBox completeInBoxCheckbox;
    @FXML private Label pricePaidLabel;
    @FXML private Label pricechartingLabel;
    @FXML private Label esrbLabel;
    @FXML private Label metacriticLabel;
    @FXML private TextArea notesArea;
    @FXML private Button editButton;

    @FXML
    public void initialize() {
    }

    @FXML
    private void onEdit(ActionEvent event) {
    }

    @FXML
    private void onBack(ActionEvent event) {
    }
}
