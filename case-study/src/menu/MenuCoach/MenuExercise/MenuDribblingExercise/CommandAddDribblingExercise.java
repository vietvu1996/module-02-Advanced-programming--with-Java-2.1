package menu.MenuCoach.MenuExercise.MenuDribblingExercise;

import menu.Command;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;

import java.util.Scanner;

public class CommandAddDribblingExercise extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        GenerateId generateId = DribblingSingleton.getInstance();
        int newId = generateId.generateId();
        System.out.println("Input exercise name: ");
        String newName = SCANNER.nextLine();
        System.out.println("Input new level difficult: ");
        String newDifficult = SCANNER.nextLine();
        System.out.println("Input new accuracy");
        double newSuccessRate = SCANNER.nextInt();

        DribblingExercise dribblingExercise = new DribblingExercise(newId, newName, newDifficult, newSuccessRate);

        DribblingSingleton.getInstance().getDribblingExerciseList().add(dribblingExercise);
        Observer observer = DribblingSingleton.getInstance();
        addObserver(observer);
        notifyObserver();
        removeObserver(observer);
    }
}
