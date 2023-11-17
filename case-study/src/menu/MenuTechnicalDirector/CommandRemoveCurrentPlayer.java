package menu.MenuTechnicalDirector;

import constant.Constants;
import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;
import service.GSON.JsonMyFileHandler;

import java.util.Scanner;

public class CommandRemoveCurrentPlayer extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void execute() {
//        System.out.println("Input young player id");
//        int id = SCANNER.nextInt();
//        CurrentYoungPlayer.getInstance().setCurrentYoungPlayer(id);
//        System.out.println(CurrentYoungPlayer.getInstance().getCurrentYoungPlayer());
//        Observer observer = LaMasiaAcademySingleton.getInstance();
//        addObserver(observer);
//        notifyObserver();
//        removeObserver(observer);
        System.out.println("Input young player id");
        int id = SCANNER.nextInt();
//set current young player
        CurrentYoungPlayer.getInstance().setCurrentYoungPlayer(id);
// Check if the player exists in the list
        boolean playerExists = LaMasiaAcademySingleton.getInstance().getYoungPlayers().stream()
                .anyMatch(player -> player.getId() == id);

        if (playerExists) {
            LaMasiaAcademySingleton.getInstance().getYoungPlayers().removeIf(player -> player.getId() == id);
            for (int i = 0; i < LaMasiaAcademySingleton.getInstance().getYoungPlayers().size(); i++) {
                LaMasiaAcademySingleton.getInstance().getYoungPlayers().get(i).setId(i + 1);
            }
            Observer observer = LaMasiaAcademySingleton.getInstance();
            //addObserver(observer);
            notifyObserver();
            removeObserver(observer);
            // Update the JSON file
            JsonMyFileHandler fileHandler = new JsonMyFileHandler();
            fileHandler.saveToFile(Constants.YOUNG_PLAYER_FILE_PATH, LaMasiaAcademySingleton.getInstance().getYoungPlayers());
            System.out.println("Young player removed from the list successfully ");
        } else {
            System.out.println("No player found with the given id.");
        }
    }
}
