package service;

import menu.Command;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Exit");
    }
}
