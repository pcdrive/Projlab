package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
    public MenuView(){
        Parent root = null;
        try {
//            root = FXMLLoader.load(getClass().getResource("data/layout/MenuView.fxml"));
            root = FXMLLoader.load(getClass().getResource("/layout/MenuView.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Killer Sokoban");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
