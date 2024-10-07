package tretjiLetnik.Exercise_11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Task1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    final int paneSize = 600;
    final int squareNum = 150;
    final int lineNum = 15;
    final int offset = 2;
    int columnNum = squareNum / lineNum;
    int size0 = (paneSize - offset * (columnNum - 1)) / columnNum;
    int size1 = (paneSize - offset * (lineNum - 1)) / lineNum;
    int squareSize = Math.min(size0, size1);
    int paneWidth = columnNum * squareSize + offset * (lineNum - 1) - 8;
    int paneHeight = lineNum * squareSize + offset * (lineNum - 1) + 2;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Naloga1");

        Pane pane = new Pane();
        System.out.println(paneWidth);
        System.out.println(paneHeight);
        pane.setPrefSize(paneWidth, paneHeight);

        constructPane(pane);

        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }

    private void constructPane(Pane pane) {
        int currLine = 0;
        int currColumn = 0;

        for (int i = 0; i < squareNum; i++) {
            Rectangle currRectangle = new Rectangle();
            currRectangle.setWidth(squareSize);
            currRectangle.setHeight(squareSize);
            currRectangle.setX(currLine);
            currRectangle.setY(currColumn);
            currRectangle.setStroke(Color.RED);
            currRectangle.setFill(Color.WHITE);

            pane.getChildren().add(currRectangle);

            currLine += squareSize + offset;

            if ((i + 1) % columnNum == 0) {
                currColumn += squareSize + offset;
                currLine = 0;
            }
        }
    }
}