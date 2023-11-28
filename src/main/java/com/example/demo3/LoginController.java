
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
import java.util.ArrayList;
import java.util.List;

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
    //for the signup page
    @FXML
    private TextField emailField;  // New email input field
    @FXML
    private PasswordField password_Field;
    @FXML
    private Button login_button;

    private List<UserProfile> userProfiles = new ArrayList<>(); // Store user profiles

    // ... other methods ...
    @FXML
    protected void onSubmitButtonClick(ActionEvent event) {
        // Get user input from the form
        String enteredUsername = usernameField.getText();
        String enteredPassword = password_Field.getText();
        String enteredEmail = emailField.getText();  // Get email input

        // Create a UserProfile object with the entered data
        UserProfile userProfile = new UserProfile(enteredUsername, enteredEmail, enteredPassword);

        // Add the UserProfile object to the list
        userProfiles.add(userProfile);

        // Display user information
        System.out.println("User Credentials Stored:");
        System.out.println("Username: " + userProfile.getUsername());
        System.out.println("Email: " + userProfile.getEmail());
        System.out.println("Password: " + userProfile.getPassword());

        // Clear the input fields
        usernameField.clear();
        password_Field.clear();
        emailField.clear();

        // Optionally, you can save the userProfiles list to a file for persistent storage.
    }

    // Rest of your code...

//    @FXML first attepmt Dont delete yet!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    protected void onSubmitButtonClick(ActionEvent event) {
//        // Get user input from the form
//        String enteredUsername = usernameField.getText();
//        String enteredPassword = password_Field.getText();
//        // You can also get the emailField value if needed.
//
//        // Create a UserProfile object with the entered data
//        UserProfile userProfile = new UserProfile(enteredUsername, enteredPassword, ""); // Replace "" with the email if needed.
//
//        // Add the UserProfile object to the list
//        userProfiles.add(userProfile);
////
////        // Display a message to inform the user that the information has been stored
////        Alert alert = new Alert(Alert.AlertType.INFORMATION);
////        alert.setTitle("Information Stored");
////        alert.setHeaderText(null);
////        alert.setContentText("Your information has been stored.");
////        alert.showAndWait();
//        System.out.println("User Credentials Stored:");
//        System.out.println("Username: " + userProfile.getUsername());
//        System.out.println("Password: " + userProfile.getPassword());
//        
//        // Clear the input fields
//        usernameField.clear();
//        password_Field.clear();
//        // Clear emailField if needed.
//
//        // Optionally, you can save the userProfiles list to a file for persistent storage.
//
//       //// event.consume(); // Prevent further handling of the event
//    }
//
//    
    
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
    private Button newUserButton;

    @FXML
    private void onNewUserButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NewUser.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            //stage.setTitle("New User Registration"); // Set the title for the new window
            stage.setScene(new Scene(root));

            stage.show();

            // Close the current stage (login page)
            Stage currentStage = (Stage) newUserButton.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    	
    	
    
    
    @FXML
    private Button WorkoutVideos;

    @FXML
    private void onWorkoutVideosButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("WorkoutVideos.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Workout Videos");
            stage.setScene(new Scene(root));

            stage.show();

            // Close the current stage
            Stage currentStage = (Stage) WorkoutVideos.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button WorkoutPlans;

    @FXML
    private void onWorkoutPlansButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("WorkoutPlans.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Workout Plans");
            stage.setScene(new Scene(root));

            stage.show();

            // Close the current stage
            Stage currentStage = (Stage) WorkoutPlans.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button RegularRoutine;

    @FXML
    private void onWorkoutPlansRegularRoutineButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RegularRoutine.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
           
            stage.setScene(new Scene(root));

            stage.show();

            // Close the current stage
            Stage currentStage = (Stage) RegularRoutine.getScene().getWindow();
            currentStage.close();
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
    
    public void handleChestPressTutorial(MouseEvent mouseEvent) {
        try {
            // Load the PushUpTutorial.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ChestPressTutorial.fxml"));
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
    
    
    
    public void handleDumbBellFlyesTutorial(MouseEvent mouseEvent) {
        try {
            // Load the PushUpTutorial.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DumbBellFlyesTutorial.fxml"));
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
    
    
    public void handleSquatsTutorial(MouseEvent mouseEvent) {
        try {
            // Load the PushUpTutorial.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SquatsTutorial.fxml"));
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
    
    public void handleLegPressesTutorial(MouseEvent mouseEvent) {
        try {
            // Load the PushUpTutorial.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LegPressesTutorial.fxml"));
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
    
    public void handleLungesTutorial(MouseEvent mouseEvent) {
        try {
            // Load the PushUpTutorial.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LungesTutorial.fxml"));
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
    
    
    public void ShoulderPressesTutorial(MouseEvent mouseEvent) {
        try {
            // Load the PushUpTutorial.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ShoulderPressesTutorial.fxml"));
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



















