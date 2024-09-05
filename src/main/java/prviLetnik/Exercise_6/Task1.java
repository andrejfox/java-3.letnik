package prviLetnik.Exercise_6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Task1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Canvas");
        Group root = new Group();
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawStuff(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawStuff(GraphicsContext gc) {
        for (int i = 0; i <= 30; i++) {
            int xCenter = 200;
            int yCenter = 200;
            int circleSize = 150 - i * 5;

            gc.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            gc.strokeOval(xCenter - (double) circleSize / 2, yCenter - (double) circleSize / 2, circleSize, circleSize);
        }
    }
}