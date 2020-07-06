package calc.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import calc.calculations.Operation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class mainWindowController {

    @FXML
    private TextField txField;

    BigDecimal num1 = new BigDecimal(0);
    BigDecimal num2 = new BigDecimal(0);
    Operation operation;
    Boolean needToClear = false;

    @FXML
    public void handlePushButton(ActionEvent event){
        if (needToClear){
            txField.setText("");
            needToClear = false;
        }

        Button bt = (Button) event.getSource();
        if (txField.getText().equals("0")) {
            txField.setText(bt.getText());
        } else {
            txField.setText(txField.getText().concat(bt.getText()));
        }
    }

    @FXML
    public void handleBackSpaceButton() {
        String s = txField.getText();
        txField.setText(s.substring(0, s.length() - 1));

    }

    @FXML
    public void handleClearButton(){
        txField.setText("0");
    }

    @FXML
    public void handlePlusButton() {
        num1 = new BigDecimal(txField.getText());
        operation = Operation.PLUS;
        txField.setText("");
    }

    @FXML
    public void handleSubtractButton() {
        num1 = new BigDecimal(txField.getText());
        operation = Operation.SUBTRACT;
        txField.setText("");
    }

    @FXML
    public void handleMultiplyButton() {
        num1 = new BigDecimal(txField.getText());
        operation = Operation.MULTIPLY;
        txField.setText("");
    }

    @FXML
    public void handleDivideButton() {
        num1 = new BigDecimal(txField.getText());
        operation = Operation.DIVISION;
        txField.setText("");
    }

    @FXML
    public void handleResultButton() {
        num2 = new BigDecimal(txField.getText());
        if (operation.equals(Operation.PLUS)) {
            txField.setText(num1.add(num2).toString());
            operation = null;
        } else if (operation.equals(Operation.DIVISION)) {
            if (num2.equals(new BigDecimal(0))) {
                txField.setText("Деление на ноль запрещено");
            } else {
                txField.setText(num1.divide(num2, 20, RoundingMode.HALF_UP).toString());
                operation = null;
            }
        } else if (operation.equals(Operation.MULTIPLY)) {
            txField.setText(num1.multiply(num2).toString());
            operation = null;
        } else if (operation.equals(Operation.SUBTRACT)) {
            txField.setText(num1.subtract(num2).toString());
            operation = null;
        }

        needToClear = true;
    }
}
