package menu.MenuSportDirector;

import menu.Command;
import service.Tournament.Team;

import java.util.Random;

public class FootballMatch implements Command {
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;

    public FootballMatch() {
    }

    public FootballMatch(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
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

    public void simulateResult() {
        Random random = new Random();
        homeScore = random.nextInt(6);
        awayScore = random.nextInt(6);

        if (homeScore > awayScore) {
            homeTeam.updateScore(homeTeam.getScore() + 3);
        } else if (homeScore < awayScore) {
            awayTeam.updateScore(awayTeam.getScore() + 3);
        } else {
            homeTeam.updateScore(homeTeam.getScore() + 1);
            awayTeam.updateScore(homeTeam.getScore() + 1);
        }
        String result = homeTeam.getName() + " " + homeScore + " - " + awayTeam.getName() + " " + awayScore;
    }

    @Override
    public void execute() {
        simulateResult();
    }
}
