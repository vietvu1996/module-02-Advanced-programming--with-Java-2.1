package test;

import constant.Constants;
import entity.AssistantCoach;
import entity.UserType;
import service.User.JsonSingleFileHandler;
import service.User.SingleFileHandler;

public class AssistantCoachTest {
    public static void main(String[] args) {
        SingleFileHandler fileHandler = new JsonSingleFileHandler();
        AssistantCoach assistant = new AssistantCoach(UserType.ASSISTANTCOACH, "Tito", "111", "Tito Vilanova", 45, "Spain", "17/09/1968", 5, 250000);
        fileHandler.saveToFile(Constants.ASSISTANTCOACH_FILE_PATH, assistant);
    }
}
