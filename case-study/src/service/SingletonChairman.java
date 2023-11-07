package service;

import entity.Chairman;

public class SingletonChairman {
    private Chairman chairman;
    private static SingletonChairman instance;

    public SingletonChairman(){
        chairman = SingletonChairman.getInstance().getChairman();
    }

    public static SingletonChairman getInstance(){
        if(instance == null){
            instance = new SingletonChairman();
        }
        return instance;
    }

    public Chairman getChairman() {
        return chairman;
    }

    public String getChairmanName(){
        return chairman.getName();
    }

    public void setChairman(Chairman chairman, String username, String password) {
        if(chairman.getUsername().equals(username) && chairman.getPassword().equals(password)){
            this.chairman = chairman;
        }
    }
}
