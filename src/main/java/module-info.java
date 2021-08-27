module com.apolon7579.javafxpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.apolon7579.javafxpractice to javafx.fxml;
    exports com.apolon7579.javafxpractice;
}