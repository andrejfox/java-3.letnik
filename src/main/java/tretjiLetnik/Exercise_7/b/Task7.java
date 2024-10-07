package tretjiLetnik.Exercise_7.b;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class Task7 extends Application {
    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) {

        int radius = 15;
        int visinaRomba = (int) (Math.random()*160)/10;
        double[] barva = {Math.random(), Math.random(), Math.random()};

        System.out.println(visinaRomba);
        int vis = (visinaRomba + 2) * radius * 2;
        int sir = visinaRomba % 2 == 1 ? vis * 3 : vis * 3 - radius * 2;
        Group root = new Group();
        Scene scene = new Scene(root, sir, visinaRomba % 2 == 1 ? vis : vis + radius * 2);
        stage.setTitle("Naloga 7");
        stage.setScene(scene);
        stage.show();

        int y = radius;

        for(int i = 0; i <= Math.ceil((visinaRomba + 2)/2); i++){
            int x = radius;
            for(int j = 0; j < Math.ceil(((visinaRomba+2)*3-2*i+1)/2); j++){
                Circle circle = new Circle(x, y, radius, Color.color(barva[0], barva[1], barva[2]));
                root.getChildren().add(circle);
                x += 2*radius;
            }
            for(int j = 0; j < 2*i-1; j++){
                Circle circle = new Circle(x, y, radius, Color.WHITE);
                root.getChildren().add(circle);
                x += 2*radius;
            }

            if(visinaRomba % 2 == 1){
                if(i != 0){
                    for(int j = 0; j < Math.floor(((visinaRomba+2)*3-2*i+1)/2); j++){
                        Circle circle = new Circle(x, y, radius, Color.color(barva[0], barva[1], barva[2]));
                        root.getChildren().add(circle);
                        x += 2*radius;
                    }
                }else{
                    for(int j = 0; j < Math.floor(((visinaRomba+2)*3-2*i)/2); j++){
                        Circle circle = new Circle(x, y, radius, Color.color(barva[0], barva[1], barva[2]));
                        root.getChildren().add(circle);
                        x += 2*radius;
                    }
                }
            }else{
                if(i != 0){
                    for(int j = 0; j < Math.floor(((visinaRomba+2)*3-2*i+1)/2); j++){
                        Circle circle = new Circle(x, y, radius, Color.color(barva[0], barva[1], barva[2]));
                        root.getChildren().add(circle);
                        x += 2*radius;
                    }
                }else{
                    for(int j = 0; j < Math.floor(((visinaRomba+2)*3-2*i-1)/2); j++){
                        Circle circle = new Circle(x, y, radius, Color.color(barva[0], barva[1], barva[2]));
                        root.getChildren().add(circle);
                        x += 2*radius;
                    }
                }
            }

            y += 2*radius;
        }

        for(int i = (int) Math.floor((visinaRomba + 2)/2)-1; i >= 0; i--){
            int x = radius;
            for(int j = 0; j < Math.ceil(((visinaRomba+2)*3-2*i+1)/2); j++){
                Circle circle = new Circle(x, y, radius, Color.color(barva[0], barva[1], barva[2]));
                root.getChildren().add(circle);
                x += 2*radius;
            }
            for(int j = 0; j < 2*i-1; j++){
                Circle circle = new Circle(x, y, radius, Color.WHITE);
                root.getChildren().add(circle);
                x += 2*radius;
            }

            if(visinaRomba % 2 == 1){
                if(i != 0){
                    for(int j = 0; j < Math.floor(((visinaRomba+2)*3-2*i+1)/2); j++){
                        Circle circle = new Circle(x, y, radius, Color.color(barva[0], barva[1], barva[2]));
                        root.getChildren().add(circle);
                        x += 2*radius;
                    }
                }else{
                    for(int j = 0; j < Math.floor(((visinaRomba+2)*3-2*i)/2); j++){
                        Circle circle = new Circle(x, y, radius, Color.color(barva[0], barva[1], barva[2]));
                        root.getChildren().add(circle);
                        x += 2*radius;
                    }
                }
            }else{
                if(i != 0){
                    for(int j = 0; j < Math.floor(((visinaRomba+2)*3-2*i+1)/2); j++){
                        Circle circle = new Circle(x, y, radius, Color.color(barva[0], barva[1], barva[2]));
                        root.getChildren().add(circle);
                        x += 2*radius;
                    }
                }else{
                    for(int j = 0; j < Math.floor(((visinaRomba+2)*3-2*i-1)/2); j++){
                        Circle circle = new Circle(x, y, radius, Color.color(barva[0], barva[1], barva[2]));
                        root.getChildren().add(circle);
                        x += 2*radius;
                    }
                }
            }
            y+=2*radius;
        }


    }
}
