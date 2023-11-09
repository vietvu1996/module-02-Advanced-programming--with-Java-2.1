package menu.MenuAssistantCoach;

import menu.Command;

public class EvaluatePerformance implements Command {
    @Override
    public void execute() {
        System.out.println("Evaluate the performance of the players");
    }
}
