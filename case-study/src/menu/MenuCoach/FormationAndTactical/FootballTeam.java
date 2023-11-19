package menu.MenuCoach.FormationAndTactical;

public class FootballTeam {
    private final FootballFormation formation;
    private final Strategy strategy;

    public FootballTeam(Strategy strategy, FootballFormation formation) {
        this.formation = formation;
        this.strategy = strategy;
    }

    public void setFormation() {
        formation.displayFormation();
    }

    public void setStrategy() {
        formation.setStrategy(strategy);
    }
}