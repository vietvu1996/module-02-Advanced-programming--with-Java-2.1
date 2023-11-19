package menu.MenuCoach.PlayerManagement;

import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;
import service.User.SingletonCurrentPlayer;
import service.User.SingletonPlayerListManagement;

import java.util.Scanner;

public class CommandChangeCurrentPlayer extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        System.out.println("Input player ID");
        int id = SCANNER.nextInt();
        SingletonCurrentPlayer.getInstance().setCurrentPlayer(id);
        System.out.println("Input player name ");
        String newName = SCANNER.nextLine();
        System.out.println("Input player dateOfBirth");
        String newDateOfBirth = SCANNER.nextLine();
        SCANNER.nextLine();
        System.out.println("Input young player position");
        String newPosition = SCANNER.nextLine();
        System.out.println("Input player nationality");
        String newNationality = SCANNER.nextLine();
        System.out.println("Input player height");
        double newHeight = SCANNER.nextDouble();
        System.out.println("Input player weight");
        double newWeight = SCANNER.nextDouble();
        System.out.println("Is player from La Masia or not");
        boolean isLaMasia = SCANNER.nextBoolean();
        System.out.println("Input player T-shirt Number");
        int newTShirtNumber = SCANNER.nextInt();

        SingletonCurrentPlayer.getInstance().getCurrentPlayer().setFullName(newName);
        SingletonCurrentPlayer.getInstance().getCurrentPlayer().setDateOfBirth(newDateOfBirth);
        SingletonCurrentPlayer.getInstance().getCurrentPlayer().setPosition(newPosition);
        SingletonCurrentPlayer.getInstance().getCurrentPlayer().setNationality(newNationality);
        SingletonCurrentPlayer.getInstance().getCurrentPlayer().setHeight(newHeight);
        SingletonCurrentPlayer.getInstance().getCurrentPlayer().setWeight(newWeight);
        SingletonCurrentPlayer.getInstance().getCurrentPlayer().setLamasia(isLaMasia);
        SingletonCurrentPlayer.getInstance().getCurrentPlayer().setTshirtNumber(newTShirtNumber);

        Observer observer = SingletonPlayerListManagement.getInstance();
        addObserver(observer);
        notifyObserver();
        removeObserver(observer);
    }
}
