package menu.MenuTechnicalDirector;

import menu.Command;
import menu.Navigator;

import java.util.Scanner;

public class CommandSelectCurrentYoungPlayer implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
//        System.out.println("Input young player id");
//        int id = SCANNER.nextInt();
//        //set current young player
//        CurrentYoungPlayer.getInstance().setCurrentYoungPlayer(id);
        //navigate
        Navigator navigator = new MenuChangeCurrentYoungPlayerDetail();
        navigator.navigate();
    }
}
