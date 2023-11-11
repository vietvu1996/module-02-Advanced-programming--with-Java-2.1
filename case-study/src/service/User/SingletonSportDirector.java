package service.User;

import entity.SportDirector;

public class SingletonSportDirector {
    private final SportDirector sportDirector;
    private static SingletonSportDirector instance;

    public SingletonSportDirector() {
        sportDirector = SingletonSportDirectorManagement.getInstance().getSportDirector();
    }

    public static SingletonSportDirector getInstance() {
        if (instance == null) {
            instance = new SingletonSportDirector();
        }
        return instance;
    }

    public SportDirector getSportDirector() {
        return sportDirector;
    }

    public String getSportDirectorName() {
        return sportDirector.getName();
    }

    public boolean setSportDirector(String username, String password) {
        return sportDirector.getUsername().equals(username) && sportDirector.getPassword().equals(password);
    }
}
