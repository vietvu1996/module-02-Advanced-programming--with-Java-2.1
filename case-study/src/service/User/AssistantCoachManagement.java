package service.User;

import constant.Constants;
import entity.AssistantCoach;
import com.google.gson.reflect.TypeToken;
import service.GSON.JsonSingleFileHandler;
import service.GSON.SingleFileHandler;

import java.lang.reflect.Type;

public class AssistantCoachManagement {
    private SingleFileHandler singleFileHandler;
    private AssistantCoach assistant;
    private final Type ASSISTANTCOACHTYPE = new TypeToken<AssistantCoach>(){}.getType();
    private static AssistantCoachManagement instance;

    private AssistantCoachManagement(){
        singleFileHandler = new JsonSingleFileHandler();
        this.assistant = (AssistantCoach) singleFileHandler.readFromFile(Constants.ASSISTANTCOACH_FILE_PATH, ASSISTANTCOACHTYPE);
    }

    public static AssistantCoachManagement getInstance(){
        if(instance == null){
            instance = new AssistantCoachManagement();
        }
        return instance;
    }

    public AssistantCoach getAssistant() {
        return assistant;
    }

    public void setAssistant(AssistantCoach assistant) {
        this.assistant = assistant;
    }
}
