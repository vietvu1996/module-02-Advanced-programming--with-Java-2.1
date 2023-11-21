package menu.MenuSportDirector;

import menu.Menu;
import menu.MenuItem;
import menu.MenuMain;
import menu.Navigator;
import service.chainLogin.ExitCommand;
import service.User.SingletonSportDirector;

import java.util.Scanner;

public class MenuSportDirector implements Navigator {
    private static MenuSportDirector instance;
    private final Scanner SCANNER = new Scanner(System.in);

    private void menuSportDirector() {
        Menu menuSportDirector = new MenuMain();
        menuSportDirector.addMenuItem(new MenuItem("La Liga Schedule", new CreateLaligaSchedule()));
        menuSportDirector.addMenuItem(new MenuItem("Uefa Champion League Schedule", new CreateUefaChampionLeagueSchedule()));
        menuSportDirector.addMenuItem(new MenuItem("Change Schedule, Reschedule", new ReSchedule()));
        menuSportDirector.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        System.out.println("Welcome Sport Director" + SingletonSportDirector.getInstance().getSportDirectorName());
        do {
            menuSportDirector.display();
            choice = SCANNER.nextInt();
            menuSportDirector.runCommand(choice - 1);
        } while (choice != 0);
    }

    public static MenuSportDirector getInstance() {
        if (instance == null) {
            instance = new MenuSportDirector();
        }
        return instance;
    }

    @Override
    public void navigate() {
        menuSportDirector();
    }
}
