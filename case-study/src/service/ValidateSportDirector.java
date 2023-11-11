package service;

import entity.SportDirector;
import service.User.SingletonSportDirectorManagement;

public class ValidateSportDirector implements Validator{
    private final SportDirector sportDirector;
    private final String username;
    private final String password;
    public ValidateSportDirector(String username, String password){
        this.sportDirector = SingletonSportDirectorManagement.getInstance().getSportDirector();
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean isCheck() {
        return sportDirector.getUsername().equals(username) && sportDirector.getPassword().equals(password);
    }
}
