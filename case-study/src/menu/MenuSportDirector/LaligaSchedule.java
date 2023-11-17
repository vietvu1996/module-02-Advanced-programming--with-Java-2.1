package menu.MenuSportDirector;

import java.util.List;

public class LaligaSchedule {
    private String name;
    private List<FootballMatch> laLigaMatches;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FootballMatch> getLaLigaMatches() {
        return laLigaMatches;
    }

    public void setLaLigaMatches(List<FootballMatch> laLigaMatches) {
        this.laLigaMatches = laLigaMatches;
    }

    public LaligaSchedule() {
        name = "LaligaSchedule";
        laLigaMatches = (new CreateLaligaSchedule()).createLaLigaMatches();
    }
}
