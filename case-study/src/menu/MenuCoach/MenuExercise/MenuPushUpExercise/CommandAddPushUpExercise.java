package menu.MenuCoach.MenuExercise.MenuPushUpExercise;

import menu.Command;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;

import java.util.Scanner;

public class CommandAddPushUpExercise extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        GenerateId generateId = PushUpSingleton.getInstance();
        int newId = generateId.generateId();
        System.out.println("Input exercise name ");
        String newName = SCANNER.nextLine();
        System.out.println("Input level of difficult ");
        String newLevel = SCANNER.nextLine();
        System.out.println("Input times: ");
        int newTimes = SCANNER.nextInt();

        PushUpExercise pushUpExercise= new PushUpExercise(newId, newName, newLevel, newTimes);

        PushUpSingleton.getInstance().getPushUpExerciseList().add(pushUpExercise);
        Observer observer = PushUpSingleton.getInstance();
        addObserver(observer);
        notifyObserver();
        removeObserver(observer);
    }
}
