package service.chainLogin;

import menu.Command;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Exit");
        System.exit(0);
    }
}
