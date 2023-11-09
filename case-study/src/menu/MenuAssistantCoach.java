package menu;

import service.User.SingletonCurrentAssistantCoach;

import java.util.Scanner;

public class MenuAssistantCoach implements Navigator{
    private static MenuAssistantCoach instance;
    private final Scanner SCANNER = new Scanner(System.in);
    private void menuAssistantCoach() {
        Menu menuMain = new MenuMain();
        menuMain.addMenuItem(new MenuItem("Tactical",new Tactical()));
        menuMain.addMenuItem(new MenuItem("Performance of players",new EvaluatePerformance()));

        int choice;
        do{
            System.out.println("Welcome " + SingletonCurrentAssistantCoach.getInstance().getAssistantName());
            menuMain.display();
            choice = SCANNER.nextInt();
            menuMain.runCommand(choice);
        } while (choice != 0);
    }

    public static MenuAssistantCoach getInstance() {
        if (instance == null) {
            instance = new MenuAssistantCoach();
        }
        return instance;
    }
    @Override
    public void navigate() {
        menuAssistantCoach();
    }
}
