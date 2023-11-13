package test;

import constant.Constants;
import entity.User;
import entity.PlayerFactory;
import entity.UserType;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.util.ArrayList;
import java.util.List;

public class PlayerTest {
    public static void main(String[] args) {
        MyFileHandler fileHandler = new JsonMyFileHandler();
        List<User> players = new ArrayList<>();
//        String username, String password, String fullName, String position, String dateOfBirth, String gender, String nationality, int height, int weight, boolean isLamasia, int tshirtNumber, int yearsContract, double salary
        PlayerFactory factory = new PlayerFactory();
        User user1 = factory.createUser(UserType.PLAYER, "David", "123", "David Villa","LW", "03/12/1981", "Male","Spain", 175, 68, false, 7, 3, 150000 );
        players.add(user1);
        User user2 = factory.createUser(UserType.PLAYER, "Pedro", "012", "Pedro Rodriguez","RW", "28/07/1987", "Male","Spain", 169, 67, true, 17, 5, 100000 );
        players.add(user2);
        User user3 = factory.createUser(UserType.PLAYER, "Leo", "321", "Lionel Messi","CF", "24/06/1987", "Male","Argentina", 170, 70, true, 10, 15, 300000 );
        players.add(user3);
        User user4 = factory.createUser(UserType.PLAYER, "Andreas", "1234", "Andreas Iniesta","LAM", "11/05/1984", "Male","Spain", 171, 71, true, 8, 15, 250000 );
        players.add(user4);
        User user5 = factory.createUser(UserType.PLAYER, "Xavi", "131", "Xavi Hernandez","CM", "25/01/1980", "Male","Spain", 171, 70, true, 6, 15, 280000 );
        players.add(user5);
        User user6 = factory.createUser(UserType.PLAYER, "Sergio", "212", "Sergio Busquets","CDM", "16/07/1988", "Male","Spain", 189, 76, true, 16, 15, 200000 );
        players.add(user6);
        User user7 = factory.createUser(UserType.PLAYER, "Eric", "123", "Eric Abidal","LB", "11/09/1979", "Male","France", 186, 78, false, 22, 6, 180000 );
        players.add(user7);
        User user8 = factory.createUser(UserType.PLAYER, "Gerard", "111", "Gerard Pique","CB", "02/02/1987", "Male","Spain", 194, 85, true, 3, 15, 200000 );
        players.add(user8);
        User user9 = factory.createUser(UserType.PLAYER, "Carles", "000", "Carles Puyol","CB", "13/04/1978", "Male","Spain", 178, 85, true, 5, 20, 200000 );
        players.add(user9);
        User user10 = factory.createUser(UserType.PLAYER, "Dani", "333", "Dani Alves","RWB", "06/05/1983", "Male","Spain", 172, 85, false, 2, 7, 155000 );
        players.add(user10);
        User user11 = factory.createUser(UserType.PLAYER, "Victor", "111", "Victor Valdes","GK", "14/01/1982", "Male","Spain", 183, 78, true, 1, 12, 190000 );
        players.add(user11);
        fileHandler.saveToFile(Constants.PLAYER_FILE_PATH, players);
    }
}
