package service.Validator;

import entity.Player;
import entity.User;
import service.User.SingletonPlayerListManagement;

import java.util.List;

public class ValidatePlayerCorrect implements Validator{
    private final List<Player> players;
    private final String username;
    private final String password;

    public ValidatePlayerCorrect(String username, String password) {
        this.players = SingletonPlayerListManagement.getInstance().getPlayers();
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
