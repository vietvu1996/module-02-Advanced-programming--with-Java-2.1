package menu.MenuCoach.MenuExercise;

import constant.Constants;
import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;
import service.GSON.JsonMyFileHandler;

import java.util.Scanner;

public class CommandRemoveRunningExercise extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println("Input exercise id");
        int id = SCANNER.nextInt();
//set current young player
        CurrentRunningExercise.getInstance().setCurrentRunningExercise(id);
// Check if the player exists in the list
        boolean exerciseExists = RunningSingleton.getInstance().getRunningExerciseList().stream().anyMatch(exercise -> exercise.getId() == id);

        if (exerciseExists) {
            RunningSingleton.getInstance().getRunningExerciseList().removeIf(exercise -> exercise.getId() == id);
            for (int i = 0; i < RunningSingleton.getInstance().getRunningExerciseList().size(); i++) {
                RunningSingleton.getInstance().getRunningExerciseList().get(i).setId(i + 1);
            }
            Observer observer = RunningSingleton.getInstance();
            //addObserver(observer);
            notifyObserver();
            removeObserver(observer);
            // Update the JSON file
            JsonMyFileHandler fileHandler = new JsonMyFileHandler();
            fileHandler.saveToFile(Constants.RUNNING_EXERCISE_PATH, RunningSingleton.getInstance().getRunningExerciseList());
            System.out.println("Your exercise was removed from the list successfully ");
        } else {
            System.out.println("No exercise found with the given id.");
        }
    }
}
