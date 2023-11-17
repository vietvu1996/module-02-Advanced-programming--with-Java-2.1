package menu.MenuSportDirector;

import menu.Command;
import service.Tournament.LaligaLeague;
import service.Tournament.Team;
import service.Tournament.UEFAChampionLeague;

import java.time.LocalDate;
import java.util.*;

public class CreateLaligaSchedule implements Command {
    private Map<String, Team> laligaTeams;
    private List<FootballMatch> laLigaMatches;

    public CreateLaligaSchedule() {
    }

    public CreateLaligaSchedule(Map<String, Team> laligaTeams) {
        this.laligaTeams = laligaTeams;
        this.laLigaMatches = new ArrayList<>();
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
    public List<FootballMatch> createLaLigaMatches() {
        List<LocalDate> availableDates = generateAvailableDates(getOccupiedLaligaMatchesDates(laLigaMatches));
        List<String> teams = new ArrayList<>(laligaTeams.keySet());
        Collections.shuffle(teams);
        int n = teams.size(); // 10 teams
        int half = n / 2; // first half and second half
        for (int round = 0; round < n - 1; round++) { // first half
            for (int i = 0; i < half; i++) {
                Team homeTeam = new Team(teams.get(i)); // left to right
                Team awayTeam = new Team(teams.get(n - 1 - i)); // right to left
                LocalDate matchDate = getRandomDateFromList(availableDates);
                laLigaMatches.add(new FootballMatch(homeTeam, awayTeam, matchDate));
                availableDates.remove(matchDate);
            }
            Collections.rotate(teams.subList(1, n), 1);// start from 1 to n, but get from 1 to n-1
        } // bring n from the last to 2 after 1
        for (int i = 0; i < n * (n - 1) / 2; i++) {
            FootballMatch originalMatch = laLigaMatches.get(i); //swap between homeTeam and awayTeam
            Team homeTeam = originalMatch.getAwayTeam();
            Team awayTeam = originalMatch.getHomeTeam();
            LocalDate matchDate = getRandomDateFromList(availableDates);
            laLigaMatches.add(new FootballMatch(homeTeam, awayTeam, matchDate));

            availableDates.remove(matchDate);
        }
        return laLigaMatches;
    }

    public void showLaLigaMatches() {
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

    @Override
    public void execute() {
        LaligaLeague laligaLeague = new LaligaLeague("La Liga");

        System.out.println("Tournament name: " + laligaLeague.getNameTournament());
        System.out.println();
        laligaLeague.execute();
        System.out.println();


        CreateLaligaSchedule createLaligaSchedule = new CreateLaligaSchedule(laligaLeague.getLaligaTeams());

        laLigaMatches = createLaligaSchedule.createLaLigaMatches();

        System.out.println("La Liga Matches:");
        System.out.println();
        createLaligaSchedule.showLaLigaMatches();
        System.out.println();


        System.out.println("Available Match Dates: " + createLaligaSchedule.generateAvailableDates(createLaligaSchedule.getOccupiedLaligaMatchesDates(laLigaMatches)));
    }

    public static void main(String[] args) {
        CreateLaligaSchedule createLaligaSchedule = new CreateLaligaSchedule();
        createLaligaSchedule.execute();
    }
}
