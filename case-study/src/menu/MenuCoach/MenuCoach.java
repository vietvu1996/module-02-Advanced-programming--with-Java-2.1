package menu.MenuCoach;

import menu.Menu;
import menu.MenuCoach.FormationAndTactical.MenuTactical;
import menu.MenuCoach.MenuExercise.MenuExercise;
import menu.MenuCoach.PlayerManagement.MenuPlayerManagement;
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
        menuCoach.addMenuItem(new MenuItem("Player Management", new MenuPlayerManagement()));
        menuCoach.addMenuItem(new MenuItem("About exercise", new MenuExercise()));
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
