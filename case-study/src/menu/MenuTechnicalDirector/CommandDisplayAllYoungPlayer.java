package menu.MenuTechnicalDirector;

import menu.Command;

public class CommandDisplayAllYoungPlayer implements Command {
    @Override
    public void execute() {
        for (YoungPlayer youngPlayer: LaMasiaAcademySingleton.getInstance().getYoungPlayers()) {
            System.out.println(youngPlayer.toString());
        }
    }
}
