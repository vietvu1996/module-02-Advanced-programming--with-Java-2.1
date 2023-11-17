package menu.MenuTechnicalDirector;

import menu.Command;
import service.ChangeandUpdate.Observer;
import service.ChangeandUpdate.Subject;

import java.util.Scanner;

public class CommandChangeCurrentYoungPlayerName extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        System.out.println("Input young player id");
        int id = SCANNER.nextInt();
        //set current young player
        CurrentYoungPlayer.getInstance().setCurrentYoungPlayer(id);
        System.out.println("Input young player new name");
        String newName = SCANNER.nextLine();
        //update
        CurrentYoungPlayer.getInstance().getCurrentYoungPlayer().setName(newName);
        Observer observer = LaMasiaAcademySingleton.getInstance();
        addObserver(observer);
        notifyObserver();
        removeObserver(observer);
    }
}
