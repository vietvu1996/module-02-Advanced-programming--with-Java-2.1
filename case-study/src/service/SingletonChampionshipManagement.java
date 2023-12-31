package service;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import entity.ChampionShip;
import service.ChangeandUpdate.Observer;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SingletonChampionshipManagement implements Observer {
    private final List<ChampionShip>  championShips;
    private final MyFileHandler fileHandler;
    private final Type CHAMPIONSHIPTYPE = new TypeToken<ArrayList<ChampionShip>>(){}.getType();
    private static SingletonChampionshipManagement instance;

    private SingletonChampionshipManagement(){
        fileHandler = new JsonMyFileHandler();
        this.championShips = (ArrayList<ChampionShip>) fileHandler.readFromFile(Constants.CHAMPIONSHIP_FILE_PATH, CHAMPIONSHIPTYPE);
    }
    public static SingletonChampionshipManagement getInstance(){
        if(instance == null){
            instance = new SingletonChampionshipManagement();
        }
        return instance;
    }

    public List<ChampionShip> getChampionShips() {
        return championShips;
    }

    @Override
    public void update() {
        fileHandler.saveToFile(Constants.PLAYER_FILE_PATH, championShips);
        System.out.println("Update successfully");
    }
}
