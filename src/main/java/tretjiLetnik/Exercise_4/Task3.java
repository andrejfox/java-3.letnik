package tretjiLetnik.Exercise_4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Task3 extends Application {
    private Canvas canvas;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test.Test Canvas");
        Group root = new Group();
        canvas = new Canvas(800, 450); // Assign the Canvas to the class variable
        GraphicsContext gc = canvas.getGraphicsContext2D();
        narisiVsebino(gc); // Pass only the GraphicsContext
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void narisiVsebino(GraphicsContext gc) {
        int canvasWidth = (int) canvas.getWidth();
        int canvasHeight = (int) canvas.getHeight();

        int halfWidth = canvasWidth / 2;
        int halfHeight = canvasHeight / 2;

        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);

        gc.strokeRect(0, 0, halfWidth, halfHeight);
        gc.strokeRect(halfWidth, halfHeight, halfWidth, halfHeight);
        gc.strokeRect(0, halfHeight, halfWidth, halfHeight);
        gc.strokeRect(halfWidth, 0, halfWidth, halfHeight);

        int maxDiameter = Math.min(canvasHeight, canvasHeight);

        int radius = ((int) (Math.random() * maxDiameter) + 1) / 2;

        gc.strokeOval(halfWidth - radius, halfHeight - radius, radius * 2, radius * 2);

        double centersDistance = radius * Math.sqrt(2);
        int miniRadius = radius / 2;

        if (Math.round(centersDistance) % 2 == 0) {
            gc.setStroke(Color.YELLOW);
            gc.strokeOval(halfWidth, halfHeight - radius, radius, radius);
            gc.strokeOval(halfWidth - radius, halfHeight, radius, radius);

            gc.setStroke(Color.GREEN);
            gc.strokeLine(halfWidth + miniRadius, halfHeight - miniRadius, halfWidth - miniRadius, halfHeight + miniRadius);
        } else {
            gc.setStroke(Color.YELLOW);
            gc.strokeOval(halfWidth - radius, halfHeight - radius, radius, radius);
            gc.strokeOval(halfWidth, halfHeight, radius, radius);

            gc.setStroke(Color.GREEN);
            gc.strokeLine(halfWidth - miniRadius, halfHeight - miniRadius, halfWidth + miniRadius, halfHeight + miniRadius);
        }
    }
}

