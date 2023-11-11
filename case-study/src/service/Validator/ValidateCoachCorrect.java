package service.Validator;

import entity.Coach;
import entity.User;
import service.User.SingletonCoachManagement;

import java.util.List;

public class ValidateCoachCorrect implements Validator {
    private final List<Coach> coaches;
    private final String username;
    private final String password;

    public ValidateCoachCorrect(String username, String password){
        this.coaches = SingletonCoachManagement.getInstance().getCoaches();
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean isCheck() {
        for (User user: coaches) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
