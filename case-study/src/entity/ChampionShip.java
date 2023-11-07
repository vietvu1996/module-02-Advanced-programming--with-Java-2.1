package entity;

public class ChampionShip {
    private String nameOfLeague;
    private int timesOfChampionship;
    private int totalCup;

    public ChampionShip(String nameOfLeague, int timesOfChampionship, int totalCup) {
        this.nameOfLeague = nameOfLeague;
        this.timesOfChampionship = timesOfChampionship;
        this.totalCup = totalCup;
    }

    public String getNameOfLeague() {
        return nameOfLeague;
    }

    public void setNameOfLeague(String nameOfLeague) {
        this.nameOfLeague = nameOfLeague;
    }

    public int getTimesOfChampionship() {
        return timesOfChampionship;
    }

    public void setTimesOfChampionship(int timesOfChampionship) {
        this.timesOfChampionship = timesOfChampionship;
    }

    public int getTotalCup() {
        return totalCup;
    }

    public void setTotalCup(int totalCup) {
        this.totalCup = totalCup;
    }
}
