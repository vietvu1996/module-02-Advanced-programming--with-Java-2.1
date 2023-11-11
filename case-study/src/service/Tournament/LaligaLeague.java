package service.Tournament;

import menu.Command;

import java.util.HashMap;
import java.util.Map;

public class LaligaLeague implements Command {
    private final String nameTournament;
    private final Map<String, Team> laligaTeams;


//    public Tournament() {}

    public LaligaLeague(String nameTournament) {
        this.nameTournament = nameTournament;
        this.laligaTeams = new HashMap<>();
    }

    public void laligaLeague() {
        Team team1 = new Team("Girona");
        Team team2 = new Team("Real Madrid");
        Team team3 = new Team("Barcelona");
        Team team4 = new Team("Atlético Madrid");
        Team team5 = new Team("Athletic Bilbao");
        Team team6 = new Team("Real Betis");
        Team team7 = new Team("Real Sociedad");
        Team team8 = new Team("Valencia");
        Team team9 = new Team("Rayo Vallecano");
        Team team10 = new Team("Las Palmas");

        addTeam(team1);
        addTeam(team2);
        addTeam(team3);
        addTeam(team4);
        addTeam(team5);
        addTeam(team6);
        addTeam(team7);
        addTeam(team8);
        addTeam(team9);
        addTeam(team10);
    }


    public String getNameTournament() {
        return nameTournament;
    }

    public void addTeam(Team team) {
        laligaTeams.put(team.getName(), team);
    }

    public void displayTeams() {
        for (Map.Entry<String, Team> entry : laligaTeams.entrySet()) {
            System.out.println("Team: " + entry.getKey() + ", Goals: " + entry.getValue().getGoals() + ", Score: " + entry.getValue().getScore());
        }
    }

    @Override
    public void execute() {
        laligaLeague();
        displayTeams();
    }

    public static void main(String[] args) {
        System.out.println();
        LaligaLeague laligaLeague = new LaligaLeague("La liga");
        System.out.println("Tournament name: " + laligaLeague.getNameTournament());
        System.out.println();
        laligaLeague.execute();
        System.out.println();
    }
}
