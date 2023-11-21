package menu.MenuCoach.MenuExercise.MenuRunningExercise;

import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;

import java.util.Scanner;

public class CommandChangeRunningExercise extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        System.out.println("Input exercise id");
        int id = SCANNER.nextInt();
        //set current young player
        CurrentRunningExercise.getInstance().setCurrentRunningExercise(id);
        SCANNER.nextLine();
        System.out.println("Input exercise new level difficult");
        String newLevel = SCANNER.nextLine();
        System.out.println("Input exercise new laps");
        int newLaps = SCANNER.nextInt();
        //update
        CurrentRunningExercise.getInstance().getCurrentRunningExercise().setLevelOfDifficult(newLevel);
        CurrentRunningExercise.getInstance().getCurrentRunningExercise().setLaps(newLaps);
        Observer observer = RunningSingleton.getInstance();
        addObserver(observer);
        notifyObserver();
        removeObserver(observer);
    }
}
