package Exercise_11.Demo;
/**
 * Write a description of class adsas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;


public class PanelObj1 extends Application {
 
    /** metoda main - ne spreminjaj */
    public static void main(String[] args) {
        launch(args);
    }
 
    
    /** metoda start - ne spreminjaj */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test objektov na panelu");
       
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
        
        Rectangle r2 = new Rectangle(250.0,145.0,200.0,100.0);   
                  r2.setFill(Color.rgb(236,30,255));  // barva iz rgb; druge možnosti: hsb, web, ... https://docs.oracle.com/javafx/2/api/javafx/scene/paint/Color.html
                  
        p.getChildren().add(r1);
        p.getChildren().add(r2);
                  
                  
        Circle  c1 = new Circle();        // https://docs.oracle.com/javafx/2/api/javafx/scene/shape/Circle.html
                c1.setCenterX(50.0f);
                c1.setCenterY(50.0f);
                c1.setRadius(35.0f);
                c1.setFill(Color.GREEN);
        Circle  c2 = new Circle(75.0f,75.0f,50.0f); // privzeto črn
       
        p.getChildren().addAll(c1,c2); // dodamo obe krožnici na pane
        
        
        // še en lik kot presek krožnice c1 in kroznice c2 : še primerčki v http://blog.ngopal.com.np/2011/06/18/shapes-intersection-subtract-and-union-in-javafx-2-0/
        Shape sp = Shape.intersect(c1,c2);
        //sp.relocate(300,175); //-- izris preseka lahko damo tudi drugam
        sp.setFill(Color.RED);
        p.getChildren().add(sp);
        
        /* konec generiranja vsebine na panel */
        
    }
    
    
}