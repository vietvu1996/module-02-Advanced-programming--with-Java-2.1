package service.User;

import entity.SportDirector;

public class SingletonSportDirector {
    private SportDirector sportDirector;
    private static SingletonSportDirector instance;

    public SingletonSportDirector(){
        sportDirector = SingletonSportDirector.getInstance().getSportDirector();
    }

    public static SingletonSportDirector getInstance(){
        if(instance == null){
            instance = new SingletonSportDirector();
        }
        return instance;
    }

    public SportDirector getSportDirector() {
        return sportDirector;
    }

    public String getSportDirectorName(){
        return sportDirector.getName();
    }

    public void setSportDirector(SportDirector sportDirector, String username, String password) {
        if(sportDirector.getUsername().equals(username) && sportDirector.getPassword().equals(password)){
            this.sportDirector = sportDirector;
        }
    }
}
