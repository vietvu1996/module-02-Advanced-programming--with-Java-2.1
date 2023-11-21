package menu.MenuCoach.MenuExercise.MenuRunningExercise;

import menu.Command;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;

import java.util.Scanner;

public class CommandAddRunningExercise extends Subject implements Command {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        GenerateId generateId = RunningSingleton.getInstance();
        int newId = generateId.generateId();
        System.out.println("Input exercise name ");
        String newName = scanner.nextLine();
        System.out.println("Input level of difficult ");
        String newLevel = scanner.nextLine();
        System.out.println("Input laps: ");
        int newLaps = scanner.nextInt();

        RunningExercise runningExercise = new RunningExercise(newId, newName, newLevel, newLaps);

        RunningSingleton.getInstance().getRunningExerciseList().add(runningExercise);
        Observer observer = RunningSingleton.getInstance();
        addObserver(observer);
        notifyObserver();
        removeObserver(observer);
    }
}