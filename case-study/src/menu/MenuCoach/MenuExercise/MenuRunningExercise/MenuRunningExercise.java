package menu.MenuCoach.MenuExercise.MenuRunningExercise;

import menu.Command;
import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import service.chainLogin.ExitCommand;

import java.util.Scanner;

public class MenuRunningExercise implements Command {
    private final Scanner scanner = new Scanner(System.in);

    public MenuRunningExercise(){}

    private void displayMenuRunningExercise(){
        Menu menuRunningExercise = new MenuMain();
        menuRunningExercise.addMenuItem(new MenuItem("Add name Exercise", new CommandAddRunningExercise()));
        menuRunningExercise.addMenuItem(new MenuItem("Change Exercise", new CommandChangeRunningExercise()));
        menuRunningExercise.addMenuItem(new MenuItem("Display Exercise", new CommandDisplayRunningExercise()));
        menuRunningExercise.addMenuItem(new MenuItem("Remove  Exercise", new CommandRemoveRunningExercise()));
        menuRunningExercise.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        do {
            menuRunningExercise.display();
            choice = scanner.nextInt();
            menuRunningExercise.runCommand(choice - 1);
        } while (choice != 0);
    }
    @Override
    public void execute() {
        displayMenuRunningExercise();
    }
}
