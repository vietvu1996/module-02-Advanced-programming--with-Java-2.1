package menu.MenuCoach.MenuExercise.MenuPushUpExercise;

import menu.Command;

public class CommandDisplayPushUpExercise implements Command {

    @Override
    public void execute() {
        for (PushUpExercise pushUpExercise: PushUpSingleton.getInstance().getPushUpExerciseList()) {
            System.out.println(pushUpExercise.toString());
        }
    }
}
