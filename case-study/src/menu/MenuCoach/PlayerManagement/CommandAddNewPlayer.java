package menu.MenuCoach.PlayerManagement;

import entity.Player;
import menu.Command;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;
import service.User.SingletonPlayerListManagement;

import java.util.Scanner;

public class CommandAddNewPlayer extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        GenerateId generateId = SingletonPlayerListManagement.getInstance();
        int newId = generateId.generateId();
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

        Player newPlayer = new Player(newId, newName, newDateOfBirth, newPosition, newNationality, newHeight, newWeight, isLaMasia, newTShirtNumber);

        SingletonPlayerListManagement.getInstance().getPlayers().add(newPlayer);
        Observer observer = SingletonPlayerListManagement.getInstance();
        addObserver(observer);
        notifyObserver();
        removeObserver(observer);
    }
}
