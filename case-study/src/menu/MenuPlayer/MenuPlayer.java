package menu.MenuPlayer;

import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import menu.Navigator;
import service.User.SingletonCurrentPlayer;

import java.util.Scanner;

public class MenuPlayer implements Navigator {
    private static MenuPlayer instance;
    private final Scanner SCANNER = new Scanner(System.in);


    public static MenuPlayer getInstance() {
        if(instance == null){
            instance = new MenuPlayer();
        }
        return instance;
    }

    private void menuPlayer() {
        Menu menuPlayer = new MenuMain();
        menuPlayer.addMenuItem(new MenuItem("Training Session", new TrainingSession()));
        menuPlayer.addMenuItem(new MenuItem("Club Regulations", new ClubRegulations()));
        int choice;
        do{
            System.out.println("Welcome " + SingletonCurrentPlayer.getInstance().getCurrentPlayerName());
            menuPlayer.display();
            choice = SCANNER.nextInt();
            menuPlayer.runCommand(choice);
        } while (choice != 0);
    }

    @Override
    public void navigate() {
        menuPlayer();
    }
}
