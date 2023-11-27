package menu.MenuChairman;

import entity.Player;
import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;
import service.User.SingletonPlayerListManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandPaySalaryForPlayer extends Subject implements Command{
    @Override
    public void execute() {
        try {
            Scanner SCANNER = new Scanner(System.in);
            SingletonPlayerListManagement.getInstance().displayPlayer();
            System.out.println("Input player line you want to pay");
            int choice = SCANNER.nextInt() - 1;
            Observer financeManagement = FinancialManagement.getInstance();
            addObserver(financeManagement);
            Player player = SingletonPlayerListManagement.getInstance().getPlayers().get(choice);
            FinancialManagement.getInstance().getFinance().paySalary(player.getSalary());

            notifyObserver();

            removeObserver(financeManagement);
        } catch (IndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Invalid choice, please try again");
        }
    }

    public static void main(String[] args) {
        Command command = new CommandPaySalaryForPlayer();
        command.execute();
    }
}
