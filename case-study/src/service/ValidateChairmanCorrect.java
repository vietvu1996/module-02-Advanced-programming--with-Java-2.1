package service;

import entity.Chairman;
import service.User.SingletonChairmanManagement;

public class ValidateChairmanCorrect implements Validator{
    private final Chairman chairman;
    private final String username;
    private final String password;

    public ValidateChairmanCorrect(String username, String password){
        this.chairman = SingletonChairmanManagement.getInstance().getChairman();
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean isCheck() {
        return chairman.getUsername().equals(username) && chairman.getPassword().equals(password);
    }
}
