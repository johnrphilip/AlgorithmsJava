package noFingWay;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
 
public class BloodyTriangle extends Application
{
          public void start (Stage stage)    
          {
                    // create and configure the 3 lines 
                    Line line1 = new Line(100, 70, 100, 250);
                    line1.setStroke(Color.RED);
            

                    Line line2 = new Line(100, 250, 400, 250);
                    line2.setStroke(Color.RED);
            
                    Line line3 = new Line(400, 250, 100, 70);
                    line3.setStroke(Color.RED);
            
                    // create a group that holds all the features                    
                    Group triangle = new Group(line1, line2, line3);
            
                    // create and configure a new scene        
                    Scene scene = new Scene(triangle, 500, 300);
            
                    // add the scene to the stage, then set the title        
                    stage.setScene(scene);        
                    stage.setTitle("Triangle");
            
                    // show the stage        
                    stage.show(); 
                    }
      
          public static void main(String[] args)    
          {        
        	  launch(args);    
          }  
}
 