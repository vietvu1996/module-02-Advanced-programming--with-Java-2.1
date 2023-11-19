package menu.MenuPlayer;

import menu.Command;

public class FollowTrainingSession implements Command {
    @Override
    public void execute() {
        System.out.println("Participate in training sessions according to the coach's instructions");
    }
}
