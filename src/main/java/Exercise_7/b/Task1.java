package Exercise_7.b;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Task1 extends Application {
    public void start(Stage stage) {
        Circle circle = new Circle(150, 150, 150);
        Group root = new Group(circle);
        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }
}
