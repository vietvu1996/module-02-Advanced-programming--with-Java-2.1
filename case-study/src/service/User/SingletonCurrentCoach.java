package service.User;

import entity.Coach;

import java.util.List;

public class SingletonCurrentCoach {
    private Coach currentCoach;
    private final List<Coach> coaches;
    private static SingletonCurrentCoach instance;

    private SingletonCurrentCoach(){
        coaches = SingletonCoachManagement.getInstance().getCoaches();
    }
    public static SingletonCurrentCoach getInstance(){
        if(instance == null){
            instance = new SingletonCurrentCoach();
        }
        return instance;
    }

    public Coach getCoach(){
        return currentCoach;
    }

    public String getCoachName(){
        return currentCoach.getFullName();
    }

    public boolean setCoach(String username, String password) {
        for (Coach coach: coaches
             ) {
            if(coach.getUsername().equals(username) && coach.getPassword().equals(password)){
                this.currentCoach = coach;
                return true;
            }
        }
        return false;
    }
}