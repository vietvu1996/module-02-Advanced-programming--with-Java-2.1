package menu.MenuChairman;

import menu.Command;

public class ImportantDecision implements Command {
    @Override
    public void execute() {
        System.out.println("""
                3. Important Decision:
                3.1 Participate in coach recruitment
                3.2 Participate in player transfer""");
    }
}
