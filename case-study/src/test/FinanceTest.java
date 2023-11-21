package test;

import constant.Constants;
import menu.MenuChairman.Finance;
import service.GSON.FileHandler;
import service.GSON.JsonFileHandler;

public class FinanceTest {
    public static void main(String[] args) {
        FileHandler fileHandler = new JsonFileHandler();
        Finance finance = new Finance(2000000, 0, 0, 1000000, 1000000);
        fileHandler.saveToFile(Constants.FINANCE_FILE_PATH, finance);
    }
}
