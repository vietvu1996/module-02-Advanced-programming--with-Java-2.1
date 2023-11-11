package service.User;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import entity.Player;
import service.ChangeandUpdate.Observer;
import service.JsonMyFileHandler;
import service.MyFileHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SingletonPlayerListManagement implements Observer {
    private List<Player> player;
    private final MyFileHandler fileHandler;
    private final Type PLAYERTYPE = new TypeToken<ArrayList<Player>>() {
    }.getType();

    private static SingletonPlayerListManagement instance;

    private SingletonPlayerListManagement() {
        fileHandler = new JsonMyFileHandler();
        this.player = (ArrayList<Player>) fileHandler.readFromFile(Constants.PLAYER_FILE_PATH, PLAYERTYPE);
    }

    public static SingletonPlayerListManagement getInstance() {
        if (instance == null) {
            instance = new SingletonPlayerListManagement();
        }
        return instance;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    @Override
    public void update() {
        fileHandler.saveToFile(Constants.PLAYER_FILE_PATH, player);
        System.out.println("Update successfully");
    }
}
