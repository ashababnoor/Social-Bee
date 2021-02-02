package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("loginPage.fxml")));
        primaryStage.setTitle("SocialBee");
        primaryStage.setScene(new Scene(root, 1115, 735));
        primaryStage.getIcons().add(new Image("resources//images/icon-bee-01.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
