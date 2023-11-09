package service.User;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import entity.Coach;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SingletonCoachManagement {
    private List<Coach> coaches;
    private MyFileHandler fileHandler;
    private final Type COACHTYPE = new TypeToken<ArrayList<Coach>>(){}.getType();
    private static SingletonCoachManagement instance;
    private SingletonCoachManagement(){
        fileHandler = new JsonMyFileHandler();
        this.coaches = (ArrayList<Coach>) fileHandler.readFromFile(Constants.COACH_FILE_PATH, COACHTYPE);
    }

    public static SingletonCoachManagement getInstance(){
        if(instance == null){
            instance = new SingletonCoachManagement();
        }
        return instance;
    }

    public List<Coach> getCoaches() {
        return coaches;
    }
    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }
}
