package application;

import javafx.beans.property.IntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	 @FXML
	    private Button btnLogin;

	    @FXML
	    private TextField txtEmail;

	    @FXML
	    private TextField txtPassword;

		private Main main;
	    
	    static boolean inicioSesion;
	    
	   
	    
	    @FXML
	    public boolean login(ActionEvent event) {
	    	//Creamos la alerta que aparecer� para decirnos si hemos introducido bien las credenciales
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Informaci�n");
	    	alert.setHeaderText(null);
	    	
	    	//Variables ficticias para emular un inicio de sesi�n
	    	String email = "prueba@gmail.com";
	    	String password = "123456";
	    	
	    	//Comprobamos si coinciden los datos del login
	    	if(txtEmail.getText().equals(email) && txtPassword.getText().equals(password)) {
	    		//Si coincide, nos muestra el siguiente mensaje
	    		
	    		inicioSesion = true;
	    		
	    		alert.setContentText("Ha iniciado sesi�n correctamente");
	    		
	    		
	    		
	    	}else {
	    		//Si no hemos escrito bien nuestra credenciales, nos muestra este otro
	    		alert.setContentText("Email y/o contrase�a incorrectos");
	    		System.out.println(email +" "+password+" "+txtEmail.getText()+" "+txtPassword.getText()+" ");
	    	}
	    	
	    	alert.showAndWait();
	    	System.out.println(inicioSesion);
	    	return inicioSesion;
	    	
	    	
	    }
	    
	    public class ProductoOverviewController {
	        @FXML
	        private TableView<ProductoModel> productoTable;
	        @FXML
	        private TableColumn<ProductoModel, String> productoColumn;
	        @FXML
	        private TableColumn<ProductoModel, Number> stockColumn;

	        @FXML
	        private Label productoLabel;
	        @FXML
	        private Label unidadesLabel;
	        @FXML
	        private Label precioLabel;
	        @FXML
	        private Label fechaLabel;
	        
	        // Reference to the main application.
	        private Main main;
	      

	        /**
	         * The constructor.
	         * The constructor is called before the initialize() method.
	         */
	        public ProductoOverviewController() {
	        }

	        /**
	         * Initializes the controller class. This method is automatically called
	         * after the fxml file has been loaded.
	         */
	        @FXML
	        private void initialize() {
	            // Initialize the person table with the two columns.
	            productoColumn.setCellValueFactory(cellData -> cellData.getValue().getProducto());
	            stockColumn.setCellValueFactory(cellData -> cellData.getValue().getUnidades());
	        }

	        /**
	         * Is called by the main application to give a reference back to itself.
	         * 
	         * @param mainApp
	         */
	        public void setMain(Main main) {
				this.main = main;

	            // Add observable list data to the table
	            productoTable.setItems(main.getproductoData());
				
			}

			public void setParent(Stage primaryStage) {
				// TODO Auto-generated method stub
				
			}

	    }

		
		
}
