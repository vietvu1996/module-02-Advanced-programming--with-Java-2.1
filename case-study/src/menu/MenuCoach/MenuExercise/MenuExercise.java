package menu.MenuCoach.MenuExercise;

import menu.Command;
import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;

import java.util.Scanner;

public class MenuExercise implements Command{
    private final Scanner scanner = new Scanner(System.in);

   public MenuExercise(){}

    private void displayMenuExercise(){
        Menu menuExercise = new MenuMain();
        menuExercise.addMenuItem(new MenuItem("Add new Running Exercise", new CommandAddRunningExercise()));
        menuExercise.addMenuItem(new MenuItem("Change Running Exercise", new CommandChangeRunningExercise()));
        menuExercise.addMenuItem(new MenuItem("Display Running Exercise", new CommandDisplayRunningExercise()));
        menuExercise.addMenuItem(new MenuItem("Remove Running Exercise", new CommandRemoveRunningExercise()));
        menuExercise.addMenuItem(new MenuItem("Add new Push Up Exercise", new CommandAddPushUpExercise()));
        menuExercise.addMenuItem(new MenuItem("Change Push Up Exercise", new CommandChangePushUpExercise()));
        menuExercise.addMenuItem(new MenuItem("Display Push Up Exercise", new CommandDisplayPushUpExercise()));
        menuExercise.addMenuItem(new MenuItem("Remove Push Up Exercise", new CommandRemovePushUpExercise()));
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
