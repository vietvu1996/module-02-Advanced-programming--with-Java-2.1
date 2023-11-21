package menu.MenuChairman;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import service.ChangeandUpdate.Observer;
import service.GSON.FileHandler;
import service.GSON.JsonFileHandler;

import java.lang.reflect.Type;

public class FinancialManagement implements Observer {
    private FileHandler fileHandler;
    private Finance finance;
    private Type FINANCETYPE = new TypeToken<Finance>(){}.getType();
    private static FinancialManagement instance;

    private FinancialManagement(){
        fileHandler = new JsonFileHandler();
        this.finance = (Finance) fileHandler.readFromFile(Constants.FINANCE_FILE_PATH, FINANCETYPE);
    }

    public static FinancialManagement getInstance(){
        if(instance == null){
            instance = new FinancialManagement();
        }
        return instance;
    }

    public Finance getFinance() {
        return finance;
    }

    @Override
    public void update() {
        fileHandler.saveToFile(Constants.FINANCE_FILE_PATH, finance);
        System.out.println("Your finance was updated successfully");
    }
}
