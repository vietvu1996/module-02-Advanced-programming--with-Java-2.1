package service.User;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import entity.Chairman;

import java.lang.reflect.Type;

public class SingletonChairmanManagement {
    private SingleFileHandler singleFileHandler;
    private Chairman chairman;
    private final Type CHAIRMANTYPE = new TypeToken<Chairman>(){}.getType();
    private static SingletonChairmanManagement instance;

    private SingletonChairmanManagement(){
        singleFileHandler = new JsonSingleFileHandler();
        this.chairman = (Chairman) singleFileHandler.readFromFile(Constants.CHAIRMAN_FILE_PATH,CHAIRMANTYPE);
    }

    public static SingletonChairmanManagement getInstance(){
        if(instance == null){
            instance = new SingletonChairmanManagement();
        }
        return instance;
    }

    public Chairman getChairman() {
        return chairman;
    }

    public void setChairman(Chairman chairman) {
        this.chairman = chairman;
    }
}
