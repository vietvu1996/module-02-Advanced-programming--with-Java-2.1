package menu.MenuTechnicalDirector;

import menu.Command;

public class YoungPlayer implements Command {
    @Override
    public void execute() {
        System.out.println("""
                Build a training program for young players:
                Based on technique, health, position""");
    }
}
