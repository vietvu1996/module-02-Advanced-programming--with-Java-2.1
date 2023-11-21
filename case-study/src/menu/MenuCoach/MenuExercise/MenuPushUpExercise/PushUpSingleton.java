package menu.MenuCoach.MenuExercise.MenuPushUpExercise;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PushUpSingleton implements Observer, GenerateId {
    private List<PushUpExercise> pushUpExerciseList;
    private static PushUpSingleton instance;
    private final MyFileHandler fileHandler;

    private PushUpSingleton(){
        fileHandler = new JsonMyFileHandler();
        Type PUSHUP_EXERCISE_TYPE = new TypeToken<ArrayList<PushUpExercise>>() {}.getType();
        this.pushUpExerciseList = (List<PushUpExercise>) fileHandler.readFromFile(Constants.PUSHUP_EXERCISE_PATH, PUSHUP_EXERCISE_TYPE);
        if(this.pushUpExerciseList == null){
            this.pushUpExerciseList = new ArrayList<>();
        }
    }

    public static PushUpSingleton getInstance(){
        if(instance == null){
            instance = new PushUpSingleton();
        }
        return instance;
    }

    public List<PushUpExercise> getPushUpExerciseList() {
        return pushUpExerciseList;
    }

    @Override
    public void update() {
        fileHandler.saveToFile(Constants.PUSHUP_EXERCISE_PATH, pushUpExerciseList);
        System.out.println("Push Up exercise list was updated successfully");
    }

    @Override
    public int generateId() {
        try {
            int max = 0;
            for (PushUpExercise pushUpExercise: pushUpExerciseList) {
                if (max < pushUpExercise.getId()) {
                    max = pushUpExercise.getId();
                }
            }
            return max + 1;
        } catch (NullPointerException e) {
            return 1;
        }
    }
}
