package tretjiLetnik.Exercise_7.b;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Task3 extends Application {
    public void start(Stage stage) {
        final int num = 1487503;
        final int radij = 25;
        final int offset = 50;
        int digits = countDigits(num);

        if (digits < 2 || digits > 8 ) {
            System.out.println("Invalid Number");
            return;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = (int) Math.pow(10, digits - 1); i > 0; i /= 10) {
            list.add(num % (10 * i) / i);
        }

        int max = list.getFirst();
        for (int i = 1; i < list.size(); i++){
            if (Math.max(max, list.get(i)) != max) max = list.get(i);
        }

        Group root = new Group();
        Scene scene = new Scene(root, max * radij * 2, digits * radij * 2);
        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();

        for (int i = 0; i < digits; i++) {
            Circle currentCircle = new Circle();
            currentCircle.setCenterX(list.get(i) * offset + radij);
            currentCircle.setCenterY(radij + i * radij * 2);
            currentCircle.setRadius(radij);
            currentCircle.setFill(Color.BLACK);
            root.getChildren().add(currentCircle);
        }
    }

    static int countDigits(int num) {
        if (num == 0) return 1;

        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }
}
