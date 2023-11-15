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

    public Map<String, Team> getUefaChampionLeagueTeams() {
        return uefaChampionLeagueTeams;
    }

    public void uefaChampionLeagueTournament() {
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


        team11.setScore(11);
        team12.setScore(12);
        team13.setScore(5);
        team14.setScore(13);
        team15.setScore(11);
        team16.setScore(16);
        team17.setScore(17);
        team18.setScore(18);
        team19.setScore(17);
        team20.setScore(11);
    }

    public boolean checkIfWinning() {
        String winningTeam = null;
        int highestScore = 0;
        for (Map.Entry<String, Team> entry : uefaChampionLeagueTeams.entrySet()) {
            int score = entry.getValue().getScore();
            if (score > highestScore) {
                highestScore = score;
                winningTeam = entry.getKey();
            }
        }
        System.out.println();
        System.out.println("The champion is: " + winningTeam + " with score: " + highestScore);
        for (String team : uefaChampionLeagueTeams.keySet()) {
            if (!team.equals(winningTeam)) {
                return false;
            }
        }
        return true;
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
        checkIfWinning();
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