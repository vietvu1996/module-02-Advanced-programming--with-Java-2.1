package service;

import entity.FootballClub;

public class SingletonFootballClub {
    private FootballClub footballClub;
    private static SingletonFootballClub instance;

    public SingletonFootballClub(){
        footballClub = SingletonFootballClubManagement.getInstance().getFootballClub();
    }

    public static SingletonFootballClub getInstance(){
        if(instance == null){
            instance = new SingletonFootballClub();
        }
        return instance;
    }

    public FootballClub getFootballClub() {
        return footballClub;
    }

    public String getFootballClubName(){
        return footballClub.getClubFullName();
    }
}
