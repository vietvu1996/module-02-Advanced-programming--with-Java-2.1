package menu.MenuChairman;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import service.GSON.FileHandler;
import service.GSON.JsonFileHandler;

import java.lang.reflect.Type;

public class FinancialManagement{
    private FileHandler fileHandler;
    private final Finance finance;
    private final Type FINANCETYPE = new TypeToken<Finance>(){}.getType();
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
}
