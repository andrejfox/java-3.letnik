package Exercise_11.Demo; /**
 Dodamo v sceno (programsko) še nekaj elementov 
 
   test ali lahko soobstaja na sceni vsebina FXML in programsko dodani elementi:
   
      - predhodnemo primeru na BorderPane dodamo še zelen krogec
               levo : rdečega
               spodaj: rumenega
               
      !- deluje brez problema         
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class PanelAndButtons_5_fxml_2 extends Application
{
   @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane elementScene = (BorderPane) FXMLLoader.load(PanelAndButtons_5_fxml_2.class.getResource("Rect_control.fxml"));
            
            Circle  c1 = new Circle();        
                c1.setCenterX(50.0f);
                c1.setCenterY(50.0f);
                c1.setRadius(35.0f);
                c1.setFill(Color.GREEN);
            
            Circle  c2 = new Circle();        
                c2.setCenterX(50.0f);
                c2.setCenterY(50.0f);
                c2.setRadius(35.0f);
                c2.setFill(Color.RED);
                
                
            Circle  c3 = new Circle();        
                c3.setCenterX(60.0f);
                c3.setCenterY(60.0f);
                c3.setRadius(35.0f);
                c3.setFill(Color.YELLOW);    
                
            
            elementScene.getChildren().add(c1);  // v BorderPane
            
            elementScene.setLeft(c2);
            elementScene.setBottom(c3);
                
            Scene scene = new Scene(elementScene);
            primaryStage.setScene(scene);
            primaryStage.setTitle("FXML BorderPane in programski elementi");
            primaryStage.show();
        } catch (Exception ex) {
            //Logger.getLogger(PanelAndButtons_4_fxml_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Application.launch(PanelAndButtons_4_fxml_1.class, (java.lang.String[])null);  //minimiziramo v spodnjega
        launch(args);
    }


    
}
