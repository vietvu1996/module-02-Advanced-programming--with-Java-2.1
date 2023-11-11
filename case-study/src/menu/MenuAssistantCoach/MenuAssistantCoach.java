package menu.MenuAssistantCoach;

import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import menu.Navigator;
import service.chainLogin.ExitCommand;
import service.User.SingletonCurrentAssistantCoach;

import java.util.Scanner;

public class MenuAssistantCoach implements Navigator {
    private static MenuAssistantCoach instance;
    private final Scanner SCANNER = new Scanner(System.in);

    private void menuAssistantCoach() {
        Menu menuAssistantCoach = new MenuMain();
        menuAssistantCoach.addMenuItem(new MenuItem("Tactical", new Tactical()));
        menuAssistantCoach.addMenuItem(new MenuItem("Performance of players", new EvaluatePerformance()));
        menuAssistantCoach.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        System.out.println("Welcome " + SingletonCurrentAssistantCoach.getInstance().getAssistantName());
        do {
            menuAssistantCoach.display();
            choice = SCANNER.nextInt();
            menuAssistantCoach.runCommand(choice - 1);
        } while (choice != 0);
    }

    public static MenuAssistantCoach getInstance() {
        if (instance == null) {
            instance = new MenuAssistantCoach();
        }
        return instance;
    }

    @Override
    public void navigate() {
        menuAssistantCoach();
    }
}
