package menu;

import service.ExitCommand;
import service.LoginCommand;

import java.util.Scanner;

public class NavigationMenuLogin implements Navigator {
    private final Scanner SCANNER = new Scanner(System.in);
    private void navigationLogin() {
        Menu menuLogin = new MenuMain();
        menuLogin.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        menuLogin.addMenuItem(new MenuItem("Login", new LoginCommand()));

        int choice;
        do{
            menuLogin.display();
            choice = SCANNER.nextInt();
            menuLogin.runCommand(choice);
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
