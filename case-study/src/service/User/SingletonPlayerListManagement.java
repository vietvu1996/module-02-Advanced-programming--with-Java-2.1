package service.User;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import entity.Player;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SingletonPlayerListManagement implements Observer, GenerateId {
    private List<Player> players;
    private final MyFileHandler fileHandler;
    private final Type PLAYERTYPE = new TypeToken<ArrayList<Player>>() {
    }.getType();

    private static SingletonPlayerListManagement instance;

    private SingletonPlayerListManagement() {
        fileHandler = new JsonMyFileHandler();
        this.players = (ArrayList<Player>) fileHandler.readFromFile(Constants.PLAYER_FILE_PATH, PLAYERTYPE);
        if (this.players == null) {
            this.players = new ArrayList<>();
        }
    }

    public static SingletonPlayerListManagement getInstance() {
        if (instance == null) {
            instance = new SingletonPlayerListManagement();
        }
        return instance;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player removePlayer(int choice) {
        return players.remove(choice);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void displayPlayer() {
        for (int i = 0; i < players.size(); i++) {
            System.out.println((i + 1) + ". " + players.get(i).toString());
        }
    }

    @Override
    public void update() {
        fileHandler.saveToFile(Constants.PLAYER_FILE_PATH, players);
        System.out.println("Player list was updated successfully");
    }

    @Override
    public int generateId() {
        try {
            int max = 0;
            for (Player player : players) {
                if (max < player.getId()) {
                    max = player.getId();
                }
            }
            return max + 1;
        } catch (NullPointerException e) {
            return 1;
        }
    }
}
