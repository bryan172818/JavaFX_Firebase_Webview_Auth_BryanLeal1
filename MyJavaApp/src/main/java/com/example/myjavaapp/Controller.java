package com.example.myjavaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private Button resetButton;

    public void resetButtonOnAction(ActionEvent e){
        Stage stage = (Stage) resetButton.getScene().getWindow();
        stage.close();
    }


}