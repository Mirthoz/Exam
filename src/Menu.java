import java.util.Scanner;

public class Menu {
    public static void enterPrise(){
        Scanner scanner = new Scanner(System.in);
        printData(scanner.nextDouble());
    }

    public static void printData(double prise){
        if(prise == 0){
            Mechanics.printAllMelbas();
        }
    }
}
