package menu.MenuTechnicalDirector;

import menu.Command;

import java.util.List;

public class SearchTalentPlayer implements FunctionTechnicalDirector, Command {
private final List<YoungPlayer> potentialPlayers;
private YoungPlayer currentYoungPlayer;
    public SearchTalentPlayer() {
        this.potentialPlayers = LaMasiaAcademySingleton.getInstance().getYoungPlayers();
    }


    @Override
    public void addPlayer(YoungPlayer youngPlayer) {
        this.potentialPlayers.add(youngPlayer);
    }

    @Override
    public void removePlayer(YoungPlayer youngPlayer) {
        this.potentialPlayers.remove(youngPlayer);
    }

    @Override
    public void changePlayer(YoungPlayer youngPlayer) {

    }
    public void changePlayer(YoungPlayer youngPlayer, String name, int age, String position, String performance) {
        if (this.potentialPlayers.contains(youngPlayer)){
            youngPlayer.setName(name);
        }
    }

    @Override
    public void execute() {
        System.out.println("Input young ");
    }
}
