package menu.MenuCoach.MenuExercise.MenuDribblingExercise;

import menu.Command;
import service.ChangeandUpdate.Subject;

public class CommandDisplayDribblingExercise extends Subject implements Command {
    @Override
    public void execute() {
        for (DribblingExercise dribblingExercise : DribblingSingleton.getInstance().getDribblingExerciseList()) {
            System.out.println(dribblingExercise.toString());
        }
    }
}
