package tretjiLetnik.Exercise_11.Demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class PanelAndButtons_3 extends Application {
 
    /** metoda main - ne spreminjaj */
    public static void main(String[] args) {
        launch(args);
    }
 
    
    static Button tabb[] = new Button[20];
    
    
    /** metoda start - ne spreminjaj */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Objekt + knof na panelu");     
        
       
        Scene sc = konstruirajSceno();   // vrne sestavljeno sceno
        
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    
    private Scene konstruirajSceno(){
        
        // koren/root scene naj bo border pane 
        BorderPane bp = new BorderPane();
        
        //v desni dal damo VBox
        VBox vB = new VBox();
        bp.setRight(vB);
        
        
        //v centralni del damo Pane (ne bi rabili, če pa imamo več elementov, je privzeti layout cardLayout ...
        Pane pA = new Pane();
        bp.setCenter(pA);
        
        // pravokotnik na Pane; final (uporablja ga anonimna notr, funkcija)
        final Rectangle r1 = new Rectangle();    // https://docs.oracle.com/javafx/2/api/javafx/scene/shape/Rectangle.html
                  r1.setX(50);
                  r1.setY(50);
                  r1.setWidth(200);
                  r1.setHeight(100);
                  r1.setFill(Color.LIGHTBLUE);
                  r1.setStroke(Color.RED);
        
        
        pA.getChildren().add(r1);
                  
        
        // tri gumbe na VBox
        Button premakniB= new Button("Premakni");
        Button prebarvajB= new Button("Prebarvaj");
        Button ponastaviB= new Button("Ponastavi");
      
       
        vB.getChildren().addAll(premakniB,prebarvajB,ponastaviB); // dodamo obe krožnici na pane
        
        
        // dodamo funkcionalnosti na gumbe : uporabimo splošen dogodek : ActionEvent
        
        // najprej ponastavi : barvo, pozicijo
        ponastaviB.setOnAction(new EventHandler<ActionEvent>() {
                              @Override public void handle(ActionEvent e) {
                                  r1.setLayoutX(0);  // relativno od postavljene pozicije
                                  r1.setLayoutY(0);
                                  r1.setFill(Color.LIGHTBLUE);
                                  r1.setStroke(Color.RED);
                              }
                            });
        
         // premakni za (7,7) 
        premakniB.setOnAction(new EventHandler<ActionEvent>() {
                              @Override public void handle(ActionEvent e) {
                                  //double
                                  r1.setLayoutX(r1.getLayoutX()+7);
                                  r1.setLayoutY(r1.getLayoutY()+7);
                              }
                            });  
                            
         //prebarvaj v naključno rgb barvo
         prebarvajB.setOnAction(new EventHandler<ActionEvent>() {
                              @Override public void handle(ActionEvent e) {
                              }
                            });  
                            
       /*
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
              bp.getChildren().add(tabb[i]);                
                    }             
           */      
                      
        /* konec generiranja vsebine na panel */
      
        
        return new Scene(bp,600,400);
    }
    
    
}