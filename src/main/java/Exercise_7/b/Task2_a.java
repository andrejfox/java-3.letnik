package Exercise_7.b;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Task2_a extends Application {
    public void start(Stage stage) {
        Circle circle = new Circle(150, 150, 150);
        Group root = new Group(circle);
        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
        Circle circ2 = new Circle();
        circ2.setCenterX(62);
        circ2.setCenterY(162);
        circ2.setRadius(25);
        circ2.setStroke(Color.RED);
        circ2.setFill(Color.LIGHTGRAY);

        root.getChildren().add(circ2);
    }
}
