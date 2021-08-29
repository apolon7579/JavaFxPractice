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
    TreeView<String> tree;


    @Override
    public void start(Stage primaryStage) throws IOException {
        window = primaryStage;
        window.setTitle("Joon");

        TreeItem<String> root, bucky, megan;

        root = new TreeItem<>();
        root.setExpanded(true);

        bucky = makeBranch("Bucky", root);
        makeBranch("thenewboston", bucky);
        makeBranch("YouTube", bucky);
        makeBranch("Chicken", bucky);

        megan = makeBranch("Megan", root);
        makeBranch("Glitter", megan);
        makeBranch("Makeup", megan);

        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue) -> {
            if(newValue != null)
                System.out.println(newValue.getValue());
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);

        return item;
    }

    public static void main(String[] args) {
        launch();
    }
}