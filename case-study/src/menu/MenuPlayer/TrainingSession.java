package menu.MenuPlayer;

import menu.Command;

public class TrainingSession implements Command {
    @Override
    public void execute() {
        System.out.println("Participate in training sessions according to the coach's instructions");
    }
}
