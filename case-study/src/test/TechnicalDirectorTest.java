package test;

import constant.Constants;
import entity.TechnicalDirector;
import entity.UserType;
import service.GSON.JsonSingleFileHandler;
import service.GSON.SingleFileHandler;

public class TechnicalDirectorTest {
    public static void main(String[] args) {
        SingleFileHandler fileHandler = new JsonSingleFileHandler();
        TechnicalDirector technicalDirector = new TechnicalDirector(UserType.TECHNICALDIRECTOR, "Ramon", "777", "Ramón Planes Novau", 56, "Male", "Technical Assistant", 3, 200000);
        fileHandler.saveToFile(Constants.TECHNICALDIRECTOR_FILE_PATH, technicalDirector);
    }
}
