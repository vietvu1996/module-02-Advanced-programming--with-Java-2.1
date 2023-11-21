package menu.MenuCoach.MenuExercise.MenuPushUpExercise;

import constant.Constants;
import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;
import service.GSON.JsonMyFileHandler;

import java.util.Scanner;

public class CommandRemovePushUpExercise extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println("Input exercise id");
        int id = SCANNER.nextInt();
        CurrentPushUpExercise.getInstance().setCurrentPushUpExercise(id);
// Check if the player exists in the list
        boolean exerciseExists = PushUpSingleton.getInstance().getPushUpExerciseList().stream().anyMatch(exercise -> exercise.getId() == id);

        if (exerciseExists) {
            PushUpSingleton.getInstance().getPushUpExerciseList().removeIf(exercise -> exercise.getId() == id);
            for (int i = 0; i < PushUpSingleton.getInstance().getPushUpExerciseList().size(); i++) {
                PushUpSingleton.getInstance().getPushUpExerciseList().get(i).setId(i + 1);
            }
            Observer observer = PushUpSingleton.getInstance();
            //addObserver(observer);
            notifyObserver();
            removeObserver(observer);
            // Update the JSON file
            JsonMyFileHandler fileHandler = new JsonMyFileHandler();
            fileHandler.saveToFile(Constants.PUSHUP_EXERCISE_PATH, PushUpSingleton.getInstance().getPushUpExerciseList());
            System.out.println("Your exercise was removed from the list successfully ");
        } else {
            System.out.println("No exercise found with the given id. ");
        }
    }
}
