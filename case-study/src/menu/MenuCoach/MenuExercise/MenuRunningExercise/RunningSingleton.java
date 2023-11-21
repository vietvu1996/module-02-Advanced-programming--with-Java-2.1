package menu.MenuCoach.MenuExercise.MenuRunningExercise;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class RunningSingleton implements Observer, GenerateId {
    private List<RunningExercise> runningExerciseList;
    private static RunningSingleton instance;
    private final MyFileHandler fileHandler;
    private final Type RUNNING_EXERCISE_TYPE = new TypeToken<ArrayList<RunningExercise>>() {}.getType();

    private RunningSingleton() {
        fileHandler = new JsonMyFileHandler();
        this.runningExerciseList = (List<RunningExercise>) fileHandler.readFromFile(Constants.RUNNING_EXERCISE_PATH, RUNNING_EXERCISE_TYPE);
        if (this.runningExerciseList == null) {
            this.runningExerciseList = new ArrayList<>();
        }
    }

    public static RunningSingleton getInstance() {
        if (instance == null) {
            instance = new RunningSingleton();
        }
        return instance;
    }

    public List<RunningExercise> getRunningExerciseList() {
        return runningExerciseList;
    }

    @Override
    public void update() {
        fileHandler.saveToFile(Constants.RUNNING_EXERCISE_PATH, runningExerciseList);
        System.out.println("Running Exercise List was updated successfully");
    }

    @Override
    public int generateId() {
        try {
            int max = 0;
            for (RunningExercise runningExercise : runningExerciseList) {
                if (max < runningExercise.getId()) {
                    max = runningExercise.getId();
                }
            }
            return max + 1;
        } catch (NullPointerException e) {
            return 1;
        }
    }
}
