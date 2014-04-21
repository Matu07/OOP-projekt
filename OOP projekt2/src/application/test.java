package application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class test extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Image täring1 = new Image("/application/Täring1.jpg");
		ImageView iv1 = new ImageView();
        iv1.setImage(täring1);	
        
        Group root = new Group();
        Scene scene = new Scene(root);
        scene.setFill(Color.BLACK);
        HBox box = new HBox();
        box.getChildren().add(iv1);
        
        root.getChildren().add(box);
        
        primaryStage.setTitle("ImageView");
        primaryStage.setWidth(415);
        primaryStage.setHeight(200);
        primaryStage.setScene(scene); 
        primaryStage.sizeToScene(); 
        primaryStage.show(); 
	}

	public static void main(String[] args) {
		launch(args);
	}
}
