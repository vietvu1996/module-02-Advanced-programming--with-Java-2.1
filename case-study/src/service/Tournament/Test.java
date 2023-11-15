package service.Tournament;

import menu.Command;

import java.util.*;

public class Test implements Command {
    private final String nameTournament;
    private final Map<String, List<Team>> groups;
    private final Map<String, Team> uefaChampionLeagueTeams;

    public Test(String nameTournament) {
        this.nameTournament = nameTournament;
        this.groups = new HashMap<>();
        this.uefaChampionLeagueTeams = new HashMap<>();
        for (char group = 'A'; group <= 'E'; group++) {
            this.groups.put(String.valueOf(group), new ArrayList<>());
        }
    }

    public String getNameTournament() {
        return nameTournament;
    }

    public void UCLTeams(){
        Team team11 = new Team("AFC AJAX", 3, 1);
        Team team12 = new Team("LIVERPOOL FC", 4, 2);
        Team team13 = new Team("SSC NAPOLI", 3, 3);
        Team team14 = new Team("RANGERS FC", 2, 4);
        Team team15 = new Team("FC PORTO", 1, 1);
        Team team16 = new Team("CLUB ATLETICO DE MARID", 0, 0);
        Team team17 = new Team("BAYER 04 LEVERKUSEN", 2, 2);
        Team team18 = new Team("CLUB BRUGGE", 1, 1);
        Team team19 = new Team("AC MILAN", 4, 6);
        Team team20 = new Team("CHELSEA FC", 2, 3);
        Team team21 = new Team("FC SALZBURG", 1, 1);
        Team team22 = new Team("GNK DINAMO", 1, 3);
        Team team23 = new Team("REAL MADRID FC", 5, 5);
        Team team24 = new Team("RB LEIPZIG", 4, 3);
        Team team25 = new Team("FC SHAKHTAR DONETSK", 2, 1);
        Team team26 = new Team("CELTIC FC", 3, 1);
        Team team27  = new Team("FC BAYER MUNICH", 6, 9);
        Team team28 = new Team("FC BARCELONA", 10, 10);
        Team team29 = new Team("INTER MILAN", 5, 6);
        Team team30 = new Team("TOTTENHAM HOTSPUR", 4, 2);

        addTeam(team11, "A");
        addTeam(team12, "A");
        addTeam(team13, "A");
        addTeam(team14, "A");
        addTeam(team15, "B");
        addTeam(team16, "B");
        addTeam(team17, "B");
        addTeam(team18, "B");
        addTeam(team19, "C");
        addTeam(team20, "C");
        addTeam(team21, "C");
        addTeam(team22, "C");
        addTeam(team23, "D");
        addTeam(team24, "D");
        addTeam(team25, "D");
        addTeam(team26, "D");
        addTeam(team27, "E");
        addTeam(team28, "E");
        addTeam(team29, "E");
        addTeam(team30, "E");
    }

    public void addTeam(Team team, String group) {
        if (this.groups.containsKey(group) && this.groups.get(group).size() < 4) {
            this.groups.get(group).add(team);
            this.uefaChampionLeagueTeams.put(team.getName(), team);
        } else {
            System.out.println("Cannot add team to group " + group);
        }
    }

    public void printGroups() {
        for (Map.Entry<String, List<Team>> entry : this.groups.entrySet()) {
            System.out.println("Group " + entry.getKey() + ": " + entry.getValue());
        }
    }

//    public void playMatch(Team team, int goals){
//        Team t1 = uefaChampionLeagueTeams.get(String.valueOf(team));
//        Team t2 = uefaChampionLeagueTeams.get(String.valueOf(team));
//        if(t1 != null && t2 != null){
//            t1.updateGoals(goals);
//            t2.updateGoals(goals);
//        }
//        else {
//            System.out.println("One or both teams not found in the league.");
//        }
//    }
//
//    public void getStandings(){
//        for (Map.Entry<String, List<Team>> entry : groups.entrySet()) {
//            System.out.println("Group " + ":" + entry.getKey());
//            List<Team> groupTeams = entry.getValue();
//            for (Team team: groupTeams) {
//                System.out.println(team.getName() + ": " + team.getGoals() + " goals");
//            }
//        }
//    }

    @Override
    public void execute() {
        UCLTeams();
        printGroups();
    }

    public static void main(String[] args) {
        System.out.println();
        Test test = new Test("UEFA Champions League");
        System.out.println("Tournament name: " + test.getNameTournament());
        System.out.println();
        test.execute();
        System.out.println();
    }
}
