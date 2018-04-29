package tools;

public class Printer {
    private static int tabCount = 0;
    private static boolean printEnabled = true;

    public static void PrintTabIn(String message) {
        if (printEnabled) {
            tabCount++;
            for (int i = 0; i < tabCount; i++) {
                System.out.print("\t");
            }
            System.out.println(message);
        }
    }

    public static void PrintTabOut(String message) {
        if (printEnabled) {
            for (int i = 0; i < tabCount; i++) {
                System.out.print("\t");
            }
            System.out.println(" " + message);
            tabCount--;
        }
    }


    public static void EnablePrint() {
        printEnabled = true;
    }

    public static void DisablePrint() {
        printEnabled = false;
    }


}