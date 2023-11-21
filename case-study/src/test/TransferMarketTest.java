package test;

import constant.Constants;
import entity.Player;
import entity.PlayerFactory;
import entity.User;
import entity.UserType;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.util.ArrayList;
import java.util.List;

public class TransferMarketTest {
    public static void main(String[] args) {
        MyFileHandler fileHandler = new JsonMyFileHandler();
        List<Player> players = new ArrayList<>();
        PlayerFactory factory = new PlayerFactory();
        User user1 = factory.createUser(UserType.PLAYER, "David", "123", 1,"David Villa","LW", "03/12/1981", "Male","Spain", 175, 68, false, 7, 3, 150000 );
        players.add((Player) user1);
        User user2 = factory.createUser(UserType.PLAYER, "Pedro", "012", 2,"Pedro Rodriguez","RW", "28/07/1987", "Male","Spain", 169, 67, true, 17, 5, 100000 );
        players.add((Player) user2);
        fileHandler.saveToFile(Constants.TRANSFER_MARKET_PATH, players);
    }
}
