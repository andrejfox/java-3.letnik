package Exercise_6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Task4 extends Application {
    private Canvas canvas;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Canvas");
        Group root = new Group();
        canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawStuff(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawStuff(GraphicsContext gc) {
        int canvasWidth = (int) canvas.getWidth();
        int canvasHeight = (int) canvas.getHeight();
        int[] initials = {0, -canvasHeight, -canvasWidth, 0};

        fractal(Math.min(canvasWidth, canvasHeight), canvasWidth, canvasHeight, canvasWidth, canvasHeight, initials, gc);
    }

    private void fractal(int shorter, int canvasWidth, int canvasHeight, int sqWidth, int sqHeight, int[] lastCords, GraphicsContext gc) {
        if (shorter <= 5) return;

        int sqWidthHalf = sqWidth / 2;
        int sqHeightHalf = sqHeight / 2;

        int xHor = lastCords[0] + sqWidthHalf;
        int yHor = lastCords[1] + sqHeight;

        int xVer = lastCords[2] + sqWidth;
        int yVer = lastCords[3] + sqHeightHalf;

        gc.strokeLine(xHor, yHor, xHor, canvasHeight);
        gc.strokeLine(xVer, yVer, canvasWidth, yVer);

        int[] currentCords = {xHor, yHor, xVer, yVer};
        fractal(shorter / 2, canvasWidth, canvasHeight, sqWidthHalf, sqHeightHalf, currentCords, gc);
    }
}