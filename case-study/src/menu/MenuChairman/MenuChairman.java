package menu.MenuChairman;

import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import menu.Navigator;
import service.chainLogin.ExitCommand;
import service.User.SingletonChairman;

import java.util.Scanner;

public class MenuChairman implements Navigator {
    private static MenuChairman instance;
    private final Scanner SCANNER = new Scanner(System.in);

    private void menuChairman() {
        Menu menuChairman = new MenuMain();
        menuChairman.addMenuItem(new MenuItem("Club goals", new ClubGoals()));
        menuChairman.addMenuItem(new MenuItem("Search for sponsors", new SearchForSponsors()));
        menuChairman.addMenuItem(new MenuItem("Important decision", new MenuImportantDecision()));
        menuChairman.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        System.out.println("Welcome Chairman " + SingletonChairman.getInstance().getChairmanName());
        do{
            menuChairman.display();
            choice = SCANNER.nextInt();
            menuChairman.runCommand(choice-1);
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