package service;

import menu.Command;

import java.util.HashMap;
import java.util.Map;

public class Tournament implements Command {
    private String name;
    private Map<String, Team> teams;

    public Tournament() {
    }

    public Tournament(String name) {
        this.name = name;
        this.teams = new HashMap<>();
    }

    public void LaligaTournament() {
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
    }

    public String getName() {
        return name;
    }

    public void addTeam(Team team) {
        teams.put(team.getName(), team);
    }

    public void displayTeams() {
        for (Map.Entry<String, Team> entry : teams.entrySet()) {
            System.out.println("Team: " + entry.getKey() + ", Goals: " + entry.getValue().getGoals() + ", Score: " + entry.getValue().getScore());
        }
    }

    @Override
    public void execute() {
        displayTeams();
    }
}
