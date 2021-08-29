package com.apolon7579.javafxpractice;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class main extends Application{

    Stage window;


    @Override
    public void start(Stage primaryStage) throws IOException {
        window = primaryStage;
        window.setTitle("Joon");



        VBox layout = new VBox();
        layout.getChildren().addAll();

        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args) {
        launch();
    }
}