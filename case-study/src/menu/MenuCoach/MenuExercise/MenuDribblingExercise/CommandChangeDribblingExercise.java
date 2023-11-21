package menu.MenuCoach.MenuExercise.MenuDribblingExercise;

import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;

import java.util.Scanner;

public class CommandChangeDribblingExercise extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        System.out.println("Input exercise id");
        int id = SCANNER.nextInt();
        CurrentDribblingExercise.getInstance().setCurrentDribblingExercise(id);
        SCANNER.nextLine();
        System.out.println("Input exercise new level difficult");
        String newLevel = SCANNER.nextLine();
        System.out.println("Input exercise new times");
        double newSuccessRate = SCANNER.nextDouble();
        //update
        CurrentDribblingExercise.getInstance().getDribblingExercise().setLevelOfDifficult(newLevel);
        CurrentDribblingExercise.getInstance().getDribblingExercise().setSuccessRate(newSuccessRate);
        Observer observer = DribblingSingleton.getInstance();
        addObserver(observer);
        notifyObserver();
        removeObserver(observer);
    }
}
