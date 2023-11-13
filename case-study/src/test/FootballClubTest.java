package test;

import constant.Constants;
import entity.FootballClub;
import service.GSON.FileHandler;
import service.GSON.JsonFileHandler;

public class FootballClubTest {
    public static void main(String[] args) {
        FileHandler fileHandler = new JsonFileHandler();
        FootballClub footballClub = new FootballClub("Futbol Club Barcelona", "Barça", "Red and Blue", "Més que un club", "Spotify Camp Nou");
        fileHandler.saveToFile(Constants.FOOTBALLCLUB_FILE_PATH,footballClub);
    }
}
