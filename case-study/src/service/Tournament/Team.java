package service.Tournament;

public class Team {
    public Team(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
    private int goals;
    private int score;

    public Team(String name, int goals, int score) {
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

    public void setScore(int score) {
        this.score = score;
    }


    public void updateGoals(int goals) {
        this.goals += goals;
    }

    @Override
    public String toString() {
        return name;
    }
}
