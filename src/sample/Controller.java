package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class Controller {

    @FXML
    private TextField txField;

    @FXML
    public void handlePushButton(ActionEvent event){
        Button bt = (Button) event.getSource();
        txField.setText(txField.getText().concat(bt.getText()));
    }

}
