package entity;

public class FootballClub {
    private String clubFullName;
    private String clubShortName;
    private String stripColour;
    private String Slogan;
    private String nameOfStadium;

    public FootballClub(String clubFullName, String clubShortName, String stripColour, String slogan, String nameOfStadium) {
        this.clubFullName = clubFullName;
        this.clubShortName = clubShortName;
        this.stripColour = stripColour;
        Slogan = slogan;
        this.nameOfStadium = nameOfStadium;
    }

    public String getClubFullName() {
        return clubFullName;
    }

    public void setClubFullName(String clubFullName) {
        this.clubFullName = clubFullName;
    }

    public String getClubShortName() {
        return clubShortName;
    }

    public void setClubShortName(String clubShortName) {
        this.clubShortName = clubShortName;
    }

    public String getStripColour() {
        return stripColour;
    }

    public void setStripColour(String stripColour) {
        this.stripColour = stripColour;
    }

    public String getSlogan() {
        return Slogan;
    }

    public void setSlogan(String slogan) {
        Slogan = slogan;
    }

    public String getNameOfStadium() {
        return nameOfStadium;
    }

    public void setNameOfStadium(String nameOfStadium) {
        this.nameOfStadium = nameOfStadium;
    }

}
