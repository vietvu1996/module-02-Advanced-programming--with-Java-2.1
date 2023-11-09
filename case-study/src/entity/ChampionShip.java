package entity;

public class ChampionShip {
    private String nameOfLeague;
    private int timesOfChampionship;
    private String area;

    public ChampionShip(String area, String nameOfLeague, int timesOfChampionship) {
        this.nameOfLeague = nameOfLeague;
        this.timesOfChampionship = timesOfChampionship;
        this.area = area;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
