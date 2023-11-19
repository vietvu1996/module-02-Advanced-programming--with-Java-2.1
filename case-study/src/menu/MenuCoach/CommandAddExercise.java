package menu.MenuCoach;

import menu.Command;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;

import java.util.Scanner;

public class CommandAddExercise extends Subject implements Command {
    private final Scanner scanner = new Scanner(System.in);
    @Override
    public void execute() {
        GenerateId generateId = TrainingSessionSingleton.getInstance();
        int newId = generateId.generateId();
        System.out.println("Input name exercise: ");
        String newNameExercise = scanner.nextLine();
        System.out.println("Input level difficult: ");
        String newLevelDifficult = scanner.nextLine();
//        System.out.println("Input laps: ");
//        int newLaps = scanner.nextInt();

        TrainingSession trainingSession = new TrainingSession(newId, newNameExercise, newLevelDifficult);

        TrainingSessionSingleton.getInstance().getTrainingSessionList().add(trainingSession);
        Observer observer = TrainingSessionSingleton.getInstance();
        addObserver(observer);
        notifyObserver();
        removeObserver(observer);
    }
}
