package service.User;

import entity.TechnicalDirector;

public class SingletonTechnicalDirector {
    private TechnicalDirector technicalDirector;
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

    public void setTechnicalDirector(TechnicalDirector technicalDirector, String username, String password) {
        if(technicalDirector.getUsername().equals(username) && technicalDirector.getPassword().equals(password)){
            this.technicalDirector = technicalDirector;
        }
    }
}
