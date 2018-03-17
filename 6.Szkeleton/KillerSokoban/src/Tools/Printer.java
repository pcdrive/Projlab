package Tools;

public class Printer {
    private static int tabCount = 0;
    public static void PrintFunction(String message){
        for(int i = 0; i<tabCount; i++){
            System.out.print("\t");
        }
        System.out.println(message);
        tabCount++;
    }
    public static void PrintReturn(String message){
        for(int i = 0; i<tabCount; i++){
            System.out.print("\t");
        }
        System.out.println(message);
        tabCount--;
    }
}