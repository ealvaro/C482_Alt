package edu.wgu.c482.main;

import edu.wgu.c482.controllers.MainScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/main_screen.fxml"));
        MainScreenController controller = new MainScreenController();
        loader.setController(controller);
        Parent root =  loader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("Main Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
