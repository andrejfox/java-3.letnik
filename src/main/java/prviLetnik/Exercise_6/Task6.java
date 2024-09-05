package prviLetnik.Exercise_6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Task6 extends Application {
    private Canvas canvas;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Canvas");
        Group root = new Group();
        canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawStuff(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawStuff(GraphicsContext gc) {
        int canvasWidth = (int) canvas.getWidth();
        int canvasHeight = (int) canvas.getHeight();
        final double interval = 0.1;
        final double circleSize = 3;
        final int unit = 200;

        gc.strokeLine((double) canvasWidth / 2, 0, (double) canvasWidth / 2, canvasHeight);
        gc.strokeLine(0, (double) canvasHeight / 2, canvasWidth, (double) canvasHeight / 2);
        gc.strokeOval(
            (double) canvasWidth / 2 - circleSize / 2,
            (double) canvasHeight / 2 - circleSize / 2,
            circleSize,
            circleSize
        );

        for (double i = -Math.PI / 2; i <= Math.PI / 2; i += interval) {
            double x = i * unit + (double) canvasWidth / 2 - circleSize / 2;
            double y = Math.sin(i) * unit + (double) canvasHeight / 2 - circleSize / 2;
            gc.strokeOval(x - circleSize / 2, y - circleSize / 2, circleSize, circleSize);
        }
    }
}