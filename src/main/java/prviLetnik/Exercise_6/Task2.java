package prviLetnik.Exercise_6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Task2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Canvas");
        Group root = new Group();
        Canvas canvas = new Canvas(600, 450);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawStuff(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawStuff(GraphicsContext gc) {
        final int sqWidth = 30;
        final int sqHeight = 15;

        for (int i = 0; i < 15; i++) {
            int x = i * sqWidth;
            int y = i * sqHeight;

            gc.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            gc.strokeRect(x, y, sqWidth, sqHeight);
        }

        for (int i = 14; i >= 0; i--) {
            int x = i * sqWidth;
            int y = (15 - i) * sqHeight + 195;

            gc.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            gc.strokeRect(x, y, sqWidth, sqHeight);
        }
    }
}