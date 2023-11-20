package menu.MenuCoach.MenuExercise;

import menu.Command;
import service.ChangeandUpdate.Subject;

public class CommandDisplayPushUpExercise implements Command {

    @Override
    public void execute() {
        for (PushUpExercise pushUpExercise: PushUpSingleton.getInstance().getPushUpExerciseList()) {
            System.out.println(pushUpExercise.toString());
        }
    }
}
