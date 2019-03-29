package View;

import Controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    //loads the app
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HighTeach");
        FXMLLoader fxmlLoader = new FXMLLoader();
        InputStream is = this.getClass().getResource("/Login.fxml").openStream();
        Parent root = fxmlLoader.load(is);
        Scene scene = new Scene(root, 500, 300);
        scene.getStylesheets().add(LoginController.class.getResource("/Login.css").toExternalForm());
        primaryStage.setScene(scene);
        /*
        MyModel myModel=new MyModel();
        Controller myController = new Controller();
        AView view=fxmlLoader.getController();
        view.setMyController(myController);
        */
        primaryStage.show();

    }
}



