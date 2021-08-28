package com.apolon7579.javafxpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class main extends Application{

    Stage window;
    Scene scene;
    Button button;

    @Override
    public void start(Stage primaryStage) throws IOException {
        window = primaryStage;
        window.setTitle("Joon");

        //Checkboxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);

        button = new Button("Order Now!");
        button.setOnAction(e -> handleOptions(box1, box2));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1, box2, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2){
        String message = "Users order:\n";

        if(box1.isSelected()){
            message += "Bacon";
        }

        if(box2.isSelected()){
            message += "Tuna";
        }

        System.out.println(message);
    }

    public static void main(String[] args) {
        launch();
    }
}