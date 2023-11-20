package test;

import constant.Constants;
import menu.MenuCoach.MenuExercise.RunningExercise;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.util.ArrayList;
import java.util.List;

public class RunningExerciseTest {
    public static void main(String[] args) {
        List<RunningExercise> runningExerciseList = new ArrayList<>();
        runningExerciseList.add(new RunningExercise(1, "Running", "Easy", 5));
        runningExerciseList.add(new RunningExercise(2, "Running", "Easy", 8));
        runningExerciseList.add(new RunningExercise(3, "Running", "Medium", 10));
        runningExerciseList.add(new RunningExercise(4, "Running", "Medium", 15));
        runningExerciseList.add(new RunningExercise(5, "Running", "Hard", 20));
        MyFileHandler fileHandler = new JsonMyFileHandler();
        fileHandler.saveToFile(Constants.RUNNING_EXERCISE_PATH, runningExerciseList);
    }
}
