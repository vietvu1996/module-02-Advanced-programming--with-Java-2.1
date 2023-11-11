package service;

import entity.ChampionShip;

import java.util.List;

public class SingletonChampionship {
    private final List<ChampionShip> championShips;
    private ChampionShip championShip;
    private static SingletonChampionship instance;
    
    public SingletonChampionship(){
        championShips = SingletonChampionshipManagement.getInstance().getChampionShips();
    }
    
    public static SingletonChampionship getInstance(){
        if(instance == null){
            instance = new SingletonChampionship();
        }
        return instance;
    }

    public ChampionShip getChampionShip() {
        return championShip;
    }

    public String getNameOfLeague(){
        return championShip.getNameOfLeague();
    }
}
