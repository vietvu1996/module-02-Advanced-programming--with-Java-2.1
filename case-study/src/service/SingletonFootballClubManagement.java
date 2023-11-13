package service;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import entity.FootballClub;
import service.GSON.FileHandler;
import service.GSON.JsonFileHandler;

import java.lang.reflect.Type;

public class SingletonFootballClubManagement {
    private FootballClub footballClub;
    private FileHandler fileHandler;
    private static SingletonFootballClubManagement instance;
    private final Type FOOTBALLCLUBTYPE = new TypeToken<FootballClub>(){}.getType();

    public static SingletonFootballClubManagement getInstance(){
        if(instance == null){
            instance = new SingletonFootballClubManagement();
        }
        return instance;
    }

    public SingletonFootballClubManagement(){
        fileHandler = new JsonFileHandler();
        this.footballClub = (FootballClub) fileHandler.readFromFile(Constants.FOOTBALLCLUB_FILE_PATH, FOOTBALLCLUBTYPE);
    }

    public FootballClub getFootballClub() {
        return footballClub;
    }

    public void setFootballClub(FootballClub footballClub) {
        this.footballClub = footballClub;
    }
}
