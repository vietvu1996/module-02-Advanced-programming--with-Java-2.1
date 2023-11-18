package menu.MenuCoach;

import menu.*;
import service.chainLogin.ExitCommand;

import java.util.Scanner;

public class MenuTactical implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    public MenuTactical(){}
    private void displayMenuTactical(){
        Menu menuTactical = new MenuMain();
        menuTactical.addMenuItem(new MenuItem("Formation and Strategy of Tiki Taka", new TikiTakaFormationAndStrategy()));
        menuTactical.addMenuItem(new MenuItem("Formation and Strategy of Counter Attack", new CounterAttackFormationAndStrategy()));
        menuTactical.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        do {
            menuTactical.display();
            choice = SCANNER.nextInt();
            menuTactical.runCommand(choice - 1);
        } while (choice != 0);
    }

    @Override
    public void execute() {
        displayMenuTactical();
    }
}
