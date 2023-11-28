package com.mycompany.mvvmexample;

import com.google.cloud.firestore.Firestore;
import com.google.firebase.auth.FirebaseAuth;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    public static Firestore fstore;
    public static FirebaseAuth fauth;
    public static Scene scene;
    private final FirestoreContext contxtFirebase = new FirestoreContext();

    @Override
    public void start(Stage primaryStage) throws Exception {
        fstore = contxtFirebase.firebase();
        fauth = FirebaseAuth.getInstance();

        // Set up a menu
        VBox root = new VBox(setupMenu());
        root.getChildren().add(loadFXML("AccessFBView.fxml"));

        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private MenuBar setupMenu() {
        MenuBar menuBar = new MenuBar();

        // File Menu
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> System.exit(0));
        fileMenu.getItems().add(exitItem);



        menuBar.getMenus().add(fileMenu);
        return menuBar;
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml));
        return fxmlLoader.load();
    }

    public static void setRoot(String fxml) throws IOException {
        Parent fxmlRoot = loadFXML(fxml);
        VBox root = (VBox) scene.getRoot();
        root.getChildren().set(1, fxmlRoot);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

