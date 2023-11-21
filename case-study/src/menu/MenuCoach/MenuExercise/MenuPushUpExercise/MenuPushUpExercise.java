package menu.MenuCoach.MenuExercise.MenuPushUpExercise;

import menu.Command;
import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import service.chainLogin.ExitCommand;

import java.util.Scanner;

public class MenuPushUpExercise implements Command {
    private final Scanner scanner = new Scanner(System.in);

    public MenuPushUpExercise(){}

    private void displayMenuPushUpExercise(){
        Menu menuPushUpExercise = new MenuMain();
        menuPushUpExercise.addMenuItem(new MenuItem("Add name Exercise", new CommandAddPushUpExercise()));
        menuPushUpExercise.addMenuItem(new MenuItem("Change Exercise", new CommandChangePushUpExercise()));
        menuPushUpExercise.addMenuItem(new MenuItem("Display Exercise", new CommandDisplayPushUpExercise()));
        menuPushUpExercise.addMenuItem(new MenuItem("Remove  Exercise", new CommandRemovePushUpExercise()));
        menuPushUpExercise.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        do {
            menuPushUpExercise.display();
            choice = scanner.nextInt();
            menuPushUpExercise.runCommand(choice - 1);
        } while (choice != 0);
    }
    @Override
    public void execute() {
        displayMenuPushUpExercise();
    }
}
