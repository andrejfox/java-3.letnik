package tretjiLetnik.Exercise_11.Demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;


public class PanelAndButtons_4_fxml_1 extends Application {
   @Override
    public void start(Stage primaryStage) throws IOException {
       BorderPane elementScene = FXMLLoader.load(PanelAndButtons_4_fxml_1.class.getResource("Rect_control.fxml"));
            
       Scene scene = new Scene(elementScene);
       primaryStage.setScene(scene);
       primaryStage.setTitle("Nalaganje dela scene (BorderPane) iz FXML datoteke");
       primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(PanelAndButtons_4_fxml_1.class, (java.lang.String[])null);  //minimiziramo v spodnjega
        //launch("100");
    }
}
