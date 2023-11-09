package menu;

import menu.Command;

public class Tactical implements Command {
    @Override
    public void execute() {
        System.out.println("Contribute idea of tactical to the Coach");
    }
}
