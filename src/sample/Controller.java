package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.math.BigDecimal;


enum Operation{
    PLUS, MINUS, DIVISION, MULTIPLY
}

public class Controller {

    @FXML
    private TextField txField;

    BigDecimal num1 = new BigDecimal(0);
    BigDecimal num2 = new BigDecimal(0);
    Operation operation;

    @FXML
    public void handlePushButton(ActionEvent event){
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
    public void handleResultButton() {
        num2 = new BigDecimal(txField.getText());
        if (operation.equals(Operation.PLUS)) {
            txField.setText(num1.add(num2).toString());
            operation = null;
        }
    }


}
