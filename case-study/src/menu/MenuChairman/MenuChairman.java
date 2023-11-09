package menu.MenuChairman;

import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import menu.Navigator;
import service.User.SingletonChairman;

import java.util.Scanner;

public class MenuChairman implements Navigator {
    private static MenuChairman instance;
    private final Scanner SCANNER = new Scanner(System.in);

    private void menuChairman() {
        Menu menuMain = new MenuMain();
        menuMain.addMenuItem(new MenuItem("Overall Management",new CommandOverallManagement()));
        menuMain.addMenuItem(new MenuItem("Search for sponsors", new SearchForSponsors()));
        menuMain.addMenuItem(new MenuItem("Important decision", new ImportantDecision()));
//        menuMain.addMenuItem(new MenuItem();
        int choice;
        do{
            System.out.println("Welcome " + SingletonChairman.getInstance().getChairmanName());
            menuMain.display();
            choice = SCANNER.nextInt();
            menuMain.runCommand(choice);
        } while (choice != 0);
    }

    public static MenuChairman getInstance() {
        if (instance == null) {
            instance = new MenuChairman();
        }
        return instance;
    }

    @Override
    public void navigate() {
        menuChairman();
        }
}