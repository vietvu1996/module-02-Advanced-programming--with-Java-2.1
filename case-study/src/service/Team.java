package service;

public class Team {
    private String name;
    private int goals;
    private int score;

    public Team(){}

    public Team(String name) {
        this.name = name;
        this.goals = 0;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public int getScore() {
        return score;
    }

    public void updateScore(int score){
        this.score += score;
    }

    public void updateGoals(int goals){
        this.goals += goals;
    }
}
