package menu.MenuTechnicalDirector;

import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;

import java.util.Scanner;

public class CommandAddNewYoungPlayer extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
//    String name, int age, String position, String performance
    @Override
    public void execute() {
        GenerateId generateId = LaMasiaAcademySingleton.getInstance();
        int newId = generateId.generateId();
        System.out.println("Input young player name ");
        String newName = SCANNER.nextLine();
        System.out.println("Input young player age");
        int newAge = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("Input young player position");
        String newPosition = SCANNER.nextLine();
        System.out.println("Input young player performance");
        String newPerformance = SCANNER.nextLine();

        //factory
        YoungPlayer newPLayer = new YoungPlayer(newId, newName, newAge, newPosition, newPerformance);

        //update
        LaMasiaAcademySingleton.getInstance().getYoungPlayers().add(newPLayer);
        Observer observer = LaMasiaAcademySingleton.getInstance();
        addObserver(observer);
        notifyObserver();
        removeObserver(observer);
    }
}
