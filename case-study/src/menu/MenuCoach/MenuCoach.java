package menu.MenuCoach;

import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import menu.Navigator;
import service.User.SingletonCurrentCoach;
import service.chainLogin.ExitCommand;

import java.util.Scanner;

public class MenuCoach implements Navigator {
    private static MenuCoach instance;
    private final Scanner scanner = new Scanner(System.in);
    private void menuCoach(){
        Menu menuCoach = new MenuMain();
        menuCoach.addMenuItem(new MenuItem("Build Tactical", new MenuTactical()));
        menuCoach.addMenuItem(new MenuItem("Create a new player", new CommandAddNewPlayer()));
        menuCoach.addMenuItem(new MenuItem("Display all player", new CommandDisplayAllPlayer()));
        menuCoach.addMenuItem(new MenuItem("Change player", new CommandChangeCurrentPlayer()));
        menuCoach.addMenuItem(new MenuItem("Remove player", new CommandRemoveCurrentPlayer()));
        menuCoach.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        System.out.println("Welcome Coach " + SingletonCurrentCoach.getInstance().getCoachName());
        do {
            menuCoach.display();
            choice = scanner.nextInt();
            menuCoach.runCommand(choice -1);
        } while (choice != 0);
    }

    public static MenuCoach getInstance(){
        if(instance == null){
            instance = new MenuCoach();
        }
        return instance;
    }
    @Override
    public void navigate() {
        menuCoach();
    }
}
