package controller;

import data.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
public class ServerController {
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
    @FXML
    public ComboBox<String> combobox_palyavalaszto;
    @FXML
    public GridPane gridpane_preview;

    public void onButtonDownAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button_start) {
            if (textfield_jatekos1nev.getText().isEmpty() || textfield_jatekos2nev.getText().isEmpty() || textfield_port.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hiányos adatok!");
                alert.setHeaderText(null);
                alert.setContentText("Nem adott meg minden adatot!");
                alert.show();
                return;
            } else {
                //valamit csinaljon....
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

    @FXML
    public void initialize() {
        combobox_palyavalaszto.setItems(Data.jatek.getPalyaLista());
    }
}