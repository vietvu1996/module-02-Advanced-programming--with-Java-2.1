package service;

import entity.AssistantCoach;

public class SingletonCurrentAssistantCoach {
    private AssistantCoach assistant;
    private static SingletonCurrentAssistantCoach instance;

    public SingletonCurrentAssistantCoach(){
        assistant = AssistantCoachManagement.getInstance().getAssistant();
    }

    public static SingletonCurrentAssistantCoach getInstance(){
        if(instance == null){
            instance = new SingletonCurrentAssistantCoach();
        }
        return instance;
    }

    public AssistantCoach getAssistant(){
        return assistant;
    }

    public String getAssistantName(){
        return assistant.getFullName();
    }

    public void setAssistant(AssistantCoach assistant,String username, String password) {
        if(assistant.getUsername().equals(username) && assistant.getPassword().equals(password)){
            this.assistant = assistant;
        }
    }
}
