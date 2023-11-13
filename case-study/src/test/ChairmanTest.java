package test;

import constant.Constants;
import entity.Chairman;
import entity.UserType;
import service.GSON.JsonSingleFileHandler;
import service.GSON.SingleFileHandler;

public class ChairmanTest {
    public static void main(String[] args) {
       SingleFileHandler fileHandler = new JsonSingleFileHandler();
        Chairman chairman = new Chairman(UserType.CHAIRMAN, "Joan", "567", "Joan Laporta i Estruch",61, "Male", "Lawyer" );
        fileHandler.saveToFile(Constants.CHAIRMAN_FILE_PATH, chairman);
    }
}
