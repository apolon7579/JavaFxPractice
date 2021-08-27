package com.apolon7579.javafxpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application{

    Button button;

    @Override
    public void start(Stage stage) throws IOException {

        stage.setTitle("Title of hte Window");
        button = new Button();
        button.setText("Click me");

        button.setOnAction(e -> {
            System.out.println("람다식 연습");
            System.out.println("여러줄도 실행가능");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        stage.show();

    }



    public static void main(String[] args) {
        launch();
    }
}