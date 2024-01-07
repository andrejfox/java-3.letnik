package Exercise_7.b;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Task8 extends Application {

    public static void main(String[] args) {
        launch();
    }


    public void start(Stage stage) {
        int x = 500;
        int y = 500;

        Group root = new Group();
        Scene scene = new Scene(root, x, y);
        stage.setTitle("Naloga 8");
        stage.setScene(scene);
        stage.show();

        int a = 20;
        int b = 5;

        int x_rect = x/2-a/2;
        int y_rect = y/2-b/2;
        int povecanje = 4;



        for(int i = a; i < x; i+=povecanje){
            if(b > y) break;
            Rectangle rect = new Rectangle(x_rect, y_rect, i, b);
            rect.setFill(null);
            rect.setStroke(Color.BLACK);
            root.getChildren().add(rect);
            x_rect -= povecanje/2;
            y_rect -= povecanje/2;
            b+=povecanje;
        }

    }
}
