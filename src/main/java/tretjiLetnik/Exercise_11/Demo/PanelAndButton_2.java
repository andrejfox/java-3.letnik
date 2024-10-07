package tretjiLetnik.Exercise_11.Demo;
/**
 * Write a description of class adsas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

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


public class PanelAndButton_2 extends Application {
 
    /** metoda main - ne spreminjaj */
    public static void main(String[] args) {
        launch(args);
    }
 
    
    static Button tabb[] = new Button[20];
    
    
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
        
        
        // zamenjavo poimenovano referenco, z referenco, pridobljeno iz eventa 
        
        
        Button b1= new Button("  -"+4+"-");
       for (int i=0;i<10;i++){
        // button
       tabb[i] = new Button("  -"+i+"-");
       tabb[i].relocate(100+i*5,50+i*5);
     
        
        //tabb[i] = b1;
        tabb[i].setOnAction(new EventHandler<ActionEvent>() {
                            @Override public void handle(ActionEvent e) {
                                System.out.println(e);
                                // sprememba napisa na gumbu
                                //b1.setText("Accepted");
                                // prestavi za (15,15) desno dol
                                Button b = (Button)e.getSource();
                                double xc = b.getLayoutX();
                                double yc = b.getLayoutY();
                                System.out.print("pred.."+xc+" "+yc+" "+e.getSource()+" : ");
                                b.relocate(xc+15,yc+15);
                                System.out.println("po.."+b.getLayoutX()+" "+b.getLayoutY()+" ");
                                System.out.println(b.getText());
                                if ( b.getText().equals("  -0-")){
                                  System.out.println("knof 0 je bil kliknjen");
                                  b.toFront();
                                }
                                
                                //System.out.println(this);
                            }
                        }
                      );
              p.getChildren().add(tabb[i]);                
                    }             
                 
                      
        /* konec generiranja vsebine na panel */
      
    }
    
    
}