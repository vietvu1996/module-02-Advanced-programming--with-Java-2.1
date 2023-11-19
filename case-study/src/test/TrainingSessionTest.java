package test;

import constant.Constants;
import menu.MenuCoach.*;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.util.ArrayList;
import java.util.List;

public class TrainingSessionTest {
    public static void main(String[] args) {
        List<TrainingSession> trainingSessionList = new ArrayList<>();
        trainingSessionList.add(new PushUpExercise(1, "Push up Exercise", "Easy", 10));
        trainingSessionList.add(new PushUpExercise(2, "Push up Exercise", "Medium", 20));
        trainingSessionList.add(new RunningExercise(3, "Running Exercise", "Easy", 10));
        trainingSessionList.add(new RunningExercise(4, "Running Exercise", "Medium", 20));
        trainingSessionList.add(new ShootingExercise(5, "Shooting Exercise", "easy", 50));
        trainingSessionList.add(new PassingExercise(6, "Passing Exercise", "Hard", 80));
        trainingSessionList.add(new MovingExercise(7,"Moving Exercise", "Medium", "Normal"));
        trainingSessionList.add(new DribblingExercise(8, "Dribbling", "Hard", 90));

        MyFileHandler myFileHandler = new JsonMyFileHandler();
        myFileHandler.saveToFile(Constants.TRAINING_SESSION_PATH, trainingSessionList);
    }
}
