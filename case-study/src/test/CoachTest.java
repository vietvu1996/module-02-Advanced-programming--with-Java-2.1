package test;

import constant.Constants;
import entity.Coach;
import entity.UserType;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.util.ArrayList;
import java.util.List;

public class CoachTest {
    public static void main(String[] args) {
        MyFileHandler fileHandler = new JsonMyFileHandler();
        List<Coach> coaches = new ArrayList<>();
        Coach coach = new Coach(UserType.COACH, "Pep","123","Pep Guardiola",52, "Spain", "18/01/1971", "Sextuple with Barcelona", 4, "Control and Pass the ball", 433, 5, 500000);
        coaches.add(coach);
        fileHandler.saveToFile(Constants.COACH_FILE_PATH,coaches);
    }
}
