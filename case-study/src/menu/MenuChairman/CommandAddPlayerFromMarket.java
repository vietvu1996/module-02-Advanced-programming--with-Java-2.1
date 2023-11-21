package menu.MenuChairman;

import entity.Player;
import menu.Command;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;
import service.User.SingletonPlayerListManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandAddPlayerFromMarket extends Subject implements Command {
    @Override
    public void execute() {
        try {
            Scanner SCANNER = new Scanner(System.in);
            TransferMarketSingleton.getInstance().displayPlayer();
            System.out.println("Input player line you want to add");
            int choice = SCANNER.nextInt() - 1;
            Observer playerListObserver = SingletonPlayerListManagement.getInstance();
            Observer marketListObserver = TransferMarketSingleton.getInstance();
            addObserver(playerListObserver);
            addObserver(marketListObserver);
            Player playerAdd = TransferMarketSingleton.getInstance().removePlayer(choice);
            GenerateId generateId = SingletonPlayerListManagement.getInstance();
            playerAdd.setId(generateId.generateId());
            SingletonPlayerListManagement.getInstance().addPlayer(playerAdd);

            notifyObserver();
            //remove budget
            Finance finance = new Finance();
            finance.manageFinance(playerAdd.getSalary());

            removeObserver(playerListObserver);
            removeObserver(marketListObserver);
        } catch (IndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Invalid choice, please try again");
        }
    }

    public static void main(String[] args) {
        Command command = new CommandAddPlayerFromMarket();
        command.execute();
    }
}
