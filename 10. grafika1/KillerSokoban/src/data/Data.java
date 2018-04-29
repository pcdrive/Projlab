package data;

import javafx.util.Pair;
import sokoban.Jatek;

import java.util.ArrayList;

public class Data {
    //    public static final int JatekosEro = 1;
    public static int PalyaX = 5;
    public static int PalyaY = 5;
    public static Jatek jatek;
    public static boolean fullScreen = false;
    public static final ArrayList<Pair<Integer, Integer>> resolutions = new ArrayList<Pair<Integer, Integer>>() {{
        add(new Pair<>(1920, 1080));
        add(new Pair<>(1680, 1050));
        add(new Pair<>(1440, 900));
        add(new Pair<>(1366, 768));
        add(new Pair<>(1280, 1024));
        add(new Pair<>(1280, 800));
        add(new Pair<>(1024, 768));
    }};
    public static int resolution = 0;
}
