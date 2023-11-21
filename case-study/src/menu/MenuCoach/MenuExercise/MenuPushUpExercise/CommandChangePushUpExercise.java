package menu.MenuCoach.MenuExercise.MenuPushUpExercise;

import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;

import java.util.Scanner;

public class CommandChangePushUpExercise extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        System.out.println("Input exercise id");
        int id = SCANNER.nextInt();
        CurrentPushUpExercise.getInstance().setCurrentPushUpExercise(id);
        SCANNER.nextLine();
        System.out.println("Input exercise new level difficult");
        String newLevel = SCANNER.nextLine();
        System.out.println("Input exercise new times");
        int newTimes = SCANNER.nextInt();
        //update
        CurrentPushUpExercise.getInstance().getCurrentPushUpExercise().setLevelOfDifficult(newLevel);
        CurrentPushUpExercise.getInstance().getCurrentPushUpExercise().setTimes(newTimes);
        Observer observer = PushUpSingleton.getInstance();
        addObserver(observer);
        notifyObserver();
        removeObserver(observer);
    }
}
