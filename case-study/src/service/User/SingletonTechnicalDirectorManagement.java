package service.User;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import entity.TechnicalDirector;
import service.GSON.JsonSingleFileHandler;
import service.GSON.SingleFileHandler;

import java.lang.reflect.Type;

public class SingletonTechnicalDirectorManagement {
    private SingleFileHandler fileHandler;
    private TechnicalDirector technicalDirector;
    private final Type TECHNICALDIRECTORTYPE = new TypeToken<TechnicalDirector>() {}.getType();
    private static SingletonTechnicalDirectorManagement instance;

    private SingletonTechnicalDirectorManagement() {
        fileHandler = new JsonSingleFileHandler();
        this.technicalDirector = (TechnicalDirector) fileHandler.readFromFile(Constants.TECHNICALDIRECTOR_FILE_PATH, TECHNICALDIRECTORTYPE);
    }

    public static SingletonTechnicalDirectorManagement getInstance() {
        if (instance == null) {
            instance = new SingletonTechnicalDirectorManagement();
        }
        return instance;
    }

    public TechnicalDirector getTechnicalDirector() {
        return technicalDirector;
    }

    public void setTechnicalDirector(TechnicalDirector technicalDirector) {
        this.technicalDirector = technicalDirector;
    }
}
