package menu.MenuChairman;

import constant.Constants;
import entity.Player;
import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;
import service.User.SingletonPlayerListManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandRemovePlayerFromPlayerList extends Subject implements Command {
    @Override
    public void execute() {
        try {
            Scanner SCANNER = new Scanner(System.in);
            SingletonPlayerListManagement.getInstance().displayPlayer();
            System.out.println("Input player line you want to remove");
            int choice = SCANNER.nextInt() - 1;
            Observer playerListObserver = SingletonPlayerListManagement.getInstance();
            Observer marketListObserver = TransferMarketSingleton.getInstance();
            addObserver(playerListObserver);
            addObserver(marketListObserver);
            Player removePlayer = SingletonPlayerListManagement.getInstance().removePlayer(choice);
            TransferMarketSingleton.getInstance().addPlayer(removePlayer);
            notifyObserver();
            Finance finance = new Finance();
            finance.addIncome(removePlayer.getSalary());

            removeObserver(playerListObserver);
            removeObserver(marketListObserver);
        } catch (IndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Invalid choice, please try again");
        }
    }

    public static void main(String[] args) {
        Command command = new CommandRemovePlayerFromPlayerList();
        command.execute();
    }
}
