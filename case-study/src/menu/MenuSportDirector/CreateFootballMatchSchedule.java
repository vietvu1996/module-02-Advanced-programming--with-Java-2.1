package menu.MenuSportDirector;

import menu.Command;
import service.Tournament.LaligaLeague;
import service.Tournament.Team;
import service.Tournament.UEFAChampionLeague;

import java.util.*;

public class CreateFootballMatchSchedule implements Command {
    private Map<String, Team> laligaTeams;
    private Map<String, Team> uefaTeams;
    private List<FootballMatch> laLigaMatches;
    private List<FootballMatch> uclMatches;

    public CreateFootballMatchSchedule() {
    }

    public CreateFootballMatchSchedule(Map<String, Team> laligaTeams, Map<String, Team> uefaTeams) {
        this.laligaTeams = laligaTeams;
        this.uefaTeams = uefaTeams;
        this.laLigaMatches = new ArrayList<>();
        this.uclMatches = new ArrayList<>();
    }

    //  Method to create the matches for La Liga
    public void createLaLigaMatches(){
        List<String> teams = new ArrayList<>(laligaTeams.keySet());
        Collections.shuffle(teams);
        int n = teams.size(); // 10 teams
        int half = n / 2; // first half and second half
        for (int round = 0; round < n - 1; round++) { // first half
            for (int i = 0; i < half; i++) {
                Team homeTeam = new Team(teams.get(i)); // left to right
                Team awayTeam = new Team(teams.get(n - 1 - i)); // right to left
                laLigaMatches.add(new FootballMatch(homeTeam, awayTeam));
            }
            Collections.rotate(teams.subList(1, n), 1);// start from 1 to n, but get from 1 to n-1
        } // bring n from the last to 2 after 1
        for (int i = 0; i < n * (n - 1) / 2; i++) {
            FootballMatch originalMatch = laLigaMatches.get(i); //swap between homeTeam and awayTeam
            Team homeTeam = originalMatch.getAwayTeam();
            Team awayTeam = originalMatch.getHomeTeam();
            laLigaMatches.add(new FootballMatch(homeTeam, awayTeam));
        }
    }

    public void createUCLMatches(){
        List<String> teams = new ArrayList<>(uefaTeams.keySet());
        Collections.shuffle(teams);
        int n = teams.size(); // 10 teams
        int half = n / 2; // first half and second half
        for (int round = 0; round < n - 1; round++) { // first half
            for (int i = 0; i < half; i++) {
                Team homeTeam = new Team(teams.get(i)); // left to right
                Team awayTeam = new Team(teams.get(n - 1 - i)); // right to left
                uclMatches.add(new FootballMatch(homeTeam, awayTeam));
            }
            Collections.rotate(teams.subList(1, n), 1);// start from 1 to n, but get from 1 to n-1
        } // bring n from the last to 2 after 1
        for (int i = 0; i < n * (n - 1) / 2; i++) {
            FootballMatch originalMatch = uclMatches.get(i); //swap between homeTeam and awayTeam
            Team homeTeam = originalMatch.getAwayTeam();
            Team awayTeam = originalMatch.getHomeTeam();
            uclMatches.add(new FootballMatch(homeTeam, awayTeam));
        }
    }

    public void showLaLigaMatches(){
        int round = 1;
        int matchCount = 0;
        for (FootballMatch match : laLigaMatches) {
            if (matchCount == 0) { // use only once
                System.out.println("Home matches: ");
                System.out.println();
            }
            if (matchCount == laligaTeams.size() * (laligaTeams.size() - 1) / 2) // Matches count = 45; formula = 10 * 9 / 2
            {
                System.out.println();
                System.out.println("Away matches: ");
                System.out.println();
            }
            System.out.println("Round " + round + ": " + match);
            matchCount++; // when matchCount = 45, jump into the second if condition
            if (matchCount % (laligaTeams.size() - 1) == 0) { // each time, when matchCount = 9
                round++;
            }
        }
    }

    public void showUefaMatches(){
        int round = 1;
        int matchCount = 0;
        for (FootballMatch match : uclMatches) {
            if (matchCount == 0) { // use only once
                System.out.println("Home matches: ");
                System.out.println();
            }
            if (matchCount == uefaTeams.size() * (uefaTeams.size() - 1) / 2) // Matches count = 45; formula = 10 * 9 / 2
            {
                System.out.println();
                System.out.println("Away matches: ");
                System.out.println();
            }
            System.out.println("Round " + round + ": " + match);
            matchCount++; // when matchCount = 45, jump into the second if condition
            if (matchCount % (uefaTeams.size() - 1) == 0) { // each time, when matchCount = 9
                round++;
            }
        }
    }


    @Override
    public void execute() {
        System.out.println("Laliga League Matches:");
        System.out.println();
        createLaLigaMatches();
        System.out.println("UEFA Champions League Matches:");
        System.out.println();

        createUCLMatches();
        showLaLigaMatches();
        showUefaMatches();
    }

    public static void main(String[] args) {
        LaligaLeague laligaLeague = new LaligaLeague("La liga");
        System.out.println("Tournament name: " + laligaLeague.getNameTournament());
        System.out.println();
        laligaLeague.execute();
        System.out.println();
        UEFAChampionLeague uefaChampionLeague = new UEFAChampionLeague("UEFA Champion League");
        System.out.println("Tournament name: " + uefaChampionLeague.getNameTournament());
        System.out.println();
        uefaChampionLeague.execute();
        System.out.println();

        CreateFootballMatchSchedule createFootballMatchSchedule = new CreateFootballMatchSchedule(laligaLeague.getLaligaTeams(), uefaChampionLeague.getUefaChampionLeagueTeams());
        createFootballMatchSchedule.execute();
    }
}
