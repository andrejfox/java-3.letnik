package prviLetnik.Exercise_11.Demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class PanelAndButton_1 extends Application {
 
    /** metoda main - ne spreminjaj */
    public static void main(String[] args) {
        launch(args);
    }
 
    
    /** metoda start - ne spreminjaj */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Objekt + knof na panelu");     
        
        Pane p = new Pane();                        // https://docs.oracle.com/javafx/2/api/javafx/scene/layout/Pane.html
             p.setPrefSize(600,400);
     
        konstruirajPane(p);
        
        primaryStage.setScene(new Scene(p));
        primaryStage.show();
    }

    /** vsebuje 2 pravokotnika in 2 krožnici in en izračun ter vizualizacija preseka dveh krožnic */
    private void konstruirajPane(Pane p){
        
        /* začetek generiranja vsebine na panel */
        
        Rectangle r1 = new Rectangle();    // https://docs.oracle.com/javafx/2/api/javafx/scene/shape/Rectangle.html
                  r1.setX(250);
                  r1.setY(250);
                  r1.setWidth(200);
                  r1.setHeight(100);
                  r1.setStroke(Color.RED);
        
        
        p.getChildren().add(r1);
                  
      
        Circle  c2 = new Circle(75.0f,75.0f,50.0f); // privzeto črn
                c2.setStroke(Color.RED);
                c2.setFill(Color.WHITE);
       
        p.getChildren().addAll(c2); // dodamo obe krožnici na pane
        
        
        // button
        Button b1 = new Button("Klikn me ...");
        b1.relocate(100,50);
        p.getChildren().add(b1);
        
        System.out.println(b1);
        b1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override public void handle(ActionEvent e) {
                                System.out.println(e);
                                // sprememba napisa na gumbu
                                b1.setText("Accepted");
                                // prestavi za (15,15) desno dol
                                double xc = b1.getLayoutX();
                                double yc = b1.getLayoutY();
                                System.out.print("pred.."+xc+" "+yc+" ");
                                b1.relocate(xc+15,yc+15);
                                System.out.println("po.."+b1.getLayoutX()+" "+b1.getLayoutY()+" ");
                                
                                System.out.println(this);
                            }
                        }
                      );
        /* konec generiranja vsebine na panel */
        
    }
    
    
}