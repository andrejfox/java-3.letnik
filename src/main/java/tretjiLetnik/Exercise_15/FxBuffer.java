package tretjiLetnik.Exercise_15;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.text.*;
import java.util.Arrays;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FxBuffer extends Application {
    static int vrh_size = 0;
    static int dno_size = 0;
    static int prejsnje_dno = 0;
    static int prejsnji_vrh = 0;
    static int zadnji_text = 0;
    static int texti[] = new int[0];
    public void start(Stage stage) {
        Vrsta vrsta = new Vrsta(17);
        int scene_x = 400;
        int x = scene_x/2;
        int y = scene_x/2;
        int radius = (scene_x-100)/2;

        Group root = new Group();
        Scene scene = new Scene(root, scene_x, scene_x);
        stage.setTitle("FxBuffer");
        stage.setScene(scene);
        stage.show();

        Circle circ2 = new Circle();
        circ2.setCenterX(x);
        circ2.setCenterY(y);
        circ2.setRadius(radius);
        circ2.setStroke(Color.BLACK);
        circ2.setFill(Color.TRANSPARENT);
        root.getChildren().add(circ2);

        Circle circ1 = new Circle();
        circ1.setCenterX(x);
        circ1.setCenterY(y);
        circ1.setRadius(radius-radius/5);
        circ1.setStroke(Color.BLACK);
        circ1.setFill(Color.TRANSPARENT);
        root.getChildren().add(circ1);

        int r = vrsta.n*2;
        double[][] pointer_coord = new double[vrsta.n][4];

        for(int i = 0; i < r; i++){
            double x_point = Math.cos(2 * Math.PI * i / r - Math.PI / 2) * radius + x;
            double y_point = Math.sin(2*Math.PI*i/r - Math.PI/2)*radius+y;
            double x_zacetek = Math.cos(2*Math.PI*i/r - Math.PI/2)*(radius-radius/5)+x;
            double y_zacetek = Math.sin(2*Math.PI*i/r - Math.PI/2)*(radius-radius/5)+y;
            if(i % 2 == 0){
                Line line = new Line();
                line.setStartX(x_zacetek);
                line.setStartY(y_zacetek);
                line.setEndX(x_point);
                line.setEndY(y_point);
                root.getChildren().add(line);
            }else{
                pointer_coord[(int) Math.floor(i/2)][0] = x_point;
                pointer_coord[(int) Math.floor(i/2)][1] = y_point;
                pointer_coord[(int) Math.floor(i/2)][2] = x_zacetek;
                pointer_coord[(int) Math.floor(i/2)][3] = y_zacetek;
            }
        }


        drawPointers(pointer_coord, vrsta.dno, vrsta.vrh, vrsta.n, root, vrsta);

        Button b1 = new Button("add");
        Button b2 = new Button("take");

        b1.relocate(x-25, y-50);
        root.getChildren().add(b1);

        b1.setOnAction(new EventHandler<ActionEvent>() {
                           @Override public void handle(ActionEvent e) {
                               b1.setText("add");
                               b2.setText("take");
                               vrsta.dodaj((int)Math.round(Math.random()*10));
                               drawPointers(pointer_coord, vrsta.dno, vrsta.vrh, vrsta.n, root, vrsta);
                           }
                       }
        );

        b2.relocate(x-32.5, y+25);
        root.getChildren().add(b2);

        b2.setOnAction(new EventHandler<ActionEvent>() {
                           @Override public void handle(ActionEvent e) {
                               b2.setText("add");
                               b1.setText("take");

                               System.out.println(vrsta.odvzemi());
                               drawPointers(pointer_coord, vrsta.dno, vrsta.vrh, vrsta.n, root, vrsta);
                           }
                       }
        );
    }

    public static void drawPointers(double[][] pointer_coord, int dno, int vrh, int n, Group root, Vrsta vrsta){
        if((prejsnje_dno != dno) || (dno_size == 0)){
            if(dno_size != 0){
                root.getChildren().remove(dno_size);
                if(vrh_size > dno_size)vrh_size--;
                texti = Tabele.zmanjsaj(texti, dno_size);
                System.out.println(Arrays.toString(texti));
            }

            if(dno != prejsnje_dno){
                root.getChildren().remove(texti[0]);

                if(vrh_size > texti[0]) vrh_size--;
                texti = Tabele.zmanjsaj(texti, texti[0]);
                texti = Tabele.izbrisi(texti);
            }

            Circle dno_krog = new Circle();
            dno_krog.setCenterX(pointer_coord[dno%n][0]);
            dno_krog.setCenterY(pointer_coord[dno%n][1]);
            dno_krog.setRadius(5);
            dno_krog.setStroke(Color.BLACK);
            dno_krog.setFill(Color.PURPLE);
            root.getChildren().add(dno_krog);
            dno_size = root.getChildren().size()-1;
            prejsnje_dno = dno;
        }

        if((prejsnji_vrh != vrh) || (vrh_size == 0)){
            if(vrh_size != 0){
                root.getChildren().remove(vrh_size);
                if(dno_size > vrh_size)dno_size--;
                if(texti.length > 0) texti = Tabele.zmanjsaj(texti, vrh_size);
            }
            if(prejsnji_vrh != vrh){
                double text_x = (pointer_coord[(vrh-1)%n][0] + pointer_coord[(vrh-1)%n][2])/2;
                double text_y = (pointer_coord[(vrh-1)%n][1] + pointer_coord[(vrh-1)%n][3])/2;
                Text t = new Text(text_x, text_y, String.valueOf(vrsta.peek()));
                root.getChildren().add(t);
                zadnji_text = root.getChildren().size()-1;
                texti = Tabele.dodaj(texti, zadnji_text);
            }
            Circle vrh_krog = new Circle();
            vrh_krog.setCenterX(pointer_coord[vrh%n][2]);
            vrh_krog.setCenterY(pointer_coord[vrh%n][3]);
            vrh_krog.setRadius(10);
            vrh_krog.setStroke(Color.BLACK);
            vrh_krog.setFill(Color.LIGHTCYAN);
            root.getChildren().add(vrh_krog);
            vrh_size = root.getChildren().size()-1;
            prejsnji_vrh = vrh;
        }
    }
}
