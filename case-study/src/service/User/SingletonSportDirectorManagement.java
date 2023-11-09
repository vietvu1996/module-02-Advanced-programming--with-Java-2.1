package service.User;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import entity.SportDirector;

import java.lang.reflect.Type;

public class SingletonSportDirectorManagement {
    private SingleFileHandler singleFileHandler;
    private SportDirector sportDirector;
    private final Type SPORTDIRECTORTYPE = new TypeToken<SportDirector>() {
    }.getType();
    private static SingletonSportDirectorManagement instance;

    private SingletonSportDirectorManagement() {
        singleFileHandler = new JsonSingleFileHandler();
        this.sportDirector = (SportDirector) singleFileHandler.readFromFile(Constants.SPORTDIRECTOR_FILE_PATH, SPORTDIRECTORTYPE);
    }

    public static SingletonSportDirectorManagement getInstance() {
        if (instance == null) {
            instance = new SingletonSportDirectorManagement();
        }
        return instance;
    }

    public SportDirector getSportDirector() {
        return sportDirector;
    }

    public void setSportDirector(SportDirector sportDirector) {
        this.sportDirector = sportDirector;
    }
}
