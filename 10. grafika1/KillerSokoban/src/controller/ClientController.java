package controller;

import data.Data;
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
public class ClientController {
    @FXML
    public TextField textfield_jatekosnev;
    @FXML
    public TextField textfield_host;
    @FXML
    public TextField textfield_port;
    @FXML
    public Button button_megse;
    @FXML
    public Button button_start;

    public void onButtonDownAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button_start) {

            if (textfield_jatekosnev.getText().isEmpty() || textfield_host.getText().isEmpty() || textfield_port.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hianyos adatok!");
                alert.setHeaderText(null);
                alert.setContentText("Nem adott meg minden adatot!");
                alert.show();
                return;
            } else {
                try {
                    int port = Integer.parseInt(textfield_port.getText());

                    if (Data.jatek.CheckIPAvailability(textfield_host.getText(), "Kliens") && Data.jatek.CheckPortAvailability(port, "Kliens")) {
                        boolean success = Data.jatek.Kapcsol(textfield_jatekosnev.getText(), textfield_host.getText(), port);
                        if (success) {
                            Parent root = FXMLLoader.load(getClass().getResource("/data/resources/layout/GameView.fxml"));
                            Navigator.navigate(root);
                        } else {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Kapcsolodas sikertelen!");
                            alert.setHeaderText(null);
                            alert.setContentText("A kapcsolatot nem sikerult kiepiteni a szerverrel!");
                            alert.show();
                        }
                    }
                } catch (Exception e) {
                    //Nem kell semmit sem tenni
                }
            }
        } else if (actionEvent.getSource() == button_megse) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/data/resources/layout/MenuView.fxml"));
                Navigator.navigate(root);
            } catch (IOException e) {
                //Nem kell semmit sem tenni
            }
        }
    }
}