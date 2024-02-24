package Exercise_11;

       import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class Task2 extends Application {
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
        primaryStage.setTitle("Naloga2");

        Pane pane = new Pane();
        pane.setPrefSize(paneWidth, paneHeight);

        constructPane(pane);

        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }

    private void constructPane(Pane pane) {
        Random randy = new Random();

        int currLine = 0;
        int currColumn = 0;
        for (int i = 0; i < squareNum; i++) {
            Rectangle currRectangle = new Rectangle();
            currRectangle.setX(currLine);
            currRectangle.setY(currColumn);

            int currSize = randy.nextInt(squareSizeRange[1] - squareSizeRange[0]) + squareSizeRange[0];
            currRectangle.setWidth(currSize);
            currRectangle.setHeight(currSize);

            int red = map(paneHeight - currColumn, 0, paneHeight, 0, 255);
            int blue = map(currColumn * currLine, 0, paneWidth * paneHeight, 0, 255 * 255) / 255;
            int green = map(paneWidth - currLine, 0, paneWidth, 0, 255);
            Color currColor = Color.rgb(red, green, blue);
            currRectangle.setStroke(currColor);
            currRectangle.setFill(Color.WHITE);

            pane.getChildren().add(currRectangle);

            currLine += squareSize + offset;

            if ((i + 1) % columnNum == 0) {
                currColumn += squareSize + offset;
                currLine = 0;
            }
        }
    }
    public static int map(double x, double x1, double x2, double y1, double y2) {
        double ret = y1 + (x - x1) * (y2 - y1) / (x2 - x1);
        return (int) ret;
    }
}