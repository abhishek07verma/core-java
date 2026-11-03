package program;

import java.util.HashMap;
import java.util.Map;

import static Constants.Constant.breakCase;

public class CodeMenu {

    public static Map<Integer, String> mainMenu = new HashMap<>();
    public static Map<Integer, String> stringMenu = new HashMap<>();
    public CodeMenu() {

        //Setting Main Menu Items
        mainMenu.put(1, "String Programs");

        //Setting Sub Menu Items
        stringMenu.put(1, "Get String in Literal");
        stringMenu.put(2, "Get String with new keyword");
        stringMenu.put(3, "Escaped characters");
        stringMenu.put(4, "Text block");
        stringMenu.put(5, "Default Concatenating by + operator");
        stringMenu.put(6, "Default Concatenating by method");
        stringMenu.put(7, "Length of String");
        stringMenu.put(8, "Get substring of a given string");
        stringMenu.put(9, "Search in the String with help of indexOf substring");
        stringMenu.put(10, "Search in the String with help of regular exp. operator like");
    }

    public void showCodeMenu(Map<Integer, String> menu) {
        for (Map.Entry<Integer, String> entry: menu.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(breakCase + " " + "Exit");
    }

    public int selectOptionAndProcess(int option) {
        switch (option) {
            case 1 -> {
                StringCode stringCode = new StringCode();
                stringCode.showAllStringCodeMenuAndProcess();
                break;
            }

            case breakCase -> {
                System.out.println("Exiting the Code flow.");
                break;
            }
            default -> System.out.println("Invalid option");
        }
        return option;
    }
}
