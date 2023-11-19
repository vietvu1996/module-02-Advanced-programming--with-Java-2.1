package menu.MenuCoach.PlayerManagement;

import menu.Command;
import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import service.chainLogin.ExitCommand;

import java.util.Scanner;

public class MenuPlayerManagement implements Command {
    private final Scanner scanner = new Scanner(System.in);
    public MenuPlayerManagement(){}

    private void displayMenuPlayer(){
        Menu menuPlayer = new MenuMain();
        menuPlayer.addMenuItem(new MenuItem("Create a new player", new CommandAddNewPlayer()));
        menuPlayer.addMenuItem(new MenuItem("Display all player", new CommandDisplayAllPlayer()));
        menuPlayer.addMenuItem(new MenuItem("Change player", new CommandChangeCurrentPlayer()));
        menuPlayer.addMenuItem(new MenuItem("Remove player", new CommandRemoveCurrentPlayer()));
        menuPlayer.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        do {
           menuPlayer.display();
            choice = scanner.nextInt();
            menuPlayer.runCommand(choice - 1);
        } while (choice != 0);
    }
    @Override
    public void execute() {
        displayMenuPlayer();
    }
}
