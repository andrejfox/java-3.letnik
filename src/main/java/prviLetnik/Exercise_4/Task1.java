package prviLetnik.Exercise_4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Task1 extends Application {
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
        double canvasWidth = canvas.getWidth();
        double canvasHeight = canvas.getHeight();

        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);

        int halfWidth = (int) canvasWidth / 2;
        int halfHeight = (int) canvasHeight / 2;


        List<Integer> tocke = new ArrayList<>();


        gc.strokeRect(0, 0, halfWidth, halfHeight);
        gc.strokeRect(halfWidth, halfHeight, halfWidth, halfHeight);
        gc.strokeRect(0, halfHeight, halfWidth, halfHeight);
        gc.strokeRect(halfWidth, 0, halfWidth, halfHeight);

        int OffKvadrant = (int)(Math.random()*4+1);

        System.out.println(OffKvadrant);

        switch (OffKvadrant) {
            case 1: gc.setStroke(Color.GREEN); break;
            case 2: gc.setStroke(Color.YELLOW); break;
            case 3: gc.setStroke(Color.BLUE); break;
            case 4: gc.setStroke(Color.RED); break;
            default: break;
        }

        if (OffKvadrant != 1) {
            tocke.add((int) (Math.random() * halfWidth) + 1);
            tocke.add((int) (Math.random() * halfHeight) + 1);
        }

        if (OffKvadrant != 2) {
            tocke.add((int) (Math.random() * halfWidth) + 1 + halfWidth);
            tocke.add((int) (Math.random() * halfHeight) + 1);
        }

        if (OffKvadrant != 3) {
            tocke.add((int) (Math.random() * halfWidth) + 1);
            tocke.add((int) (Math.random() * halfHeight) + 1 + halfHeight);
        }

        if (OffKvadrant != 4) {
            tocke.add((int) (Math.random() * halfWidth) + 1 + halfWidth);
            tocke.add((int) (Math.random() * halfHeight) + 1 + halfHeight);
        }

        gc.strokeLine(tocke.get(0),tocke.get(1),tocke.get(2),tocke.get(3));
        gc.strokeLine(tocke.get(0),tocke.get(1),tocke.get(4),tocke.get(5));
        gc.strokeLine(tocke.get(2),tocke.get(3),tocke.get(4),tocke.get(5));
    }
}