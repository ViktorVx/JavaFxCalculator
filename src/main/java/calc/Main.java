package calc;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //todo add brackets-buttons
    //todo make expression evaluation
    //todo add css-styling
    //todo avoid resizable of the form to fixed size
    //todo для цифр-кнопок использовать id
    //todo добавить поле для выражений
    //todo add application icon


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/mainWindows/mainWindow.fxml"));
        primaryStage.setTitle("Калькулятор");
        primaryStage.setScene(new Scene(root, 300, 320));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
