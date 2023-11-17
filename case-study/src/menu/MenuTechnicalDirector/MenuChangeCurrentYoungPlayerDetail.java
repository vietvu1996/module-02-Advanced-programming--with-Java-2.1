package menu.MenuTechnicalDirector;

import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import menu.Navigator;
import service.User.SingletonTechnicalDirector;
import service.chainLogin.ExitCommand;

import java.util.Scanner;

public class MenuChangeCurrentYoungPlayerDetail implements Navigator {
    private final Scanner SCANNER = new Scanner(System.in);
    private void displayMenuChangeCurrentYoungPlayerDetail(){
        Menu menuTechnicalDirector = new MenuMain();
        menuTechnicalDirector.addMenuItem(new MenuItem("Change young player name", new CommandChangeCurrentYoungPlayerName()));
        menuTechnicalDirector.addMenuItem(new MenuItem("Remove young player name", new CommandRemoveCurrentPlayer()));
        menuTechnicalDirector.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
//        System.out.println("Welcome " + SingletonTechnicalDirector.getInstance().getTechnicalDirectorName());
        do {
            menuTechnicalDirector.display();
            choice = SCANNER.nextInt();
            menuTechnicalDirector.runCommand(choice - 1);
        } while (choice != 0);
    }
    @Override
    public void navigate() {
        displayMenuChangeCurrentYoungPlayerDetail();
    }
}
