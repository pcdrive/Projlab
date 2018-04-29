package view;

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
    public Button btn_Server;
    @FXML
    public Button btn_Exit;
    @FXML
    public Button btn_Client;

    public void SzerverButtonDown() {
//        if(actionEvent.getSource() != btn_Server){
//            return;
//        }
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/data/layout/ServerView.fxml"));
            Navigator.navigate(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void KliensButtonDown() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/data/layout/ClientView.fxml"));
            Navigator.navigate(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ExitButtonDown() {
        System.exit(0);
    }
}
