package menu.MenuCoach;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TrainingSessionSingleton implements Observer, GenerateId {
    private List<TrainingSession> trainingSessionList;
    private static TrainingSessionSingleton instance;
    private final MyFileHandler fileHandler;
    private final Type TRAINING_SESSION_TYPE = new TypeToken<ArrayList<TrainingSession>>() {}.getType();

    private TrainingSessionSingleton() {
        fileHandler = new JsonMyFileHandler();
        this.trainingSessionList = (List<TrainingSession>) fileHandler.readFromFile(Constants.TRAINING_SESSION_PATH, TRAINING_SESSION_TYPE);
        if (this.trainingSessionList == null) {
            this.trainingSessionList = new ArrayList<>();
        }
    }

    public static TrainingSessionSingleton getInstance() {
        if (instance == null) {
            instance = new TrainingSessionSingleton();
        }
        return instance;
    }

    public List<TrainingSession> getTrainingSessionList() {
        return trainingSessionList;
    }

    public void setTrainingSessionList(List<TrainingSession> trainingSessionList) {
        this.trainingSessionList = trainingSessionList;
    }

    @Override
    public void update() {
        fileHandler.saveToFile(Constants.TRAINING_SESSION_PATH, trainingSessionList);
        System.out.println("Training Session List was updated successfully");
    }

    @Override
    public int generateId() {
        try {
            int max = 0;
            for (TrainingSession trainingSession : trainingSessionList) {
                if (max < trainingSession.getId()) {
                    max = trainingSession.getId();
                }
            }
            return max + 1;
        } catch (NullPointerException e) {
            return 1;
        }
    }
}
