package menu.MenuCoach;

import constant.Constants;
import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;
import service.GSON.JsonMyFileHandler;
import service.User.SingletonCurrentPlayer;
import service.User.SingletonPlayerListManagement;

import java.util.Scanner;

public class CommandRemoveCurrentPlayer extends Subject implements Command {
    private final Scanner scanner = new Scanner(System.in);
    @Override
    public void execute() {
        System.out.println("Input player id");
        int id = scanner.nextInt();
//set current young player
        SingletonCurrentPlayer.getInstance().setCurrentPlayer(id);
// Check if the player exists in the list
        boolean playerExists = SingletonPlayerListManagement.getInstance().getPlayers().stream().anyMatch(player -> player.getId() == id);

        if (playerExists) {
            SingletonPlayerListManagement.getInstance().getPlayers().removeIf(player -> player.getId() == id);
            for (int i = 0; i <  SingletonPlayerListManagement.getInstance().getPlayers().size(); i++) {
                SingletonPlayerListManagement.getInstance().getPlayers().get(i).setId(i + 1);
            }
            Observer observer = SingletonPlayerListManagement.getInstance();
            //addObserver(observer);
            notifyObserver();
            removeObserver(observer);
            // Update the JSON file
            JsonMyFileHandler fileHandler = new JsonMyFileHandler();
            fileHandler.saveToFile(Constants.PLAYER_FILE_PATH, SingletonPlayerListManagement.getInstance().getPlayers());
            System.out.println("Player removed from the list successfully ");
        } else {
            System.out.println("No player found with the given id.");
        }
    }
}
