package com.apolon7579.javafxpractice;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class main extends Application{

    Stage window;
    BorderPane layout;

    @Override
    public void start(Stage primaryStage) throws IOException {
        window = primaryStage;
        window.setTitle("Joon");

        Menu fileMenu = new Menu("File");

        fileMenu.getItems().add(new MenuItem("New Project..."));
        fileMenu.getItems().add(new MenuItem("New Module..."));
        fileMenu.getItems().add(new MenuItem("Import Project..."));

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);


        layout = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch();
    }
}