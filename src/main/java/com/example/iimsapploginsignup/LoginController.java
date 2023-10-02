package com.example.iimsapploginsignup;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public void NavigatetoRegistration() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("registration.fxml"));
        Object root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Registration");
        stage.setScene(new Scene((Parent) root, 420,40));
        stage.show();
    }
}
