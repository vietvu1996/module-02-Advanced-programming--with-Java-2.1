package service;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import entity.Stadium;

import java.lang.reflect.Type;

public class SingletonStadiumManagement {
    private Stadium stadium;
    private FileHandler fileHandler;
    private static SingletonStadiumManagement instance;
    private final Type STADIUMTYPE = new TypeToken<Stadium>() {
    }.getType();

    public static SingletonStadiumManagement getInstance() {
        if (instance == null) {
            instance = new SingletonStadiumManagement();
        }
        return instance;
    }

    public SingletonStadiumManagement(){
        fileHandler = new JsonFileHandler();
        this.stadium = (Stadium) fileHandler.readFromFile(Constants.STADIUM_FILE_PATH, STADIUMTYPE);
    }
    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }
}
