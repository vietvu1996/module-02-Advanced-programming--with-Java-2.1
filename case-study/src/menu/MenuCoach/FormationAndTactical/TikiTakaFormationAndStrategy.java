package menu.MenuCoach.FormationAndTactical;

import entity.Player;
import menu.Command;

import java.util.ArrayList;
import java.util.List;

public class TikiTakaFormationAndStrategy implements Command {
    List<Player> players433 = new ArrayList<>();

    @Override
    public void execute() {
        players433.add(new Player("David Villa", "LW"));
        players433.add(new Player("Lionel Messi", "CF"));
        players433.add(new Player("Pedro Rodriguez", "RW"));
        players433.add(new Player("Andreas Iniesta", "CM"));
        players433.add(new Player("Xavi Hernandez", "CM"));
        players433.add(new Player("Sergio Busquets", "CDM"));
        players433.add(new Player("Eric Abidal", "LWB"));
        players433.add(new Player("Gerard Pique", "CB"));
        players433.add(new Player("Carles Puyol", "CB"));
        players433.add(new Player("Dani Alves", "RWB"));

        FootballFormation formation433 = new FootballFormation(players433);
        Strategy tikiTakaStrategy = new TikiTakaTactical();
        FootballTeam myTeam = new FootballTeam(tikiTakaStrategy, formation433);
        System.out.println();
        myTeam.setStrategy();
        System.out.println();
        myTeam.setFormation();
        System.out.println();
    }
//    public static void main(String[] args) {
//        FormationAndStrategy formationAndStrategy = new FormationAndStrategy();
//        formationAndStrategy.execute();
//    }
}
