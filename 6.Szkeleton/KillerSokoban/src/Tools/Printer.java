package Tools;

public class Printer {
    private static int tabCount = 0;

    public static void PrintTabIn(String message) {
        tabCount++;
        for (int i = 0; i < tabCount; i++) {
            System.out.print("\t");
        }
        System.out.println(message);
    }

    public static void PrintTabOut(String message) {
        for (int i = 0; i < tabCount; i++) {
            System.out.print("\t");
        }
        System.out.println(" " + message);
        tabCount--;
    }
}