package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	
	private Stage primaryStage;
    private BorderPane rootLayout;
    private ObservableList<ProductoModel> productoData = FXCollections.observableArrayList();

	@Override
	public void start(Stage primaryStage) {
		
		
		LoginController.inicioSesion=true;
		System.out.println(LoginController.inicioSesion);

		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Login");
		//initRootLayout();

		if(LoginController.inicioSesion==true) {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Productos");
		showPanelMenu();
		
		}
		
	}
	
	
	public void initRootLayout() {
		
		try {
			
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		
	        
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		

	}
	
	
	public void showPanelMenu() {
       
		try {
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("PanelMenu.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		
	        
		} catch(Exception e) {
			e.printStackTrace();
			
		}
            
    }
    
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
    public void MainApp() {
        // Add some sample data
        productoData.add(new ProductoModel("Movil", 155));
        productoData.add(new ProductoModel("TV", 12));
        productoData.add(new ProductoModel("Nevera", 4));
        productoData.add(new ProductoModel("Tablet", 43));
        productoData.add(new ProductoModel("PC", 34));
        productoData.add(new ProductoModel("Portatil", 98));
        productoData.add(new ProductoModel("Camara", 23));
        productoData.add(new ProductoModel("DVD", 245));
        productoData.add(new ProductoModel("Juegos", 897));
    }
  
    /**
     * Returns the data as an observable list of ProductoModels. 
     * @return
     */
    public ObservableList<ProductoModel> getproductoData() {
        return productoData;
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
