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
    private MyFileHandler fileHandler;
    private Type YOUNG_PLAYER_TYPE = new TypeToken<ArrayList<YoungPlayer>>() {
    }.getType();

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

    public void setYoungPlayers(List<YoungPlayer> youngPlayers) {
        this.youngPlayers = youngPlayers;
    }


    @Override
    public void update() {
        fileHandler.saveToFile(Constants.YOUNG_PLAYER_FILE_PATH, youngPlayers);
        System.out.println("Young player database updated successfully");
    }

    @Override
    public int generateId() {
        try {
            int max = 0;
            for (YoungPlayer youngPlayer : youngPlayers
            ) {
                if (max < youngPlayer.getId()) {
                    max = youngPlayer.getId();
                }
            }
            return max + 1;
        } catch (NullPointerException e) {
            return 1;
        }
    }
    //vao test

//    public void YoungTalentedInLaMasia(){
//        List<YoungPlayer> youngPlayers = new ArrayList<>();
//        youngPlayers.add(new YoungPlayer(1,"Pablo Gavi", 18, "CM", "Excellent"));
//        youngPlayers.add(new YoungPlayer(2, "Lamine Yamal", 16, "RW", "Good"));
//        youngPlayers.add(new YoungPlayer(3, "Marc Guiu", 18, "CM", "Good"));
//        youngPlayers.add(new YoungPlayer(4,"Fermin López", 20, "CAM", "Normal"));
//        youngPlayers.add(new YoungPlayer(5,"Pedri Gonzalez", 19, "CM", "Excellent"));
//    }


}
