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
        LaligaLeague laligaLeague = new LaligaLeague("La Liga");
        UEFAChampionLeague uefaChampionLeague = new UEFAChampionLeague("UEFA Champion League");
        System.out.println("Targets: Win both tournaments we are participating in: ");
        System.out.println();
        System.out.println("For tournament " + laligaLeague.getNameTournament() + ", we need to have the highest score.");
        System.out.println();
        System.out.println("For tournament " + uefaChampionLeague.getNameTournament() + ", we need to have the highest score.");
    }


    @Override
    public void execute() {
        setGoals();
    }
}
