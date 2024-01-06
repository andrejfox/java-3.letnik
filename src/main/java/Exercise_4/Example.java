package Exercise_4;

 import javafx.application.Application;
 import javafx.scene.Group;
 import javafx.scene.Scene;
 import javafx.scene.canvas.Canvas;
 import javafx.scene.canvas.GraphicsContext;
 import javafx.scene.paint.Color;
 import javafx.stage.Stage;
 
public class Example extends Application {
    /** metoda main - ne spreminjaj */
    public static void main(String[] args) {
        launch(args);
    }
    
    /** metoda start - ne spreminjaj */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test Canvas");
        Group root = new Group();
        Canvas canvas = new Canvas(600, 450);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        narisiVsebino(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void narisiVsebino(GraphicsContext gc) {
        /* vaša vsebina gre pod to vrstico */
        
        gc.setStroke(Color.BLUE);       // barva črt
        gc.setLineWidth(1);             //debelina črt
        gc.strokeLine(40, 10, 10, 40);  // črta od (40,10) do (10,40)
        
        
        // gc.strokeText("kaj se izpiše",50,50); // prijemališče besedila na 50,50
        
        // gc.getHeight(); // setWidth();
        // gc.getWidth();  // setHeight();
        
        gc.strokeRect(30,30,150,250);       // pravokotnik: izhodišče v (30,30) s širino 150 in višino 250
       
        gc.strokeOval(70,70,300,150);       // elipsa: izhodišče v (70,70) s širino v centru elipse 300 in višino v sredini elipse 150
        /* vaša vsebina se s to vrstico konča */
    }
}