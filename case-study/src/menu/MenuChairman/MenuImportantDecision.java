package menu.MenuChairman;

import menu.Command;
import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import service.chainLogin.ExitCommand;

import java.util.Scanner;

public class MenuImportantDecision implements Command {
    private final Scanner SCANNER = new Scanner(System.in);

    public MenuImportantDecision(){}

    private void displayMenuImportantDecision(){
        Menu menuImportantDecision = new MenuMain();
        menuImportantDecision.addMenuItem(new MenuItem("Buy Player", new CommandAddPlayerFromMarket()));
        menuImportantDecision.addMenuItem(new MenuItem("Sell Player", new CommandRemovePlayerFromPlayerList()));
        menuImportantDecision.addMenuItem(new MenuItem("Pay salary for player", new CommandPaySalaryForPlayer()));
        menuImportantDecision.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        do {
            menuImportantDecision.display();
            choice = SCANNER.nextInt();
            menuImportantDecision.runCommand(choice - 1);
        } while (choice != 0);
    }
    @Override
    public void execute() {
      displayMenuImportantDecision();
    }
}
