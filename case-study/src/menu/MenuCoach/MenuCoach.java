package menu.MenuCoach;

import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import menu.Navigator;
import service.ExitCommand;
import service.User.SingletonCurrentCoach;

import java.util.Scanner;

public class MenuCoach implements Navigator {
    private static MenuCoach instance;
    private final Scanner scanner = new Scanner(System.in);
    private void menuCoach(){
        Menu menuMain = new MenuMain();
        menuMain.addMenuItem(new MenuItem("Build Tactical", new BuildTactical()));
        menuMain.addMenuItem(new MenuItem("Evaluate Player Performance", new EvaluatePlayerPerformance()));
        menuMain.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        System.out.println("Welcome " + SingletonCurrentCoach.getInstance().getCoachName());
        do {
            menuMain.display();
            choice = scanner.nextInt();
            menuMain.runCommand(choice-1);
        } while (choice != 0);
    }
    @Override
    public void navigate() {
        menuCoach();
    }
}
