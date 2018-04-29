package view;

import controller.IController;
import controller.ServerController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sokoban.Navigator;

import java.io.IOException;

/**
 * A KillerSokoban egy jatek, ahol a jatekos egy raktari munkast alakit.
 * A cel, hogy minden mas jatekosnal tobb megjelolt ladat tolj a helyere.
 *
 * @author Horvath Gergo
 * @author Mocsari Andras
 * @author Zsiros Balint
 * @author Bottlik Judit
 * @author Holub Csongor
 * @version 1.0
 * @since 2018.04.29.
 */
public class ServerView implements IView {
    @FXML
    public TextField textfield_jatekos1nev;
    @FXML
    public TextField textfield_jatekos2nev;
    @FXML
    public TextField textfield_port;
    @FXML
    public Button button_megse;
    @FXML
    public Button button_start;

    private ServerController serverController;

    public void onButtonDownAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button_start) {
            if (textfield_jatekos1nev.getText().isEmpty() || textfield_jatekos2nev.getText().isEmpty() || textfield_port.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hiányos adatok!");
                alert.setHeaderText(null);
                alert.setContentText("Nem adott meg minden adatot!");
                alert.show();
                return;
            }
        } else if (actionEvent.getSource() == button_megse) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/data/resources/layout/MenuView.fxml"));
                Navigator.navigate(root);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void addController(IController controller) {
        serverController = (ServerController) controller;
    }
}