package test;

import constant.Constants;
import entity.Stadium;
import service.GSON.FileHandler;
import service.GSON.JsonFileHandler;

public class StadiumTest {
    public static void main(String[] args) {
        FileHandler fileHandler = new JsonFileHandler();
        Stadium stadium = new Stadium("Spotify Camp Nou", 100000, "C/ d'Arístides Maillol, 12, 08028 Barcelona", "Més que un club");
        fileHandler.saveToFile(Constants.STADIUM_FILE_PATH, stadium) ;
    }
}
