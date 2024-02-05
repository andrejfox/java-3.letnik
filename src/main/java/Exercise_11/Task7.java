package Exercise_11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class Task7 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    int[] squareSizeRange = {4, 60};
    final int squareNum = 50;
    final int lineNum = 5;
    final int offset = 2;
    int columnNum = squareNum / lineNum;
    int squareSize = squareSizeRange[1];
    int paneWidth = columnNum * squareSize + offset * lineNum;
    int paneHeight = lineNum * squareSize + offset * lineNum;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Naloga7");

        Pane pane = new Pane();
        pane.setPrefSize(paneWidth, paneHeight);

        constructPane(pane);

        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }

    private void constructPane(Pane pane) {
        Rectangle[] rectangleArr = new Rectangle[squareNum];
        Random randy = new Random();

        int currLine = 0;
        int currColumn = 0;
        for (int i = 0; i < squareNum; i++) {
            rectangleArr[i] = new Rectangle();
            rectangleArr[i].setX(currLine);
            rectangleArr[i].setY(currColumn);

            int currSize = randy.nextInt(squareSizeRange[1] - squareSizeRange[0]) + squareSizeRange[0];
            rectangleArr[i].setWidth(currSize);
            rectangleArr[i].setHeight(currSize);

            int red = map(paneHeight - currColumn, 0, paneHeight, 0, 255);
            int blue = map(currColumn * currLine, 0, paneWidth * paneHeight, 0, 255 * 255) / 255;
            int green = map(paneWidth - currLine, 0, paneWidth, 0, 255);
            Color currColor = Color.rgb(red, green, blue);
            rectangleArr[i].setStroke(currColor);
            rectangleArr[i].setFill(Color.WHITE);

            pane.getChildren().add(rectangleArr[i]);

            currLine += squareSize + offset;

            if ((i + 1) % columnNum == 0) {
                currColumn += squareSize + offset;
                currLine = 0;
            }
        }

        Button button0 = new Button("barvaj rdece");
        button0.relocate(0,0);
        pane.getChildren().add(button0);

        Button button1 = new Button("cetrti na 60");
        button1.relocate(0,25);
        pane.getChildren().add(button1);

        Button button2 = new Button("nakljucni");
        button2.relocate(0,50);
        pane.getChildren().add(button2);

        Button button3 = new Button("oznaci min");
        button3.relocate(0,75);
        pane.getChildren().add(button3);

        button0.setOnAction(e -> {
            int red = randy.nextInt(155) + 100;
            Color currColor = Color.rgb(red, 1, 1);

            for (int i = 2; i < squareNum; i += 3) {
                rectangleArr[i].setStroke(currColor);
            }
        });

        button1.setOnAction(e -> {
            for (int i = 3; i < squareNum; i += 4) {
                rectangleArr[i].setWidth(50);
                rectangleArr[i].setHeight(50);
            }
        });

        button2.setOnAction(e -> {
            int index = randy.nextInt(squareNum);
            rectangleArr[index].setWidth(70);
            rectangleArr[index].setHeight(70);
            rectangleArr[index].setFill(Color.RED);
            rectangleArr[index].toFront();
            button0.toFront();
            button1.toFront();
            button2.toFront();
        });

        button3.setOnAction(e -> {
            int min = squareSizeRange[1];
            for (int i = 0; i < squareNum; i++) {
                if (min > rectangleArr[i].getHeight()) {
                    min = (int) rectangleArr[i].getHeight();
                }
            }

            for (int i = 0; i < squareNum; i++) {
                if (min == rectangleArr[i].getHeight()) {
                    Circle circle = new Circle(
                        rectangleArr[i].getX() + rectangleArr[i].getWidth() / 2,
                        rectangleArr[i].getY() + rectangleArr[i].getHeight() / 2,
                        rectangleArr[i].getWidth() + rectangleArr[i].getWidth() * 0.15
                    );
                    circle.setStroke(Color.RED);
                    circle.setFill(Color.WHITE);
                    pane.getChildren().addAll(circle);
                    circle.toBack();
                    break;
                }
            }
        });
    }
    public static int map(double x, double x1, double x2, double y1, double y2) {
        double ret = y1 + (x - x1) * (y2 - y1) / (x2 - x1);
        return (int) ret;
    }
}