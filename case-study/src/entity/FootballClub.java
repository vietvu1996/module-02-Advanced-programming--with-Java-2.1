package entity;

public class FootballClub {
    private String clubFullName;
    private String clubShortName;
    private String stripColour;

    public FootballClub(String clubFullName, String clubShortName, String stripColour) {
        this.clubFullName = clubFullName;
        this.clubShortName = clubShortName;
        this.stripColour = stripColour;
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

    @Override
    public String toString() {
        return "entity.FootballClub {" +
                "clubFullName= '" + clubFullName + '\'' +
                ", clubShortName= '" + clubShortName + '\'' +
                ", stripColour= '" + stripColour + '\'' +
                '}';
    }
}
