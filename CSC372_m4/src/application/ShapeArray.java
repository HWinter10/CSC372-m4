package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShapeArray extends Application {
	public void start(Stage primaryStage) {
		
        // Shape instances creation
        Sphere sphere = new Sphere(4);
        Cylinder cylinder = new Cylinder(2, 6);
        Cone cone = new Cone(5, 8);

        // Array storage 
        Shape[] shapeArray = {sphere, cylinder, cone};
        
        // Vertical box layout
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        
        // Label creation for shape's calculated data
        for (Shape shape : shapeArray) {
            Label shapeLabel = new Label(shape.toString());
            root.getChildren().add(shapeLabel);
        }
        // Scene layout and stage
        Scene scene = new Scene(root, 500, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Shapes Surface Area & Volume Calculator");
        primaryStage.show();
    }

	// Main
	 public static void main(String[] args) {
		 launch(args);
 	 }
}
