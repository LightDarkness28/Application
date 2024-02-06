package com.application;
//
import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
//import javafx.scene.Parent;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage)  {
        try{
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("com/application/fxmlFolder/main.fxml"));
            Scene scene1 =new Scene(root);
            stage.setScene(scene1);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
