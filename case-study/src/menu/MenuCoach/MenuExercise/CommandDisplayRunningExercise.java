package menu.MenuCoach.MenuExercise;

import menu.Command;

public class CommandDisplayRunningExercise implements Command {
    @Override
    public void execute() {
        for (RunningExercise runningExercise: RunningSingleton.getInstance().getRunningExerciseList()) {
            System.out.println(runningExercise.toString());
        }
    }
}
