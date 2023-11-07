package service;

import menu.Command;

import java.util.Scanner;

public class CommandChangeUsername extends Subject implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        System.out.println("Input your new username");
        String newUsername = SCANNER.next();
        Observer observer = SingletonPlayerListManagement.getInstance();
        addObserver(observer);

        SingletonCurrentPlayer.getInstance().changeUsername(newUsername);
        notifyObserver();
        removeObserver(observer);
    }
}
