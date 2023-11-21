package menu.MenuPlayer;

import menu.Menu;
import menu.MenuCoach.FormationAndTactical.MenuTactical;
import menu.MenuCoach.MenuExercise.MenuPushUpExercise.CommandDisplayPushUpExercise;
import menu.MenuCoach.MenuExercise.MenuRunningExercise.CommandDisplayRunningExercise;
import menu.MenuItem;
import menu.MenuMain;
import menu.Navigator;
import service.chainLogin.ExitCommand;
import service.User.SingletonCurrentPlayer;

import java.util.Scanner;

public class MenuPlayer implements Navigator {
    private static MenuPlayer instance;
    private final Scanner SCANNER = new Scanner(System.in);
    public static MenuPlayer getInstance() {
        if(instance == null){
            instance = new MenuPlayer();
        }
        return instance;
    }

    private void menuPlayer() {
        Menu menuPlayer = new MenuMain();
        menuPlayer.addMenuItem(new MenuItem("View formation and Strategy", new MenuTactical()));
        menuPlayer.addMenuItem(new MenuItem("View Running Exercise", new CommandDisplayRunningExercise()));
        menuPlayer.addMenuItem(new MenuItem("View Push Up Exercise", new CommandDisplayPushUpExercise()));
        menuPlayer.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        System.out.println("Welcome Player " + SingletonCurrentPlayer.getInstance().getCurrentPlayerName());
        do{
            menuPlayer.display();
            choice = SCANNER.nextInt();
            menuPlayer.runCommand(choice-1);
        } while (choice != 0);
    }

    @Override
    public void navigate() {
        menuPlayer();
    }
}
