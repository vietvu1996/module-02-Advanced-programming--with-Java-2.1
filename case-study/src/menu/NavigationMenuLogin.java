package menu;

import service.ExitCommand;
import service.LoginCommand;
import java.util.Scanner;

public class NavigationMenuLogin implements Navigator {

    private final Scanner SCANNER = new Scanner(System.in);
    private void navigationLogin() {
        Menu menuLogin = new MenuMain();
        menuLogin.addMenuItem(new MenuItem("Login", new LoginCommand()));
        menuLogin.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        int choice;
        do{
           menuLogin.display();
            choice = SCANNER.nextInt();
            menuLogin.runCommand(choice-1);
        } while (choice != 0);
    }

    @Override
    public void navigate() {
        navigationLogin();
    }
    public static void main(String[] args) {
        NavigationMenuLogin navigationMenuLogin = new NavigationMenuLogin();
        navigationMenuLogin.navigate();
    }
}
