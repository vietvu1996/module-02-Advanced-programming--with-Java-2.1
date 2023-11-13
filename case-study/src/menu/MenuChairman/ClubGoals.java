package menu.MenuChairman;

import menu.Command;
import service.Tournament.LaligaLeague;
import service.Tournament.UEFAChampionLeague;
public class ClubGoals implements Command {
    private LaligaLeague laligaLeague;
    private UEFAChampionLeague uefaChampionLeague;

    public ClubGoals(LaligaLeague laligaLeague, UEFAChampionLeague uefaChampionLeague) {
        this.laligaLeague = laligaLeague;
        this.uefaChampionLeague = uefaChampionLeague;
    }

    public ClubGoals() {
    }

    public void setGoals() {
        System.out.println("Targets: Win both tournaments we are participating in: ");
        System.out.println();
        System.out.println("For tournament " + laligaLeague.getNameTournament() + ", we need to have the highest score.");
        System.out.println();
        System.out.println("For tournament " + uefaChampionLeague.getNameTournament() + ", we need to have the highest score.");
    }

    public boolean setWinningCondition() {
        LaligaLeague laligaLeague = new LaligaLeague("La Liga");
        UEFAChampionLeague uefaChampionLeague = new UEFAChampionLeague("UEFA Champion League");
        return laligaLeague.checkIfWinning() || uefaChampionLeague.checkIfWinning();
    }

    @Override
    public void execute() {
        setGoals();
    }

    public static void main(String[] args) {
        ClubGoals clubGoals = new ClubGoals(new LaligaLeague("La Liga"), new UEFAChampionLeague("UEFA Champion League"));
        clubGoals.execute();
    }
}
