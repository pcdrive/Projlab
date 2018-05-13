package sokoban;

import data.Data;
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

    public static void setMainStage(Stage stage) {
        mainStage = stage;
        mainStage.setResizable(false);
    }

    public static void navigate(Parent root, boolean enforceResolution) {
        Scene scene;
        if (enforceResolution) {
            int x = Data.resolutions.get(Data.resolution).getKey();
            int y = Data.resolutions.get(Data.resolution).getValue();
            scene = new Scene(root, x, y);
        } else {
            scene = new Scene(root);
        }

        mainStage.setScene(scene);
        mainStage.show();
        mainStage.setFullScreen(enforceResolution && Data.fullScreen);
    }
}
