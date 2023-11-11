package service.Tournament;

import menu.Command;

import java.util.HashMap;
import java.util.Map;

public class UEFAChampionLeague implements Command {
    private final String nameTournament;
    private final Map<String, Team> uefaChampionLeagueTeams;

    public UEFAChampionLeague(String nameTournament) {
        this.nameTournament = nameTournament;
        this.uefaChampionLeagueTeams = new HashMap<>();
    }

    public void uefaChampionLeagueTournament(){
        Team team11 = new Team("AFC Ajax");
        Team team12 = new Team("Liverpool FC");
        Team team13 = new Team("FC Porto");
        Team team14 = new Team("Atlético Madrid");
        Team team15 = new Team("AC Milan");
        Team team16 = new Team("Chelsea");
        Team team17 = new Team("Real Madrid");
        Team team18 = new Team("FC Barcelona");
        Team team19 = new Team("Manchester City FC");
        Team team20 = new Team("Paris Saint-Germain");

        addTeam(team11);
        addTeam(team12);
        addTeam(team13);
        addTeam(team14);
        addTeam(team15);
        addTeam(team16);
        addTeam(team17);
        addTeam(team18);
        addTeam(team19);
        addTeam(team20);
    }

    public String getNameTournament() {
        return nameTournament;
    }

    public void addTeam(Team team) {
        uefaChampionLeagueTeams.put(team.getName(), team);
    }

    public void displayTeams() {
        for (Map.Entry<String, Team> entry : uefaChampionLeagueTeams.entrySet()) {
            System.out.println("Team: " + entry.getKey() + ", Goals: " + entry.getValue().getGoals() + ", Score: " + entry.getValue().getScore());
        }
    }

    @Override
    public void execute() {
        uefaChampionLeagueTournament();
        displayTeams();
    }

    public static void main(String[] args) {
        System.out.println();
        UEFAChampionLeague uefaChampionLeague = new UEFAChampionLeague("UEFA Champion League");
        System.out.println("Tournament name: " + uefaChampionLeague.getNameTournament());
        System.out.println();
        uefaChampionLeague.execute();
        System.out.println();
    }
}
