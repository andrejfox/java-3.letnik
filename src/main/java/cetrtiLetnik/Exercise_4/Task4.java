package cetrtiLetnik.Exercise_4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Task4 extends Application {
    public static void mainn(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Task3");
        Pane p = new Pane();
        p.setPrefSize(600,600);
        narisiVsebino(p);
        primaryStage.setScene(new Scene(p));
        primaryStage.show();
    }

    private void narisiVsebino(Pane pane) {
        var ll = new LinkedList<Circle>();
        for (int i = 5; i < 12; i++) ll.add(new Circle(i, 5, 10, Color.BLUE));

        pane.getChildren().add(new Rectangle(600, 600, Color.WHITE));

        drawCircles(pane, ll);

        Button cw = new Button("CW");
        Button ccw = new Button("CCW");
        Button nap = new Button("NAP");

        AtomicBoolean right = new AtomicBoolean(true);

        cw.relocate(0, 0);
        ccw.relocate(40, 0);
        nap.relocate(90, 0);

        pane.getChildren().add(cw);
        pane.getChildren().add(ccw);
        pane.getChildren().add(nap);

        cw.setOnAction(actionEvent -> {
            moveRight(pane, ll);
            right.set(true);
        });

        ccw.setOnAction(actionEvent -> {
            moveLeft(pane, ll);
            right.set(false);
        });

        nap.setOnAction(actionEvent -> {
            if (right.get()) moveRight(pane, ll);
            else moveLeft(pane, ll);
        });
    }

    private void drawCircles(Pane pane, LinkedList<Circle> points) {
        System.out.println(points.stream().map(Circle::getCenterX).toList());
        for (Circle point : points) {
            Circle c = new Circle(point.getCenterX() * 20, point.getCenterY() * 20, 10, point.getFill());
            pane.getChildren().add(c);
        }
    }

    private void moveLeft(Pane pane, LinkedList<Circle> ll) {
        ll.addFirst(new Circle(ll.getFirst().getCenterX() - 1, ll.getFirst().getCenterY(), 10, Color.RED));
        pane.getChildren().add(new Circle(ll.getLast().getCenterX() * 20, ll.getLast().getCenterY() * 20, 11, Color.WHITE));
        ll.removeLast();
        drawCircles(pane, ll);
    }

    private void moveRight(Pane pane, LinkedList<Circle> ll) {
        ll.addLast(new Circle(ll.getLast().getCenterX() + 1, ll.getLast().getCenterY(), 10, Color.GREEN));
        pane.getChildren().add(new Circle(ll.getFirst().getCenterX() * 20, ll.getFirst().getCenterY() * 20, 11, Color.WHITE));
        ll.removeFirst();
        drawCircles(pane, ll);
    }
}