package tetris;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/sample.fxml"));
        primaryStage.setTitle("Tetris Skeleton");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

	public static void main(String[] args) {
        launch(args);
    }
}