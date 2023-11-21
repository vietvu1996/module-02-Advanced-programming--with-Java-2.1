package menu.MenuCoach.MenuExercise.MenuDribblingExercise;

import constant.Constants;
import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;
import service.GSON.JsonMyFileHandler;

import java.util.Scanner;

public class CommandRemoveDribblingExercise extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println("Input exercise id");
        int id = SCANNER.nextInt();
        CurrentDribblingExercise.getInstance().setCurrentDribblingExercise(id);
// Check if the player exists in the list
        boolean exerciseExists = DribblingSingleton.getInstance().getDribblingExerciseList().stream().anyMatch(exercise -> exercise.getId() == id);

        if (exerciseExists) {
            DribblingSingleton.getInstance().getDribblingExerciseList().removeIf(exercise -> exercise.getId() == id);
            for (int i = 0; i < DribblingSingleton.getInstance().getDribblingExerciseList().size(); i++) {
                DribblingSingleton.getInstance().getDribblingExerciseList().get(i).setId(i + 1);
            }
            Observer observer = DribblingSingleton.getInstance();
            notifyObserver();
            removeObserver(observer);
            // Update the JSON file
            JsonMyFileHandler fileHandler = new JsonMyFileHandler();
            fileHandler.saveToFile(Constants.DRIBBLING_EXERCISE_FILE_PATH, DribblingSingleton.getInstance().getDribblingExerciseList());
            System.out.println("Your exercise was removed from the list successfully ");
        } else {
            System.out.println("No exercise found with the given id. ");
        }
    }
}
