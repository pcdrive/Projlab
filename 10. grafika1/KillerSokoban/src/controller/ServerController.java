package controller;

import view.IView;
import view.ServerView;

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
public class ServerController implements IController {
    ServerView serverView;

    @Override
    public void addView(IView view) {
        serverView = (ServerView) view;
    }
}
