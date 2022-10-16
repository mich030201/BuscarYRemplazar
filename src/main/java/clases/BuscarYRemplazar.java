package clases;

import java.util.concurrent.Flow;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYRemplazar extends Application {
	
	//vista
	private Label buscarLabel, remplazarLabel;
	private TextField buscarField, remplazarField;
	private RadioButton mayusRadio, expresionRadio, buscarRadio, resaltarRadio;
	private Button buscarButton, remplazarButton, remplazarTodoButton, cerrarButton, ayudaButton;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Etiquetas
		buscarLabel = new Label("Buscar:");
		remplazarLabel = new Label("Remplazar con:");
		
		//Campos de texto
		buscarField = new TextField();
		remplazarField = new TextField();
		
		//RadioButtons
		mayusRadio = new RadioButton("Mayúscula y minúscula");
		expresionRadio = new RadioButton("Expresión regular");
		buscarRadio = new RadioButton("Buscar hacia atrás");
		resaltarRadio = new RadioButton("Resaltar resultados");
		
		//Botones
		buscarButton = new Button("Buscar");
		remplazarButton = new Button("Remplazar");
		remplazarTodoButton = new Button("Remplazar todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		remplazarButton.setMaxWidth(Double.MAX_VALUE);
		remplazarTodoButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		
		
		
		//BotoneraDerecha
		VBox botonera = new VBox();
		botonera.getChildren().addAll(buscarButton, remplazarButton, remplazarTodoButton, cerrarButton, ayudaButton);
		botonera.setFillWidth(true);
		//botonera.setAlignment(Pos.CENTER);
		botonera.setMinWidth(Control.USE_PREF_SIZE);
		
		
		
		//GridPane RadioButtons
		GridPane radioGrid = new GridPane();
		radioGrid.setHgap(5);
		radioGrid.setVgap(5);
		radioGrid.addRow(0, mayusRadio, buscarRadio);
		radioGrid.addRow(1, expresionRadio, resaltarRadio);
		
		
		//GridPane
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.addRow(0, buscarLabel, buscarField);
		gridPane.addRow(1, remplazarLabel, remplazarField);
		gridPane.addRow(2, radioGrid);
		gridPane.setPadding(new Insets(0, 5, 0, 0));
		
		GridPane.setColumnIndex(radioGrid, 1);
		
		//HBox
		HBox root = new HBox();
		root.getChildren().addAll(gridPane, botonera);
		root.setPadding(new Insets(3));
		
		
		primaryStage.setTitle("Buscar y remplazar");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
