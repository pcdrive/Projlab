package sokoban;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
public class Navigator {
    private static Stage mainStage;
    private static Parent prevView;

    public static void setMainStage(Stage stage) {
        mainStage = stage;
    }

    public static void navigate(Parent root) {
        prevView = root;
        mainStage.setScene(new Scene(root));
        mainStage.show();
    }

    public static void moveBack(){
        navigate(prevView);
    }
}
