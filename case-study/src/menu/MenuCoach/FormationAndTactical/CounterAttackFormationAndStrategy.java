package menu.MenuCoach.FormationAndTactical;

import entity.Player;
import menu.Command;

import java.util.ArrayList;
import java.util.List;

public class CounterAttackFormationAndStrategy implements Command {
    List<Player> players442 = new ArrayList<>();

    @Override
    public void execute() {
        players442.add(new Player("David Villa", "LW"));
        players442.add(new Player("Lionel Messi", "LM"));
        players442.add(new Player("Pedro Rodriguez", "RW"));
        players442.add(new Player("Andreas Iniesta", "RM"));
        players442.add(new Player("Xavi Hernandez", "CM"));
        players442.add(new Player("Sergio Busquets", "CM"));
        players442.add(new Player("Eric Abidal", "LB"));
        players442.add(new Player("Gerard Pique", "CB"));
        players442.add(new Player("Carles Puyol", "CB"));
        players442.add(new Player("Dani Alves", "RB"));

        FootballFormation formation442 = new FootballFormation(players442);
        Strategy counterAttackStrategy = new CounterAttackTactical();
        FootballTeam myTeam = new FootballTeam(counterAttackStrategy, formation442);
        System.out.println();
        myTeam.setStrategy();
        System.out.println();
        myTeam.setFormation();
        System.out.println();
    }
}
