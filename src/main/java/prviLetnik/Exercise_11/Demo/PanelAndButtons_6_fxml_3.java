package prviLetnik.Exercise_11.Demo; /**
    Kontrola komponent, ki smo jih 'uvozili' iz FXML
    
        - varianti:   a) xxx.getChilden()  in iskanje ustreznih definiranih objektov  -> iskanje + zahtevno naslavljanje
        
                         primer je vsebovan v temle demo-tu
                         
                         a1) če nimamo id-ja elementa v fmxml in vemo, kje v strukturi je element, ki ga želimo
                               uporabimo reflection oz. prebrskamo sceno ali BorderPane za tipom elementa (VBox)
                               
                               * tale način lahko generira nekaj opozoril, ki jih morate poservisirati v realnem programu
                         
                         a2) če imamo id, in ga poznamo
                              'prebrskamo' sceno z :     scene.lookup("#id");   pri čemer je id identifikator elementa
        
                      b) FXML way
                      
                         'označevanje' elementov fxml-ja
                         definicija kontrolerja (za obnašanje el iz fxml-ja)
                      
                                    
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class PanelAndButtons_6_fxml_3 extends Application
{
   @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane elementScene = (BorderPane) FXMLLoader.load(PanelAndButtons_6_fxml_3.class.getResource("Rect_control_1.fxml"));
            // BorderPane elementScene = (BorderPane) FXMLLoader.load(getClass().getResource("Rect_control.fxml"));
           
            
            /* spodnje temelji na predpostavki, da poznamo (približno) strukturo scene in vemo, da je VBox vsebovan v BorderPane- u
               - prebrskamo cel border pane in iščemo element, ki je tipa VBox
               - ker je ta edini, je to ta, v katerega dodamo 2 nova gumba
            */
            VBox mojBoksek=null;
            for ( Node child : elementScene.getChildren() ) {
                if (  child instanceof VBox )
                   mojBoksek = (VBox)child;
            }
            
            //System.out.println(mojBoksek);   // test izpis
            
            
            /// dodamo 2 nova gumba, če v box pač obstaja - morata iti pod spodnja dva, na poziciji 4 in 5
            if (mojBoksek != null) {
                mojBoksek.getChildren().addAll(new Button("četrti"),new Button("PETI"));
            }
            
            
           
            
                
            Scene scene = new Scene(elementScene);
            
             /* še enkrat ............. more elegant ????    če imamo v FXML definiran id elementa in ta id poznamo */
            VBox vb2 = (VBox) scene.lookup("#vb1");
            System.out.println(vb2);   // test izpis
            
            
            primaryStage.setScene(scene);
            primaryStage.setTitle("FXML BorderPane in programski elementi - gumba v desni VBox");
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
