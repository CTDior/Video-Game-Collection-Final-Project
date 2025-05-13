package main.java.controllers;
package com.example.gametracker.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AddEditGameController {
    @FXML private TextField titleField;
    @FXML private TextField platformField;
    @FXML private TextField genreField;
    @FXML private CheckBox completeInBoxCheckbox;
    @FXML private DatePicker dateAcquiredPicker;
    @FXML private TextField pricePaidField;
    @FXML private TextField pricechartingField;
    @FXML private TextField esrbField;
    @FXML private TextField metacriticField;
    @FXML private TextArea notesArea;
    @FXML private Button saveButton;

    @FXML
    public void initialize() {
    }

    @FXML
    private void onSave() {
    }
}
