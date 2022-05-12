package com.example.parcialadsw;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProyectoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}