package prviLetnik.Exercise_6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Task5 extends Application {
    private Canvas canvas;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Canvas");
        Group root = new Group();
        canvas = new Canvas(640, 480);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawStuff(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawStuff(GraphicsContext gc) {
        int canvasWidth = (int) canvas.getWidth();
        int canvasHeight = (int) canvas.getHeight();
        int tockaX = (int) (Math.random() * canvasWidth) + 1;
        int tockaY = (int) (Math.random() * canvasHeight) + 1;
        final int spacing = 3;

        gc.strokeLine(0, 0, canvasWidth, 0);
        gc.strokeLine(tockaX, tockaY, canvasWidth, 0);
        gc.strokeLine(tockaX, tockaY, 0, 0);

        double tanAlpha = (double) tockaY / tockaX;
        double tanBeta = (double) tockaY / (canvasWidth - tockaX);

        for (int i = spacing; i <= tockaY; i += spacing) {
            int x0 = (int) Math.round(i / tanAlpha);
            int x1 = canvasWidth - (int) Math.round(i / tanBeta);
            gc.strokeLine(x0, i, x1, i);
        }
    }
}