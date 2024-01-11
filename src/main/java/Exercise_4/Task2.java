package Exercise_4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Task2 extends Application {
    private Canvas canvas;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test Canvas");
        Group root = new Group();
        canvas = new Canvas(800, 450); // Assign the Canvas to the class variable
        GraphicsContext gc = canvas.getGraphicsContext2D();
        narisiVsebino(gc); // Pass only the GraphicsContext
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void narisiVsebino(GraphicsContext gc) {
        double canvasWidth = canvas.getWidth();
        double canvasHeight = canvas.getHeight();

        int halfWidth = (int) canvasWidth / 2;
        int halfHeight = (int) canvasHeight / 2;

        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);

        gc.strokeRect(0, 0, halfWidth, halfHeight);
        gc.strokeRect(halfWidth, halfHeight, halfWidth, halfHeight);
        gc.strokeRect(0, halfHeight, halfWidth, halfHeight);
        gc.strokeRect(halfWidth, 0, halfWidth, halfHeight);

        int x0 = (int) (Math.random() * halfWidth) + 1 + halfWidth;
        int y0 = (int) (Math.random() * halfHeight) + 1;
        int x1 = (int) (Math.random() * halfWidth) + 1;
        int y1 = (int) (Math.random() * halfHeight) + 1 + halfHeight;

        gc.setStroke(Color.RED);
        gc.strokeLine(x0,y0,x1,y1);

        int deltaX = x1 - x0;
        int deltaY = y1 - y0;

        int x2 = x0 + deltaX / 3;
        int y2 = y0 + deltaY / 3;
        int x3 = x0 + deltaX * 2 / 3;
        int y3 = y0 + deltaY * 2 / 3;

        int x4 = x2 + deltaY / 2;
        int y4 = y2 - deltaX / 2;
        int x5 = x2 - deltaY / 2;
        int y5 = y2 + deltaX / 2;

        int x6 = x3 + deltaY / 2;
        int y6 = y3 - deltaX / 2;
        int x7 = x3 - deltaY / 2;
        int y7 = y3 + deltaX / 2;

        gc.setStroke(Color.GREEN);
        gc.strokeLine(x4,y4,x5,y5);
        gc.strokeLine(x6,y6,x7,y7);
    }
}
