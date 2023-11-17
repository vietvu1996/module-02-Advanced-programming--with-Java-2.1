package menu.MenuSportDirector;

import menu.Command;
import service.Tournament.Team;

import java.time.LocalDate;
import java.util.Random;

public class FootballMatch implements Command {
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;
    private LocalDate matchDate;

    public FootballMatch() {
    }

    public FootballMatch(Team homeTeam, Team awayTeam, LocalDate matchDate) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
        this.matchDate = matchDate;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public void simulateResult() {
        Random random = new Random();
        homeScore = random.nextInt(6);
        awayScore = random.nextInt(6);

        if (homeScore > awayScore) {
            homeTeam.setScore(homeTeam.getScore() + 3);
        } else if (homeScore < awayScore) {
            awayTeam.setScore(awayTeam.getScore() + 3);
        } else {
            homeTeam.setScore(homeTeam.getScore() + 1);
            awayTeam.setScore(homeTeam.getScore() + 1);
        }
        System.out.println(homeTeam.getName() + " " + homeScore + " - " + awayTeam.getName() + " " + awayScore);
    }


    @Override
    public void execute() {
        simulateResult();
    }

    @Override
    public String toString() {
        return "FootballMatch{" +
                "homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                ", homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                ", matchDay =" + matchDate +
                '}';
    }
}
