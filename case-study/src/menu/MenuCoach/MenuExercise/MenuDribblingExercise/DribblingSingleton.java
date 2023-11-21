package menu.MenuCoach.MenuExercise.MenuDribblingExercise;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DribblingSingleton implements Observer, GenerateId {
    private List<DribblingExercise> dribblingExerciseList;
    private static DribblingSingleton instance;
    private final MyFileHandler fileHandler;

    private DribblingSingleton(){
        fileHandler = new JsonMyFileHandler();
        Type DRIBBLINGTYPE = new TypeToken<ArrayList<DribblingExercise>>(){}.getType();
        this.dribblingExerciseList = (List<DribblingExercise>) fileHandler.readFromFile(Constants.DRIBBLING_EXERCISE_FILE_PATH, DRIBBLINGTYPE);
        if(this.dribblingExerciseList == null){
            this.dribblingExerciseList = new ArrayList<>();
        }
    }

    public static DribblingSingleton getInstance(){
        if(instance == null){
            instance = new DribblingSingleton();
        }
        return instance;
    }

    public List<DribblingExercise> getDribblingExerciseList() {
        return dribblingExerciseList;
    }

    @Override
    public int generateId() {
        try {
            int max = 0;
            for (DribblingExercise dribblingExercise : dribblingExerciseList) {
                if(max < dribblingExercise.getId()){
                    max = dribblingExercise.getId();
                }
            }
            return max + 1;
        } catch (NullPointerException e){
            return 1;
        }
    }

    @Override
    public void update() {
        fileHandler.saveToFile(Constants.DRIBBLING_EXERCISE_FILE_PATH, dribblingExerciseList);
        System.out.println("Push Up Exercise was updated successfully");
    }
}
