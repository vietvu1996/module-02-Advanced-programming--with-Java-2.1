package menu.MenuSportDirector;

import menu.Command;
import service.Tournament.Team;
import service.Tournament.UEFAChampionLeague;

import java.time.LocalDate;
import java.util.*;

public class CreateUefaChampionLeagueSchedule implements Command {
    private Map<String, Team> uefaTeams;
    private List<FootballMatch> uclMatches;

    public CreateUefaChampionLeagueSchedule() {
    }

    public CreateUefaChampionLeagueSchedule(Map<String, Team> uefaTeams) {
        this.uefaTeams = uefaTeams;
        this.uclMatches = new ArrayList<>();
    }

    public List<LocalDate> generateAvailableDates(List<LocalDate> occupiedDates) {
        List<LocalDate> availableDates = new ArrayList<>();
        LocalDate startDate = LocalDate.of(LocalDate.now().getYear(), 9, 1);
        LocalDate endDate = LocalDate.of(LocalDate.now().getYear(), 12, 31);

        for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)) {
            if (!occupiedDates.contains(date)) {
                availableDates.add(date);
            }
        }
        return availableDates;
    }

    public List<LocalDate> getOccupiedLaligaMatchesDates(List<FootballMatch> laLigaMatches) {
        List<LocalDate> occupiedDates = new ArrayList<>();
        for (FootballMatch match : laLigaMatches) {
            occupiedDates.add(match.getMatchDate());
        }
        return occupiedDates;
    }

    public List<LocalDate> getOccupiedUefaMatchesDates(List<FootballMatch> uclMatches) {
        List<LocalDate> occupiedDates = new ArrayList<>();
        for (FootballMatch match : uclMatches) {
            occupiedDates.add(match.getMatchDate());
        }
        return occupiedDates;
    }

    public LocalDate getRandomDateFromList(List<LocalDate> dates) {
        Random random = new Random();
        int randomIndex = random.nextInt(dates.size());
        return dates.get(randomIndex);
    }

    //  Method to create the matches for La Liga

    public List<FootballMatch> createUCLMatches() {
        List<LocalDate> availableDates = generateAvailableDates(getOccupiedUefaMatchesDates(uclMatches));
        List<String> teams = new ArrayList<>(uefaTeams.keySet());
        Collections.shuffle(teams);
        int n = teams.size(); // 10 teams
        int half = n / 2; // first half and second half
        for (int round = 0; round < n - 1; round++) { // first half
            for (int i = 0; i < half; i++) {
                Team homeTeam = new Team(teams.get(i)); // left to right
                Team awayTeam = new Team(teams.get(n - 1 - i)); // right to left
                LocalDate matchDate = getRandomDateFromList(availableDates);
                uclMatches.add(new FootballMatch(homeTeam, awayTeam, matchDate));
                availableDates.remove(matchDate);
            }
            Collections.rotate(teams.subList(1, n), 1);// start from 1 to n, but get from 1 to n-1
        } // bring n from the last to 2 after 1
        for (int i = 0; i < n * (n - 1) / 2; i++) {
            FootballMatch originalMatch = uclMatches.get(i); //swap between homeTeam and awayTeam
            Team homeTeam = originalMatch.getAwayTeam();
            Team awayTeam = originalMatch.getHomeTeam();
            LocalDate matchDate = getRandomDateFromList(availableDates);
            uclMatches.add(new FootballMatch(homeTeam, awayTeam, matchDate));
            availableDates.remove(matchDate);
        }
        return uclMatches;
    }

    public void showUefaMatches() {
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
        UEFAChampionLeague uefaChampionLeague = new UEFAChampionLeague("UEFA Champion League");


        System.out.println("Tournament name: " + uefaChampionLeague.getNameTournament());
        System.out.println();
        uefaChampionLeague.execute();
        System.out.println();

        CreateUefaChampionLeagueSchedule matchSchedule = new CreateUefaChampionLeagueSchedule(uefaChampionLeague.getUefaChampionLeagueTeams()
        );

        uclMatches = matchSchedule.createUCLMatches();

        System.out.println("UEFA Matches:");
        matchSchedule.showUefaMatches();

        System.out.println("Available Match Dates: " + matchSchedule.generateAvailableDates(matchSchedule.getOccupiedLaligaMatchesDates(uclMatches)));
    }
}
