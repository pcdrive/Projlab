package sokoban;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
    private static Stage stage;

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

    public static Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Navigator.setMainStage(primaryStage);
        Parent root = FXMLLoader.load(getClass().getResource("/data/resources/layout/MenuView.fxml"));
        Navigator.navigate(root, false);
    }

    @Override
    public void stop(){
        System.exit(0);
    }
}
