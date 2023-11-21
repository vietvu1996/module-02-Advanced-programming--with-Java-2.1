package test;

import constant.Constants;
import menu.MenuCoach.MenuExercise.MenuDribblingExercise.DribblingExercise;
import menu.MenuCoach.MenuExercise.MenuRunningExercise.RunningExercise;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.util.ArrayList;
import java.util.List;

public class DribblingTest {
    public static void main(String[] args) {
        List<DribblingExercise> dribbingExerciseList = new ArrayList<>();
        dribbingExerciseList.add(new DribblingExercise(1, "Dribbling", "Easy", 20));
        dribbingExerciseList.add(new DribblingExercise(2, "Dribbling", "Easy", 30));
        dribbingExerciseList.add(new DribblingExercise(3, "Dribbling", "Medium", 50));
        dribbingExerciseList.add(new DribblingExercise(4, "Dribbling", "Hard", 80));
        dribbingExerciseList.add(new DribblingExercise(5, "Dribbling", "Hard", 100));
        MyFileHandler fileHandler = new JsonMyFileHandler();
        fileHandler.saveToFile(Constants.DRIBBLING_EXERCISE_FILE_PATH, dribbingExerciseList);
    }
}
