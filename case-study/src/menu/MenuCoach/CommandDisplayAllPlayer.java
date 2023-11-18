package menu.MenuCoach;

import entity.Player;
import menu.Command;
import service.User.SingletonPlayerListManagement;

public class CommandDisplayAllPlayer implements Command {
    @Override
    public void execute() {
        for (Player player: SingletonPlayerListManagement.getInstance().getPlayers()) {
            System.out.println(player.toString());
        }
    }
}
