package application;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;



public class Main1 extends Application {

	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample1.fxml"));
			Scene scene = new Scene(root,1350,720);
	
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());			
			primaryStage.getIcons().add(new Image("logo.png"));
	        primaryStage.setTitle("Face Detection Security System");
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
		
	}
}
