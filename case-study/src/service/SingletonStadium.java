package service;

import entity.Stadium;

public class SingletonStadium {
    private Stadium stadium;
    private static SingletonStadium instance;
    public SingletonStadium(){
        stadium = SingletonStadiumManagement.getInstance().getStadium();
    }

    public static SingletonStadium getInstance(){
        if(instance == null){
            instance = new SingletonStadium();
        }
        return instance;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public String getStadiumName(){
        return stadium.getName();
    }
}
