package service.User;

import entity.Chairman;
import entity.UserType;

public class SingletonChairman {
    private final Chairman chairman;
    private static SingletonChairman instance;

    private SingletonChairman(){
        chairman = new Chairman(UserType.CHAIRMAN, "Joan", "567", "Joan Laporta i Estruch",61, "Male", "Lawyer" );
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

    public boolean setChairman(String username, String password) {
        return chairman.getUsername().equals(username) && chairman.getPassword().equals(password);
    }
}
