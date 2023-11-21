package menu.MenuCoach.MenuExercise.MenuDribblingExercise;

import menu.Command;
import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import service.chainLogin.ExitCommand;

import java.util.Scanner;

public class MenuDribblingExercise implements Command {
    private final Scanner scanner = new Scanner(System.in);

    public MenuDribblingExercise(){}

    private void displayMenuDribblingExercise(){
        Menu menuDribblingExercise = new MenuMain();
        menuDribblingExercise.addMenuItem(new MenuItem("Add name Exercise", new CommandAddDribblingExercise()));
        menuDribblingExercise.addMenuItem(new MenuItem("Change Exercise", new CommandChangeDribblingExercise()));
        menuDribblingExercise.addMenuItem(new MenuItem("Display Exercise", new CommandDisplayDribblingExercise()));
        menuDribblingExercise.addMenuItem(new MenuItem("Remove  Exercise", new CommandRemoveDribblingExercise()));
        menuDribblingExercise.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        do {
            menuDribblingExercise.display();
            choice = scanner.nextInt();
            menuDribblingExercise.runCommand(choice - 1);
        } while (choice != 0);
    }
    @Override
    public void execute() {
        displayMenuDribblingExercise();
    }
}
