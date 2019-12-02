package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
public class appController {
	@FXML
	private ProgressIndicator pi;

	@FXML
	private Label textoutput;

	@FXML
	private TextField textinput;

	@FXML
	private void add10 (ActionEvent event) {
		double progreso = pi.getProgress();
		progreso = ((progreso * 100 + 10) % 100)/100 ;
		pi.setProgress(progreso);
	}

	@FXML
	private void changeLabel (ActionEvent event) {
		String content = textinput.getText();
		textoutput.setText(content);
	}
}