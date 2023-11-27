package menu.MenuTechnicalDirector;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import service.ChangeandUpdate.Observer;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class LaMasiaAcademySingleton implements Observer, GenerateId {
    private List<YoungPlayer> youngPlayers;
    private static LaMasiaAcademySingleton instance;
    private final MyFileHandler fileHandler;
    private final Type YOUNG_PLAYER_TYPE = new TypeToken<ArrayList<YoungPlayer>>() {}.getType();

    private LaMasiaAcademySingleton() {
        fileHandler = new JsonMyFileHandler();
        this.youngPlayers = (List<YoungPlayer>) fileHandler.readFromFile(Constants.YOUNG_PLAYER_FILE_PATH, YOUNG_PLAYER_TYPE);
        if (this.youngPlayers == null) {
            this.youngPlayers = new ArrayList<>();
        }
    }

    public static LaMasiaAcademySingleton getInstance() {
        if (instance == null) {
            instance = new LaMasiaAcademySingleton();
        }
        return instance;
    }

    public List<YoungPlayer> getYoungPlayers() {
        return youngPlayers;
    }

    @Override
    public void update() {
        fileHandler.saveToFile(Constants.YOUNG_PLAYER_FILE_PATH, youngPlayers);
        System.out.println("Young player list was updated successfully");
    }

    @Override
    public int generateId() {
        try {
            int max = 0;
            for (YoungPlayer youngPlayer : youngPlayers) {
                if (max < youngPlayer.getId()) {
                    max = youngPlayer.getId();
                }
            }
            return max + 1;
        } catch (NullPointerException e) {
            return 1;
        }
    }
}
