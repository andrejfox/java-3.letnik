package Exercise_6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Task7 extends Application {
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
        double rangeFrom = -Math.PI / 2;
        double rangeTo = Math.PI / 2;
        final double interval = 0.1;
        final int unit = 200;

        gc.strokeLine((double) canvasWidth / 2, 0, (double) canvasWidth / 2, canvasHeight);
        gc.strokeLine(0, (double) canvasHeight / 2, canvasWidth, (double) canvasHeight / 2);

        double offsetHeight = (double) canvasHeight / 2;
        double offsetWidth = (double) canvasWidth / 2;
        for (double i = rangeFrom; i <= rangeTo; i += interval) {
            double x = i * unit + offsetWidth;
            double y = Math.sin(i) * unit + offsetHeight;
            double preX = (i - interval) * unit + offsetWidth;
            double preY = Math.sin(i - interval) * unit + offsetHeight;

            if (i != rangeFrom) gc.strokeLine(preX, preY, x, y);
        }
    }
}