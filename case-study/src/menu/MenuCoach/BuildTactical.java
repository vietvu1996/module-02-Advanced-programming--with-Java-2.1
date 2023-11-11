package menu.MenuCoach;

import menu.Command;

public class BuildTactical implements Command {
    @Override
    public void execute() {
        System.out.println("1. Build squads and tactical systems");
        System.out.println("2. Give exercises to the players");
    }
}
