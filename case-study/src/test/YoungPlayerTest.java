package test;

import constant.Constants;
import menu.MenuTechnicalDirector.YoungPlayer;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.util.ArrayList;
import java.util.List;

public class YoungPlayerTest {
    public static void main(String[] args) {
        List<YoungPlayer> youngPlayers = new ArrayList<>();
        youngPlayers.add(new YoungPlayer(1, "Pablo Gavi", 18, "CM", "Excellent"));
        youngPlayers.add(new YoungPlayer(2, "Lamine Yamal", 16, "RW", "Good"));
        youngPlayers.add(new YoungPlayer(3, "Marc Guiu", 18, "CM", "Good"));
        youngPlayers.add(new YoungPlayer(4, "Fermin López", 20, "CAM", "Normal"));
        youngPlayers.add(new YoungPlayer(5, "Pedri Gonzalez", 19, "CM", "Excellent"));
        MyFileHandler fileHandler = new JsonMyFileHandler();
        fileHandler.saveToFile(Constants.YOUNG_PLAYER_FILE_PATH, youngPlayers);
    }
}
