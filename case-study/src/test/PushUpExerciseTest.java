package test;

import constant.Constants;
import menu.MenuCoach.MenuExercise.MenuPushUpExercise.PushUpExercise;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.util.ArrayList;
import java.util.List;

public class PushUpExerciseTest {
    public static void main(String[] args) {
        List<PushUpExercise> pushUpExerciseList = new ArrayList<>();
        pushUpExerciseList.add(new PushUpExercise(1, "Push Up", "Easy", 5));
        pushUpExerciseList.add(new PushUpExercise(2, "Push Up", "Easy", 10));
        pushUpExerciseList.add(new PushUpExercise(3, "Push Up", "Medium", 10));
        pushUpExerciseList.add(new PushUpExercise(4, "Push Up", "Medium", 15));
        pushUpExerciseList.add(new PushUpExercise(5, "Push Up", "Hard", 20));
        MyFileHandler fileHandler = new JsonMyFileHandler();
        fileHandler.saveToFile(Constants.PUSHUP_EXERCISE_PATH, pushUpExerciseList);
    }
}
