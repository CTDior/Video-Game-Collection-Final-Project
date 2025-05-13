package main.java.Controllers;
package com.example.gametracker.models;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;

public class MainLibraryController {
    @FXML private TextField searchBar;
    @FXML private Button addGameButton;
    @FXML private TilePane gameGrid;

    @FXML
    public void initialize() {
        // TODO: populate categories, load games into grid
    }

    @FXML
    private void onAddGame() {
        // TODO: navigate to Add/Edit view
    }
}
