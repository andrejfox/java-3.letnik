package prviLetnik.Exercise_7.b;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Task6 extends Application {
    public void start(Stage stage) {
        final int numOfShots = 10;
        final int accuracy = 60; //accuracy from center in %
        final int targetSize = 500;

        Group root = new Group();
        Scene scene = new Scene(root, targetSize, targetSize);
        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();

        for (int i = 10; i >= 1; i--) {
            Circle currentCircle = new Circle();
            currentCircle.setCenterX((double) targetSize / 2);
            currentCircle.setCenterY((double) targetSize / 2);
            currentCircle.setRadius(targetSize * ((double) i / 10) / 2);
            currentCircle.setFill(targetColour(i));
            currentCircle.setStroke(Color.BLACK);
            if (i == 7 || i == 8) currentCircle.setStroke(Color.WHITE);
            root.getChildren().add(currentCircle);
        }

        Circle currentCircle = new Circle();
        currentCircle.setCenterX((double) targetSize / 2);
        currentCircle.setCenterY((double) targetSize / 2);
        currentCircle.setFill(Color.BLACK);
        currentCircle.setRadius(1);
        root.getChildren().add(currentCircle);

        float sum = 0;
        float[] list = new float[numOfShots];
        for (int i = 0; i < numOfShots; i++) {
            float newShot = (float) Math.round((Math.random() * accuracy / 10 + (10 - (double) accuracy / 10)) * 10) / 10;
            System.out.printf("Shot %2s: %s | %s\n", i + 1, newShot, (float) Math.round(sum * 10) / 10);
            sum += newShot;
            list[i] = newShot;
            drawHit(10 - newShot, targetSize, root);
        }

        float[] max = {0, 0};
        for (int i = 0; i < numOfShots; i++) {
            if (Math.max(max[0], list[i]) != max[0]) {
                max[0] = list[i];
                max[1] = i;
            }
        }
        System.out.printf("Best was: %s (shot: %s)\n", max[0], Math.round(max[1]) + 1);

        float[] min = {10, 0};
        for (int i = 0; i < numOfShots; i++) {
            if (Math.min(min[0], list[i]) != min[0]) {
                min[0] = list[i];
                min[1] = i;
            }
        }
        System.out.printf("Worst was: %s (shot: %s)\n", min[0], Math.round(min[1]) + 1);
        System.out.printf("Result: " + sum);
    }

    private static Color targetColour(int currCircle) {
        return switch (currCircle) {
            case 1, 2 -> Color.YELLOW;
            case 3, 4 -> Color.RED;
            case 5, 6 -> Color.BLUE;
            case 7, 8 -> Color.BLACK;
            case 9, 10 -> Color.WHITE;
            default -> Color.LIME;
        };
    }

    private static void drawHit(float offCenter, int targetSize, Group root) {
        double unit = (double) targetSize / 20;

        double angle = Math.random() * 2 * Math.PI;

        float xDelta = (float) (offCenter * Math.cos(angle));
        float yDelta = (float) (offCenter * Math.sin(angle));

        double centerX = (double) targetSize / 2 + xDelta * unit;
        double centerY = (double) targetSize / 2 - yDelta * unit;

        Circle currentCircle = new Circle();
        currentCircle.setCenterX(centerX);
        currentCircle.setCenterY(centerY);
        currentCircle.setStroke(Color.PURPLE);
        currentCircle.setFill(Color.BLACK);
        currentCircle.setRadius(4);
        root.getChildren().add(currentCircle);

        Circle currentCircle1 = new Circle();
        currentCircle1.setCenterX(centerX);
        currentCircle1.setCenterY(centerY);
        currentCircle1.setFill(Color.WHITE);
        currentCircle1.setRadius(1);
        root.getChildren().add(currentCircle1);
    }
}
