package service.User;

import entity.TechnicalDirector;

public class SingletonTechnicalDirector {
    private final TechnicalDirector technicalDirector;
    private static SingletonTechnicalDirector instance;

    public SingletonTechnicalDirector(){
        technicalDirector = SingletonTechnicalDirectorManagement.getInstance().getTechnicalDirector();
    }

    public static SingletonTechnicalDirector getInstance(){
        if(instance == null){
            instance = new SingletonTechnicalDirector();
        }
        return instance;
    }

    public TechnicalDirector getTechnicalDirector() {
        return technicalDirector;
    }

    public String getTechnicalDirectorName(){
        return technicalDirector.getName();
    }

    public boolean setTechnicalDirector(String username, String password) {
        return technicalDirector.getUsername().equals(username) && technicalDirector.getPassword().equals(password);
    }
}
