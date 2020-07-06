module calc {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    opens calc.controllers;

    opens calc;
}