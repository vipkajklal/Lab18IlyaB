package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public static String message;

    @FXML
    private Button send;
    @FXML
    private TextArea log;
    @FXML
    private TextField t;

    @FXML
    private void ClickButtonSend(ActionEvent eventOne) {
        message = t.getText();
        if (message != null && message.length() >= 1) {
            log.appendText("user" + " -> " + message + "\n");
            t.setText("");
            t.requestFocus();
        } else {
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        t.requestFocus();
    }
}