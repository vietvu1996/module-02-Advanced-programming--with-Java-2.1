package test;

import constant.Constants;
import entity.ChampionShip;
import entity.Coach;
import service.FileHandler;
import service.JsonFileHandler;
import service.User.JsonMyFileHandler;
import service.User.MyFileHandler;

import java.util.ArrayList;
import java.util.List;

public class ChampionshipTest {
    public static void main(String[] args) {
        MyFileHandler fileHandler = new JsonMyFileHandler();
        List<ChampionShip> championShips = new ArrayList<>();
       ChampionShip championShip1 = new ChampionShip("domestic", "La Liga", 27);
       championShips.add(championShip1);
       ChampionShip championShip2 = new ChampionShip("domestic", "Copa del Rey", 31);
       championShips.add(championShip2);
       ChampionShip championShip3 = new ChampionShip("Europe", "UEFA Champions League", 5);
       championShips.add(championShip3);
       ChampionShip championShip4 = new ChampionShip("Europe", "UEFA Super Cup", 5);
       championShips.add(championShip4);
       ChampionShip championShip5 = new ChampionShip("World", "FIFA Club World Cup", 3);
       championShips.add(championShip5);
       fileHandler.saveToFile(Constants.CHAMPIONSHIP_FILE_PATH, championShips);
    }
}
