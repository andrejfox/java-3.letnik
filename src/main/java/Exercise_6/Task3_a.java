package Exercise_6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Task3_a extends Application {
    private Canvas canvas;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Canvas");
        Group root = new Group();
        canvas = new Canvas(800, 450);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawStuff(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawStuff(GraphicsContext gc) {
        double canvasWidth = canvas.getWidth();
        double canvasHeight = canvas.getHeight();
        final int sqSize = 3;

        for (int i = 0; i < 300; i++) {
            int x = (int) (Math.random() * canvasWidth - 2);
            int y = (int) (Math.random() * canvasHeight - 2);

            gc.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            gc.strokeRect(x, y, sqSize, sqSize);
        }
    }
}