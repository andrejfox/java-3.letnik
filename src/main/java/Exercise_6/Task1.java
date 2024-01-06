package Exercise_6;

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

            getRandomColour(gc);
            gc.strokeOval(xCenter - (double) circleSize / 2, yCenter - (double) circleSize / 2, circleSize, circleSize);
        }
    }

    private void getRandomColour(GraphicsContext gc) {
        switch ((int) (Math.random() * 7)) {
            case 0:
                gc.setStroke(Color.BLUE);
                break;

            case 1:
                gc.setStroke(Color.ALICEBLUE);
                break;

            case 2:
                gc.setStroke(Color.BURLYWOOD);
                break;

            case 3:
                gc.setStroke(Color.CYAN);
                break;

            case 4:
                gc.setStroke(Color.CORAL);
                break;

            case 6:
                gc.setStroke(Color.MAROON);
                break;

            default:
                break;
        }
    }
}