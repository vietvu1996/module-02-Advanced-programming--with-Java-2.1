package menu.MenuChairman;

import entity.Player;
import menu.Command;
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
            Observer financeManagement = FinancialManagement.getInstance();
            Observer playerListObserver = SingletonPlayerListManagement.getInstance();
            Observer marketListObserver = TransferMarketSingleton.getInstance();
            addObserver(financeManagement);
            addObserver(playerListObserver);
            addObserver(marketListObserver);
            Player playerAdd = TransferMarketSingleton.getInstance().removePlayer(choice);
            SingletonPlayerListManagement.getInstance().addPlayer(playerAdd);
            FinancialManagement.getInstance().getFinance().addTransferBudget(playerAdd.getSalary());

            notifyObserver();
            removeAll();
        } catch (IndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Invalid choice, please try again");
        }
    }

    public static void main(String[] args) {
        Command command = new CommandAddPlayerFromMarket();
        command.execute();
    }
}
