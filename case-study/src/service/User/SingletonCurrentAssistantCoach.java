package service.User;

import entity.AssistantCoach;

public class SingletonCurrentAssistantCoach {
    private final AssistantCoach assistant;
    private static SingletonCurrentAssistantCoach instance;

    public SingletonCurrentAssistantCoach() {
        assistant = AssistantCoachManagement.getInstance().getAssistant();
    }

    public static SingletonCurrentAssistantCoach getInstance() {
        if (instance == null) {
            instance = new SingletonCurrentAssistantCoach();
        }
        return instance;
    }

    public AssistantCoach getAssistant() {
        return assistant;
    }

    public String getAssistantName() {
        return assistant.getFullName();
    }

    public boolean setAssistant(String username, String password) {
        return assistant.getUsername().equals(username) && assistant.getPassword().equals(password);
    }
}
