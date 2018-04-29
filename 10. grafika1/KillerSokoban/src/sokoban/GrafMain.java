package sokoban;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tools.Printer;

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
public class GrafMain extends Application {

    static Jatek j;

    /**
     * ProtoMain fuggveny, ami a jatekot futtatja.
     *
     * @param args    parancssori argumentumok
     */

    /**
     * Lehetseges parancsok listazasa
     */

    public static void main(String[] args) {
        Printer.DisablePrint();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/data/layout/MenuView.fxml"));
        primaryStage.setTitle("Killer Sokoban");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}