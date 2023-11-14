package menu.MenuSportDirector;

import menu.Command;
import service.Tournament.LaligaLeague;
import service.Tournament.Team;
import service.Tournament.UEFAChampionLeague;

import java.util.*;

public class FootballMatchSchedule implements Command {
    private Map<String, Team> laligaTeams;
    private Map<String, Team> uefaTeams;
    private List<FootballMatch> laLigaMatches;
    private List<FootballMatch> uclMatches;

    public FootballMatchSchedule() {
    }

    public FootballMatchSchedule(Map<String, Team> laligaTeams, Map<String, Team> uefaTeams) {
        this.laligaTeams = laligaTeams;
        this.uefaTeams = uefaTeams;
        this.laLigaMatches = new ArrayList<>();
        this.uclMatches = new ArrayList<>();
    }

    //  Method to create the matches for La Liga
    public void createLaLigaMatches(){
        List<String> teams = new ArrayList<>(laligaTeams.keySet());
        Collections.shuffle(teams);
        int n = teams.size();
        int half = n / 2;
        for (int round = 0; round < n - 1; round++) {
            for (int i = 0; i < half; i++) {
                Team homeTeam = new Team(teams.get(i));
                Team awayTeam = new Team(teams.get(n - 1 - i));
                laLigaMatches.add(new FootballMatch(homeTeam, awayTeam));
            }
            Collections.rotate(teams.subList(1, n), 1);
        }
        for (int i = 0; i < n * (n - 1) / 2; i++) {
            FootballMatch originalMatch = laLigaMatches.get(i);
            Team homeTeam = originalMatch.getAwayTeam();
            Team awayTeam = originalMatch.getHomeTeam();
            laLigaMatches.add(new FootballMatch(homeTeam, awayTeam));
        }
    }

    public void show(){
        int round = 1;
        int matchCount = 0;
        for (FootballMatch match : laLigaMatches) {
            if (matchCount == 0) {
                System.out.println("Home matches: ");
                System.out.println();
            }
            if (matchCount == laligaTeams.size() * (laligaTeams.size() - 1) / 2) // Matches count = 45; formula = 10 * 9 / 2
            {
                System.out.println("Away matches: ");
                System.out.println();
            }
            System.out.println("Round " + round + ": " + match);
            matchCount++;
            if (matchCount % (laligaTeams.size() - 1) == 0) {
                round++;
            }
        }
    }

    @Override
    public void execute() {
        System.out.println("Laliga League Matches:");
        System.out.println();
        createLaLigaMatches();
        show();
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

        FootballMatchSchedule footballMatchSchedule = new FootballMatchSchedule(laligaLeague.getLaligaTeams(), uefaChampionLeague.getUefaChampionLeagueTeams());
        footballMatchSchedule.execute();
    }
}
