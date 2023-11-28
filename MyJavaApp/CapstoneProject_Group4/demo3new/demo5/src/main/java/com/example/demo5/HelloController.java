package com.example.demo5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
@FXML
    private Label welText;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void OnClickMeButtonClick() {
        welText.setText("o JavaFX Application!");
    }










}