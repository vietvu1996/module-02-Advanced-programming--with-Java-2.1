package menu.MenuTechnicalDirector;

import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import menu.Navigator;
import service.User.SingletonTechnicalDirector;
import service.chainLogin.ExitCommand;

import java.util.Scanner;

public class MenuTechnicalDirector implements Navigator {
    private static MenuTechnicalDirector instance;
    private final Scanner SCANNER = new Scanner(System.in);
    private void menuTechnicalDirector(){
        Menu menuTechnicalDirector = new MenuMain();
//        menuTechnicalDirector.addMenuItem(new MenuItem("Young Player", ));
//        menuTechnicalDirector.addMenuItem(new MenuItem("Search Talent Player", new SearchTalentPlayer()));
        menuTechnicalDirector.addMenuItem(new MenuItem("Create new young player", new CommandAddNewYoungPlayer()));
        menuTechnicalDirector.addMenuItem(new MenuItem("Display all young player", new CommandDisplayAllYoungPlayer()));
        menuTechnicalDirector.addMenuItem(new MenuItem("Change young player", new CommandChangeCurrentYoungPlayerName()));
        menuTechnicalDirector.addMenuItem(new MenuItem("Remove young player", new CommandRemoveCurrentYoungPlayer()));
        menuTechnicalDirector.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        System.out.println("Welcome Sport Director " + SingletonTechnicalDirector.getInstance().getTechnicalDirectorName());
        do {
            menuTechnicalDirector.display();
            choice = SCANNER.nextInt();
            menuTechnicalDirector.runCommand(choice - 1);
        } while (choice != 0);
    }

    public static MenuTechnicalDirector getInstance(){
        if(instance == null){
            instance = new MenuTechnicalDirector();
        }
        return instance;
    }

    @Override
    public void navigate() {
        menuTechnicalDirector();
    }
}
