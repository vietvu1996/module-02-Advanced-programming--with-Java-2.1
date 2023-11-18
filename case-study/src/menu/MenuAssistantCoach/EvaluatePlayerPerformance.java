package menu.MenuAssistantCoach;

import menu.Command;

public class EvaluatePlayerPerformance implements Command {
    @Override
    public void execute() {
        System.out.println("""
                Evaluate player performance through training session
                Exp: Health, Performance Drop Point
                and official match (running, possession, score, key pass, assist, minute to play)""");
    }
}
