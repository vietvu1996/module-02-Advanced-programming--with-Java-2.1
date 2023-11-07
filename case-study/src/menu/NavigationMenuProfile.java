package menu;

import service.ExitCommand;
import service.SingletonCurrentPlayer;
import service.CommandChangeUsername;

import java.util.Scanner;

public class NavigationMenuProfile implements Navigator{
    private final Scanner SCANNER = new Scanner(System.in);
    private void navigationProfile() {
        Menu menuProfile = new MenuMain();
        menuProfile.addMenuItem(new MenuItem("Change username", new CommandChangeUsername()));
        menuProfile.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        do{
            System.out.println("Welcome " + SingletonCurrentPlayer.getInstance().getCurrentPlayerName());
            menuProfile.display();
            choice = SCANNER.nextInt();
            menuProfile.runCommand(choice);
        } while (choice != 0);
    }

    @Override
    public void navigate() {
        navigationProfile();
    }
}
