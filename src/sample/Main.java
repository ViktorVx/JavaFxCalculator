package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //todo insert testing with Mockito
    //todo insert multilingualism
    //todo add brackets-buttons
    //todo make expression evaluation
    //todo add css-styling


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Калькулятор");
        primaryStage.setScene(new Scene(root, 300, 320));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
