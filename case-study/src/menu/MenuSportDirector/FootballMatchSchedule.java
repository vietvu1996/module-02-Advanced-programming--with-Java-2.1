package menu.MenuSportDirector;

import menu.Command;
import service.Tournament.LaligaLeague;
import service.Tournament.Team;
import service.Tournament.UEFAChampionLeague;

import java.util.*;

public class FootballMatchSchedule implements Command {
    private Map<String, Team> laligaTeams;
    private Map<String, Team> uefaTeams;

    public FootballMatchSchedule() {
    }

    public FootballMatchSchedule(Map<String, Team> laligaTeams, Map<String, Team> uefaTeams) {
        this.laligaTeams = laligaTeams;
        this.uefaTeams = uefaTeams;
    }

    public void addScheduleMatches(Map<String, Team> teams) {
        List<String> teamNames = new ArrayList<>(teams.keySet());
        Collections.shuffle(teamNames);
//        int n = teamNames.size();
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n / 2; j++) {
//                Team homeTeam = laligaTeams.get(String.valueOf(j));
//                Team awayTeam = laligaTeams.get(n - 1 - j);
//                FootballMatch match = new FootballMatch(homeTeam, awayTeam);
//
//            }
//        }
        for (int i = 0; i < teamNames.size(); i += 2) {
            System.out.println("Match: " + teamNames.get(i) + " vs " + teamNames.get(i + 1));
        }
    }

//    public void changeTime(FootballMatch match, int hour, int minute){
//        if(hour < 0 || hour > 23 || minute < 0 || minute > 59){
//            System.out.println("Invalid time input");
//            return;
//        }
//        if(laligaTeams.containsKey(match) || uefaTeams.containsKey(match){
//            Date newDate =
//        }
//    }


    @Override
    public void execute() {
        System.out.println("Laliga League Matches:");
        System.out.println();
        addScheduleMatches(laligaTeams);
        System.out.println("\nUEFA Champion League Matches:");
        System.out.println();
        addScheduleMatches(uefaTeams);
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
