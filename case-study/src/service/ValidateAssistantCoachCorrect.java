package service;

import entity.AssistantCoach;
import service.User.AssistantCoachManagement;

public class ValidateAssistantCoachCorrect implements Validator{
    private final AssistantCoach assistantCoach;
    private final String username;
    private final String password;
    public ValidateAssistantCoachCorrect(String username, String password){
        this.assistantCoach = AssistantCoachManagement.getInstance().getAssistant();
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean isCheck() {
        return assistantCoach.getUsername().equals(username) && assistantCoach.getPassword().equals(password);
    }
}
