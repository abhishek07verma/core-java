import program.CodeMenu;
import java.util.Scanner;

import static Constants.Constant.breakCase;
import static program.CodeMenu.mainMenu;

public class Main {
    public static void main(String[] args) {

        System.out.println("===Here are the java programs===");
        CodeMenu codeMenu = new CodeMenu();

        int menuOption = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------");
            System.out.println("Select option");
            codeMenu.showCodeMenu(mainMenu);
            menuOption = codeMenu.selectOptionAndProcess(sc.nextInt());
        } while (menuOption != breakCase);
        sc.close();
    }
}