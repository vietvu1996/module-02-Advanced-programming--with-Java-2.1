package test;

import constant.Constants;
import entity.TechnicalDirector;
import entity.UserType;
import service.User.JsonSingleFileHandler;
import service.User.SingleFileHandler;

public class TechnicalDirectorTest {
    public static void main(String[] args) {
        SingleFileHandler fileHandler = new JsonSingleFileHandler();
        TechnicalDirector technicalDirector = new TechnicalDirector(UserType.TECHNICALDIRECTOR, "Ramón", "011", "Ramón Planes Novau", 56, "Male", "Technical Assistant", 3, 200000);
        fileHandler.saveToFile(Constants.TECHNICALDIRECTOR_FILE_PATH, technicalDirector);
    }
}
