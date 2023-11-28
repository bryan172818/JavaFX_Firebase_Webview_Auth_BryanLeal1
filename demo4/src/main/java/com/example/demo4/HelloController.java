package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    protected void onLoginButtonClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Add your login logic here
        if (username.equals("your_username") && password.equals("your_password")) {
            welcomeText.setText("Login Successful!");
        } else {
            welcomeText.setText("Login Failed. Please try again.");
        }
    }

    @FXML
    protected void onCloseButtonClick() {
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.close();
    }
}
