package service;

import entity.Player;
import entity.User;

import java.util.List;

public class ValidatePlayerCorrect implements Validator{
    private List<Player> players;
    private String username;
    private String password;

    public ValidatePlayerCorrect(String username, String password) {
        this.players = SingletonPlayerListManagement.getInstance().getPlayer();
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean isCheck() {
        for (User user: players
             ) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
