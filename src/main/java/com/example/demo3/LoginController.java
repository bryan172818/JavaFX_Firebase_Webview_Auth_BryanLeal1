
package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class LoginController  {

    @FXML
    private Label welcomeText;
    @FXML
    private Label welText;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button cancelButton;

    @FXML
    private Button login_button;

    //Not needed
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    //Not needed
    @FXML
    protected void OnClickMeButtonClick() {
        welText.setText("o JavaFX Application!");
    }

    @FXML
    protected void OnClickMecancelbuttonClick() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void onLoginButtonClick() {
        String enteredUsername = usernameField.getText();
        String enteredPassword = passwordField.getText();

        if (enteredUsername.equals("Jeff") && enteredPassword.equals("Jeff1")) {


            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
                Parent root = loader.load();
                Stage menuStage = new Stage();
                menuStage.setScene(new Scene(root));
                menuStage.show();


                Stage loginStage = (Stage) usernameField.getScene().getWindow();
                loginStage.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //welcomeText.setText("Invalid username or password");
        }
    }


    @FXML
    private Button WorkoutVideos; // Make sure to match this with  FXML

    @FXML
    private void onWorkoutVideosButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("WorkoutVideos.fxml"));
            Parent root = loader.load();


            Stage stage = new Stage();
            stage.setTitle("Workout Videos");
            stage.setScene(new Scene(root));


            stage.show();


            Stage oldStage = (Stage) WorkoutVideos.getScene().getWindow();
            oldStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button Push_Up;

    
    
    public void handleOpenPushupTutorial(MouseEvent mouseEvent) {
        try {
            // Load the PushUpTutorial.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PushUpTutorial.fxml"));
            Parent root = loader.load();

            // Create a new scene and set it on the stage
            Scene scene = new Scene(root);
            Stage stage = (Stage) Push_Up.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    
}



















