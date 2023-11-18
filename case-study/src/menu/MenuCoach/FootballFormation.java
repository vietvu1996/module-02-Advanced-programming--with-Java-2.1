package menu.MenuCoach;

import entity.Player;

import java.util.List;

public class FootballFormation {
    private List<Player> players;

    public FootballFormation(List<Player> players) {
        this.players = players;
    }
    public void setStrategy(Strategy strategy){
        strategy.build();
    }
    public void displayFormation(){
        for (Player player: players) {
            System.out.println(player.getFullName() + " " + player.getPosition());
        }
    }
}