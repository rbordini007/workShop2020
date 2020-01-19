package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class MainViewController implements Initializable {
	
	@FXML
	private Button btTeste;
	
	@FXML
	public void onBtTestAction() {
		Alerts.showAlert("Alert title", "Alert header", "hello", AlertType.ERROR);
	}
	
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
	
}
