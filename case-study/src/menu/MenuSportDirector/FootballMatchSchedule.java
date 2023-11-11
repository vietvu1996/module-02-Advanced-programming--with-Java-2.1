package menu.MenuSportDirector;

import menu.Command;

public class FootballMatchSchedule implements Command {
    @Override
    public void execute() {
        System.out.println("Plan schedule, change schedule, reschedule");
    }
}
