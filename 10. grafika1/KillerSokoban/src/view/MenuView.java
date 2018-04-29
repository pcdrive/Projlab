package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
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
public class MenuView {

    @FXML
    public Button button_server;
    @FXML
    public Button button_exit;
    @FXML
    public Button button_client;

    public void onButtonDownAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button_server) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/data/resources/layout/ServerView.fxml"));
                Navigator.navigate(root);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (actionEvent.getSource() == button_client) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/data/resources/layout/ClientView.fxml"));
                Navigator.navigate(root);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (actionEvent.getSource() == button_exit) {
            System.exit(0);
        }
    }
}
