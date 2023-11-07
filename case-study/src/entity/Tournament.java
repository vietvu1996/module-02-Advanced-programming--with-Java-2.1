package entity;

public class Tournament {
    private String nameOfTournament;
    private int numberOfTeam;

    public Tournament(String nameOfTournament, int numberOfTeam) {
        this.nameOfTournament = nameOfTournament;
        this.numberOfTeam = numberOfTeam;
    }

    public String getNameOfTournament() {

        return nameOfTournament;
    }

    public void setNameOfTournament(String nameOfTournament) {
        this.nameOfTournament = nameOfTournament;
    }

    public int getNumberOfTeam() {
        return numberOfTeam;
    }

    public void setNumberOfTeam(int numberOfTeam) {
        this.numberOfTeam = numberOfTeam;
    }
}
