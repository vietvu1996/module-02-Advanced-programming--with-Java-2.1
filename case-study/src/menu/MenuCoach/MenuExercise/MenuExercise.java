package menu.MenuCoach.MenuExercise;

import menu.Command;
import menu.Menu;
import menu.MenuCoach.MenuExercise.MenuDribblingExercise.MenuDribblingExercise;
import menu.MenuCoach.MenuExercise.MenuPushUpExercise.MenuPushUpExercise;
import menu.MenuCoach.MenuExercise.MenuRunningExercise.MenuRunningExercise;
import menu.MenuItem;
import menu.MenuMain;

import java.util.Scanner;

public class MenuExercise implements Command{
    private final Scanner scanner = new Scanner(System.in);

   public MenuExercise(){}

    private void displayMenuExercise(){
        Menu menuExercise = new MenuMain();
        menuExercise.addMenuItem(new MenuItem("Dribbling Exercise", new MenuDribblingExercise()));
        menuExercise.addMenuItem(new MenuItem("Running Exercise", new MenuRunningExercise()));
        menuExercise.addMenuItem(new MenuItem("Push up Exercise", new MenuPushUpExercise()));
        int choice;
        do {
            menuExercise.display();
            choice = scanner.nextInt();
            menuExercise.runCommand(choice - 1);
        } while (choice != 0);
    }

    @Override
    public void execute() {
        displayMenuExercise();
    }
}
