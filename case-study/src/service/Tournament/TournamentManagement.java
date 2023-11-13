package service.Tournament;

import menu.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TournamentManagement implements Command {
    private final Map<String, Command> tournaments;
    private final Scanner scanner;

    private void initializeTournaments(){
        tournaments.put("uefa", new UEFAChampionLeague("UEFA Champion League"));
        tournaments.put("laliga", new LaligaLeague("La liga"));
    }

    public TournamentManagement(){
        tournaments = new HashMap<>();
        scanner = new Scanner(System.in);
        initializeTournaments();
    }

    @Override
    public void execute() {
        String choice;
        do {
                System.out.println("Choose tournament (uefa/laliga) to display or press Exit to exit");
                choice = scanner.next().toLowerCase();
                if(tournaments.containsKey(choice)){
                    tournaments.get(choice).execute();
                } else if (!choice.equals("exit")) {
                System.out.println("Invalid Tournament, please try again");
            }
        } while (!choice.equals("exit"));
    }

    public static void main(String[] args) {
        TournamentManagement tournamentManagement = new TournamentManagement();
        tournamentManagement.execute();
    }
}
